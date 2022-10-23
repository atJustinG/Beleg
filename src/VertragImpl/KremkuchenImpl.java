package VertragImpl;

import vertrag.Allergen;
import vertrag.Hersteller;
import vertrag.Kremkuchen;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.Collection;
import java.util.Date;

/**
 * @author Justin Glowa Matrikelnummer: 573904
 * implementierung von Kremkuchen
 */
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
                          Duration duration, BigDecimal preis, Date Inspektionsdatum) {
        this.kremsorte = kremsorte;
        this.hersteller = hersteller;
        this.allergene = allergene;
        this.naehrwerte = naehrwerte;
        this.duration = duration;
        this.preis = preis;
        this.inspektionsdatum = Inspektionsdatum;
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

    /**
     * Methode um das Inspektionsdatum zu ändern nicht Teil des Interface
     * @param inspektionsdatum wird ein neuen inspektionsdatum gesetzt
     */
    public void setInspektionsdatum(Date inspektionsdatum){
        this.inspektionsdatum = inspektionsdatum;
    }

    /**
     *
     * @param fachnummer sets die neue Fachnummer
     */
    public void setFachnummer(int fachnummer) {
        this.fachnummer = fachnummer;
    }
}
