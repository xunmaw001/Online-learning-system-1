package com.entity.view;

import com.entity.JifenshangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 积分商品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-05 09:40:21
 */
@TableName("jifenshangpin")
public class JifenshangpinView  extends JifenshangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JifenshangpinView(){
	}
 
 	public JifenshangpinView(JifenshangpinEntity jifenshangpinEntity){
 	try {
			BeanUtils.copyProperties(this, jifenshangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
