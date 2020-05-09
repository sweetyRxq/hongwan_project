package dmxy.com.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mchain.apollo.core.entity.Message;
import com.mchain.apollo.core.entity.Pagination;
import com.mchain.apollo.core.hibernate.HQuerySpecificationBuilder;
import dmxy.com.dao.AiouniyaRepository;
import dmxy.com.entity.Aiouniya;

@RestController
@RequestMapping(value = "/api/business/aiouniya")
public class AiouniyaService {
	
	private final static String API = "/api/business/aiouniya";
	@Autowired
	private AiouniyaRepository aiouniyaRepository;	
	/**
	 * 保存艾欧尼亚
	 * @param entity 数据
	 * @return
	 */
	@RequestMapping(value = "", method = RequestMethod.POST)
	public Message<Aiouniya> save(@RequestBody Aiouniya entity){
		try {
			aiouniyaRepository.save(entity);
			return new Message<Aiouniya>(entity);
		}catch(Exception e) {
			return new Message<Aiouniya>("500", String.format("POST %s", API), e.getMessage());
		}
	}
}