package org.yu.farm;

public interface LifeForm {
   // void eatUnderYonderTree();

    default void eatUnderYonderTree() {
       System.out.println("Eating under tree");
    }
}
