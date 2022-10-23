package VertragImpl;


import vertrag.Hersteller;

/**
 * @author Justin Glowa Matrikelnummer: 573904
 */
public class HerstellerImpl implements Hersteller {
    private String name;

    public HerstellerImpl(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
