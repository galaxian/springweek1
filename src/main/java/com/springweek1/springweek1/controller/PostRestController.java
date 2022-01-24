package com.springweek1.springweek1.controller;

import com.springweek1.springweek1.models.Post;
import com.springweek1.springweek1.models.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostRestController {

    private final PostRepository postRepository;

    @GetMapping("/api/posts")
    public List<Post> getPost() {
        return postRepository.findAll();
    }
}
