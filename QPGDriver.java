import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class QPGDriver {
    private int maxTextPostLenght = 20;
    private int maxEmojiLenght = 8;
    private ArrayList<Post> publishedPosts;
    private Set<String> tagList;

    public QPGDriver(ArrayList<Post> publishedPosts, Set<String> tagList) {
        this.publishedPosts = publishedPosts;
        this.tagList = new HashSet<String>();
        tagList.addAll(tagList);
    }

    public QPGDriver() {
        this.publishedPosts = new ArrayList<Post>();
        this.tagList = new HashSet<String>();
    }

    public boolean publishPost(Post post) {
        if (post != null) {
            this.publishedPosts.add(post);
            return true;
        } else {
            return false;
        }
    }

    public boolean likePost(Post post) {
        if (post != null) {
            post.likePost();
            return true;
        } else {
            return false;
        }
    }

    public boolean addCommentToPost(Post post, String comment) {
        if (post != null) {
            return post.addComment(comment);
        } else {
            return false;
        }
    }

    public Post[] getPostsFromDate(LocalDateTime postDateTime) {
        return null;
    }

    public Post[] getPostsWithTag(String tag) {
        if (this.tagList.contains(tag)) {
            ArrayList<Post> foundPosts = new ArrayList<>();
            for (Post post : this.publishedPosts) {
                for (String searchedTag : post.getTags()) {
                    if (searchedTag.equals(tag))
                        foundPosts.add(post);
                }
            }
            return (Post[]) foundPosts.toArray();
        } else {
            return null;
        }
    }

    public Post getPostAtIndex(int index) {
        try {
            Post foundPost = this.publishedPosts.get(index);
            return foundPost;
        } catch (Exception e) {
            return null;
        }
    }

    public boolean validTag(String tag) {
        return (tag.charAt(0) == '#' && !tag.contains(" "));
    }
    
    public String[] getTagsFromTagString(String tagString) {
        Set<String> tags = new HashSet<String>();
        for (String tag : tagString.split(" ")) {
            if (tag.startsWith("#"))
                tags.add(tag);
        }
        return (String[]) tags.toArray();
    }
}
