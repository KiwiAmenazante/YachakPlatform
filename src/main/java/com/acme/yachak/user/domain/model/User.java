package com.acme.yachak.user.domain.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.List;
import java.util.UUID;

@Data
@Table("users")
public class User {

    @Id
    @PrimaryKey
    private UUID userId;

    @Column("username")
    private String username;

    @Column("email")
    private String email;

    @Column("password")
    private String password;

    @Column("name")
    private String name;

    @Column("picture")
    private String picture;

    @Column("follows")
    private List<UUID> follows;

    @Column("followers")
    private List<UUID> followers;

    @Column("groups")
    private List<UUID> groups;

    @Column("created_at")
    private String createdAt;

    @Column("updated_at")
    private String updatedAt;
}
