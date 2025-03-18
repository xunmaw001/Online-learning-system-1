package com.dao;

import com.entity.DiscussfufeiziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfufeiziliaoVO;
import com.entity.view.DiscussfufeiziliaoView;


/**
 * 付费资料评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-05 09:40:21
 */
public interface DiscussfufeiziliaoDao extends BaseMapper<DiscussfufeiziliaoEntity> {
	
	List<DiscussfufeiziliaoVO> selectListVO(@Param("ew") Wrapper<DiscussfufeiziliaoEntity> wrapper);
	
	DiscussfufeiziliaoVO selectVO(@Param("ew") Wrapper<DiscussfufeiziliaoEntity> wrapper);
	
	List<DiscussfufeiziliaoView> selectListView(@Param("ew") Wrapper<DiscussfufeiziliaoEntity> wrapper);

	List<DiscussfufeiziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfufeiziliaoEntity> wrapper);
	
	DiscussfufeiziliaoView selectView(@Param("ew") Wrapper<DiscussfufeiziliaoEntity> wrapper);
	
}
