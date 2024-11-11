package com.acme.yachak.group.domain.model;

import lombok.Data;

import java.util.UUID;

// Definición de clase Member dentro del mismo archivo o en uno separado (com.yachak.group.domain.model.Member.java)
@Data
public class Member {
    private UUID userId;
    private String role;
}
