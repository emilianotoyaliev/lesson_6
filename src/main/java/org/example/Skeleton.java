package org.example;

public class Skeleton extends Boss{
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Boss arrows =" + getArrows());
    }
}
