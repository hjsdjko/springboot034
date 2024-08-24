package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YingyangpingguEntity;
import com.entity.view.YingyangpingguView;

import com.service.YingyangpingguService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 营养评估
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-23 21:17:42
 */
@RestController
@RequestMapping("/yingyangpinggu")
public class YingyangpingguController {
    @Autowired
    private YingyangpingguService yingyangpingguService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YingyangpingguEntity yingyangpinggu,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqiend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yingyangpinggu.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YingyangpingguEntity> ew = new EntityWrapper<YingyangpingguEntity>();
                if(riqistart!=null) ew.ge("riqi", riqistart);
                if(riqiend!=null) ew.le("riqi", riqiend);

		PageUtils page = yingyangpingguService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yingyangpinggu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YingyangpingguEntity yingyangpinggu, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqiend,
		HttpServletRequest request){
        EntityWrapper<YingyangpingguEntity> ew = new EntityWrapper<YingyangpingguEntity>();
                if(riqistart!=null) ew.ge("riqi", riqistart);
                if(riqiend!=null) ew.le("riqi", riqiend);

		PageUtils page = yingyangpingguService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yingyangpinggu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YingyangpingguEntity yingyangpinggu){
       	EntityWrapper<YingyangpingguEntity> ew = new EntityWrapper<YingyangpingguEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yingyangpinggu, "yingyangpinggu")); 
        return R.ok().put("data", yingyangpingguService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YingyangpingguEntity yingyangpinggu){
        EntityWrapper< YingyangpingguEntity> ew = new EntityWrapper< YingyangpingguEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yingyangpinggu, "yingyangpinggu")); 
		YingyangpingguView yingyangpingguView =  yingyangpingguService.selectView(ew);
		return R.ok("查询营养评估成功").put("data", yingyangpingguView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YingyangpingguEntity yingyangpinggu = yingyangpingguService.selectById(id);
        return R.ok().put("data", yingyangpinggu);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YingyangpingguEntity yingyangpinggu = yingyangpingguService.selectById(id);
        return R.ok().put("data", yingyangpinggu);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YingyangpingguEntity yingyangpinggu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yingyangpinggu);
        yingyangpingguService.insert(yingyangpinggu);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YingyangpingguEntity yingyangpinggu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yingyangpinggu);
        yingyangpingguService.insert(yingyangpinggu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YingyangpingguEntity yingyangpinggu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yingyangpinggu);
        yingyangpingguService.updateById(yingyangpinggu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yingyangpingguService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
