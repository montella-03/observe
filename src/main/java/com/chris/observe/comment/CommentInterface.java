package com.chris.observe.comment;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

public interface CommentInterface {
    @GetExchange("/comments")
    List<Post> getComments();

    @GetExchange("/comments/{id}")
    public Post getComment(@PathVariable Integer id);
}
