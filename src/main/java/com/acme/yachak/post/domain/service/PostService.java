package com.acme.yachak.post.domain.service;

import com.acme.yachak.post.domain.model.Post;
import com.acme.yachak.post.domain.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Optional<Post> getPostById(UUID postId) {
        return postRepository.findById(postId);
    }

    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    public void deletePost(UUID postId) {
        postRepository.deleteById(postId);
    }
}
