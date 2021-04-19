package com.tts;

public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;

//    empty constructor
    public Pet()
    {
        name= "Rex";
        age= 1;
        location= "Charlotte";
        type= "Dog";
    }

//    Constructor with arguments
    public Pet(String name, int age, String location, String type)
    {
        this.name= name;
        this.age= age;
        this.location= location;
        this.type= type;
    }

//    Get method
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getType(){
      return type;
    }
    public String getLocation(){
        return location;
    }

//    Set method
    public void setName(String name){
        this.name= name;
    }
    public void setAge(int age){
        this.age= age;
    }
    public void setType(String type){
        this.type= type;
    }
    public void setLocation(String location){
        this.location= location;
    }
}
