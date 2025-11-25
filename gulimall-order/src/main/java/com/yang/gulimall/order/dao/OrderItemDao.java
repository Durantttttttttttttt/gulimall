package com.yang.gulimall.order.dao;

import com.yang.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author durant
 * @email 1977337091@qq.com
 * @date 2025-11-24 19:17:23
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
