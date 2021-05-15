package com.company;

public class Oscelograph
{
    private String mark = "FSD";
    private String countryProducer = "Germany";
    private String model = "MK-1";

    private int price = 100;
    private String material = "Aluminum";
    private int volume = 8;
    private int frequency = 16;

    private static int numberOfObj = 0;
    protected String typeOfEnergyUse = "ordinary";
    protected double sizeInCm = 40;

    public Oscelograph()
    {
        numberOfObj += 1;
    }

    public Oscelograph(String mark, String countryProducer, String model, int price )
    {
        this.mark = mark;
        this.countryProducer = countryProducer;
        this.model = model;
        this.price = price;
        numberOfObj += 1;
    }
    public Oscelograph(String mark, String countryProducer, String model, int price,
                       String material, int volume, int frequency, String typeOfEnergyUse, int sizeInCm)
    {
        this(mark, countryProducer, model, price);
        this.material = material;
        this.volume = volume;
        this.frequency = frequency;
        this.typeOfEnergyUse = typeOfEnergyUse;
        this.sizeInCm = sizeInCm;
        numberOfObj += 1;
    }


    @Override
    public String toString()
    {
        return "Oscelograph :\n"
                + "Mark: " + mark
                + ", \nCountryProducer: " + countryProducer
                + ", \nModel: " + model
                + ", \nPrice: " + price
                + ", \nMaterial: " + material
                + ", \nVolume: " + volume
                + ", \nFrequency: " + frequency
                + ", \nType of energy use: " + typeOfEnergyUse
                + ", \nSizeInCm: " + sizeInCm + "\n";
    }


    public static void printStaticNumberOfObj()
    {
        System.out.println(numberOfObj);
    }

    public void printNumberOfObj()
    {
        System.out.println(numberOfObj);
    }
    public void resetValues(String mark, String countryProducer, String model, int price,
                            String material, int volume, int frequency, String typeOfEnergyUse, int sizeInCm)
    {
        this.mark = mark;
        this.countryProducer = countryProducer;
        this.model = model;
        this.price = price;
        this.material = material;
        this.volume = volume;
        this.frequency = frequency;
        this.typeOfEnergyUse = typeOfEnergyUse;
        this.sizeInCm = sizeInCm;
    }

    public String getMark()
    {
        return this.mark;
    }
    public void setMark(String mark)
    {
        this.mark = mark;
    }
    public String getCountryProducer()
    {
        return this.countryProducer;
    }
    public void setCountryProducer(String countryProducer)
    {
        this.countryProducer = countryProducer;
    }
    public String getModel()
    {
        return this.model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public int getPrice()
    {
        return this.price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    public String getMaterial()
    {
        return this.material;
    }
    public void setMaterial(String material)
    {
        this.material = material;
    }
    public int getVolume()
    {
        return this.volume;
    }
    public void setVolume(int volume)
    {
        this.volume = volume;
    }
    public int getFrequency()
    {
        return this.frequency;
    }
    public void setFrequency(int frequency)
    {
        this.frequency = frequency;
    }
}