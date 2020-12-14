package com.ct.pay.factory;

import com.ct.pay.service.WxAPPPay;
import com.ct.pay.service.WxJSAPIPay;
import com.ct.pay.service.impl.IPay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Cter
 * @date: 2020/12/8
 */

@Service
public class WxPayFactory implements IPayFactory {

    @Autowired
    private WxJSAPIPay wxJSAPIPay;

    @Autowired
    private WxAPPPay wxAPPPay;

    public IPay getPay(String tradeType) {
        return null;
    }
}
