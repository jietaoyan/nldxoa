package com.fc.v2.iotmanage.mapper;

import com.fc.v2.iotmanage.model.respone.AirConditionInfo;
import com.fc.v2.iotmanage.model.respone.AirConditionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AirConditionInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table air_condition_info
     *
     * @mbg.generated
     */
    long countByExample(AirConditionInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table air_condition_info
     *
     * @mbg.generated
     */
    int deleteByExample(AirConditionInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table air_condition_info
     *
     * @mbg.generated
     */
    int insert(AirConditionInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table air_condition_info
     *
     * @mbg.generated
     */
    int insertSelective(AirConditionInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table air_condition_info
     *
     * @mbg.generated
     */
    List<AirConditionInfo> selectByExample(AirConditionInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table air_condition_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") AirConditionInfo record, @Param("example") AirConditionInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table air_condition_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") AirConditionInfo record, @Param("example") AirConditionInfoExample example);
}