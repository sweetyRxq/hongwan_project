package dmxy.com.auth.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import dmxy.com.auth.entity.AuthUser;

@Repository
public interface AuthUserRepository extends JpaSpecificationExecutor<AuthUser>, PagingAndSortingRepository<AuthUser, String> {

}

