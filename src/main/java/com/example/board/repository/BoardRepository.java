package com.example.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.board.domain.Board;
import com.example.board.repository.search.BoardSearch;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardSearch {


}
