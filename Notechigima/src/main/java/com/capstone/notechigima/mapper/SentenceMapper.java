package com.capstone.notechigima.mapper;

import com.capstone.notechigima.domain.sentence.Sentence;
import com.capstone.notechigima.dto.sentence.SentenceGetResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SentenceMapper {
    SentenceMapper INSTANCE = Mappers.getMapper(SentenceMapper.class);

    default SentenceGetResponseDTO toSentenceGetResponseDTO(Sentence sentence) {
        return SentenceGetResponseDTO.builder()
                .writerId(sentence.getNote().getOwner().getUserId())
                .writerName(sentence.getNote().getOwner().getNickname())
                .sentenceId(sentence.getSentenceId())
                .sentence(sentence.getContent())
                .build();
    }
}
