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


import com.dao.ShiwuyingyangDao;
import com.entity.ShiwuyingyangEntity;
import com.service.ShiwuyingyangService;
import com.entity.vo.ShiwuyingyangVO;
import com.entity.view.ShiwuyingyangView;

@Service("shiwuyingyangService")
public class ShiwuyingyangServiceImpl extends ServiceImpl<ShiwuyingyangDao, ShiwuyingyangEntity> implements ShiwuyingyangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiwuyingyangEntity> page = this.selectPage(
                new Query<ShiwuyingyangEntity>(params).getPage(),
                new EntityWrapper<ShiwuyingyangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiwuyingyangEntity> wrapper) {
		  Page<ShiwuyingyangView> page =new Query<ShiwuyingyangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShiwuyingyangVO> selectListVO(Wrapper<ShiwuyingyangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiwuyingyangVO selectVO(Wrapper<ShiwuyingyangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiwuyingyangView> selectListView(Wrapper<ShiwuyingyangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiwuyingyangView selectView(Wrapper<ShiwuyingyangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
