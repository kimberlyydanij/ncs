package ncs.test06;

public class InvalidException {
	 String message; 
	
	public InvalidException() {
		
	}

	public InvalidException(String message) {
		this.message = message;
	}

	public static String getMessage() {
		String m = "입력값에 오류가 있습니다.";
		return m;
	}
	

    }
