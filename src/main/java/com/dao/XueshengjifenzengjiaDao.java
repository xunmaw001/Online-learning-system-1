package com.dao;

import com.entity.XueshengjifenzengjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengjifenzengjiaVO;
import com.entity.view.XueshengjifenzengjiaView;


/**
 * 学生积分增加
 * 
 * @author 
 * @email 
 * @date 2021-02-05 09:40:21
 */
public interface XueshengjifenzengjiaDao extends BaseMapper<XueshengjifenzengjiaEntity> {
	
	List<XueshengjifenzengjiaVO> selectListVO(@Param("ew") Wrapper<XueshengjifenzengjiaEntity> wrapper);
	
	XueshengjifenzengjiaVO selectVO(@Param("ew") Wrapper<XueshengjifenzengjiaEntity> wrapper);
	
	List<XueshengjifenzengjiaView> selectListView(@Param("ew") Wrapper<XueshengjifenzengjiaEntity> wrapper);

	List<XueshengjifenzengjiaView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengjifenzengjiaEntity> wrapper);
	
	XueshengjifenzengjiaView selectView(@Param("ew") Wrapper<XueshengjifenzengjiaEntity> wrapper);
	
}
