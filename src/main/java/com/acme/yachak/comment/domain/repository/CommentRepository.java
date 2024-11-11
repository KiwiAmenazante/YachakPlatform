package com.acme.yachak.comment.domain.repository;

import com.acme.yachak.comment.domain.model.Comment;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CommentRepository extends CassandraRepository<Comment, UUID> {
    // Métodos de consulta personalizados (si son necesarios)
}
