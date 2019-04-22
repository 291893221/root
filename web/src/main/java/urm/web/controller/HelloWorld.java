package urm.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import urm.entity.model.SysUser;
import urm.repository.dao.SysUserRepository;

@Controller
public class HelloWorld {

	@Autowired
	private SysUserRepository sysUserRepository;
	/**
	 * http://localhost:8080/sayHelloWorld
	 * @return
	 */
	@RequestMapping("sayHelloWorld")
	@ResponseBody
	public Object sayHelloWorld() {

		SysUser user = new SysUser();
		user.setId(0);
		user.setUsername("张三JPA");
		user.setPassword("10086");
		SysUser save = sysUserRepository.save(user);
		return user;
	}
}
