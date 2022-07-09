package com.abstractyfactory.factory.abstractFactory;

import com.abstractyfactory.model.certificate.Certificate;
import com.abstractyfactory.model.packing.Packing;

public interface CountryRulesAbstractFactory {

    Certificate getCertificates();

    Packing getPacking();
}
