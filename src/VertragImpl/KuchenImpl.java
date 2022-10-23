package VertragImpl;

import vertrag.Allergen;
import vertrag.Hersteller;
import vertrag.Kuchen;

import java.time.Duration;
import java.util.Collection;

/**
 * @author Justin Glowa Matrikelnummer: 573904
 * Implementierung vom Kuchen Interface
 */
public class KuchenImpl implements Kuchen {

    private Hersteller hersteller;
    private Collection<Allergen> allergene;
    private int naehrwert;
    private Duration haltbarkeit;

    public KuchenImpl(Hersteller hersteller, Collection<Allergen> allergene, int naehrwert, Duration haltbarkeit) {
        this.hersteller = hersteller;
        this.allergene = allergene;
        this.naehrwert = naehrwert;
        this.haltbarkeit = haltbarkeit;
    }

    @Override
    public Hersteller getHersteller() {
        return hersteller;
    }

    @Override
    public Collection<Allergen> getAllergene() {
        return allergene;
    }

    @Override
    public int getNaehrwert() {
        return naehrwert;
    }

    @Override
    public Duration getHaltbarkeit() {
        return haltbarkeit;
    }
}
