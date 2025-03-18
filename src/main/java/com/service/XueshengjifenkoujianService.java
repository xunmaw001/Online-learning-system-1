package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengjifenkoujianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengjifenkoujianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengjifenkoujianView;


/**
 * 学生积分扣减
 *
 * @author 
 * @email 
 * @date 2021-02-05 09:40:21
 */
public interface XueshengjifenkoujianService extends IService<XueshengjifenkoujianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengjifenkoujianVO> selectListVO(Wrapper<XueshengjifenkoujianEntity> wrapper);
   	
   	XueshengjifenkoujianVO selectVO(@Param("ew") Wrapper<XueshengjifenkoujianEntity> wrapper);
   	
   	List<XueshengjifenkoujianView> selectListView(Wrapper<XueshengjifenkoujianEntity> wrapper);
   	
   	XueshengjifenkoujianView selectView(@Param("ew") Wrapper<XueshengjifenkoujianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengjifenkoujianEntity> wrapper);
   	
}

