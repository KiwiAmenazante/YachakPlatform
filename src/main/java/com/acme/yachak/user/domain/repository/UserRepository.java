package com.acme.yachak.user.domain.repository;

import com.acme.yachak.user.domain.model.User;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends CassandraRepository<User, UUID> {
    // Puedes añadir métodos de consulta personalizados si es necesario
}
