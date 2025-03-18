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


import com.dao.FufeiziliaoDao;
import com.entity.FufeiziliaoEntity;
import com.service.FufeiziliaoService;
import com.entity.vo.FufeiziliaoVO;
import com.entity.view.FufeiziliaoView;

@Service("fufeiziliaoService")
public class FufeiziliaoServiceImpl extends ServiceImpl<FufeiziliaoDao, FufeiziliaoEntity> implements FufeiziliaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FufeiziliaoEntity> page = this.selectPage(
                new Query<FufeiziliaoEntity>(params).getPage(),
                new EntityWrapper<FufeiziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FufeiziliaoEntity> wrapper) {
		  Page<FufeiziliaoView> page =new Query<FufeiziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FufeiziliaoVO> selectListVO(Wrapper<FufeiziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FufeiziliaoVO selectVO(Wrapper<FufeiziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FufeiziliaoView> selectListView(Wrapper<FufeiziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FufeiziliaoView selectView(Wrapper<FufeiziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
