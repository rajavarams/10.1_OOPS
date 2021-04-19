package com.tts;

public class Students {
    private String firstName;
    private String lastName;
    private int age;
    private int grade;

//    empty constructor
    public Students()
    {
      firstName= "John";
      lastName= "Gregory";
      age= 13;
      grade= 7;
    }

//  Constructor with only 3 of the 4 variables as arguments
public Students(String firstName, String lastName, int grade){
        this.firstName= firstName;
        this.lastName= lastName;
        this.grade= grade;
}

//  Constructor with all of the 4 variables as arguments
    public Students(String firstName, String lastName, int age, int grade){
        this.firstName= firstName;
        this.lastName= lastName;
        this.age= age;
        this.grade= grade;
    }

//   Get method
        public String getFirstName(){
        return firstName;
}
        public String getLastName(){
        return lastName;
}
        public int getAge(){
        return age;
}
        public int getGrade(){
        return grade;
}

//   Set method
    public void setFirstName(String firstName) { this.firstName= firstName; }
    public void setLastName(String lastName)
    {
        this.lastName= lastName;
    }
    public void setAge(int age)
    {
        this.age= age;
    }
    public void setGrade(int grade)
    {
        this.grade= grade;
    }


//Boolean method
public boolean checkGrade(int grade){
    if(grade>=8) {
        return true;
    }
    else {return false;
    }
    }

//    String method
    public String studentDetails(){
        String studentDetails= this.firstName + " " + this.lastName + " " + "Grade" + this.grade;
        return studentDetails;
    }

}
