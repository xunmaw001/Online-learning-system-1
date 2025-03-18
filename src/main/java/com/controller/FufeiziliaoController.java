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

import com.entity.FufeiziliaoEntity;
import com.entity.view.FufeiziliaoView;

import com.service.FufeiziliaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 付费资料
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-05 09:40:21
 */
@RestController
@RequestMapping("/fufeiziliao")
public class FufeiziliaoController {
    @Autowired
    private FufeiziliaoService fufeiziliaoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FufeiziliaoEntity fufeiziliao, HttpServletRequest request){

        EntityWrapper<FufeiziliaoEntity> ew = new EntityWrapper<FufeiziliaoEntity>();
		PageUtils page = fufeiziliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fufeiziliao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FufeiziliaoEntity fufeiziliao, HttpServletRequest request){
        EntityWrapper<FufeiziliaoEntity> ew = new EntityWrapper<FufeiziliaoEntity>();
		PageUtils page = fufeiziliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fufeiziliao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FufeiziliaoEntity fufeiziliao){
       	EntityWrapper<FufeiziliaoEntity> ew = new EntityWrapper<FufeiziliaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fufeiziliao, "fufeiziliao")); 
        return R.ok().put("data", fufeiziliaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FufeiziliaoEntity fufeiziliao){
        EntityWrapper< FufeiziliaoEntity> ew = new EntityWrapper< FufeiziliaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fufeiziliao, "fufeiziliao")); 
		FufeiziliaoView fufeiziliaoView =  fufeiziliaoService.selectView(ew);
		return R.ok("查询付费资料成功").put("data", fufeiziliaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FufeiziliaoEntity fufeiziliao = fufeiziliaoService.selectById(id);
        return R.ok().put("data", fufeiziliao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FufeiziliaoEntity fufeiziliao = fufeiziliaoService.selectById(id);
        return R.ok().put("data", fufeiziliao);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        FufeiziliaoEntity fufeiziliao = fufeiziliaoService.selectById(id);
        if(type.equals("1")) {
        	fufeiziliao.setThumbsupnum(fufeiziliao.getThumbsupnum()+1);
        } else {
        	fufeiziliao.setCrazilynum(fufeiziliao.getCrazilynum()+1);
        }
        fufeiziliaoService.updateById(fufeiziliao);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FufeiziliaoEntity fufeiziliao, HttpServletRequest request){
    	fufeiziliao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fufeiziliao);

        fufeiziliaoService.insert(fufeiziliao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FufeiziliaoEntity fufeiziliao, HttpServletRequest request){
    	fufeiziliao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fufeiziliao);

        fufeiziliaoService.insert(fufeiziliao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody FufeiziliaoEntity fufeiziliao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fufeiziliao);
        fufeiziliaoService.updateById(fufeiziliao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fufeiziliaoService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<FufeiziliaoEntity> wrapper = new EntityWrapper<FufeiziliaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = fufeiziliaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
