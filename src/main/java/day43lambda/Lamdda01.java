package day43lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lamdda01 {

    public static void main(String[] args) {

        Courses turkishDay = new Courses("Turkish Daytime QA", 213, "Spring", 97);
        Courses turkishNight = new Courses("Turkish Nighttime QA", 245, "Winter", 98);
        Courses engishDay = new Courses("English Daytime Dev", 121, "Spring", 91);
        Courses engishNigtht = new Courses("English Nighttime Dev", 137, "Winter", 95);

        List<Courses> courseList = new ArrayList<>();

        courseList.add(turkishDay);
        courseList.add(turkishNight);
        courseList.add(engishDay);
        courseList.add(engishNigtht);


        System.out.println(isAvgScoreGreaterThanANumber(courseList, 90));

    }
    //example 1 : Tum average score'larin 90 dan buyuk olup olmadigini kontrol eden methodu olusturunuz

    public static boolean isAvgScoreGreaterThanANumber(List<Courses> courseList, int avg) {

        return courseList.stream().allMatch(t -> t.getAverageScore() > avg);

    }

    //Example 2: En az bir kurs isminin QA icerip icermedigini kontrol eden method'u olusturunuz
    public static boolean isAnyCourseNameContainsQa(List<Courses> courseList, String word) {
        return courseList.stream().anyMatch(t -> t.getCourseName().contains(word));
    }


    //Example 3: En yuksek average score'asahip kurs ismini veren code'u yaziniz
    public static String getCourseNamesWhoseAvgMax(List<Courses> courseList) {

        return courseList.
                stream().
                sorted(Comparator.comparing(Courses::getAverageScore).reversed()).
                findFirst().
                get().
                getCourseName();

    }

    //Example 4: Average score'u en dusuk olan ilk iki course disindaki tum kurslari return eden method'u olusturunuz
    public static List<Courses> getCourseBetterThanLastTwo(List<Courses> courseList) {
        return courseList.
                stream().
                sorted(Comparator.comparing(Courses::getAverageScore)).
                skip(2).
                collect(Collectors.toList());
    }

    //Example 5: Average score'u ustten ucuncu olan kursu veren method'u olusturunuz.
    public static Courses getHighestThird(List<Courses> courseList) {
        return courseList.
                stream().
                sorted(Comparator.comparing(Courses::getAverageScore).reversed()).
                skip(2).
                limit(1).
                collect(Collectors.toList()).
                get(0);
    }

    //Example 5: Ogrenci sayisi 150'den az olan kurslari return eden method'u olusturunuz.
    public static List<Courses> getCourseWhoseRegisteredStdLessThanANumber(List<Courses> courseList, int numOfStd) {
        return courseList.stream().filter(t -> t.getNumOfStudents() < numOfStd).collect(Collectors.toList());
    }
}