package com.springweek1.springweek1.service;

import com.springweek1.springweek1.models.Post;
import com.springweek1.springweek1.models.PostRepository;
import com.springweek1.springweek1.models.PostRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;

    @Transactional
    public Long update(Long id, PostRequestDto requestDto) {
        Post post = postRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 게시글이 존재하지 않습니다.")
        );
        post.update(requestDto);
        return id;
    }
}
