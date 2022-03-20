package sia.example.contest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

    public static void main(String[] args) throws PerformanceException {

        Auditorium auditorium;
        Performer performer;

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        auditorium = (Auditorium) context.getBean("auditorium");


//        performer = (Performer) context.getBean("duke");
//        performer.perform();

//        performer = (Performer) context.getBean("poeticDuke");
//        performer.perform();

        performer = (Performer) context.getBean("kenny");
        performer.perform();


    }
}
