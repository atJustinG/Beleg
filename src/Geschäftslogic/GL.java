package Geschäftslogic;

import VertragImpl.KremkuchenImpl;
import vertrag.Kremkuchen;
import vertrag.Kuchen;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class GL {
    private List<Kremkuchen> kremkuchenList = new LinkedList<>();

    public boolean create(Kremkuchen kuchen){
        kremkuchenList.add(kuchen);
        return true;
    }

    public List<Kremkuchen> read(){
        return kremkuchenList;
    }

    public void update(int fachnummer, Date inspektionsDatum){
//        for (KremkuchenImpl k :
//                kremkuchenList) {
//            if(k.getFachnummer() == fachnummer){
//                k.
//            }
//        }
    }

    public boolean delete(Kremkuchen kuchen){
        return kremkuchenList.remove(kuchen);
    }
}
