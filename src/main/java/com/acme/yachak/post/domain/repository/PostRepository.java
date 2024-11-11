package com.acme.yachak.post.domain.repository;

import com.acme.yachak.post.domain.model.Post;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PostRepository extends CassandraRepository<Post, UUID> {
    // Métodos de consulta personalizados (si son necesarios)
}
