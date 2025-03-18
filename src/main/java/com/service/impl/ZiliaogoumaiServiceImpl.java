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


import com.dao.ZiliaogoumaiDao;
import com.entity.ZiliaogoumaiEntity;
import com.service.ZiliaogoumaiService;
import com.entity.vo.ZiliaogoumaiVO;
import com.entity.view.ZiliaogoumaiView;

@Service("ziliaogoumaiService")
public class ZiliaogoumaiServiceImpl extends ServiceImpl<ZiliaogoumaiDao, ZiliaogoumaiEntity> implements ZiliaogoumaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZiliaogoumaiEntity> page = this.selectPage(
                new Query<ZiliaogoumaiEntity>(params).getPage(),
                new EntityWrapper<ZiliaogoumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZiliaogoumaiEntity> wrapper) {
		  Page<ZiliaogoumaiView> page =new Query<ZiliaogoumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZiliaogoumaiVO> selectListVO(Wrapper<ZiliaogoumaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZiliaogoumaiVO selectVO(Wrapper<ZiliaogoumaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZiliaogoumaiView> selectListView(Wrapper<ZiliaogoumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZiliaogoumaiView selectView(Wrapper<ZiliaogoumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
