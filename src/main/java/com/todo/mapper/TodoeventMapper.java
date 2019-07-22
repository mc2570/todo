package com.todo.mapper;

import com.todo.model.Todoevent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TodoeventMapper {

    List<Todoevent> selectByEventid(@Param("eventid") String eventid);//根据eventid查询所有事件

    Todoevent selectBySeq(@Param("seq") Integer seq);//根据seq查询单个事件

    void updateBySeq(@Param("todoevent") Todoevent todoevent);//根据seq修改事件

    void deleteBySeq(@Param("seq") Integer seq);//根据seq删除事件

    void addTodoEvent(@Param("todoevent") Todoevent todoevent);//增加事件
}