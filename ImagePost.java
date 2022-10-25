public class ImagePost extends MediaPost {
    private String format;
    private int resolution;

    public ImagePost(String author, String[] tags, String url, int size, String format, int resolution) {
        super(author, tags, url, size);
        this.format = format.toUpperCase();
        this.resolution = resolution;
        setType("image");
    }

    public String play() {
        return "Displaying image... with a resolution of " + this.resolution + " Megapixels"; 
    }

    public String getInfoString() {
        return (
            super.getInfoString() + ", " + this.format + ", " + this.resolution + " Megapixels"
        );
    }
}
