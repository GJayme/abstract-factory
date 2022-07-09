package com.abstractyfactory;

import com.abstractyfactory.factory.Iphone11Factory;
import com.abstractyfactory.factory.IphoneFactory;
import com.abstractyfactory.factory.IphoneXFactory;
import com.abstractyfactory.factory.abstractFactory.BrazilianRulesAbstractFactory;
import com.abstractyfactory.factory.abstractFactory.CountryRulesAbstractFactory;
import com.abstractyfactory.model.iphone.Iphone;

public class Main {
    public static void main(String[] args) {
        CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
        IphoneFactory genXFactory = new IphoneXFactory(rules);
        IphoneFactory gen11Factory = new Iphone11Factory(rules);

        System.out.println("### Ordering an iPhone X");
        Iphone iphoneX = genXFactory.orderIPhone("standard");
        System.out.println(iphoneX);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        Iphone iphone11Pro = gen11Factory.orderIPhone("highEnd");
        System.out.println(iphone11Pro);
    }
}
