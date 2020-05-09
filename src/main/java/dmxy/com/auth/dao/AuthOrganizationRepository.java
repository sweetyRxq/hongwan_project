package dmxy.com.auth.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import dmxy.com.auth.entity.AuthOrganization;

public interface AuthOrganizationRepository extends JpaSpecificationExecutor<AuthOrganization>, PagingAndSortingRepository<AuthOrganization, String> {

}

