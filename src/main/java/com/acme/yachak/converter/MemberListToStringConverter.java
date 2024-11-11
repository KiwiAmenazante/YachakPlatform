package com.acme.yachak.converter;

import com.acme.yachak.group.domain.model.Member;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;

import java.util.List;

@WritingConverter
public class MemberListToStringConverter implements Converter<List<Member>, String> {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convert(List<Member> members) {
        try {
            return objectMapper.writeValueAsString(members);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error serializing members", e);
        }
    }
}
