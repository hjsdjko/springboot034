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
 * 食物营养
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-23 21:17:42
 */
@TableName("shiwuyingyang")
public class ShiwuyingyangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShiwuyingyangEntity() {
		
	}
	
	public ShiwuyingyangEntity(T t) {
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
	 * 食物名称
	 */
					
	private String shiwumingcheng;
	
	/**
	 * 蛋白质
	 */
					
	private Double danbaizhi;
	
	/**
	 * 脂肪
	 */
					
	private Double zhifang;
	
	/**
	 * 碳水化合物
	 */
					
	private Double tanshuihuahewu;
	
	/**
	 * 膳食纤维
	 */
					
	private Double shanshixianwei;
	
	/**
	 * 热量
	 */
					
	private Double reliang;
	
	/**
	 * 维生素
	 */
					
	private Double weishengsu;
	
	/**
	 * 相关信息
	 */
					
	private String xiangguanxinxi;
	
	/**
	 * 食物图片
	 */
					
	private String shiwutupian;
	
	
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
	 * 设置：食物名称
	 */
	public void setShiwumingcheng(String shiwumingcheng) {
		this.shiwumingcheng = shiwumingcheng;
	}
	/**
	 * 获取：食物名称
	 */
	public String getShiwumingcheng() {
		return shiwumingcheng;
	}
	/**
	 * 设置：蛋白质
	 */
	public void setDanbaizhi(Double danbaizhi) {
		this.danbaizhi = danbaizhi;
	}
	/**
	 * 获取：蛋白质
	 */
	public Double getDanbaizhi() {
		return danbaizhi;
	}
	/**
	 * 设置：脂肪
	 */
	public void setZhifang(Double zhifang) {
		this.zhifang = zhifang;
	}
	/**
	 * 获取：脂肪
	 */
	public Double getZhifang() {
		return zhifang;
	}
	/**
	 * 设置：碳水化合物
	 */
	public void setTanshuihuahewu(Double tanshuihuahewu) {
		this.tanshuihuahewu = tanshuihuahewu;
	}
	/**
	 * 获取：碳水化合物
	 */
	public Double getTanshuihuahewu() {
		return tanshuihuahewu;
	}
	/**
	 * 设置：膳食纤维
	 */
	public void setShanshixianwei(Double shanshixianwei) {
		this.shanshixianwei = shanshixianwei;
	}
	/**
	 * 获取：膳食纤维
	 */
	public Double getShanshixianwei() {
		return shanshixianwei;
	}
	/**
	 * 设置：热量
	 */
	public void setReliang(Double reliang) {
		this.reliang = reliang;
	}
	/**
	 * 获取：热量
	 */
	public Double getReliang() {
		return reliang;
	}
	/**
	 * 设置：维生素
	 */
	public void setWeishengsu(Double weishengsu) {
		this.weishengsu = weishengsu;
	}
	/**
	 * 获取：维生素
	 */
	public Double getWeishengsu() {
		return weishengsu;
	}
	/**
	 * 设置：相关信息
	 */
	public void setXiangguanxinxi(String xiangguanxinxi) {
		this.xiangguanxinxi = xiangguanxinxi;
	}
	/**
	 * 获取：相关信息
	 */
	public String getXiangguanxinxi() {
		return xiangguanxinxi;
	}
	/**
	 * 设置：食物图片
	 */
	public void setShiwutupian(String shiwutupian) {
		this.shiwutupian = shiwutupian;
	}
	/**
	 * 获取：食物图片
	 */
	public String getShiwutupian() {
		return shiwutupian;
	}

}
