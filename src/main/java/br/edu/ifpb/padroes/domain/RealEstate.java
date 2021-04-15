package br.edu.ifpb.padroes.domain;

import java.util.ArrayList;

public class RealEstate implements Property
{
    private ArrayList<Property> children;

    public RealEstate()
    {
        this.children = new ArrayList<Property>();
    }

    public void addChild(Property p)
    {
        this.children.add(p);
    }

    public Property getChild(int pos)
    {
        return children.get(pos);
    }

    @Override
    public float getPrice()
    {
        int price = 0;
        for (Property p : this.children)
        {
            price += p.getPrice();
        }
        return price;
    }
}