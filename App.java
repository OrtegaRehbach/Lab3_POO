public class App {
    public static void main(String[] args) {
        String[] tags = {"#tag1", "#tag2"};
        Post testPost = new VideoPost("Chente", tags, "google.com", 5698, 60);

        System.out.println(testPost.getInfoString());
        System.out.println(testPost.play());
    }
}