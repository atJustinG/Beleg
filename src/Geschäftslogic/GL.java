package Geschäftslogic;

import VertragImpl.KremkuchenImpl;
import VertragImpl.KuchenImpl;
import vertrag.Kremkuchen;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class GL {
    private List<KremkuchenImpl> kremkuchenList = new LinkedList<>();

    public boolean create(KremkuchenImpl kuchen){
        kremkuchenList.add(kuchen);
        return true;
    }

    public List<Kremkuchen> read(){
        List<Kremkuchen> kuchenListTmp = new LinkedList<Kremkuchen>();
        for (KremkuchenImpl k :
                kremkuchenList) {
            kuchenListTmp.add(k);
        }

        return kuchenListTmp;
    }

    public void update(int fachnummer, Date inspektionsDatum){
        for (KremkuchenImpl k :
                kremkuchenList) {
            if(k.getFachnummer() == fachnummer){
                k.setInspektionsdatum(inspektionsDatum);
            }
        }
    }

    public boolean delete(Kremkuchen kuchen){
        return kremkuchenList.remove(kuchen);
    }
}
