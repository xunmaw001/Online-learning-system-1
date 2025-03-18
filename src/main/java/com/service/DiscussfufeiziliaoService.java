package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfufeiziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfufeiziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfufeiziliaoView;


/**
 * 付费资料评论表
 *
 * @author 
 * @email 
 * @date 2021-02-05 09:40:21
 */
public interface DiscussfufeiziliaoService extends IService<DiscussfufeiziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfufeiziliaoVO> selectListVO(Wrapper<DiscussfufeiziliaoEntity> wrapper);
   	
   	DiscussfufeiziliaoVO selectVO(@Param("ew") Wrapper<DiscussfufeiziliaoEntity> wrapper);
   	
   	List<DiscussfufeiziliaoView> selectListView(Wrapper<DiscussfufeiziliaoEntity> wrapper);
   	
   	DiscussfufeiziliaoView selectView(@Param("ew") Wrapper<DiscussfufeiziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfufeiziliaoEntity> wrapper);
   	
}

