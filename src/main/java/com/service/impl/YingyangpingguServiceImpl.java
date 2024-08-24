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


import com.dao.YingyangpingguDao;
import com.entity.YingyangpingguEntity;
import com.service.YingyangpingguService;
import com.entity.vo.YingyangpingguVO;
import com.entity.view.YingyangpingguView;

@Service("yingyangpingguService")
public class YingyangpingguServiceImpl extends ServiceImpl<YingyangpingguDao, YingyangpingguEntity> implements YingyangpingguService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingyangpingguEntity> page = this.selectPage(
                new Query<YingyangpingguEntity>(params).getPage(),
                new EntityWrapper<YingyangpingguEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingyangpingguEntity> wrapper) {
		  Page<YingyangpingguView> page =new Query<YingyangpingguView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YingyangpingguVO> selectListVO(Wrapper<YingyangpingguEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingyangpingguVO selectVO(Wrapper<YingyangpingguEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingyangpingguView> selectListView(Wrapper<YingyangpingguEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingyangpingguView selectView(Wrapper<YingyangpingguEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
