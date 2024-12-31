package v2.mvc.spring.service;

import java.util.List;

import v2.mvc.spring.vo.CommentAddRequestVO;
import v2.mvc.spring.vo.CommentResponseVO;

public interface CommentService {

	CommentResponseVO add(CommentAddRequestVO commentAddRequestVO);

	List<CommentResponseVO> listByBlgContSeq(int blgContSeq);

}
