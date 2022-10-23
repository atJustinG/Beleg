package Geschäftslogic;

import VertragImpl.KremkuchenImpl;
import VertragImpl.KuchenImpl;
import vertrag.Kremkuchen;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
/**
 * Implementierung der Geschäftslogik auf prototypischer basis
 * @author Justin Glowa Matrikelnummer: 573904
 */
public class GL {
    private List<KremkuchenImpl> kremkuchenList = new LinkedList<>();
    private int fachnummerCount;   //Variable um ein finiten Automaten mit 10 plätzen zu simulieren(zu simpel muss erweitert werden in den nächsten Iterationen)

    /**
     * ,
     * @param kuchen fügt Kuchen zum Automaten oder erstellt einen Automaten falls kein Kuchen vorhanden ist
     * @return true wenn ein Kuchen erfolgreich hinzugefügt wurde und false wenn die Fächer "voll" sind
     */
    public boolean create(KremkuchenImpl kuchen){
        fachnummerCount++;
        kuchen.setFachnummer(fachnummerCount);
        if(fachnummerCount <=10) {
            kremkuchenList.add(kuchen);
            return true;
        }
        return false;
    }

    /**
     * liest einen spezifischen Kuchen aus dem Automaten und returned diesen
     * @param fachnummer wird übergeben um den spezifischen Kuchen zu finden
     * @return den gefunden Kuchen oder NULL falls er nicht gefunden wird.
     */
    public KremkuchenImpl readSpecificKuchen(int fachnummer){
        for (KremkuchenImpl k :
                kremkuchenList){
            if(fachnummer == k.getFachnummer()){
                return k;
            }
        }
        return null;
    }

    /**
     * liest den automaten aus
      * @return eine Liste mit Kuchen Objekten
     */
    public List<Kremkuchen> read(){
        List<Kremkuchen> kuchenListTmp = new LinkedList<Kremkuchen>();
        for (KremkuchenImpl k :
                kremkuchenList) {
            kuchenListTmp.add(k);
        }

        return kuchenListTmp;
    }

    /**
     * updates das Inspektionsdatum von einen spezifischen Kuchen
     * @param fachnummer um den richtigen Kuchen ausfindig zu machen
     * @param inspektionsDatum das neue Inspektionsdatum
     */
    public void update(int fachnummer, Date inspektionsDatum){
        for (KremkuchenImpl k :
                kremkuchenList) {
            if(k.getFachnummer() == fachnummer){
                k.setInspektionsdatum(inspektionsDatum);
            }
        }
    }

    /**
     * lösht einen Kuchen aus den Automaten, leider noch nicht kompatibel mit der Fachnummer
     * @param kuchen der zu löschende Kuchen
     * @return true wenn der Kuchen gefunden wurde und entfernt wurde
     */
    public boolean delete(Kremkuchen kuchen){
        return kremkuchenList.remove(kuchen);
    }
}
