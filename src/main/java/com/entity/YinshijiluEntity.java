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
 * 饮食记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-23 21:17:42
 */
@TableName("yinshijilu")
public class YinshijiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YinshijiluEntity() {
		
	}
	
	public YinshijiluEntity(T t) {
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
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	/**
	 * 餐次
	 */
					
	private String canci;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 食物名称
	 */
					
	private String shiwumingcheng;
	
	/**
	 * 蛋白质
	 */
					
	private Double alldanbaizhi;
	
	/**
	 * 脂肪
	 */
					
	private Double allzhifang;
	
	/**
	 * 碳水化合物
	 */
					
	private Double alltanshuihuahewu;
	
	/**
	 * 膳食纤维
	 */
					
	private Double allshanshixianwei;
	
	/**
	 * 热量
	 */
					
	private Double allreliang;
	
	/**
	 * 维生素
	 */
					
	private Double allweishengsu;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	
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
	 * 设置：餐次
	 */
	public void setCanci(String canci) {
		this.canci = canci;
	}
	/**
	 * 获取：餐次
	 */
	public String getCanci() {
		return canci;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
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
	public void setAlldanbaizhi(Double alldanbaizhi) {
		this.alldanbaizhi = alldanbaizhi;
	}
	/**
	 * 获取：蛋白质
	 */
	public Double getAlldanbaizhi() {
		return alldanbaizhi;
	}
	/**
	 * 设置：脂肪
	 */
	public void setAllzhifang(Double allzhifang) {
		this.allzhifang = allzhifang;
	}
	/**
	 * 获取：脂肪
	 */
	public Double getAllzhifang() {
		return allzhifang;
	}
	/**
	 * 设置：碳水化合物
	 */
	public void setAlltanshuihuahewu(Double alltanshuihuahewu) {
		this.alltanshuihuahewu = alltanshuihuahewu;
	}
	/**
	 * 获取：碳水化合物
	 */
	public Double getAlltanshuihuahewu() {
		return alltanshuihuahewu;
	}
	/**
	 * 设置：膳食纤维
	 */
	public void setAllshanshixianwei(Double allshanshixianwei) {
		this.allshanshixianwei = allshanshixianwei;
	}
	/**
	 * 获取：膳食纤维
	 */
	public Double getAllshanshixianwei() {
		return allshanshixianwei;
	}
	/**
	 * 设置：热量
	 */
	public void setAllreliang(Double allreliang) {
		this.allreliang = allreliang;
	}
	/**
	 * 获取：热量
	 */
	public Double getAllreliang() {
		return allreliang;
	}
	/**
	 * 设置：维生素
	 */
	public void setAllweishengsu(Double allweishengsu) {
		this.allweishengsu = allweishengsu;
	}
	/**
	 * 获取：维生素
	 */
	public Double getAllweishengsu() {
		return allweishengsu;
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

}
