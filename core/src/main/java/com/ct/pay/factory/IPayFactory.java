package com.ct.pay.factory;

import com.ct.pay.service.IPayService;

/**
 * @description:
 * @author: Cter
 * @date: 2020/12/7
 */
public interface IPayFactory {
    IPayService getPay(String tradeType);
}
