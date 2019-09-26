package com.toly1994.toly_sb.dao;

import com.toly1994.toly_sb.model.Widget;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface WidgetDao {
    int insert(UUID id,Widget widget );

    default int add(Widget widget){
        UUID id =UUID.randomUUID();
        return  insert(id,widget);
    }

    List<Widget> selectAll();

    Optional<Widget> selectById(UUID id);

    int deleteById(UUID id);
    int updateById(UUID id, Widget widget);
}
