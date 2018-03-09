package idv.mission.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //Resource resource = new ClassPathResource("applicationContext.xml");
        //BeanFactory factory = new XmlBeanFactory(resource);
        //Student student = (Student) factory.getBean("studentbean");
        //student.say();
        
        ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
        Student student = context.getBean(Student.class);
        //Teacher teacher = context.getBean(Teacher.class);
        Teacher teacher = (Teacher) context.getBean("teacher");
        student.say();
        teacher.say();
    }
}
