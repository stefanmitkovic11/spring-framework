package company.bootstrap;

import com.github.javafaker.Faker;
import company.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDataGenerator {

    public static List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        Faker faker = new Faker();

        students.add(new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,60),faker.address().stateAbbr()));
        students.add(new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,60),faker.address().stateAbbr()));
        students.add(new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,60),faker.address().stateAbbr()));
        students.add(new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,60),faker.address().stateAbbr()));
        students.add(new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,60),faker.address().stateAbbr()));
        students.add(new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,60),faker.address().stateAbbr()));
        students.add(new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,60),faker.address().stateAbbr()));
        students.add(new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,60),faker.address().stateAbbr()));
        students.add(new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,60),faker.address().stateAbbr()));
        students.add(new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,60),faker.address().stateAbbr()));
        students.add(new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,60),faker.address().stateAbbr()));
        students.add(new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,60),faker.address().stateAbbr()));


        return students;
    }
}
