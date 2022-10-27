public class TextPost extends Post {
    private String text;

    public TextPost(String author, String text, String... tags) {
        super(author, tags);
        this.text = text;
    }

    public String play() {
        return "Converting to Text to Speech...";
    }

    public String getInfoString() {
        return (
            super.getInfoString() + "\n" + 
            "(text) " + this.text
        );
    }
}
