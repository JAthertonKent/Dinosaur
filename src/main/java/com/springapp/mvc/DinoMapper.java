package com.springapp.mvc;

import org.apache.ibatis.annotations.*;

import java.util.List;

public interface DinoMapper {
    @Select("SELECT * FROM dinosaur WHERE dinosaur_id = #{dinosaurId}")
    Dinosaur getDinosaurById(@Param("dinosaurId") Long dinosaurId);

    @Select("SELECT * FROM dinosaur")
    @Results(value = {
            @Result(property = "name"),
            @Result(property = "description")
    })
    List<Dinosaur> findAll();

    @Insert("INSERT INTO dinosaur (name, description) VALUES (#{name}, #{description})")
    @Options(keyProperty = "dinosaur_id", keyColumn = "dinosaur_id", useGeneratedKeys = true)
    void insert(Dinosaur dinosaur);

}
