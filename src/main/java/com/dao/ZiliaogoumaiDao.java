package com.dao;

import com.entity.ZiliaogoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZiliaogoumaiVO;
import com.entity.view.ZiliaogoumaiView;


/**
 * 资料购买
 * 
 * @author 
 * @email 
 * @date 2021-02-05 09:40:21
 */
public interface ZiliaogoumaiDao extends BaseMapper<ZiliaogoumaiEntity> {
	
	List<ZiliaogoumaiVO> selectListVO(@Param("ew") Wrapper<ZiliaogoumaiEntity> wrapper);
	
	ZiliaogoumaiVO selectVO(@Param("ew") Wrapper<ZiliaogoumaiEntity> wrapper);
	
	List<ZiliaogoumaiView> selectListView(@Param("ew") Wrapper<ZiliaogoumaiEntity> wrapper);

	List<ZiliaogoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<ZiliaogoumaiEntity> wrapper);
	
	ZiliaogoumaiView selectView(@Param("ew") Wrapper<ZiliaogoumaiEntity> wrapper);
	
}
