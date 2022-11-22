package top.popov.testSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Warehouse stock1 = context.getBean("warehouse", Warehouse.class);

        stock1.getSectionName();



        System.out.println(stock1.getSectionName());
        System.out.println(stock1.getCapacity());

        context.close();
    }
}
