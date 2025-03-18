package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengjifenzengjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengjifenzengjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengjifenzengjiaView;


/**
 * 学生积分增加
 *
 * @author 
 * @email 
 * @date 2021-02-05 09:40:21
 */
public interface XueshengjifenzengjiaService extends IService<XueshengjifenzengjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengjifenzengjiaVO> selectListVO(Wrapper<XueshengjifenzengjiaEntity> wrapper);
   	
   	XueshengjifenzengjiaVO selectVO(@Param("ew") Wrapper<XueshengjifenzengjiaEntity> wrapper);
   	
   	List<XueshengjifenzengjiaView> selectListView(Wrapper<XueshengjifenzengjiaEntity> wrapper);
   	
   	XueshengjifenzengjiaView selectView(@Param("ew") Wrapper<XueshengjifenzengjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengjifenzengjiaEntity> wrapper);
   	
}

