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


import com.dao.DiscussfufeiziliaoDao;
import com.entity.DiscussfufeiziliaoEntity;
import com.service.DiscussfufeiziliaoService;
import com.entity.vo.DiscussfufeiziliaoVO;
import com.entity.view.DiscussfufeiziliaoView;

@Service("discussfufeiziliaoService")
public class DiscussfufeiziliaoServiceImpl extends ServiceImpl<DiscussfufeiziliaoDao, DiscussfufeiziliaoEntity> implements DiscussfufeiziliaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfufeiziliaoEntity> page = this.selectPage(
                new Query<DiscussfufeiziliaoEntity>(params).getPage(),
                new EntityWrapper<DiscussfufeiziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfufeiziliaoEntity> wrapper) {
		  Page<DiscussfufeiziliaoView> page =new Query<DiscussfufeiziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfufeiziliaoVO> selectListVO(Wrapper<DiscussfufeiziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfufeiziliaoVO selectVO(Wrapper<DiscussfufeiziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfufeiziliaoView> selectListView(Wrapper<DiscussfufeiziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfufeiziliaoView selectView(Wrapper<DiscussfufeiziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
