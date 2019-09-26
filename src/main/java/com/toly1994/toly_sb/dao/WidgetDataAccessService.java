package com.toly1994.toly_sb.dao;

import com.toly1994.toly_sb.model.Widget;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("widget")// 仓库标识,可指定名称
public class WidgetDataAccessService implements WidgetDao{
    private static List<Widget> DB =new ArrayList<>();

    @Override
    public int insert(UUID id, Widget widget) {
        DB.add(new Widget(id,widget.getName()));
        return 1;
    }

    @Override
    public List<Widget> selectAll() {
        return DB;
    }
}
