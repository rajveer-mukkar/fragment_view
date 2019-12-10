package com.example.fragment_introdemo;

public class Position {
    private String title;
    private String description;
    public Position(String title , String description){
        this.title = title;
        this.description = description;
    }



    public  static  final Position[] position = {
            new Position("ios developer","developing ios application"),
            new Position("java developer","developing java application"),
            new Position("android developer","developing the android application"),
            new Position("Firmaware cdeveloper","developing the firmware application"),
            new Position(" hotel managememnt","managing hotel")
    };
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
