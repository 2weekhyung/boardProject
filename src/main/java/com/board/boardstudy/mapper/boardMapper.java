package com.board.boardstudy.mapper;

import com.board.boardstudy.model.boardRes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface boardMapper {

    // 게시판 출력
    List<boardRes> boardList();
}


