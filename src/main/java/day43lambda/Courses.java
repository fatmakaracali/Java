package day43lambda;

/*
 icinde
 i)private variable'lar
 ii)Parametreli ve parametresiz constructorlar
 iii)getter'lar
 iv)setter'lar
 v)toString() methodu
 barindiran class'lara "POJO" class denir
 POJO:Plain Old Java Object

 */

public class Courses {

    private String courseName;
    private int numOfStudents;
    private String season;
    private double averageScore;


    public Courses(String courseName, int numOfStudents, String season, double averageScore) {
        this.courseName = courseName;
        this.numOfStudents = numOfStudents;
        this.season = season;
        this.averageScore = averageScore;
    }

    public Courses() {
    }

    public String getCourseName() {
        return courseName;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public String getSeason() {
        return season;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "courseName='" + courseName + '\'' +
                ", numOfStudents=" + numOfStudents +
                ", season='" + season + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
