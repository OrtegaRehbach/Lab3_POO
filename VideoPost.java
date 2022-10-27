public class VideoPost extends MediaPost {
    private int frameRate;

    public VideoPost(String author, String url, int size, int frameRate, String... tags) {
        super(author, url, size, tags);
        this.frameRate = frameRate;
        setType("video");
    }

    public String play() {
        return "Playing video... with a framerate of " + this.frameRate + " fps"; 
    }

    public String getInfoString() {
        return (
            super.getInfoString() + ", Framerate: " + this.frameRate + " fps"
        );
    }    
}
