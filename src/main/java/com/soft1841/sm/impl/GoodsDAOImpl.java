package com.soft1841.sm.impl;


import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.sm.dao.GoodsDAO;
import com.soft1841.sm.entity.Goods;

import java.sql.SQLException;
import java.util.List;


/**
 * 商品DAO的实现类
 */
public class GoodsDAOImpl implements GoodsDAO {

    public List<Entity> selectGoods() throws SQLException {
        return Db.use().query("SELECT * FROM t_goods");
    }

    public long deleteById(long id) throws SQLException {
        return Db.use().del(Entity.create("t_goods").set("id",id));
    }

    public Long insertGoods(Goods goods) throws SQLException {
        return Db.use().insertForGeneratedKey(
                Entity.create("t_goods")
                .set("type_id",goods.getType_id())
                .set("barcode",goods.getBarcode())
                .set("name",goods.getName())
                .set("price",goods.getPrice())
        );
    }

    public int updateGoods(Goods goods) throws SQLException {
        return Db.use().update(Entity.create().set("price",goods.getPrice())
               .set("name",goods.getName()) ,
                Entity.create("t_goods").set("id",goods.getId())
        );
    }
}
