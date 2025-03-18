package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JifenshangpinEntity;
import com.entity.view.JifenshangpinView;

import com.service.JifenshangpinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 积分商品
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-05 09:40:21
 */
@RestController
@RequestMapping("/jifenshangpin")
public class JifenshangpinController {
    @Autowired
    private JifenshangpinService jifenshangpinService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JifenshangpinEntity jifenshangpin, HttpServletRequest request){

        EntityWrapper<JifenshangpinEntity> ew = new EntityWrapper<JifenshangpinEntity>();
		PageUtils page = jifenshangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jifenshangpin), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JifenshangpinEntity jifenshangpin, HttpServletRequest request){
        EntityWrapper<JifenshangpinEntity> ew = new EntityWrapper<JifenshangpinEntity>();
		PageUtils page = jifenshangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jifenshangpin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JifenshangpinEntity jifenshangpin){
       	EntityWrapper<JifenshangpinEntity> ew = new EntityWrapper<JifenshangpinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jifenshangpin, "jifenshangpin")); 
        return R.ok().put("data", jifenshangpinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JifenshangpinEntity jifenshangpin){
        EntityWrapper< JifenshangpinEntity> ew = new EntityWrapper< JifenshangpinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jifenshangpin, "jifenshangpin")); 
		JifenshangpinView jifenshangpinView =  jifenshangpinService.selectView(ew);
		return R.ok("查询积分商品成功").put("data", jifenshangpinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JifenshangpinEntity jifenshangpin = jifenshangpinService.selectById(id);
        return R.ok().put("data", jifenshangpin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JifenshangpinEntity jifenshangpin = jifenshangpinService.selectById(id);
        return R.ok().put("data", jifenshangpin);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        JifenshangpinEntity jifenshangpin = jifenshangpinService.selectById(id);
        if(type.equals("1")) {
        	jifenshangpin.setThumbsupnum(jifenshangpin.getThumbsupnum()+1);
        } else {
        	jifenshangpin.setCrazilynum(jifenshangpin.getCrazilynum()+1);
        }
        jifenshangpinService.updateById(jifenshangpin);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JifenshangpinEntity jifenshangpin, HttpServletRequest request){
    	jifenshangpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jifenshangpin);

        jifenshangpinService.insert(jifenshangpin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JifenshangpinEntity jifenshangpin, HttpServletRequest request){
    	jifenshangpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jifenshangpin);

        jifenshangpinService.insert(jifenshangpin);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JifenshangpinEntity jifenshangpin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jifenshangpin);
        jifenshangpinService.updateById(jifenshangpin);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jifenshangpinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JifenshangpinEntity> wrapper = new EntityWrapper<JifenshangpinEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = jifenshangpinService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
