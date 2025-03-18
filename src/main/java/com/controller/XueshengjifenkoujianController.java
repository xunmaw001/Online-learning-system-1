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

import com.entity.XueshengjifenkoujianEntity;
import com.entity.view.XueshengjifenkoujianView;

import com.service.XueshengjifenkoujianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 学生积分扣减
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-05 09:40:21
 */
@RestController
@RequestMapping("/xueshengjifenkoujian")
public class XueshengjifenkoujianController {
    @Autowired
    private XueshengjifenkoujianService xueshengjifenkoujianService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XueshengjifenkoujianEntity xueshengjifenkoujian, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			xueshengjifenkoujian.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XueshengjifenkoujianEntity> ew = new EntityWrapper<XueshengjifenkoujianEntity>();
		PageUtils page = xueshengjifenkoujianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengjifenkoujian), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XueshengjifenkoujianEntity xueshengjifenkoujian, HttpServletRequest request){
        EntityWrapper<XueshengjifenkoujianEntity> ew = new EntityWrapper<XueshengjifenkoujianEntity>();
		PageUtils page = xueshengjifenkoujianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengjifenkoujian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XueshengjifenkoujianEntity xueshengjifenkoujian){
       	EntityWrapper<XueshengjifenkoujianEntity> ew = new EntityWrapper<XueshengjifenkoujianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xueshengjifenkoujian, "xueshengjifenkoujian")); 
        return R.ok().put("data", xueshengjifenkoujianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueshengjifenkoujianEntity xueshengjifenkoujian){
        EntityWrapper< XueshengjifenkoujianEntity> ew = new EntityWrapper< XueshengjifenkoujianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xueshengjifenkoujian, "xueshengjifenkoujian")); 
		XueshengjifenkoujianView xueshengjifenkoujianView =  xueshengjifenkoujianService.selectView(ew);
		return R.ok("查询学生积分扣减成功").put("data", xueshengjifenkoujianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XueshengjifenkoujianEntity xueshengjifenkoujian = xueshengjifenkoujianService.selectById(id);
        return R.ok().put("data", xueshengjifenkoujian);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XueshengjifenkoujianEntity xueshengjifenkoujian = xueshengjifenkoujianService.selectById(id);
        return R.ok().put("data", xueshengjifenkoujian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueshengjifenkoujianEntity xueshengjifenkoujian, HttpServletRequest request){
    	xueshengjifenkoujian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengjifenkoujian);

        xueshengjifenkoujianService.insert(xueshengjifenkoujian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XueshengjifenkoujianEntity xueshengjifenkoujian, HttpServletRequest request){
    	xueshengjifenkoujian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengjifenkoujian);

        xueshengjifenkoujianService.insert(xueshengjifenkoujian);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XueshengjifenkoujianEntity xueshengjifenkoujian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xueshengjifenkoujian);
        xueshengjifenkoujianService.updateById(xueshengjifenkoujian);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xueshengjifenkoujianService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<XueshengjifenkoujianEntity> wrapper = new EntityWrapper<XueshengjifenkoujianEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = xueshengjifenkoujianService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
