package com.lzh.seckill.dao;

import com.lzh.seckill.dataobject.OrderDO;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Sun Oct 27 19:40:03 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Sun Oct 27 19:40:03 CST 2019
     */
    int insert(OrderDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Sun Oct 27 19:40:03 CST 2019
     */
    int insertSelective(OrderDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Sun Oct 27 19:40:03 CST 2019
     */
    OrderDO selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Sun Oct 27 19:40:03 CST 2019
     */
    int updateByPrimaryKeySelective(OrderDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Sun Oct 27 19:40:03 CST 2019
     */
    int updateByPrimaryKey(OrderDO record);
}