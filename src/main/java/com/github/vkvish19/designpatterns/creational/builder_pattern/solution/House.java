package com.github.vkvish19.designpatterns.creational.builder_pattern.solution;

public class House
{
    // mandatory
    private final String roof;
    private final String foundation;
    private final String structure;
    // optional
    private final boolean hasSwimmingPool;
    private final boolean hasGarden;
    private final boolean hasGarage;

    private House(HouseBuilder houseBuilder)
    {
        this.foundation = houseBuilder.foundation;
        this.structure = houseBuilder.structure;
        this.roof = houseBuilder.roof;
        this.hasSwimmingPool = houseBuilder.hasSwimmingPool;
        this.hasGarage = houseBuilder.hasGarage;
        this.hasGarden = houseBuilder.hasGarden;
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

    public static class HouseBuilder
    {
        // mandatory
        private final String roof;
        private final String foundation;
        private final String structure;
        // optional
        private boolean hasSwimmingPool;
        private boolean hasGarden;
        private boolean hasGarage;

        public HouseBuilder(String roof, String foundation, String structure)
        {
            this.roof = roof;
            this.foundation = foundation;
            this.structure = structure;
        }

        public HouseBuilder setSwimmingPool(boolean hasSwimmingPool)
        {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public HouseBuilder setGarage(boolean hasGarage)
        {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setGarden(boolean hasGarden)
        {
            this.hasGarden = hasGarden;
            return this;
        }

        public House build()
        {
            return new House(this);
        }
    }
}
