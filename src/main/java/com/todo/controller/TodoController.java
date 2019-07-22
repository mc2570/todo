package com.todo.controller;

import com.todo.mapper.TodoeventMapper;
import com.todo.model.Todoevent;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class TodoController {

    @Autowired
    TodoeventMapper todoeventMapper;

    //根据eventid查询事件
    @ResponseBody
    @RequestMapping("querybyeventidC")
    public List<Todoevent> querybyEventidC(@RequestParam("data")String eventid){
        List<Todoevent> todoevents = todoeventMapper.selectByEventid(eventid);
        return todoevents;
    }

    //根据seq查询事件
    @ResponseBody
    @RequestMapping("querybySeq")
    public Todoevent querybySeq(@RequestParam("seq") Integer seq){
        Todoevent todoevent = todoeventMapper.selectBySeq(seq);
        return todoevent;
    }

    //根据seq保存修改后的事项
    @ResponseBody
    @RequestMapping("updatebySeq")
    public void updatebySeq(@RequestParam("eventid")String eventid,@RequestParam("context") String context,@RequestParam("seq") Integer seq){
        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String level = df.format(day);
        System.out.println(df.format(day));
        Todoevent todoevent = new Todoevent(seq,eventid,context,level);
        todoeventMapper.updateBySeq(todoevent);
    }

    //根据seq删除事项
    @ResponseBody
    @RequestMapping("deletebySeq")
    public void deletebySeq(@RequestParam("seq") Integer seq){
        System.out.println(seq);
        todoeventMapper.deleteBySeq(seq);
    }

    //增加事项
    @ResponseBody
    @RequestMapping("addtodoEvent")
    public void addtodoEvent(@RequestParam("eventid") String eventid,@RequestParam("context") String context){
        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String level = df.format(day);
        System.out.println(df.format(day));
        Todoevent todoevent = new Todoevent(eventid,context,level);
        todoeventMapper.addTodoEvent(todoevent);
    }

}
