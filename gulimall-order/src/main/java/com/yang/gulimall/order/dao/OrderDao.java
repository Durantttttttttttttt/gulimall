package com.yang.gulimall.order.dao;

import com.yang.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author durant
 * @email 1977337091@qq.com
 * @date 2025-11-24 19:17:23
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
