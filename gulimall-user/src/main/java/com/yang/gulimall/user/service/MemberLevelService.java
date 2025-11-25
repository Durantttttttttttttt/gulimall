package com.yang.gulimall.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.gulimall.user.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author durant
 * @email 1977337091@qq.com
 * @date 2025-11-24 19:49:55
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

