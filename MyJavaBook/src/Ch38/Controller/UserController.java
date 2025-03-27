package Ch38.Controller;

import java.util.Map;

public class UserController implements SubController {

	// C(1) R(2) U(3) D(4) + 로그인(5), 로그아웃(6)
	@Override
	public Map<String, Object> execute(Map<String, Object> params) {
		System.out.println("[SC] UserController execute Invoke..!");
		
		// 01 파라미터 받기
		// 02 유효성 검증(Data Validation)
		// 03 관련 서비스 실행
		// 04 뷰로 이동(or 내용전달)
		
		return null;
	}

}
