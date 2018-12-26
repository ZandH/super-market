package com.soft1841.sm.service;

import com.soft1841.sm.entity.Goods;

import java.util.List;

/**
 * 读者业务逻辑接口
 *
 * @author 屏儿
 * 2018/12/26
 */
public interface GoodsService {
    /**
     * 查询所有商品信息
     *
     * @return List <Goods>
     */

    List<Goods> getAllGoods();

    /**
     * 根据id删除商品
     *
     * @param id
     */
    void deleteGoods(long id);

    /**
     * 新增一种商品，返回自增主键
     *
     * @param goods
     * @return long
     */
    long addGoods(Goods goods);

    /**
     * 修改一种商品，返回自增主键
     *
     * @param goods
     * @return
     */
    String updateGoods(String goods);
}
