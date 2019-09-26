package com.toly1994.toly_sb.dao;

import com.toly1994.toly_sb.model.Widget;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

    @Override
    public Optional<Widget> selectById(UUID id) {
        return DB.stream().filter(widget -> widget.getId().equals(id)).findFirst();
    }

    @Override
    public int deleteById(UUID id) {
      Optional<Widget> widget=  selectById(id);
      if (widget.isEmpty()){
          return 0;
      }
      return  DB.remove(widget.get())?1:0;
    }

    @Override
    public int updateById(UUID id, Widget widget) {

        return selectById(id).map(w->{
            int index = DB.indexOf(w);
            if (index>=0){
                DB.set(index,new Widget(id,widget.getName()));
                return 1;
            }
            return 0;
        }).orElse(0);
    }
}
