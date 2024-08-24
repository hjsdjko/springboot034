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
 * 营养评估
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-23 21:17:42
 */
@TableName("yingyangpinggu")
public class YingyangpingguEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YingyangpingguEntity() {
		
	}
	
	public YingyangpingguEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	/**
	 * 身高/米
	 */
					
	private Double shengao;
	
	/**
	 * 体重/公斤
	 */
					
	private Double tizhong;
	
	/**
	 * BMI
	 */
					
	private Double shentizhiliang;
	
	/**
	 * 营养摄入分析
	 */
					
	private String yingyangsherufenxi;
	
	/**
	 * 营养摄入建议
	 */
					
	private String yingyangsherujianyi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
	/**
	 * 设置：日期
	 */
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
	/**
	 * 设置：身高/米
	 */
	public void setShengao(Double shengao) {
		this.shengao = shengao;
	}
	/**
	 * 获取：身高/米
	 */
	public Double getShengao() {
		return shengao;
	}
	/**
	 * 设置：体重/公斤
	 */
	public void setTizhong(Double tizhong) {
		this.tizhong = tizhong;
	}
	/**
	 * 获取：体重/公斤
	 */
	public Double getTizhong() {
		return tizhong;
	}
	/**
	 * 设置：BMI
	 */
	public void setShentizhiliang(Double shentizhiliang) {
		this.shentizhiliang = shentizhiliang;
	}
	/**
	 * 获取：BMI
	 */
	public Double getShentizhiliang() {
		return shentizhiliang;
	}
	/**
	 * 设置：营养摄入分析
	 */
	public void setYingyangsherufenxi(String yingyangsherufenxi) {
		this.yingyangsherufenxi = yingyangsherufenxi;
	}
	/**
	 * 获取：营养摄入分析
	 */
	public String getYingyangsherufenxi() {
		return yingyangsherufenxi;
	}
	/**
	 * 设置：营养摄入建议
	 */
	public void setYingyangsherujianyi(String yingyangsherujianyi) {
		this.yingyangsherujianyi = yingyangsherujianyi;
	}
	/**
	 * 获取：营养摄入建议
	 */
	public String getYingyangsherujianyi() {
		return yingyangsherujianyi;
	}

}
