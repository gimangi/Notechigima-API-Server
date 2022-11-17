package com.capstone.notechigima.model.dao.sentence;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SentenceWithWriterEntity {
    private int sentenceId;
    private String content;
    private int writerId;
    private String writerName;
}
