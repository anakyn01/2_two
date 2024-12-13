package v2.mvc.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import v2.mvc.spring.vo.CommentInsertVO;
import v2.mvc.spring.vo.CommentResponseVO;

@Mapper
public interface CommentMapper {
	int insert(CommentInsertVO commentInsertVO);
	public List<CommentResponseVO> selectListByBlgContSeq(int blgContSeq);
}
