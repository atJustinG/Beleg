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
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Justin Glowa Matrikelnummer: 573904
 */
class GLTest {
    /**
     * Variablen für Testdaten
     */
    private List<Kremkuchen> kremkuchenList = new LinkedList<Kremkuchen>();
    private KremkuchenImpl kuchen1;
    private KremkuchenImpl kuchen2;
    private KremkuchenImpl kuchen3;
    private KremkuchenImpl kuchen4;
    private Date inspektionsdatum;
    private Date inspektionsDatum2;

    /**
     * setup Methode um Testdaten anzulegen
     */
    @BeforeEach
    public void setup(){
        Hersteller hersteller1 = new HerstellerImpl("Kellogs");
        Hersteller hersteller2 = new HerstellerImpl("Danny");
        Hersteller hersteller3 = new HerstellerImpl("Bahlsen");
        Hersteller hersteller4 = new HerstellerImpl("Koppenrat und Wiesen");
        Collection<Allergen> allergene1 = new ArrayList<>();
        Collection<Allergen> allergene2 = new ArrayList<>();
        Collection<Allergen> allergene3 = new ArrayList<>();
        Collection<Allergen> allergene4 = new ArrayList<>();
        allergene1.add(Allergen.Gluten);
        allergene2.add(Allergen.Erdnuss);
        allergene3.add(Allergen.Haselnuss);
        allergene4.add(Allergen.Sesamsamen);
        inspektionsdatum = new Date();
        inspektionsdatum.setTime(1350);
        Duration duration;
        kuchen1 = new KremkuchenImpl("Sahne", hersteller1, allergene1, 150,
                Duration.ZERO, new BigDecimal(3.50), inspektionsdatum);
        kuchen2 = new KremkuchenImpl("Sahne", hersteller2, allergene2, 50,
                Duration.ZERO, new BigDecimal(3.50), inspektionsdatum);
        kuchen3 = new KremkuchenImpl("Sahne", hersteller2, allergene3, 80,
                Duration.ZERO, new BigDecimal(3.50), inspektionsdatum);
        kuchen4 = new KremkuchenImpl("Sahne", hersteller3, allergene4, 30,
                Duration.ZERO, new BigDecimal(3.50), inspektionsdatum);
    }

    /**
     * testet ob ein Kuchen erstellt wurde
     */
    @Test
    void create(){
        GL automatCreate = new GL();
        assertTrue(automatCreate.create(kuchen1));
    }

    /**
     * testet die funktionalität der inkrementierten Fachnummer
     */
    @Test
    void readCorrectFachnummer() {
        GL automatFachnummerTest = new GL();
        automatFachnummerTest.create(kuchen1);
        automatFachnummerTest.create(kuchen2);
        int expected = 2;
        assertEquals(expected, automatFachnummerTest.read().size());
    }

    /**
     * tested ob ein Automat leer ist wenn kein Kuchen hinzugefügt wurde
     */
    @Test
    void readEmptyList() {
        GL emptyAutomat = new GL();
        assertEquals(0, emptyAutomat.read().size());
    }

//    @Test
//    void update() {
//        GL automatUpdateTest = new GL();
//        automatUpdateTest.create(kuchen1);
//        automatUpdateTest.create(kuchen2);
//        automatUpdateTest.create(kuchen3);
//        wait(300);
//        inspektionsDatum2 = new Date();
//
//        automatUpdateTest.update(2, inspektionsDatum2);
//
//        assertEquals(inspektionsDatum2, automatUpdateTest.readSpecificKuchen(2).getInspektionsdatum());
//    }

    /**
     * testet ob ein Kuchen gelöscht wird
     */
    @Test
    void delete() {
        GL automatDeleteTest = new GL();
        automatDeleteTest.create(kuchen1);
        automatDeleteTest.create(kuchen2);
        automatDeleteTest.delete(kuchen1);
        int actual = automatDeleteTest.read().size();
        int expected = 1;
        assertEquals(expected, actual);

    }
}