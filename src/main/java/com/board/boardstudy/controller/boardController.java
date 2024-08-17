package com.board.boardstudy.controller;

import com.board.boardstudy.model.boardRes;
import com.board.boardstudy.service.boardSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/board")
public class boardController {

    @Autowired
    boardSerive boardSerive;

    @RequestMapping(value = "/list")
    public ModelAndView list() {
        ModelAndView mav = new ModelAndView("list");

        List<boardRes> arr = boardSerive.boardList();

        List<Integer> arr1 = new ArrayList<>();
        List<String> arr2 =  new ArrayList<>();
        List<String> arr3 =  new ArrayList<>();
        List<String> arr4 =  new ArrayList<>();
        List<String> arr5 =  new ArrayList<>();
        List<String> arr6 =  new ArrayList<>();


        for (boardRes boardRes : arr) {
            arr1.add(boardRes.getId());
            arr2.add(boardRes.getTitle());
            arr3.add(boardRes.getContent());
            arr4.add(boardRes.getWriter());
            arr5.add(boardRes.getCreated_at());
            arr6.add(boardRes.getView_count());

        }
        mav.addObject("boardList", arr);
        mav.addObject("boardList1", arr1);
        mav.addObject("boardList2", arr2);
        mav.addObject("boardList3", arr3);
        mav.addObject("boardList4", arr4);
        mav.addObject("boardList5", arr5);
        mav.addObject("boardList6", arr6);
        return mav;
    }


    @RequestMapping(value = "/login")
    public ModelAndView login() {
        ModelAndView mav = new ModelAndView("login");


        return mav;
    }
    @RequestMapping(value = "/insert")
    public ModelAndView insert() {
        ModelAndView mav = new ModelAndView("insert");


        return mav;
    }
    @RequestMapping(value = "/detail")
    public ModelAndView detail() {
        ModelAndView mav = new ModelAndView("detail");


        return mav;
    }
    @RequestMapping(value = "/join")
    public ModelAndView join() {
        ModelAndView mav = new ModelAndView("join");


        return mav;
    }
}
