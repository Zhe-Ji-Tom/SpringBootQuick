package SpringBoot;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import SpringBoot.bean.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootQuickApplicationTests {

	@Autowired
	DataSource dataSource;
	
	@Autowired
	Person person;
	
	@Autowired
	ApplicationContext ioc;
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
//	@Test
//	public void testHelloService() {
//		System.out.println(ioc.containsBean("helloService"));
//	}
//	
	@Test
	void contextLoads() throws SQLException {
//		logger.trace("trace");
//		logger.debug("debug");
//		logger.info("info");
//		logger.warn("warn");
//		logger.error("error");
		
		System.out.println(dataSource.getClass());
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
		connection.close();
		
	}

}
