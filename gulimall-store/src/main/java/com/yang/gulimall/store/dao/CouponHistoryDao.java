package com.yang.gulimall.store.dao;

import com.yang.gulimall.store.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author durant
 * @email 1977337091@qq.com
 * @date 2025-11-24 19:47:03
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
