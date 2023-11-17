package org.yu.farm;

public class Llama extends Animal {
    public Llama(String name){
        this(AnimalType.LLAMA, name);
    }

    private Llama(AnimalType species, String name) {
        super(species, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("chomp chomp");
    }

    @Override
    public void eatUnderYonderTree() {
        super.eatUnderYonderTree();
    }
}
