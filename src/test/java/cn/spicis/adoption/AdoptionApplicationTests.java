package cn.spicis.adoption;

import cn.spicis.adoption.domain.Users;
import cn.spicis.adoption.repository.UsersMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdoptionApplicationTests {

	@Resource
	private UsersMapper usersMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testSelectByUsername() {
		Users user = usersMapper.selectByUsername("adoption");
		if (user != null) {
			System.out.println(user.getPassword());
		} else {
			System.out.println("null");
		}

	}

}

