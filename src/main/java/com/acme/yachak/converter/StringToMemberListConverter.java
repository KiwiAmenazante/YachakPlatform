package com.acme.yachak.converter;

import com.acme.yachak.group.domain.model.Member;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

import java.util.List;

@ReadingConverter
public class StringToMemberListConverter implements Converter<String, List<Member>> {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public List<Member> convert(String source) {
        try {
            return objectMapper.readValue(source, new TypeReference<List<Member>>() {});
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error deserializing members", e);
        }
    }
}
