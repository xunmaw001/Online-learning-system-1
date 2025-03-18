package com.dao;

import com.entity.DiscussjifenshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjifenshangpinVO;
import com.entity.view.DiscussjifenshangpinView;


/**
 * 积分商品评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-05 09:40:21
 */
public interface DiscussjifenshangpinDao extends BaseMapper<DiscussjifenshangpinEntity> {
	
	List<DiscussjifenshangpinVO> selectListVO(@Param("ew") Wrapper<DiscussjifenshangpinEntity> wrapper);
	
	DiscussjifenshangpinVO selectVO(@Param("ew") Wrapper<DiscussjifenshangpinEntity> wrapper);
	
	List<DiscussjifenshangpinView> selectListView(@Param("ew") Wrapper<DiscussjifenshangpinEntity> wrapper);

	List<DiscussjifenshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjifenshangpinEntity> wrapper);
	
	DiscussjifenshangpinView selectView(@Param("ew") Wrapper<DiscussjifenshangpinEntity> wrapper);
	
}
