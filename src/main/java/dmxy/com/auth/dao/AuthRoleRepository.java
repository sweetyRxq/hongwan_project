package dmxy.com.auth.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import dmxy.com.auth.entity.AuthRole;

public interface AuthRoleRepository extends JpaSpecificationExecutor<AuthRole>, PagingAndSortingRepository<AuthRole, String> {

}

