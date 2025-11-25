package com.yang.gulimall.order.controller;

import java.util.Arrays;
import java.util.Map;

import com.yang.gulimall.order.feign.ProductFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.yang.gulimall.order.entity.OrderEntity;
import com.yang.gulimall.order.service.OrderService;
import com.yang.common.utils.PageUtils;
import com.yang.common.utils.R;



/**
 * 订单
 *
 * @author durant
 * @email 1977337091@qq.com
 * @date 2025-11-24 19:17:23
 */
@RestController
@RequestMapping("order/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductFeign productFeign;

    /**
     * 测试调用feign
     *
     */
    @GetMapping("getProductByOrder")
    public R getProductByOrder(@RequestParam("id") Long id) {
        R r = productFeign.returnProduct(id);
        Object o = r.get("attr");
        return R.ok().put("code", 200).put("product", o);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = orderService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		OrderEntity order = orderService.getById(id);

        return R.ok().put("order", order);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OrderEntity order){
		orderService.save(order);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OrderEntity order){
		orderService.updateById(order);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		orderService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
