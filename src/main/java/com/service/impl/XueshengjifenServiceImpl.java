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


import com.dao.XueshengjifenDao;
import com.entity.XueshengjifenEntity;
import com.service.XueshengjifenService;
import com.entity.vo.XueshengjifenVO;
import com.entity.view.XueshengjifenView;

@Service("xueshengjifenService")
public class XueshengjifenServiceImpl extends ServiceImpl<XueshengjifenDao, XueshengjifenEntity> implements XueshengjifenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengjifenEntity> page = this.selectPage(
                new Query<XueshengjifenEntity>(params).getPage(),
                new EntityWrapper<XueshengjifenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengjifenEntity> wrapper) {
		  Page<XueshengjifenView> page =new Query<XueshengjifenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengjifenVO> selectListVO(Wrapper<XueshengjifenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengjifenVO selectVO(Wrapper<XueshengjifenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengjifenView> selectListView(Wrapper<XueshengjifenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengjifenView selectView(Wrapper<XueshengjifenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
