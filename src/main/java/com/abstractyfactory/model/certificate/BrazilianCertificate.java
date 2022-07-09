package com.abstractyfactory.model.certificate;

import com.abstractyfactory.model.certificate.Certificate;

public class BrazilianCertificate implements Certificate {
    @Override
    public String applyCertification() {
        return "\t- Calibrating Brazilian rules\n\t- Applying Anatel's Stamp";
    }
}
