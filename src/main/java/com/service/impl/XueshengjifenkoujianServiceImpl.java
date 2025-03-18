package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XueshengjifenkoujianDao;
import com.entity.XueshengjifenkoujianEntity;
import com.service.XueshengjifenkoujianService;
import com.entity.vo.XueshengjifenkoujianVO;
import com.entity.view.XueshengjifenkoujianView;

@Service("xueshengjifenkoujianService")
public class XueshengjifenkoujianServiceImpl extends ServiceImpl<XueshengjifenkoujianDao, XueshengjifenkoujianEntity> implements XueshengjifenkoujianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengjifenkoujianEntity> page = this.selectPage(
                new Query<XueshengjifenkoujianEntity>(params).getPage(),
                new EntityWrapper<XueshengjifenkoujianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengjifenkoujianEntity> wrapper) {
		  Page<XueshengjifenkoujianView> page =new Query<XueshengjifenkoujianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengjifenkoujianVO> selectListVO(Wrapper<XueshengjifenkoujianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengjifenkoujianVO selectVO(Wrapper<XueshengjifenkoujianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengjifenkoujianView> selectListView(Wrapper<XueshengjifenkoujianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengjifenkoujianView selectView(Wrapper<XueshengjifenkoujianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
