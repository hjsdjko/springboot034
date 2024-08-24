package com.dao;

import com.entity.ShiwuyingyangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiwuyingyangVO;
import com.entity.view.ShiwuyingyangView;


/**
 * 食物营养
 * 
 * @author 
 * @email 
 * @date 2024-04-23 21:17:42
 */
public interface ShiwuyingyangDao extends BaseMapper<ShiwuyingyangEntity> {
	
	List<ShiwuyingyangVO> selectListVO(@Param("ew") Wrapper<ShiwuyingyangEntity> wrapper);
	
	ShiwuyingyangVO selectVO(@Param("ew") Wrapper<ShiwuyingyangEntity> wrapper);
	
	List<ShiwuyingyangView> selectListView(@Param("ew") Wrapper<ShiwuyingyangEntity> wrapper);

	List<ShiwuyingyangView> selectListView(Pagination page,@Param("ew") Wrapper<ShiwuyingyangEntity> wrapper);

	
	ShiwuyingyangView selectView(@Param("ew") Wrapper<ShiwuyingyangEntity> wrapper);
	

}
