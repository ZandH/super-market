package com.soft1841.sm.dao;

import cn.hutool.db.Entity;
import com.soft1841.sm.entity.Goods;

import java.sql.SQLException;
import java.util.List;

/**
 * 商品的DAO接口
 *
 * @author 屏儿
 * 2018/12/24
 */
public interface GoodsDAO {
    /**
     * 查询所有商品信息
     *
     * @return List <Goods>
     * @throws SQLException
     */
    List<Entity> selectGoods() throws SQLException;

    /**
     * 根据id删除实体
     *
     * @param id
     * @return
     * @throws SQLException
     */
    int deleteById(long id) throws SQLException;

    /**
     * 新增一种商品，返回自增主键
     *
     * @param goods
     * @return
     * @throws SQLException
     */
    Long insertGoods(Goods goods) throws SQLException;

    /**
     * 修改一种商品，返回自增主键
     *
     * @param goods
     * @return
     * @throws SQLException
     */
    int updateGoods(Goods goods) throws SQLException;
}

