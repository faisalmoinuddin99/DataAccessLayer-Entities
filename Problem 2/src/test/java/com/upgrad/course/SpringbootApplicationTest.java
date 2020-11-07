package com.upgrad.course;

import com.upgrad.course.entity.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringbootApplicationTest {
    Class<Student> cls = Student.class;
    Annotation annotation = cls.getAnnotation(Table.class);
    Field[] fields = cls.getDeclaredFields();
    @Test
    public void whenTableAnnotationisUsed() {
            Assertions.assertTrue(annotation.toString().contains("Table"));
    }

}
