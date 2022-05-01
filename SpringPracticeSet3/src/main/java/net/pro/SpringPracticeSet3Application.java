package net.pro;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import net.model.Employee;

@SpringBootApplication
public class SpringPracticeSet3Application {

	public static void main(String[] args) {		//SpringApplication.run(SpringPracticeSet3Application.class, args);
		Resource resource= new ClassPathResource("rock.xml");
		BeanFactory bean=new XmlBeanFactory(resource);
		Employee  e2=bean.getBean("lion1",net.model.Employee.class);
		System.out.println(" " +e2.getM_strFname());	
	}

}
