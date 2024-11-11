package com.acme.yachak.group.domain.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.List;
import java.util.UUID;

@Data
@Table("groups")
public class Group {

    @Id
    @PrimaryKey
    private UUID groupId;

    @Column("name")
    private String name;

    @Column("description")
    private String description;

    @Column("admin_id")
    private UUID adminId;

    @Column("members")
    private String members;  // Cambiado de List<Member> a String

    @Column("posts")
    private List<UUID> posts;

    @Column("created_at")
    private String createdAt;
}
