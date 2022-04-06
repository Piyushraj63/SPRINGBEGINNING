package san.cruz;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SpringBootApplication
public class SpringFirstStageApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringFirstStageApplication.class, args);
		Resource resource=new ClassPathResource("spring.xml");
		BeanFactory beanFactory=new  XmlBeanFactory(resource);
		Programm m1=beanFactory.getBean("NITIN",san.cruz.Programm.class);
		
		System.out.println(m1.getPgName());
		System.out.println(m1.getPgID());
		System.out.println(m1.getPgGameVersion());
		
		
	}

}
