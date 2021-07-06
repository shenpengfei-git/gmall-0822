package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author shenpengfei
 * @email shenpengfei@atguigu.com
 * @date 2021-06-26 17:47:47
 */
@Mapper
public interface CategoryMapper extends BaseMapper<CategoryEntity> {
	
}
