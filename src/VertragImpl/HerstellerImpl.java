package VertragImpl;

import vertrag.Hersteller;

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
