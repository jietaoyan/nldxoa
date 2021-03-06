package com.fc.v2.iotmanage.mapper;

import com.fc.v2.iotmanage.model.respone.EnvInfo;
import com.fc.v2.iotmanage.model.respone.EnvInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnvInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table env_info
     *
     * @mbg.generated
     */
    long countByExample(EnvInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table env_info
     *
     * @mbg.generated
     */
    int deleteByExample(EnvInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table env_info
     *
     * @mbg.generated
     */
    int insert(EnvInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table env_info
     *
     * @mbg.generated
     */
    int insertSelective(EnvInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table env_info
     *
     * @mbg.generated
     */
    List<EnvInfo> selectByExample(EnvInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table env_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EnvInfo record, @Param("example") EnvInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table env_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EnvInfo record, @Param("example") EnvInfoExample example);
}