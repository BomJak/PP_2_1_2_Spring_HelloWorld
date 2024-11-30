import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = applicationContext.getBean(HelloWorld.class);
        System.out.println(bean.getMessage());

        HelloWorld secondBean = applicationContext.getBean(HelloWorld.class);
        System.out.println("Equals Hello World: " + bean.equals(secondBean));

        Cat cat = applicationContext.getBean(Cat.class);
        Cat secondCat = applicationContext.getBean(Cat.class);

        System.out.println("First cat: " + cat.getName() +
                            " Second cat: " + secondCat.getName());
        System.out.println("Equals Cat: " + cat.equals(secondCat));
    }
}