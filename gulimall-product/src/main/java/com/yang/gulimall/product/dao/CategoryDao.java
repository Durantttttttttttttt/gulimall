package com.yang.gulimall.product.dao;

import com.yang.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author durant
 * @email 1977337091@qq.com
 * @date 2025-11-24 19:43:42
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
