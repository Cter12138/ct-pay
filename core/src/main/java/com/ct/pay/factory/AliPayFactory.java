package com.ct.pay.factory;

import com.ct.pay.service.AliWebPay;
import com.ct.pay.service.impl.IPay;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author: Cter
 * @date: 2020/12/7
 */
public class AliPayFactory implements IPayFactory {

    @Autowired
    AliWebPay aliWebPay;

    public IPay getPay(String tradeType) {
        return null;
    }
}
