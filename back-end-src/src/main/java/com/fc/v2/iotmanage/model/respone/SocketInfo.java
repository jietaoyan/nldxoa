package com.fc.v2.iotmanage.model.respone;

import java.io.Serializable;
import java.util.Date;

public class SocketInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column socket_info.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column socket_info.socket_id
     *
     * @mbg.generated
     */
    private Integer socketId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column socket_info.socket_name
     *
     * @mbg.generated
     */
    private String socketName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column socket_info.socket_i
     *
     * @mbg.generated
     */
    private String socketI;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column socket_info.socket_u
     *
     * @mbg.generated
     */
    private String socketU;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column socket_info.socket_p
     *
     * @mbg.generated
     */
    private String socketP;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column socket_info.socket_status
     *
     * @mbg.generated
     */
    private String socketStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column socket_info.socket_clock_status
     *
     * @mbg.generated
     */
    private String socketClockStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column socket_info.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column socket_info.room_id
     *
     * @mbg.generated
     */
    private Integer roomId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column socket_info.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table socket_info
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column socket_info.id
     *
     * @return the value of socket_info.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column socket_info.id
     *
     * @param id the value for socket_info.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column socket_info.socket_id
     *
     * @return the value of socket_info.socket_id
     *
     * @mbg.generated
     */
    public Integer getSocketId() {
        return socketId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column socket_info.socket_id
     *
     * @param socketId the value for socket_info.socket_id
     *
     * @mbg.generated
     */
    public void setSocketId(Integer socketId) {
        this.socketId = socketId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column socket_info.socket_name
     *
     * @return the value of socket_info.socket_name
     *
     * @mbg.generated
     */
    public String getSocketName() {
        return socketName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column socket_info.socket_name
     *
     * @param socketName the value for socket_info.socket_name
     *
     * @mbg.generated
     */
    public void setSocketName(String socketName) {
        this.socketName = socketName == null ? null : socketName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column socket_info.socket_i
     *
     * @return the value of socket_info.socket_i
     *
     * @mbg.generated
     */
    public String getSocketI() {
        return socketI;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column socket_info.socket_i
     *
     * @param socketI the value for socket_info.socket_i
     *
     * @mbg.generated
     */
    public void setSocketI(String socketI) {
        this.socketI = socketI == null ? null : socketI.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column socket_info.socket_u
     *
     * @return the value of socket_info.socket_u
     *
     * @mbg.generated
     */
    public String getSocketU() {
        return socketU;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column socket_info.socket_u
     *
     * @param socketU the value for socket_info.socket_u
     *
     * @mbg.generated
     */
    public void setSocketU(String socketU) {
        this.socketU = socketU == null ? null : socketU.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column socket_info.socket_p
     *
     * @return the value of socket_info.socket_p
     *
     * @mbg.generated
     */
    public String getSocketP() {
        return socketP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column socket_info.socket_p
     *
     * @param socketP the value for socket_info.socket_p
     *
     * @mbg.generated
     */
    public void setSocketP(String socketP) {
        this.socketP = socketP == null ? null : socketP.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column socket_info.socket_status
     *
     * @return the value of socket_info.socket_status
     *
     * @mbg.generated
     */
    public String getSocketStatus() {
        return socketStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column socket_info.socket_status
     *
     * @param socketStatus the value for socket_info.socket_status
     *
     * @mbg.generated
     */
    public void setSocketStatus(String socketStatus) {
        this.socketStatus = socketStatus == null ? null : socketStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column socket_info.socket_clock_status
     *
     * @return the value of socket_info.socket_clock_status
     *
     * @mbg.generated
     */
    public String getSocketClockStatus() {
        return socketClockStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column socket_info.socket_clock_status
     *
     * @param socketClockStatus the value for socket_info.socket_clock_status
     *
     * @mbg.generated
     */
    public void setSocketClockStatus(String socketClockStatus) {
        this.socketClockStatus = socketClockStatus == null ? null : socketClockStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column socket_info.create_time
     *
     * @return the value of socket_info.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column socket_info.create_time
     *
     * @param createTime the value for socket_info.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column socket_info.room_id
     *
     * @return the value of socket_info.room_id
     *
     * @mbg.generated
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column socket_info.room_id
     *
     * @param roomId the value for socket_info.room_id
     *
     * @mbg.generated
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column socket_info.type
     *
     * @return the value of socket_info.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column socket_info.type
     *
     * @param type the value for socket_info.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}