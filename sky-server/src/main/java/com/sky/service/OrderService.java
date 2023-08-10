package com.sky.service;

import com.sky.dto.*;
import com.sky.result.PageResult;
import com.sky.vo.OrderPaymentVO;
import com.sky.vo.OrderStatisticsVO;
import com.sky.vo.OrderSubmitVO;
import com.sky.vo.OrderVO;

public interface OrderService {

    /**
     * 用户下单
     *
     * @param ordersSubmitDTO
     * @return
     */
    OrderSubmitVO submitOrder(OrdersSubmitDTO ordersSubmitDTO);

    /**
     * 订单支付
     *
     * @param ordersPaymentDTO
     * @return
     */
    OrderPaymentVO payment(OrdersPaymentDTO ordersPaymentDTO);

    /**
     * 支付成功，修改订单状态
     *
     * @param outTradeNo
     */
    void paySuccess(String outTradeNo);

    /**
     * 用户端历史订单查询
     *
     * @param page
     * @param pageSize
     * @param status
     * @return
     */
    PageResult pageQuery4User(int page, int pageSize, Integer status);

    /**
     * 用户端及管理端查询订单详情
     *
     * @param id
     * @return OrderVO
     */
    OrderVO details(Long id);

    /**
     * 用户端取消订单
     *
     * @param id
     * @return
     */
    void cancel(Long id);

    /**
     * 再来一单
     *
     * @param id
     * @return
     */
    void repetition(Long id);

    /**
     * 订单搜索
     *
     * @param ordersPageQueryDTO
     * @return
     */
    PageResult conditionSearch(OrdersPageQueryDTO ordersPageQueryDTO);

    /**
     * 各个状态的订单数量统计 //订单状态 2待接单 3已接单 4派送中
     *
     * @return
     */
    OrderStatisticsVO statistics();

    /**
     * 接单
     *
     * @param ordersConfirmDTO
     * @return
     */
    void confirm(OrdersConfirmDTO ordersConfirmDTO);

    /**
     * 拒单
     *
     * @param ordersRejectionDTO
     * @return
     */
    void rejection(OrdersRejectionDTO ordersRejectionDTO);

    /**
     * 管理端取消订单
     *
     * @param ordersCancelDTO
     * @return
     */
    void cancelByAdmin(OrdersCancelDTO ordersCancelDTO);

    /**
     * 派送订单
     *
     * @param id
     * @return
     */
    void delivery(Long id);

    /**
     * 完成订单
     *
     * @param id
     * @return
     */
    void complete(Long id);

    /**
     * 用户催单
     *
     * @param id
     * @return
     */
    void reminder(Long id);
}