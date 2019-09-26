package com.toly1994.toly_sb.service;

import com.toly1994.toly_sb.dao.WidgetDao;
import com.toly1994.toly_sb.model.Widget;

public class WidgetService {

    private  final WidgetDao widgetDao;

    public WidgetService(WidgetDao widgetDao) {
        this.widgetDao = widgetDao;
    }

    public int add(Widget widget){
       return widgetDao.add(widget);

    }
}
