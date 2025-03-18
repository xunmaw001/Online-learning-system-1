package com.dao;

import com.entity.FufeiziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FufeiziliaoVO;
import com.entity.view.FufeiziliaoView;


/**
 * 付费资料
 * 
 * @author 
 * @email 
 * @date 2021-02-05 09:40:21
 */
public interface FufeiziliaoDao extends BaseMapper<FufeiziliaoEntity> {
	
	List<FufeiziliaoVO> selectListVO(@Param("ew") Wrapper<FufeiziliaoEntity> wrapper);
	
	FufeiziliaoVO selectVO(@Param("ew") Wrapper<FufeiziliaoEntity> wrapper);
	
	List<FufeiziliaoView> selectListView(@Param("ew") Wrapper<FufeiziliaoEntity> wrapper);

	List<FufeiziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<FufeiziliaoEntity> wrapper);
	
	FufeiziliaoView selectView(@Param("ew") Wrapper<FufeiziliaoEntity> wrapper);
	
}
