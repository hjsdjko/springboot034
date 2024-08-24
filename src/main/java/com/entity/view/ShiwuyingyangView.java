package com.entity.view;

import com.entity.ShiwuyingyangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 食物营养
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-23 21:17:42
 */
@TableName("shiwuyingyang")
public class ShiwuyingyangView  extends ShiwuyingyangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiwuyingyangView(){
	}
 
 	public ShiwuyingyangView(ShiwuyingyangEntity shiwuyingyangEntity){
 	try {
			BeanUtils.copyProperties(this, shiwuyingyangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
