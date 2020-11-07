package com.upgrad.course;

import com.upgrad.course.entity.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.Id;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringbootApplicationTest {
    Class<Student> cls = Student.class;
    Annotation[] annotations = cls.getAnnotations();
    Field[] fields = cls.getDeclaredFields();

    @Test
    public void whenEntityisProvided() {
        for(Annotation annotation: annotations) {
            Assertions.assertTrue(annotation.toString().contains("Entity"));
        }
    }
    
}
