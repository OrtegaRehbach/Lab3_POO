import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public abstract class Post {
    private String author;
    private LocalDateTime dateAndTime;
    private String dateTimeFormat = "dd-MM-yyyy HH:mm:ss";
    private int likes;
    private ArrayList<String> comments;
    private int maxCommentLenght = 20;
    private String[] tags;


    public Post(String author, String[] tags) {
        this.author = author;
        this.dateAndTime = LocalDateTime.now();
        this.likes = 0;
        this.comments = new ArrayList<>();
        this.tags = tags;
    }

    public abstract String play();

    public String getInfoString() {
        return (this.tags != null) ? (
            getPostHeader() + "\n" + 
            getTagString()
        ) : (
            getPostHeader()
        );
    }

    private String getPostHeader() {
        return this.author + "." + getFormattedDateAndTime() + " " + "likes: " + this.likes;
    }

    private String getFormattedDateAndTime() {
        return this.dateAndTime.format(DateTimeFormatter.ofPattern(this.dateTimeFormat));
    }

    public boolean addComment(String comment) {
        if (comment.length() <= this.maxCommentLenght) {
            this.comments.add(comment);
            return true;
        } else {
            return false;
        }
    }

    public String[] getComments() {
        return (String[]) this.comments.toArray();
    }

    public String[] getTags() {
        return this.tags;
    }

    private String getTagString() {
        if (this.tags != null && this.tags.length != 0) {
            String tagString = "";
            for (String tag : this.tags) {
                tagString += tag + " ";
            }
            return tagString;
        } else {
            return "";
        }
    }

    public void likePost() {
        this.likes++;
    }
    
}