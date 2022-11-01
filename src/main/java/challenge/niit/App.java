package challenge.niit;

import challenge.niit.config.Config;
import challenge.niit.domin.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        System.out.println("Employee = " + context.getBean("employee", Employee.class));
    }
}
