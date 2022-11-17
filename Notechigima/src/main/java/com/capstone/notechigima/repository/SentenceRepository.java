package com.capstone.notechigima.repository;

import com.capstone.notechigima.model.dao.sentence.SentenceEntity;
import com.capstone.notechigima.model.dao.sentence.SentenceWithWriterEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface SentenceRepository {

    List<SentenceEntity> getSentenceListByNoteId(int noteId);
    List<SentenceWithWriterEntity> getSentenceListByTopicId(int topicId);

    int insertAll(Map<String, Object> map);
}
