package com.acme.yachak.post.domain.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.List;
import java.util.UUID;

@Data
@Table("posts")
public class Post {

    @Id
    @PrimaryKey
    private UUID postId;

    @Column("user_id")
    private UUID userId;

    @Column("group_id")
    private UUID groupId;

    @Column("content")
    private String content;

    @Column("media")
    private String media;

    @Column("rating_avg")
    private double ratingAvg;

    @Column("rates_up")
    private int ratesUp;

    @Column("rates_down")
    private int ratesDown;

    @Column("comments")
    private List<UUID> comments;

    @Column("created_at")
    private String createdAt;

    @Column("updated_at")
    private String updatedAt;
}
