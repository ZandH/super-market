package dao;

import cn.hutool.db.Entity;
import com.soft1841.sm.dao.GoodsDAO;
import com.soft1841.sm.entity.Goods;
import com.soft1841.sm.utils.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

/**
 * 测试Goods
 *
 * @author 屏儿
 * 2018/12/27
 */
public class GoodsDAOTest {

    //从工厂中获取到GoodsDAO的实例
    private GoodsDAO goodsDAO = DAOFactory.getGoodsDAOInstance();

    public GoodsDAOTest() {

    }


    @Test
    public void selectGoods() throws SQLException {
        List<Entity> goodsList = this.goodsDAO.selectGoods();
        goodsList.forEach(entity -> System.out.println(entity));
    }


    @Test
    public void deleteById() throws SQLException {
        goodsDAO.deleteById(12);
    }
}
