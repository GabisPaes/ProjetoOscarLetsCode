package com.letscode;

public class Listas {
    private int Index;
    private int Year;
    private int Age;
    private String Name;
    private String Movie;

    public Listas(int index, int year, int age, String name, String movie) {
        this.Index = index;
        this.Year = year;
        this.Age = age;
        this.Name = name;
        this.Movie = movie;
    }

    @Override
    public String toString() {
        return
                ", index=" + Index +
                        ", year=" + Year +
                        ", age=" + Age +
                        ", name='" + Name + '\'' +
                        ", movie='" + Movie + '\''
                ;
    }

    public int getIndex() {

        return Index;
    }

    public void setIndex(int index) {

        this.Index = index;
    }

    public int getYear() {

        return Year;
    }

    public void setYear(int year) {

        this.Year = year;
    }

    public int getAge() {

        return Age;
    }

    public void setAge(int age) {

        this.Age = age;
    }

    public String getName() {

        return Name;
    }

    public void setName(String name) {

        this.Name = name;
    }

    public String getMovie() {

        return Movie;
    }

    public void setMovie(String movie) {

        this.Movie = movie;
    }
}

