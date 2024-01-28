/**
package com.example.springdemo.infrastructure;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.springdemo.domain.Task;

@Mapper
public interface TaskMapper {
  @Insert("insert into task (id, name) values (#{id}, #{name})")
  void create(Task task);
  @Select("select * from task where id = #{id}")
  Task findById(@Param("id") String id);
}
*/