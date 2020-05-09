package dmxy.com.auth.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import dmxy.com.auth.entity.AuthFunction;

public interface AuthFunctionRepository extends JpaSpecificationExecutor<AuthFunction>, PagingAndSortingRepository<AuthFunction, String> {

}

