package com.entity.vo;

import com.entity.YinshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 饮食信息
 * @author 
 * @email 
 * @date 2024-04-23 21:17:42
 */
public class YinshixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 饮食类型
	 */
	
	private String yinshileixing;
		
	/**
	 * 制作难度
	 */
	
	private String zhizuonandu;
		
	/**
	 * 主要材料
	 */
	
	private String zhuyaocailiao;
		
	/**
	 * 营养价值
	 */
	
	private String yingyangjiazhi;
		
	/**
	 * 适宜人群
	 */
	
	private String shiyirenqun;
		
	/**
	 * 饮食视频
	 */
	
	private String yinshishipin;
		
	/**
	 * 制作步骤
	 */
	
	private String zhizuobuzhou;
		
	/**
	 * 饮食图片
	 */
	
	private String yinshitupian;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：饮食类型
	 */
	 
	public void setYinshileixing(String yinshileixing) {
		this.yinshileixing = yinshileixing;
	}
	
	/**
	 * 获取：饮食类型
	 */
	public String getYinshileixing() {
		return yinshileixing;
	}
				
	
	/**
	 * 设置：制作难度
	 */
	 
	public void setZhizuonandu(String zhizuonandu) {
		this.zhizuonandu = zhizuonandu;
	}
	
	/**
	 * 获取：制作难度
	 */
	public String getZhizuonandu() {
		return zhizuonandu;
	}
				
	
	/**
	 * 设置：主要材料
	 */
	 
	public void setZhuyaocailiao(String zhuyaocailiao) {
		this.zhuyaocailiao = zhuyaocailiao;
	}
	
	/**
	 * 获取：主要材料
	 */
	public String getZhuyaocailiao() {
		return zhuyaocailiao;
	}
				
	
	/**
	 * 设置：营养价值
	 */
	 
	public void setYingyangjiazhi(String yingyangjiazhi) {
		this.yingyangjiazhi = yingyangjiazhi;
	}
	
	/**
	 * 获取：营养价值
	 */
	public String getYingyangjiazhi() {
		return yingyangjiazhi;
	}
				
	
	/**
	 * 设置：适宜人群
	 */
	 
	public void setShiyirenqun(String shiyirenqun) {
		this.shiyirenqun = shiyirenqun;
	}
	
	/**
	 * 获取：适宜人群
	 */
	public String getShiyirenqun() {
		return shiyirenqun;
	}
				
	
	/**
	 * 设置：饮食视频
	 */
	 
	public void setYinshishipin(String yinshishipin) {
		this.yinshishipin = yinshishipin;
	}
	
	/**
	 * 获取：饮食视频
	 */
	public String getYinshishipin() {
		return yinshishipin;
	}
				
	
	/**
	 * 设置：制作步骤
	 */
	 
	public void setZhizuobuzhou(String zhizuobuzhou) {
		this.zhizuobuzhou = zhizuobuzhou;
	}
	
	/**
	 * 获取：制作步骤
	 */
	public String getZhizuobuzhou() {
		return zhizuobuzhou;
	}
				
	
	/**
	 * 设置：饮食图片
	 */
	 
	public void setYinshitupian(String yinshitupian) {
		this.yinshitupian = yinshitupian;
	}
	
	/**
	 * 获取：饮食图片
	 */
	public String getYinshitupian() {
		return yinshitupian;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
