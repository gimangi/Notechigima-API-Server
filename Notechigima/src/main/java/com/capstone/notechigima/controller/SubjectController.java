package com.capstone.notechigima.controller;

import com.capstone.notechigima.config.BaseResponse;
import com.capstone.notechigima.config.BaseResponseStatus;
import com.capstone.notechigima.dto.subject.SubjectPostRequestDTO;
import com.capstone.notechigima.dto.topic.TopicGetResponseDTO;
import com.capstone.notechigima.service.SubjectService;
import com.capstone.notechigima.service.TopicService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "subject", description = "과목 API")
@RestController
@RequestMapping("/api/subject")
@RequiredArgsConstructor
public class SubjectController {

    private final TopicService topicService;
    private final SubjectService subjectService;

    @ResponseBody
    @GetMapping("/{subjectId}/topic")
    @Operation(summary = "과목별 토픽 목록", description = "해당 과목 내의 모든 토픽 목록을 조회")
    public BaseResponse<List<TopicGetResponseDTO>> getTopicList(@PathVariable("subjectId") int subjectId) {
        return new BaseResponse(BaseResponseStatus.SUCCESS_READ, topicService.getTopicList(subjectId));
    }

    @PostMapping
    @Operation(summary = "과목 생성", description = "해당 그룹 내에 과목 생성")
    public BaseResponse postSubject(@RequestBody SubjectPostRequestDTO body) {
        subjectService.postSubject(body);
        return new BaseResponse(BaseResponseStatus.SUCCESS_WRITE);
    }

}
