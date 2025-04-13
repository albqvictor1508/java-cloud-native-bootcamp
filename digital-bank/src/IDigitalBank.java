public interface IDigitalBank {
  public void checkout(int code, double balance);
  public void deposit(int code, double balance);
  public void showSalary(int code);
}
