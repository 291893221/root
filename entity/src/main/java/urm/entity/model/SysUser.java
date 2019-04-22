package urm.entity.model;

import lombok.Data;

/**
 * Created by Mybatis Generator 2019/03/26
 */
@Data
public class SysUser extends PageEntity {
	private Integer id;

	private String username;

	private String password;
}