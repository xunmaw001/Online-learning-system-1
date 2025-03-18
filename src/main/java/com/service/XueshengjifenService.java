package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengjifenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengjifenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengjifenView;


/**
 * 学生积分
 *
 * @author 
 * @email 
 * @date 2021-02-05 09:40:21
 */
public interface XueshengjifenService extends IService<XueshengjifenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengjifenVO> selectListVO(Wrapper<XueshengjifenEntity> wrapper);
   	
   	XueshengjifenVO selectVO(@Param("ew") Wrapper<XueshengjifenEntity> wrapper);
   	
   	List<XueshengjifenView> selectListView(Wrapper<XueshengjifenEntity> wrapper);
   	
   	XueshengjifenView selectView(@Param("ew") Wrapper<XueshengjifenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengjifenEntity> wrapper);
   	
}

