package com.test;

import com.util.HibernateSessionFactory;
import com.yx.entity.Student;
import org.hibernate.Session;

/**
 * Created by Administrator on 2015/12/6 0006.
 */
public class StudentTest {
    public static void main(String[] avgs){
        Session session = HibernateSessionFactory.getSession();
        System.out.println("session="+session);
        Student student = new Student();
        student.setName("zhangsan");
        student.setAge(100);
        student.setSex("男");

        session.beginTransaction();

        session.save(student);

        session.getTransaction().commit();
        session.close();


    }
}
