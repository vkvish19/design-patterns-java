package com.github.vkvish19.designpatterns.creational.builder_pattern.problem;

public class House
{
    private String roof;
    private String foundation;
    private String structure;
    private boolean hasSwimmingPool;
    private boolean hasGarden;
    private boolean hasGarage;

    public House(String roof, String foundation, String structure, boolean hasSwimmingPool, boolean hasGarden, boolean hasGarage)
    {
        this.roof = roof;
        this.foundation = foundation;
        this.structure = structure;
        this.hasSwimmingPool = hasSwimmingPool;
        this.hasGarden = hasGarden;
        this.hasGarage = hasGarage;
    }

    @Override
    public String toString()
    {
        return "House{" +
                "roof='" + roof + '\'' +
                ", foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden +
                ", hasGarage=" + hasGarage +
                '}';
    }
}
