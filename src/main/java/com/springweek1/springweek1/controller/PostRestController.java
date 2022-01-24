package com.springweek1.springweek1.controller;

import com.springweek1.springweek1.models.Post;
import com.springweek1.springweek1.models.PostRepository;
import com.springweek1.springweek1.models.PostRequestDto;
import com.springweek1.springweek1.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostRestController {

    private final PostRepository postRepository;
    private final PostService postService;

    @GetMapping("/api/posts")
    public List<Post> getPost() {
        return postRepository.findAll();
    }

    @PostMapping("api/posts")
    public Post createPost(@RequestBody PostRequestDto requestDto) {
        Post post = new Post(requestDto);
        postRepository.save(post);
        return post;
    }

    @PutMapping("api/posts/{id}")
    public Long updatePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto) {
        postService.update(id, requestDto);
        return id;
    }

    @DeleteMapping("api/posts/{id}")
    public Long deletePost(@PathVariable Long id) {
        postRepository.deleteById(id);
        return id;
    }
}
