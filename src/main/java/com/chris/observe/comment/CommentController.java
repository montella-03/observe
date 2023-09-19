package com.chris.observe.comment;

import io.micrometer.observation.annotation.Observed;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CommentController {
    private final CommentInterface commentInterface;

    public CommentController(CommentInterface commentInterface) {
        this.commentInterface = commentInterface;
    }

    @GetMapping("/comments")
    @Observed(name = "comments", contextualName = "comments")
    public List<Post> getComments() {
       return commentInterface.getComments();
    }

    @GetMapping("/comments/{id}")
    public Post getComment(@PathVariable Integer id) {
        return commentInterface.getComment(id);
    }
}
