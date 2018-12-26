package com.soft1841.sm.entity.impl;


import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.sm.dao.GoodsDAO;
import com.soft1841.sm.entity.Goods;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * 商品DAO的实现类
 *
 * @author 屏儿
 * 2018/12/24
 */
public class GoodsDAOImpl implements GoodsDAO {

    @Override
    public List<Entity> selectGoods() throws SQLException {
        return Db.use().query("SELECT * FROM t_goods");
        }



    @Override
    public int deleteById(long id) throws SQLException {
        return Db.use().del(
                Entity.create("t_goods").set("id", id)
        );
    }

    @Override
    public Long insertGoods(Goods goods) throws SQLException {
        return Db.use().insertForGeneratedKey(
                Entity.create("t_goods")
                        .set("type_id", goods.getType_id())
                        .set("barcode", goods.getBarcode())
                        .set("name", goods.getName())
                        .set("price", goods.getPrice())
        );
    }

    @Override
    public int updateGoods(Goods goods) throws SQLException {
        return Db.use().update(Entity.create().set("price", goods.getPrice())
                        .set("name", goods.getName()),
                Entity.create("t_goods").set("id", goods.getId())
        );
    }

    /**
     * 将Entity转换为Goods
     *
     * @param entity
     * @return Goods
     */
    private Goods convertReader(Entity entity) {
        Goods goods = new Goods();
        goods.setId(entity.getLong("id"));
        goods.setType_id(entity.getStr("type_id"));
        goods.setBarcode(entity.getStr("barcode"));

        goods.setName(entity.getStr("name"));
        goods.setPrice(entity.getDouble("Price"));

        return goods;
    }
}


