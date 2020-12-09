package com.ct.pay.factory;

import com.ct.pay.service.impl.IPay;

/**
 * @description:
 * @author: Cter
 * @date: 2020/12/7
 */
public interface IPayFactory {
    IPay getPay(String tradeType);
}
