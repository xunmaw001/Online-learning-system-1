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


import com.dao.ZiliaofasongDao;
import com.entity.ZiliaofasongEntity;
import com.service.ZiliaofasongService;
import com.entity.vo.ZiliaofasongVO;
import com.entity.view.ZiliaofasongView;

@Service("ziliaofasongService")
public class ZiliaofasongServiceImpl extends ServiceImpl<ZiliaofasongDao, ZiliaofasongEntity> implements ZiliaofasongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZiliaofasongEntity> page = this.selectPage(
                new Query<ZiliaofasongEntity>(params).getPage(),
                new EntityWrapper<ZiliaofasongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZiliaofasongEntity> wrapper) {
		  Page<ZiliaofasongView> page =new Query<ZiliaofasongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZiliaofasongVO> selectListVO(Wrapper<ZiliaofasongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZiliaofasongVO selectVO(Wrapper<ZiliaofasongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZiliaofasongView> selectListView(Wrapper<ZiliaofasongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZiliaofasongView selectView(Wrapper<ZiliaofasongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
