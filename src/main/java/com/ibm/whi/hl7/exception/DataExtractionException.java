package com.ibm.whi.hl7.exception;

public class DataExtractionException extends RuntimeException {

  public DataExtractionException(String message, Exception e) {
    super(message, e);
  }

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

}
