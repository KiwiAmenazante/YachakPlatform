package com.acme.yachak.group.domain.repository;


import com.acme.yachak.group.domain.model.Group;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GroupRepository extends CassandraRepository<Group, UUID> {
    // Puedes añadir métodos de consulta personalizados si es necesario
}
