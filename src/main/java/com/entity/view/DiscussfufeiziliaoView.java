package com.entity.view;

import com.entity.DiscussfufeiziliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 付费资料评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-05 09:40:21
 */
@TableName("discussfufeiziliao")
public class DiscussfufeiziliaoView  extends DiscussfufeiziliaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussfufeiziliaoView(){
	}
 
 	public DiscussfufeiziliaoView(DiscussfufeiziliaoEntity discussfufeiziliaoEntity){
 	try {
			BeanUtils.copyProperties(this, discussfufeiziliaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
