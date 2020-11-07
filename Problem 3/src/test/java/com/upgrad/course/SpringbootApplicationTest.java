package com.upgrad.course;

import com.upgrad.course.entity.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringbootApplicationTest {
    Class<Student> cls = Student.class;
    Field[] fields = cls.getDeclaredFields();

    @Test
    public void whenColumnAnnotationisUsed() {
        for(Field field: fields) {
            if(field.getName().equals("student_name")){
                Column column = field.getAnnotation(Column.class);
                Assertions.assertTrue(column.toString().contains("Column"));
            }
        }
    }

}
