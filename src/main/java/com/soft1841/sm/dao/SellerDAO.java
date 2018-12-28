package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Seller;

import java.sql.SQLException;

/**
 * DAO接口
 * @author 屏儿
 * 2018/12/28
 */
public interface SellerDAO {

    /**
     * 根据工号查询收银员
     * @param number
     * @return
     * @throws SQLException
     */
    Seller getSellerByNumber(String number)throws SQLException;
}
