package exceptions;

public class InvalidParamsException extends RuntimeException {
  public InvalidParamsException(String msg) {
    super(msg);
  }
}
