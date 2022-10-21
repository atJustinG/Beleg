package Geschäftslogic;

import VertragImpl.HerstellerImpl;
import VertragImpl.KremkuchenImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vertrag.Allergen;
import vertrag.Hersteller;
import vertrag.Kremkuchen;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GLTest {
    private List<Kremkuchen> kremkuchenList = new LinkedList<Kremkuchen>();

    @BeforeEach
    public void setup(){
        Hersteller hersteller1 = new HerstellerImpl("Kellogs");
        Hersteller hersteller2 = new HerstellerImpl("Danny");
        Hersteller hersteller3 = new HerstellerImpl("Bahlsen");
        Hersteller hersteller4 = new HerstellerImpl("Koppenrat und Wiesen");
        Collection<Allergen> allergene;
        Date inspektionsdatum = new Date();
        Duration duration;
//        Kremkuchen kuchen1 = new KremkuchenImpl("Sahne", hersteller1, allergene, 100,
//                Duration.ZERO, new BigDecimal(3.50), inspektionsdatum, 0);
    }
    @Test
    void create() {
        fail();
    }

    @Test
    void readEmptyList() {
        GL emptyAutomat = new GL();
        assertEquals(0, emptyAutomat.read().size());
    }

    @Test
    void update() {
        fail();
    }

    @Test
    void delete() {
        fail();
    }
}