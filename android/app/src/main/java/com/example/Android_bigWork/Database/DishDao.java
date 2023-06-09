package com.example.Android_bigWork.Database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.Android_bigWork.Entity.Dish;

import java.util.List;

@Dao //Dao的声明
public interface DishDao {
    /** 获取所有菜品 */
    @Query("SELECT * FROM dish_table ORDER BY CID")
    List<Dish> getAllDish();

    /** 清除所有菜品 */
    @Query("DELETE FROM dish_table")
    void deleteAllDish();

    /** 添加菜品 */
    @Insert
    void insert(Dish dish);

    @Update
    void update(Dish dish);

    @Delete
    void delete(Dish Dish);

    /** 返回菜品信息 */
    @Query("SELECT * FROM dish_table WHERE name = :name")
    Dish getDishByName(String name);

    /** 返回该分类下所有菜品信息 */
    @Query("SELECT * FROM dish_table WHERE category = :category")
    List<Dish> getDishByCategory(String category);

    @Query("SELECT COUNT(*) FROM dish_table")
    int getDishCount();

}
