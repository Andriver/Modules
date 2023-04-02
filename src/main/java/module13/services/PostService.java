package module13.services;

import com.google.gson.reflect.TypeToken;
import module13.entities.Post;
import module13.entities.User;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import static module13.utils.Utils.*;

public class PostService {

    public List<Post> getUserPosts(User user) throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(USERS_URI + "/" + user.getId() + "/posts"))
                .GET()
                .build();

        HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());

        return GSON.fromJson(response.body(), new TypeToken<List<Post>>() {
        }.getType());

    }

    public Post getLastUserPost(User user) throws IOException, InterruptedException {

        List<Post> userPosts = getUserPosts(user);
        Post lastUserPost = null;
        long maxPostId = 0;

        for (Post post : userPosts) {
            if (post.getId() > maxPostId) {
                maxPostId = post.getId();
                lastUserPost = post;
            }
        }

        return lastUserPost;
    }
}
