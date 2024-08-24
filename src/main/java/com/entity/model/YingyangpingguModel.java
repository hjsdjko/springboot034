package com.entity.model;

import com.entity.YingyangpingguEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 营养评估
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-23 21:17:42
 */
public class YingyangpingguModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
