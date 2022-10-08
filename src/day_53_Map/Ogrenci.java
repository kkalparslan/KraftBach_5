package day_53_Map;

public class Ogrenci {
    private String name;
    private String surName;
    private double averageNote;

    public Ogrenci() {
    }

    public Ogrenci(String name, String surName, double averageNote) {
        this.name = name;
        this.surName = surName;
        this.averageNote = averageNote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getAverageNote() {
        return averageNote;
    }

    public void setAverageNote(double averageNote) {
        this.averageNote = averageNote;
    }
}
