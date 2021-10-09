package com.miniproject1.miniproject1.service;

import com.miniproject1.miniproject1.models.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import java.util.Calendar;

public class PersonItemProcessor implements ItemProcessor<Student, Student> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Student process(final Student student) throws Exception {
        final String firstName = student.getFirstName().toUpperCase();
        final String lastName = student.getLastName().toUpperCase();
        final Double gpa= Math.round(student.getGpa() * 100.0) / 100.0;

        final int age= student.getAge();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int doy = year - age;
        Calendar dob = Calendar.getInstance();
        dob.set(doy, 0, 1);
        final Student transformedStudent = new Student(firstName, lastName, gpa, dob);

        log.info("Converting (" + student + ") into (" + transformedStudent + ")");

        return transformedStudent;
    }

}