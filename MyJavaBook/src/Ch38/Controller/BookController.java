package Ch38.Controller;

import java.util.HashMap;
import java.util.Map;

import Ch38.Domain.DTO.BookDTO;
import Ch38.Domain.SERVICE.BookServiceImpl;

public class BookController implements SubController {

	// BookServiceImpl 연결
	private BookServiceImpl bookService;

	Map<String, Object> response;

	public BookController() {
		try {
			bookService = BookServiceImpl.getInstance();
		} catch (Exception e) {
			exceptionHandler(e);
		}
	}

	// C(1) R(2) U(3) D(4)
	@Override
	public Map<String, Object> execute(Map<String, Object> params) {
		System.out.println("[SC] BookController execute Invoke..!");

		// 00
		response = new HashMap();
		Integer serviceNo = (Integer) params.get("serviceNo");

		if (serviceNo == null) {
			response.put("status", false);
			response.put("message", "유요하지 않은 서비스 요청입니다.");
			return response;
		}

		try {
			switch (serviceNo) {
			case 1: // C - 도서 등록 (ROLE - 사서)
				System.out.println("[SC] 도서 등록 요청 확인");

				// 01 파라미터 받기
				String bookCode = (params.get("bookCode") != null) ? (String) params.get("bookCode") : null;
				String bookName = (params.get("bookName") != null) ? (String) params.get("bookName") : null;
				String publisher = (params.get("publisher") != null) ? (String) params.get("publisher") : null;
				String isbn = (params.get("isbn") != null) ? (String) params.get("isbn") : null;
				BookDTO bookDto = new BookDTO(bookCode, bookName, publisher, isbn);

				// 02 유효성 검증(Data Validation)
				boolean isOk = isValid(bookDto);
				System.out.println("[No-1 도서등록] : 유효성 검증 확인 : " + isOk);
				if (!isOk) {
					response.put("status", false);
					return response;
				}
				// 03 관련 서비스 실행
				boolean isSuccess = bookService.bookRegistration(bookDto);

				// 04 뷰로 이동(or 내용전달)
				if (isSuccess) {
					response.put("status", isSuccess);
					response.put("message", "도서 등록 성공!");
				}
				break;
			case 2: // R - 도서 조회 (ROLE - 회원, 사서, 관리자
				System.out.println("[SC] 도서 조회 요청 확인");
				// 01 파라미터 받기
				// 02 유효성 검증(Data Validation)
				// 03 관련 서비스 실행
				// 04 뷰로 이동(or 내용전달)
				break;
			case 3: // U - 도서 수정 (ROLE - 사서, 관리자)
				System.out.println("[SC] 도서 수정 요청 확인");
				// 01 파라미터 받기
				// 02 유효성 검증(Data Validation)
				// 03 관련 서비스 실행
				// 04 뷰로 이동(or 내용전달)
				break;
			case 4: // D - 도서 삭제 (ROLE - 사서, 관리자)
				System.out.println("[SC] 도서 삭제 요청 확인");
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
	private boolean isValid(BookDTO bookDto) {

		if (bookDto.getBookCode() == null || bookDto.getBookCode().length() != 8) {
			response.put("error", "bookCode의 길이는 8글자 입니다");
			System.out.println("[INVALID] bookCode의 길이는 8글자 입니다");
			return false;
		}

		if (bookDto.getBookName() == null || bookDto.getBookName().length() > 255) {
			response.put("error", "bookName의 길이는 255자를 넘기면 안됩니다");
			System.out.println("[INVALID] bookName의 길이는 255자를 넘기면 안됩니다");
			return false;
		}

		if (bookDto.getBookName().matches("^[0-9].*")) {
			response.put("error", "bookName의 첫문자로 숫자가 들어올 수 없습니다");
			System.out.println("[INVALID] bookName의 첫문자로 숫자가 들어올 수 없습니다");
			return false;
		}

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
