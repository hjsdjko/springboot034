package com.dao;

import com.entity.YingyangpingguEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingyangpingguVO;
import com.entity.view.YingyangpingguView;


/**
 * 营养评估
 * 
 * @author 
 * @email 
 * @date 2024-04-23 21:17:42
 */
public interface YingyangpingguDao extends BaseMapper<YingyangpingguEntity> {
	
	List<YingyangpingguVO> selectListVO(@Param("ew") Wrapper<YingyangpingguEntity> wrapper);
	
	YingyangpingguVO selectVO(@Param("ew") Wrapper<YingyangpingguEntity> wrapper);
	
	List<YingyangpingguView> selectListView(@Param("ew") Wrapper<YingyangpingguEntity> wrapper);

	List<YingyangpingguView> selectListView(Pagination page,@Param("ew") Wrapper<YingyangpingguEntity> wrapper);

	
	YingyangpingguView selectView(@Param("ew") Wrapper<YingyangpingguEntity> wrapper);
	

}
