package v2.mvc.spring.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import v2.mvc.spring.vo.BlogEditRequestVO;


@Repository
public class BlogDAO {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int insert(Map<String, Object> map) {
		int result = this.sqlSessionTemplate.insert("TB_BLG_CONT.insert", map);
		if(result > 0 && map.containsKey("seq_blg_cont")) {
			return (int) map.get("seq_blg_cont");
		}
		return -1;
	}

	public Map<String, Object> selectOne(int blogContSeq) {
		return this.sqlSessionTemplate.selectOne("TB_BLG_CONT.selectOne", blogContSeq);
	}
	public int update(BlogEditRequestVO blogEditRequestVO) {
	    return this.sqlSessionTemplate.update("TB_BLG_CONT.update", blogEditRequestVO);
	}

		
}