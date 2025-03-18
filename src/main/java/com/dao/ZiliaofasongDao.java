package com.dao;

import com.entity.ZiliaofasongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZiliaofasongVO;
import com.entity.view.ZiliaofasongView;


/**
 * 资料发送
 * 
 * @author 
 * @email 
 * @date 2021-02-05 09:40:21
 */
public interface ZiliaofasongDao extends BaseMapper<ZiliaofasongEntity> {
	
	List<ZiliaofasongVO> selectListVO(@Param("ew") Wrapper<ZiliaofasongEntity> wrapper);
	
	ZiliaofasongVO selectVO(@Param("ew") Wrapper<ZiliaofasongEntity> wrapper);
	
	List<ZiliaofasongView> selectListView(@Param("ew") Wrapper<ZiliaofasongEntity> wrapper);

	List<ZiliaofasongView> selectListView(Pagination page,@Param("ew") Wrapper<ZiliaofasongEntity> wrapper);
	
	ZiliaofasongView selectView(@Param("ew") Wrapper<ZiliaofasongEntity> wrapper);
	
}
