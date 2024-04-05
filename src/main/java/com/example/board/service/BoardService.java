package com.example.board.service;

import com.example.board.dto.PageResponseDTO;
import com.example.board.dto.BoardDTO;
import com.example.board.dto.PageRequestDTO;

public interface BoardService {

    Long register(BoardDTO boardDTO);

    BoardDTO readOne(Long bno);

    void modify(BoardDTO boardDTO);

    void remove(Long bno);

    PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO);
}