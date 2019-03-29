package me.whiteship;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.Example;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Example.class)
public class ExampleTest {

	@Autowired
	UserService userService;

	@Test
	public void vi() {
		Assert.assertNotNull(userService);

	}

}
