/**
 * 
 */
package com.fsdfinal.workoutapi.to;

/**
 * @author 142555
 *
 */
public class BaseResponseTO {
	
	private boolean success;
	
	private String  Message;

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return Message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		Message = message;
	}
	
	

}
