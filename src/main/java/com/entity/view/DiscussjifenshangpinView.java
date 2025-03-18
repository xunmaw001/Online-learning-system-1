package com.entity.view;

import com.entity.DiscussjifenshangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 积分商品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-05 09:40:21
 */
@TableName("discussjifenshangpin")
public class DiscussjifenshangpinView  extends DiscussjifenshangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjifenshangpinView(){
	}
 
 	public DiscussjifenshangpinView(DiscussjifenshangpinEntity discussjifenshangpinEntity){
 	try {
			BeanUtils.copyProperties(this, discussjifenshangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
