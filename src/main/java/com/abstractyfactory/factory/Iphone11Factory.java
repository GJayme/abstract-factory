package com.abstractyfactory.factory;

import com.abstractyfactory.factory.abstractFactory.CountryRulesAbstractFactory;
import com.abstractyfactory.model.iphone.Iphone;
import com.abstractyfactory.model.iphone.Iphone11;
import com.abstractyfactory.model.iphone.Iphone11Pro;

public class Iphone11Factory extends IphoneFactory{
    public Iphone11Factory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    protected Iphone createIPhone(String level) {
        if(level.equals("standard")) {
            return new Iphone11(rules);
        } else if(level.equals("highEnd")) {
            return new Iphone11Pro(rules);
        } else return null;
    }
}