package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZiliaofasongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZiliaofasongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZiliaofasongView;


/**
 * 资料发送
 *
 * @author 
 * @email 
 * @date 2021-02-05 09:40:21
 */
public interface ZiliaofasongService extends IService<ZiliaofasongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZiliaofasongVO> selectListVO(Wrapper<ZiliaofasongEntity> wrapper);
   	
   	ZiliaofasongVO selectVO(@Param("ew") Wrapper<ZiliaofasongEntity> wrapper);
   	
   	List<ZiliaofasongView> selectListView(Wrapper<ZiliaofasongEntity> wrapper);
   	
   	ZiliaofasongView selectView(@Param("ew") Wrapper<ZiliaofasongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZiliaofasongEntity> wrapper);
   	
}

