package com.toly1994.toly_sb.api;

import com.toly1994.toly_sb.model.Widget;
import com.toly1994.toly_sb.service.WidgetService;

public class WidgetController {
    private  final WidgetService widgetService;

    public WidgetController(WidgetService widgetService) {
        this.widgetService = widgetService;
    }

    public void add(Widget widget){
        widgetService.add(widget);
    }
}
