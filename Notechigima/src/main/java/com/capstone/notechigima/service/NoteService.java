package com.capstone.notechigima.service;

import com.capstone.notechigima.config.BaseException;
import com.capstone.notechigima.dto.note.GetNoteResponseDTO;
import com.capstone.notechigima.dto.note.GetNoteSummarizedDTO;
import com.capstone.notechigima.dto.note.PostNoteRequestDTO;

import java.util.List;

public interface NoteService {

    List<GetNoteSummarizedDTO> getNoteList(int topicId) throws BaseException;

    GetNoteResponseDTO getNote(int noteId) throws BaseException;

    int postNote(PostNoteRequestDTO body) throws BaseException;
}
