package com.entity.model;

import com.entity.ShiwuyingyangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 食物营养
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-23 21:17:42
 */
public class ShiwuyingyangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
