package com.capstone.notechigima.dto.advice;

import com.capstone.notechigima.domain.comment.CommentDetailEntity;
import com.capstone.notechigima.dto.sentence.SentenceGetResponseDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class AdviceGetResponseDTO {
    @Schema(description = "분석 결과항목 ID", defaultValue = "1")
    private int adviceId;
    @Schema(description = "분석 결과", defaultValue = "상반되는 문장이 있어요.")
    private String advice;
    @Schema(description = "문장 1")
    private SentenceGetResponseDTO sentence1;
    @Schema(description = "문장 2")
    private SentenceGetResponseDTO sentence2;
    @Schema(description = "댓글 목록")
    private List<CommentDetailEntity> comments;

    @Builder
    public AdviceGetResponseDTO(int adviceId, String advice, SentenceGetResponseDTO sentence1, SentenceGetResponseDTO sentence2, List<CommentDetailEntity> comments) {
        this.adviceId = adviceId;
        this.advice = advice;
        this.sentence1 = sentence1;
        this.sentence2 = sentence2;
        this.comments = comments;
    }
}
