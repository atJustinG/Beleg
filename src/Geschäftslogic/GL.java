package Geschäftslogic;

import vertrag.Kremkuchen;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class GL {
    private List<Kremkuchen> kremkuchenList = new LinkedList<>();

    public boolean create(Kremkuchen kuchen){
        throw new UnsupportedOperationException();
    }

    public List<Kremkuchen> read(){
        return kremkuchenList;
    }

    public void update(int fachnummer, Date inspektionsDatum){
        throw new UnsupportedOperationException();
    }

    public boolean delete(Kremkuchen kuchen){
        throw new UnsupportedOperationException();
    }
}
