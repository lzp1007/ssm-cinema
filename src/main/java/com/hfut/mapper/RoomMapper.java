package com.hfut.mapper;

import com.hfut.model.Room;
import java.util.List;

public interface RoomMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Room record);

    Room selectByPrimaryKey(Long id);

    List<Room> selectAll();
    
    Room selectById(String roomId);

    int updateByPrimaryKey(Room record);
}