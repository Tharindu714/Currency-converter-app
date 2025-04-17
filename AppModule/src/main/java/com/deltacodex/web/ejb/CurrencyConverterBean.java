package com.deltacodex.web.ejb;

import com.deltacodex.web.core.remote.CurrencyConverter;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ejb.Stateless;

@Stateless
public class CurrencyConverterBean implements CurrencyConverter {

    public CurrencyConverterBean() {
        System.out.println("CurrencyConverterBean Constructor called :" + this.hashCode());
    }

    @PostConstruct
    public void init(){
        System.out.println("CurrencyConverterBean init Created !!");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("CurrencyConverterBean destroyed !!");
    }

    private static final double USD_TO_LKR_RATE = 298.18;

    @Override
    public double convertToLKR(double amount) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return amount * USD_TO_LKR_RATE;
    }

    @Override
    public double convertToUSD(double amount) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return amount / USD_TO_LKR_RATE;
    }
}
