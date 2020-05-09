package dmxy.com.config.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import dmxy.com.config.entity.ConfigChaincode;

public interface ConfigChaincodeRepository extends JpaSpecificationExecutor<ConfigChaincode>, PagingAndSortingRepository<ConfigChaincode, String> {

}

