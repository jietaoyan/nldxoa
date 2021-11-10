package com.fc.v2.iotmanage.model.respone;

import java.io.Serializable;
import java.util.Date;

public class AirConditionInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column air_condition_info.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column air_condition_info.aircon_id
     *
     * @mbg.generated
     */
    private Integer airconId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column air_condition_info.aircon_name
     *
     * @mbg.generated
     */
    private String airconName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column air_condition_info.air_temp
     *
     * @mbg.generated
     */
    private String airTemp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column air_condition_info.air_status
     *
     * @mbg.generated
     */
    private String airStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column air_condition_info.air_mode
     *
     * @mbg.generated
     */
    private String airMode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column air_condition_info.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column air_condition_info.room_id
     *
     * @mbg.generated
     */
    private Integer roomId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table air_condition_info
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column air_condition_info.id
     *
     * @return the value of air_condition_info.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column air_condition_info.id
     *
     * @param id the value for air_condition_info.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column air_condition_info.aircon_id
     *
     * @return the value of air_condition_info.aircon_id
     *
     * @mbg.generated
     */
    public Integer getAirconId() {
        return airconId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column air_condition_info.aircon_id
     *
     * @param airconId the value for air_condition_info.aircon_id
     *
     * @mbg.generated
     */
    public void setAirconId(Integer airconId) {
        this.airconId = airconId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column air_condition_info.aircon_name
     *
     * @return the value of air_condition_info.aircon_name
     *
     * @mbg.generated
     */
    public String getAirconName() {
        return airconName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column air_condition_info.aircon_name
     *
     * @param airconName the value for air_condition_info.aircon_name
     *
     * @mbg.generated
     */
    public void setAirconName(String airconName) {
        this.airconName = airconName == null ? null : airconName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column air_condition_info.air_temp
     *
     * @return the value of air_condition_info.air_temp
     *
     * @mbg.generated
     */
    public String getAirTemp() {
        return airTemp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column air_condition_info.air_temp
     *
     * @param airTemp the value for air_condition_info.air_temp
     *
     * @mbg.generated
     */
    public void setAirTemp(String airTemp) {
        this.airTemp = airTemp == null ? null : airTemp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column air_condition_info.air_status
     *
     * @return the value of air_condition_info.air_status
     *
     * @mbg.generated
     */
    public String getAirStatus() {
        return airStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column air_condition_info.air_status
     *
     * @param airStatus the value for air_condition_info.air_status
     *
     * @mbg.generated
     */
    public void setAirStatus(String airStatus) {
        this.airStatus = airStatus == null ? null : airStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column air_condition_info.air_mode
     *
     * @return the value of air_condition_info.air_mode
     *
     * @mbg.generated
     */
    public String getAirMode() {
        return airMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column air_condition_info.air_mode
     *
     * @param airMode the value for air_condition_info.air_mode
     *
     * @mbg.generated
     */
    public void setAirMode(String airMode) {
        this.airMode = airMode == null ? null : airMode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column air_condition_info.create_time
     *
     * @return the value of air_condition_info.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column air_condition_info.create_time
     *
     * @param createTime the value for air_condition_info.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column air_condition_info.room_id
     *
     * @return the value of air_condition_info.room_id
     *
     * @mbg.generated
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column air_condition_info.room_id
     *
     * @param roomId the value for air_condition_info.room_id
     *
     * @mbg.generated
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }
}