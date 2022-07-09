package com.abstractyfactory.factory.abstractFactory;

import com.abstractyfactory.model.certificate.Certificate;
import com.abstractyfactory.model.certificate.USCertificate;
import com.abstractyfactory.model.packing.Packing;
import com.abstractyfactory.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory{
    @Override
    public Certificate getCertificates() {
        return new USCertificate();
    }

    @Override
    public Packing getPacking() {
        return new USPacking();
    }
}
