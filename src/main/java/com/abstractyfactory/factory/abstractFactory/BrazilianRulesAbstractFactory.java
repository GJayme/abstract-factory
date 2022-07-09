package com.abstractyfactory.factory.abstractFactory;

import com.abstractyfactory.model.certificate.BrazilianCertificate;
import com.abstractyfactory.model.packing.BrazilianPacking;
import com.abstractyfactory.model.certificate.Certificate;
import com.abstractyfactory.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory{
    @Override
    public Certificate getCertificates() {
        return new BrazilianCertificate();
    }

    @Override
    public Packing getPacking() {
        return new BrazilianPacking();
    }
}
