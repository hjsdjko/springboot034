package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiwuyingyangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiwuyingyangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiwuyingyangView;


/**
 * 食物营养
 *
 * @author 
 * @email 
 * @date 2024-04-23 21:17:42
 */
public interface ShiwuyingyangService extends IService<ShiwuyingyangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiwuyingyangVO> selectListVO(Wrapper<ShiwuyingyangEntity> wrapper);
   	
   	ShiwuyingyangVO selectVO(@Param("ew") Wrapper<ShiwuyingyangEntity> wrapper);
   	
   	List<ShiwuyingyangView> selectListView(Wrapper<ShiwuyingyangEntity> wrapper);
   	
   	ShiwuyingyangView selectView(@Param("ew") Wrapper<ShiwuyingyangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiwuyingyangEntity> wrapper);

   	

}

