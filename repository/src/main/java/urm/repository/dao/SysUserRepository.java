package urm.repository.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import urm.entity.model.SysUser;

public interface SysUserRepository extends JpaRepository<SysUser, Integer> {
}
