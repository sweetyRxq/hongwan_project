package dmxy.com.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import dmxy.com.entity.Aiouniya;

@Repository
public interface AiouniyaRepository extends PagingAndSortingRepository<Aiouniya, String>, JpaSpecificationExecutor<Aiouniya>{

}
