package com.toly1994.toly_sb.api;

import com.toly1994.toly_sb.model.Widget;
import com.toly1994.toly_sb.service.WidgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/flutter/widget") //api前缀标识
@RestController //控制器 标识
public class WidgetController {
    private  final WidgetService widgetService;

    @Autowired //自动连接 标识
    public WidgetController(WidgetService widgetService) {
        this.widgetService = widgetService;
    }

    @PostMapping //post 标识
    public void add(@RequestBody Widget widget){
        widgetService.add(widget);
    }

    @GetMapping // get 标识
    public List<Widget> getAll(){
        return widgetService.getAll();
    }
}
