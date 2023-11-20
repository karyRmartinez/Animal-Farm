package org.yu.farm;

public class Sheep extends Animal {
    public Sheep(String name){
        this(AnimalType.SHEEP, name);
    }

    private Sheep(AnimalType species, String name) {
        super(species, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("ehhhh ehhhh");
    }

    @Override
    public void eatUnderYonderTree() {
        super.eatUnderYonderTree();
    }

}
