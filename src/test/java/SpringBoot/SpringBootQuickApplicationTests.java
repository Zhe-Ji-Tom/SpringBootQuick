package SpringBoot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import SpringBoot.bean.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootQuickApplicationTests {

	@Autowired
	Person person;
	
	@Autowired
	ApplicationContext ioc;
	
	@Test
	public void testHelloService() {
		System.out.println(ioc.containsBean("helloService"));
	}
	
	@Test
	void contextLoads() {
		System.out.println(person);
	}

}
