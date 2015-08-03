package ba.bitcamp.homework16.task01;

public class BitResponse {
	
	private String message;
	private String timestamp;
	
	public BitResponse() {
		message = null;
		timestamp = null;
	}
	
	public BitResponse(String message, String timestamp) {
		this.message = message;
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "BitResponse [message=" + message + ", timestamp=" + timestamp
				+ "]";
	}
	
	

}
