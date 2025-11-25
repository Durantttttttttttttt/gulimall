package com.yang.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yang.common.utils.PageUtils;
import com.yang.common.utils.Query;

import com.yang.gulimall.product.dao.CategoryDao;
import com.yang.gulimall.product.entity.CategoryEntity;
import com.yang.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 范围嵌套搜索树
     * @return
     */
    @Override
    public List<CategoryEntity> listTree() {
        List<CategoryEntity> entityList = baseMapper.selectList(null);

        List<CategoryEntity> list = entityList.stream()
                .filter(entity -> entity.getParentCid() != 0)
                .map((menu) -> {
                    menu.setCategoryEntityList(getChildren(menu, entityList));
                    return menu;
                })
                .sorted((o1, o2) -> {
                    return (o1.getSort() == null ? 0 : o1.getSort()) - (o2.getSort() == null ? 0 : o2.getSort());
                })
                .collect(Collectors.toList());


        return list;
    }

    public List<CategoryEntity> getChildren(CategoryEntity category, List<CategoryEntity> list) {

        List<CategoryEntity> collect = list.stream()
                .filter(entity -> entity.getParentCid() == category.getCatId())
                .map((menu) -> {
                    menu.setCategoryEntityList(getChildren(menu, list));
                    return menu;
                })
                .sorted((o1, o2) -> {
                    return (o1.getSort() == null ? 0 : o1.getSort()) - (o2.getSort() == null ? 0 : o2.getSort());
                })
                .collect(Collectors.toList());
        return collect;

    }

}