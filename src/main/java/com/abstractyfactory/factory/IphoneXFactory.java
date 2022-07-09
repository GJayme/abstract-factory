package com.abstractyfactory.factory;

import com.abstractyfactory.factory.abstractFactory.CountryRulesAbstractFactory;
import com.abstractyfactory.model.iphone.Iphone;
import com.abstractyfactory.model.iphone.IphoneX;
import com.abstractyfactory.model.iphone.IphoneXSMax;

public class IphoneXFactory extends IphoneFactory {
    public IphoneXFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    protected Iphone createIPhone(String level) {
        if(level.equals("standard")) {
            return new IphoneX(rules);
        } else if(level.equals("highEnd")) {
            return new IphoneXSMax(rules);
        } else return null;
    }
}
