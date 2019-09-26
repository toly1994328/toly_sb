package com.toly1994.toly_sb.api;

import com.toly1994.toly_sb.model.Widget;
import com.toly1994.toly_sb.service.WidgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("/api/flutter/widget") //api前缀标识
@RestController //控制器 标识
public class WidgetController {
    private  final WidgetService widgetService;

    @Autowired //自动连接 标识
    public WidgetController(WidgetService widgetService) {
        this.widgetService = widgetService;
    }

    @PostMapping // @PostMapping post 标识 @Valid 有效的  @NonNull 非空 @RequestBody 请求体
    public void add(@Valid @NonNull @RequestBody Widget widget){
        widgetService.add(widget);
    }

    @GetMapping // get 标识
    public List<Widget> getAll(){
        return widgetService.getAll();
    }

    @GetMapping(path = "{id}") // get 标识  @PathVariable 路径参数
    public Optional<Widget> getById(@PathVariable("id") UUID id){
        return  widgetService.getById(id);
    }

    @DeleteMapping(path = "{id}") // get 标识  @PathVariable 路径参数
    public int deleteById(@PathVariable("id") UUID id){
        return  widgetService.deleteById(id);
    }

    @PutMapping(path = "{id}") //@PutMapping put 标识  @PathVariable 路径参数 @Valid 有效的  @NonNull 非空 @RequestBody 请求体
    public int updateById(@PathVariable("id") UUID id,
                        @Valid @NonNull @RequestBody Widget widget) {
        return widgetService.updateById(id, widget);
    }
}
