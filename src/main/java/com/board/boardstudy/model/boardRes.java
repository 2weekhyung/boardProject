package com.board.boardstudy.model;

import lombok.Data;

@Data
public class boardRes {
    private int id ;
    private String title;
    private String content;
    private String writer;
    private String created_at ;
    private String updated_at ;
    private String view_count;
}
