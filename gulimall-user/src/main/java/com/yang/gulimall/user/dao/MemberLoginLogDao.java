package com.yang.gulimall.user.dao;

import com.yang.gulimall.user.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author durant
 * @email 1977337091@qq.com
 * @date 2025-11-24 19:49:55
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
