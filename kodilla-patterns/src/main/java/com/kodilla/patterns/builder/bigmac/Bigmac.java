package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String bun;
    private final String sauce;
    private final int burgers;
    private List<String> ingredients;

    private Bigmac(final String bun,final String sauce,final int burgers,List<String> ingredients) {
        this.bun = bun;
        this.sauce = sauce;
        this.burgers = burgers;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public static class BigmacBuilder{
        private String bun;
        private String sauce;
        private int burgers;
        private List<String> ingredients = new ArrayList<>();
        public BigmacBuilder bun(String bun){
            this.bun = bun;
            return this;
        }
        public BigmacBuilder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }
        public BigmacBuilder burgers(int burgers){
            this.burgers = burgers;
            return this;
        }
        public BigmacBuilder ingredient(String ingredient){
            ingredients.add(ingredient);
            return this;
        }
        public Bigmac build(){
            return new Bigmac(bun,sauce,burgers,ingredients);
        }
    }


    public String getBun() {
        return bun;
    }

    public String getSauce() {
        return sauce;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", sauce='" + sauce + '\'' +
                ", burgers=" + burgers +
                ", ingredients=" + ingredients +
                '}';
    }
}
