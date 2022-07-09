package com.abstractyfactory.model.packing;

import com.abstractyfactory.model.packing.Packing;

public class BrazilianPacking implements Packing {
    @Override
    public String pack() {
        return "\t- Empacotando em Portugues";
    }
}
