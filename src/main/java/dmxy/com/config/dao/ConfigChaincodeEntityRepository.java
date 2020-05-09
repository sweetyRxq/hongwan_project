package dmxy.com.config.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import dmxy.com.config.entity.ConfigChaincodeEntity;

public interface ConfigChaincodeEntityRepository
		extends JpaSpecificationExecutor<ConfigChaincodeEntity>, PagingAndSortingRepository<ConfigChaincodeEntity, String> {

}

