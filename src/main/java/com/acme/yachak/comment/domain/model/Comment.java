package com.acme.yachak.comment.domain.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Data
@Table("comments")
public class Comment {

    @Id
    @PrimaryKey
    private UUID commentId;

    @Column("post_id")
    private UUID postId;

    @Column("user_id")
    private UUID userId;

    @Column("content")
    private String content;

    @Column("created_at")
    private String createdAt;
}
