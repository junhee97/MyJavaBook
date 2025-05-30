package Ch38.Controller;

import java.util.HashMap;
import java.util.Map;

import Ch38.Domain.DTO.UserDTO;
import Ch38.Domain.SERVICE.UserServiceImpl;

public class UserController implements SubController {

	// UserServiceImpl 연결
	private UserServiceImpl userService;

	Map<String, Object> response;

	public UserController() {
		try {
			userService = UserServiceImpl.getInstance();
		} catch (Exception e) {
			exceptionHandler(e);
		}
	}

	// C(1) R(2) U(3) D(4) + 로그인(5), 로그아웃(6)
	@Override
	public Map<String, Object> execute(Map<String, Object> params) {
		System.out.println("[SC] UserController execute Invoke..!");

		// 00
		response = new HashMap();
		Integer serviceNo = (Integer) params.get("serviceNo");

		if (serviceNo == null) {
			response.put("status", false);
			response.put("message", "유효하지 않은 서비스 요청입니다.");
			return response;
		}

		try {
			switch (serviceNo) {
			case 1: // C - 회원가입
				System.out.println("[SC] 회원가입 요청 확인");

				// 01 파라미터 받기
				String userid = (params.get("userid") != null) ? (String) params.get("userid") : null;
				String username = (params.get("username") != null) ? (String) params.get("username") : null;
				String password = (params.get("password") != null) ? (String) params.get("password") : null;
				String role = "ROLE_USER"; // 기본값
				UserDTO userDto = new UserDTO(userid, username, password, role);

				// 02 유효성 검증(Data Validation)
				boolean isOk = isValid(userDto);
				System.out.println("[No-1 회원가입] : 유효성 검증 확인 : " + isOk);
				if (!isOk) {
					response.put("status", false);
//				response.put("message", "유효성 체크 오류 발생!");
					return response;
				}

				// 03 관련 서비스 실행
				boolean isSuccess = userService.userJoin(userDto);

				// 04 뷰로 이동(or 내용전달)
				if (isSuccess) {
					response.put("status", isSuccess);
					response.put("message", "회원가입 성공!");
				}

				break;
			case 2: // R - 개인 회원 정보 조회
				System.out.println("[SC] 개인 회원 정보 조회 요청 확인");
				// 01 파라미터 받기
				// 02 유효성 검증(Data Validation)
				// 03 관련 서비스 실행
				// 04 뷰로 이동(or 내용전달)
				break;
			case 3: // U - 개인 회원 정보 수정
				System.out.println("[SC] 개인 회원 정보 수정 요청 확인");
				// 01 파라미터 받기
				// 02 유효성 검증(Data Validation)
				// 03 관련 서비스 실행
				// 04 뷰로 이동(or 내용전달)
				break;
			case 4: // D - 개인 회원 탈퇴
				System.out.println("[SC] 개인 회원 탈퇴 요청 확인");
				// 01 파라미터 받기
				// 02 유효성 검증(Data Validation)
				// 03 관련 서비스 실행
				// 04 뷰로 이동(or 내용전달)
				break;
			case 5: // P - 로그인
				System.out.println("[SC] 로그인 요청 확인");
				// 01 파라미터 받기
				// 02 유효성 검증(Data Validation)
				// 03 관련 서비스 실행
				// 04 뷰로 이동(or 내용전달)
				break;
			case 6: // P - 로그아웃
				System.out.println("[SC] 로그아웃 요청 확인");
				// 01 파라미터 받기
				// 02 유효성 검증(Data Validation)
				// 03 관련 서비스 실행
				// 04 뷰로 이동(or 내용전달)
				break;
			default:
				System.out.println("[SC] 잘못된 서비스번호 요청 확인");
				response.put("status", false);
				response.put("message", "잘못된 서비스번호 요청입니다.");
			}
		} catch (Exception e) {
			exceptionHandler(e);
		}

		return response;
	}

	// 유효성 검사 함수
	private boolean isValid(UserDTO userDto) {

		if (userDto.getUserid() == null || userDto.getUserid().length() <= 4) {
			response.put("error", "userid의 길이는 최소 5자 이상이여야 합니다");
			System.out.println("[INVALID] userid의 길이는 최소 5자 이상이여야 합니다");
			return false;
		}

		if (userDto.getUserid().matches("^[0-9].*")) {
			response.put("error", "userid의 첫문자로 숫자가 들어올 수 없습니다");
			System.out.println("[INVALID] userid의 첫문자로 숫자가 들어올 수 없습니다");
			return false;
		}
		// NULL 체크 / 데이터(자료) 수준에서의 의미있는 데이터가 포함되어져 있는지 여부
		// userid 는 첫문자가 숫자인지 여부 / 길이가 1글자인지 등등...
		// username 은 첫문자가 숫자인지 여부
		// password 복잡도체크는 Business Layer 체크(Policy 에 의한 처리)

		return true;

	}

	// 예외처리 함수
	public Map<String, Object> exceptionHandler(Exception e) {

		if (response == null)
			response = new HashMap();

		response.put("status", false);
		response.put("message", e.getMessage());
		response.put("exception", e);

		return response;
	}

}
