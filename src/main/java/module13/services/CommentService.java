package module13.services;

import com.google.gson.reflect.TypeToken;
import module13.entities.Comment;
import module13.entities.Post;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import static module13.utils.Utils.*;

public class CommentService {
    public List<Comment> getUserCommentsByPost(Post post) throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(POST_URI + "/" + post.getId() + "/comments"))
                .GET()
                .build();

        HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());

        return GSON.fromJson(response.body(), new TypeToken<List<Comment>>() {
        }.getType());
    }
}
