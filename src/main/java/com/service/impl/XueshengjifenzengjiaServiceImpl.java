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


import com.dao.XueshengjifenzengjiaDao;
import com.entity.XueshengjifenzengjiaEntity;
import com.service.XueshengjifenzengjiaService;
import com.entity.vo.XueshengjifenzengjiaVO;
import com.entity.view.XueshengjifenzengjiaView;

@Service("xueshengjifenzengjiaService")
public class XueshengjifenzengjiaServiceImpl extends ServiceImpl<XueshengjifenzengjiaDao, XueshengjifenzengjiaEntity> implements XueshengjifenzengjiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengjifenzengjiaEntity> page = this.selectPage(
                new Query<XueshengjifenzengjiaEntity>(params).getPage(),
                new EntityWrapper<XueshengjifenzengjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengjifenzengjiaEntity> wrapper) {
		  Page<XueshengjifenzengjiaView> page =new Query<XueshengjifenzengjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengjifenzengjiaVO> selectListVO(Wrapper<XueshengjifenzengjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengjifenzengjiaVO selectVO(Wrapper<XueshengjifenzengjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengjifenzengjiaView> selectListView(Wrapper<XueshengjifenzengjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengjifenzengjiaView selectView(Wrapper<XueshengjifenzengjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
