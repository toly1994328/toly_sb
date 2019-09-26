package com.toly1994.toly_sb.service;

import com.toly1994.toly_sb.dao.WidgetDao;
import com.toly1994.toly_sb.model.Widget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class WidgetService {

    private  final WidgetDao widgetDao;
    @Autowired// Autowired自动连接 + Qualifier 资格限定
    public WidgetService(@ Qualifier("widget") WidgetDao widgetDao) {
        this.widgetDao = widgetDao;
    }

    public int add(Widget widget){
       return widgetDao.add(widget);
    }

    public List<Widget> getAll(){
        return widgetDao.selectAll();
    }

    public Optional<Widget> getById(UUID id){
        return  widgetDao.selectById(id);
    }

    public int updateById(UUID id,Widget newWidget){
        return  widgetDao.updateById(id,newWidget);
    }


    public int deleteById(UUID id){
        return  widgetDao.deleteById(id);
    }
}
