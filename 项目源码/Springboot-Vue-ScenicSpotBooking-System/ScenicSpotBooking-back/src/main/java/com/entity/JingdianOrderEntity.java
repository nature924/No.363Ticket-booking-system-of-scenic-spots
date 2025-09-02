package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 旅游景点预定
 *
 * @author 
 * @email
 */
@TableName("jingdian_order")
public class JingdianOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JingdianOrderEntity() {

	}

	public JingdianOrderEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 旅游景点
     */
    @TableField(value = "jingdian_id")

    private Integer jingdianId;


    /**
     * 预定时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "jingdian_order_time")

    private Date jingdianOrderTime;


    /**
     * 预定人数
     */
    @TableField(value = "buy_number")

    private Integer buyNumber;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：旅游景点
	 */
    public Integer getJingdianId() {
        return jingdianId;
    }
    /**
	 * 获取：旅游景点
	 */

    public void setJingdianId(Integer jingdianId) {
        this.jingdianId = jingdianId;
    }
    /**
	 * 设置：预定时间
	 */
    public Date getJingdianOrderTime() {
        return jingdianOrderTime;
    }
    /**
	 * 获取：预定时间
	 */

    public void setJingdianOrderTime(Date jingdianOrderTime) {
        this.jingdianOrderTime = jingdianOrderTime;
    }
    /**
	 * 设置：预定人数
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }
    /**
	 * 获取：预定人数
	 */

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "JingdianOrder{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", jingdianId=" + jingdianId +
            ", jingdianOrderTime=" + jingdianOrderTime +
            ", buyNumber=" + buyNumber +
            ", createTime=" + createTime +
        "}";
    }
}
