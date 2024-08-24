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

import com.entity.YinshixinxiEntity;
import com.entity.view.YinshixinxiView;

import com.service.YinshixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.YonghuService;
import com.entity.YonghuEntity;

/**
 * 饮食信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-23 21:17:42
 */
@RestController
@RequestMapping("/yinshixinxi")
public class YinshixinxiController {
    @Autowired
    private YinshixinxiService yinshixinxiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YinshixinxiEntity yinshixinxi,
		HttpServletRequest request){
        EntityWrapper<YinshixinxiEntity> ew = new EntityWrapper<YinshixinxiEntity>();

		PageUtils page = yinshixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinshixinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YinshixinxiEntity yinshixinxi, 
		HttpServletRequest request){
        EntityWrapper<YinshixinxiEntity> ew = new EntityWrapper<YinshixinxiEntity>();

		PageUtils page = yinshixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinshixinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YinshixinxiEntity yinshixinxi){
       	EntityWrapper<YinshixinxiEntity> ew = new EntityWrapper<YinshixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yinshixinxi, "yinshixinxi")); 
        return R.ok().put("data", yinshixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YinshixinxiEntity yinshixinxi){
        EntityWrapper< YinshixinxiEntity> ew = new EntityWrapper< YinshixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yinshixinxi, "yinshixinxi")); 
		YinshixinxiView yinshixinxiView =  yinshixinxiService.selectView(ew);
		return R.ok("查询饮食信息成功").put("data", yinshixinxiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YinshixinxiEntity yinshixinxi = yinshixinxiService.selectById(id);
		yinshixinxi.setClicknum(yinshixinxi.getClicknum()+1);
		yinshixinxi.setClicktime(new Date());
		yinshixinxiService.updateById(yinshixinxi);
        yinshixinxi = yinshixinxiService.selectView(new EntityWrapper<YinshixinxiEntity>().eq("id", id));
        return R.ok().put("data", yinshixinxi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YinshixinxiEntity yinshixinxi = yinshixinxiService.selectById(id);
		yinshixinxi.setClicknum(yinshixinxi.getClicknum()+1);
		yinshixinxi.setClicktime(new Date());
		yinshixinxiService.updateById(yinshixinxi);
        yinshixinxi = yinshixinxiService.selectView(new EntityWrapper<YinshixinxiEntity>().eq("id", id));
        return R.ok().put("data", yinshixinxi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YinshixinxiEntity yinshixinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yinshixinxi);
        yinshixinxiService.insert(yinshixinxi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YinshixinxiEntity yinshixinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yinshixinxi);
        yinshixinxiService.insert(yinshixinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YinshixinxiEntity yinshixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yinshixinxi);
        yinshixinxiService.updateById(yinshixinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yinshixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前台智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,YinshixinxiEntity yinshixinxi, HttpServletRequest request,String pre){
        EntityWrapper<YinshixinxiEntity> ew = new EntityWrapper<YinshixinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = yinshixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinshixinxi), params), params));
        return R.ok().put("data", page);
    }


    @Autowired
    private YonghuService yonghuService;
    /**
     * 协同算法（按注册选型推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,YinshixinxiEntity yinshixinxi, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String inteltypeColumn = "yinshileixing";
        String tableName = request.getSession().getAttribute("tableName").toString();
        List<String> inteltypes = new ArrayList<String>();
        if(tableName.equals("yonghu")) {
            YonghuEntity yonghu = yonghuService.selectOne(new EntityWrapper<YonghuEntity>().eq("id", userId));
            inteltypes = Arrays.asList(yonghu.getYinshileixing().split(","));
        }
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<YinshixinxiEntity> yinshixinxiList = new ArrayList<YinshixinxiEntity>();
        //去重
        if(inteltypes!=null && inteltypes.size()>0) {
            for(String s : inteltypes) {
                yinshixinxiList.addAll(yinshixinxiService.selectList(new EntityWrapper<YinshixinxiEntity>().eq(inteltypeColumn, s)));
            }
        }
        EntityWrapper<YinshixinxiEntity> ew = new EntityWrapper<YinshixinxiEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = yinshixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinshixinxi), params), params));
        List<YinshixinxiEntity> pageList = (List<YinshixinxiEntity>)page.getList();
        if(yinshixinxiList.size()<limit) {
            int toAddNum = (limit-yinshixinxiList.size())<=pageList.size()?(limit-yinshixinxiList.size()):pageList.size();
            for(YinshixinxiEntity o1 : pageList) {
                boolean addFlag = true;
                for(YinshixinxiEntity o2 : yinshixinxiList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    yinshixinxiList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        } else if(yinshixinxiList.size()>limit) {
            yinshixinxiList = yinshixinxiList.subList(0, limit);
        }
        page.setList(yinshixinxiList);
        return R.ok().put("data", page);
    }








}
