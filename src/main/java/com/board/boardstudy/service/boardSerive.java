package com.board.boardstudy.service;

import com.board.boardstudy.mapper.boardMapper;
import com.board.boardstudy.model.boardRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class boardSerive {
    @Autowired
    boardMapper boardMapper;

    public List<boardRes> boardList(){
        return boardMapper.boardList();
    }
}
