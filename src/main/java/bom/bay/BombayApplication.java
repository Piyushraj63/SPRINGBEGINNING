package bom.bay;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import bom.bay2.Programm;

@SuppressWarnings("deprecation")
@SpringBootApplication
public class BombayApplication {
	public static void main(String[] args) {		
		//SpringApplication.run(BombayApplication.class, args);
		Resource resource=new ClassPathResource("power.xml");
		@SuppressWarnings("deprecation")
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		Programm p1=beanFactory.getBean("NITIN",bom.bay2.Programm.class);
		System.out.println(p1.getPgGameVersion());		
	}
}
