package cn.appsys.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.appsys.pojo.BackendUser;
import cn.appsys.service.backend.BackendUserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-mybatis.xml")
public class TestApp {
	
	private Logger logger = Logger.getLogger(TestApp.class);
	
	@Resource
	private BackendUserService backendUserService;
	
	@Test
	public void  backendUser() throws Exception{
		BackendUser user = backendUserService.login("admin", "123456");
		logger.debug("用户名:================"+user.getUserCode()+"密码:================"+user.getUserPassword());
	}
}
