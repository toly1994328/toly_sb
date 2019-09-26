package com.toly1994.toly_sb.dao;

import com.toly1994.toly_sb.model.Widget;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FackWidgetDataAccessService implements WidgetDao{
    private static List<Widget> DB =new ArrayList<>();

    @Override
    public int insert(UUID id, Widget widget) {
        DB.add(new Widget(id,widget.getName()));
        return 1;
    }
}
