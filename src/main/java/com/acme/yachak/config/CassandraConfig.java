package com.acme.yachak.config;

import com.acme.yachak.converter.MemberListToStringConverter;
import com.acme.yachak.converter.StringToMemberListConverter;
import org.springframework.data.convert.CustomConversions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

import java.util.Arrays;

@Configuration
@EnableCassandraRepositories(basePackages = "com.acme.yachak")
public class CassandraConfig extends AbstractCassandraConfiguration {

    @Override
    protected String getKeyspaceName() {
        return "yachak_keyspace";  // Reemplaza con el nombre de tu keyspace
    }

    @Bean
    public CustomConversions cassandraCustomConversions() {
        return new CustomConversions(
                CustomConversions.StoreConversions.NONE,
                Arrays.asList(new MemberListToStringConverter(), new StringToMemberListConverter())
        );
    }
}
