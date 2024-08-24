package com.entity.view;

import com.entity.YinshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 饮食信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-23 21:17:42
 */
@TableName("yinshixinxi")
public class YinshixinxiView  extends YinshixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YinshixinxiView(){
	}
 
 	public YinshixinxiView(YinshixinxiEntity yinshixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, yinshixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
