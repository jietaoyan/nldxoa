package com.fc.v2.iotmanage.mapper;

import java.util.List;

import com.fc.v2.iotmanage.model.respone.ShopInfo;
import com.fc.v2.iotmanage.model.respone.ShopInfoExample;
import org.apache.ibatis.annotations.Param;

public interface ShopInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_info
     *
     * @mbg.generated
     */
    long countByExample(ShopInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_info
     *
     * @mbg.generated
     */
    int deleteByExample(ShopInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_info
     *
     * @mbg.generated
     */
    int insert(ShopInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_info
     *
     * @mbg.generated
     */
    int insertSelective(ShopInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_info
     *
     * @mbg.generated
     */
    List<ShopInfo> selectByExample(ShopInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShopInfo record, @Param("example") ShopInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShopInfo record, @Param("example") ShopInfoExample example);
}