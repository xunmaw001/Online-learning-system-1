package com.dao;

import com.entity.XueshengjifenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengjifenVO;
import com.entity.view.XueshengjifenView;


/**
 * 学生积分
 * 
 * @author 
 * @email 
 * @date 2021-02-05 09:40:21
 */
public interface XueshengjifenDao extends BaseMapper<XueshengjifenEntity> {
	
	List<XueshengjifenVO> selectListVO(@Param("ew") Wrapper<XueshengjifenEntity> wrapper);
	
	XueshengjifenVO selectVO(@Param("ew") Wrapper<XueshengjifenEntity> wrapper);
	
	List<XueshengjifenView> selectListView(@Param("ew") Wrapper<XueshengjifenEntity> wrapper);

	List<XueshengjifenView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengjifenEntity> wrapper);
	
	XueshengjifenView selectView(@Param("ew") Wrapper<XueshengjifenEntity> wrapper);
	
}
