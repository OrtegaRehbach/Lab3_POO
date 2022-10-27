public abstract class MediaPost extends Post {
    private String url;
    private int size;
    private String type = "media";

    public MediaPost(String author, String url, int size, String... tags) {
        super(author, tags);
        this.url = url;
        this.size = size;
    }

    public String play() {
        return "Tryinto to play media file..."; 
    }

    public String getInfoString() {
        return (
            super.getInfoString() + "\n" + 
            "(" + this.type + ") " + this.url + "\n" +
            this.size + " KB"
        );
    }

    public String getUrl() {
        return this.url;
    }

    public int getSize() {
        return this.size;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
