package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingyangpingguEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingyangpingguVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingyangpingguView;


/**
 * 营养评估
 *
 * @author 
 * @email 
 * @date 2024-04-23 21:17:42
 */
public interface YingyangpingguService extends IService<YingyangpingguEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingyangpingguVO> selectListVO(Wrapper<YingyangpingguEntity> wrapper);
   	
   	YingyangpingguVO selectVO(@Param("ew") Wrapper<YingyangpingguEntity> wrapper);
   	
   	List<YingyangpingguView> selectListView(Wrapper<YingyangpingguEntity> wrapper);
   	
   	YingyangpingguView selectView(@Param("ew") Wrapper<YingyangpingguEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingyangpingguEntity> wrapper);

   	

}

