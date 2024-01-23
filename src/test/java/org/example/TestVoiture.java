package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestVoiture {

    @Test
    void testerSiImmatriculationEstEnMajuscule() {
        Voiture maVoiture = new Voiture();
        maVoiture.setImmatriculation("ab9999cd");

        Assertions.assertEquals("AB9999CD",maVoiture.getImmatriculation());
    }

    @Test
    void testerSiImmatriculationEstEnMajusculeViaConstructeur() {
        Voiture maVoiture = new Voiture("ab9999cd");

        Assertions.assertEquals("AB9999CD",maVoiture.getImmatriculation());
    }

    @Test
    void testerSiCodeFonctionne() {
        Voiture maVoiture = new Voiture("ab9999cd");
        maVoiture.setMoteur(new MoteurMock());

        Assertions.assertEquals("AB9999CDSUPER MOTEUR-4",maVoiture.code());
    }
}
