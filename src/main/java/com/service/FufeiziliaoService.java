package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FufeiziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FufeiziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FufeiziliaoView;


/**
 * 付费资料
 *
 * @author 
 * @email 
 * @date 2021-02-05 09:40:21
 */
public interface FufeiziliaoService extends IService<FufeiziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FufeiziliaoVO> selectListVO(Wrapper<FufeiziliaoEntity> wrapper);
   	
   	FufeiziliaoVO selectVO(@Param("ew") Wrapper<FufeiziliaoEntity> wrapper);
   	
   	List<FufeiziliaoView> selectListView(Wrapper<FufeiziliaoEntity> wrapper);
   	
   	FufeiziliaoView selectView(@Param("ew") Wrapper<FufeiziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FufeiziliaoEntity> wrapper);
   	
}

