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

import com.entity.ShiwuyingyangEntity;
import com.entity.view.ShiwuyingyangView;

import com.service.ShiwuyingyangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 食物营养
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-23 21:17:42
 */
@RestController
@RequestMapping("/shiwuyingyang")
public class ShiwuyingyangController {
    @Autowired
    private ShiwuyingyangService shiwuyingyangService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiwuyingyangEntity shiwuyingyang,
		HttpServletRequest request){
        EntityWrapper<ShiwuyingyangEntity> ew = new EntityWrapper<ShiwuyingyangEntity>();

		PageUtils page = shiwuyingyangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiwuyingyang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShiwuyingyangEntity shiwuyingyang, 
		HttpServletRequest request){
        EntityWrapper<ShiwuyingyangEntity> ew = new EntityWrapper<ShiwuyingyangEntity>();

		PageUtils page = shiwuyingyangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiwuyingyang), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiwuyingyangEntity shiwuyingyang){
       	EntityWrapper<ShiwuyingyangEntity> ew = new EntityWrapper<ShiwuyingyangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiwuyingyang, "shiwuyingyang")); 
        return R.ok().put("data", shiwuyingyangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiwuyingyangEntity shiwuyingyang){
        EntityWrapper< ShiwuyingyangEntity> ew = new EntityWrapper< ShiwuyingyangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiwuyingyang, "shiwuyingyang")); 
		ShiwuyingyangView shiwuyingyangView =  shiwuyingyangService.selectView(ew);
		return R.ok("查询食物营养成功").put("data", shiwuyingyangView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShiwuyingyangEntity shiwuyingyang = shiwuyingyangService.selectById(id);
        return R.ok().put("data", shiwuyingyang);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShiwuyingyangEntity shiwuyingyang = shiwuyingyangService.selectById(id);
        return R.ok().put("data", shiwuyingyang);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShiwuyingyangEntity shiwuyingyang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shiwuyingyang);
        shiwuyingyangService.insert(shiwuyingyang);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShiwuyingyangEntity shiwuyingyang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shiwuyingyang);
        shiwuyingyangService.insert(shiwuyingyang);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShiwuyingyangEntity shiwuyingyang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiwuyingyang);
        shiwuyingyangService.updateById(shiwuyingyang);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shiwuyingyangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
