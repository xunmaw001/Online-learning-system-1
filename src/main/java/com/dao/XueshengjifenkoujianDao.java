package com.dao;

import com.entity.XueshengjifenkoujianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengjifenkoujianVO;
import com.entity.view.XueshengjifenkoujianView;


/**
 * 学生积分扣减
 * 
 * @author 
 * @email 
 * @date 2021-02-05 09:40:21
 */
public interface XueshengjifenkoujianDao extends BaseMapper<XueshengjifenkoujianEntity> {
	
	List<XueshengjifenkoujianVO> selectListVO(@Param("ew") Wrapper<XueshengjifenkoujianEntity> wrapper);
	
	XueshengjifenkoujianVO selectVO(@Param("ew") Wrapper<XueshengjifenkoujianEntity> wrapper);
	
	List<XueshengjifenkoujianView> selectListView(@Param("ew") Wrapper<XueshengjifenkoujianEntity> wrapper);

	List<XueshengjifenkoujianView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengjifenkoujianEntity> wrapper);
	
	XueshengjifenkoujianView selectView(@Param("ew") Wrapper<XueshengjifenkoujianEntity> wrapper);
	
}
