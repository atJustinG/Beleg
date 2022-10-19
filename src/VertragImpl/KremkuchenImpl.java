package VertragImpl;

import vertrag.Allergen;
import vertrag.Hersteller;
import vertrag.Kremkuchen;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.Collection;
import java.util.Date;

public class KremkuchenImpl implements Kremkuchen {

    private String kremsorte;
    private Hersteller hersteller;
    private Collection<Allergen> allergene;
    private int naehrwerte;
    private Duration duration;
    private BigDecimal preis;
    private Date inspektionsdatum;
    private int fachnummer;

    public KremkuchenImpl(String kremsorte, Hersteller hersteller, Collection<Allergen> allergene, int naehrwerte,
                          Duration duration, BigDecimal preis, Date Inspektionsdatum, int fachnummer) {
        this.kremsorte = kremsorte;
        this.hersteller = hersteller;
        this.allergene = allergene;
        this.naehrwerte = naehrwerte;
        this.duration = duration;
        this.preis = preis;
        this.inspektionsdatum = Inspektionsdatum;
        this.fachnummer = fachnummer;
    }

    @Override
    public String getKremsorte() {
        return kremsorte;
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
        return naehrwerte;
    }

    @Override
    public Duration getHaltbarkeit() {
        return duration;
    }

    @Override
    public BigDecimal getPreis() {
        return preis;
    }

    @Override
    public Date getInspektionsdatum() {
        return inspektionsdatum;
    }

    @Override
    public int getFachnummer() {
        return fachnummer;
    }
}
