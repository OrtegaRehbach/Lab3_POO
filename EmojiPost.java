public class EmojiPost extends Post {
    private String emoji;

    public EmojiPost(String author, String emoji, String... tags) {
        super(author, tags);
        this.emoji = emoji;
    }

    public String play() {
        return "Cannot play this facial expression... \"" + this.emoji + "\"";
    }

    public String getInfoString() {
        return (
            super.getInfoString() + "\n" + 
            "(emoji) " + this.emoji
        );
    }    
}
