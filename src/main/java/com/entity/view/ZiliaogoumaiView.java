package com.entity.view;

import com.entity.ZiliaogoumaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资料购买
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-05 09:40:21
 */
@TableName("ziliaogoumai")
public class ZiliaogoumaiView  extends ZiliaogoumaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZiliaogoumaiView(){
	}
 
 	public ZiliaogoumaiView(ZiliaogoumaiEntity ziliaogoumaiEntity){
 	try {
			BeanUtils.copyProperties(this, ziliaogoumaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
