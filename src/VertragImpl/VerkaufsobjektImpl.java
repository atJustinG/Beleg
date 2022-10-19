package VertragImpl;

import vertrag.Verkaufsobjekt;

import java.math.BigDecimal;
import java.util.Date;

public class VerkaufsobjektImpl implements Verkaufsobjekt {

    private BigDecimal preis;
    private Date inspektionsdatum;
    private int fachnummer;

    public VerkaufsobjektImpl(BigDecimal preis, Date inspektionsdatum, int fachnummer) {
        this.preis = preis;
        this.inspektionsdatum = inspektionsdatum;
        this.fachnummer = fachnummer;
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
