import java.util.Objects;

public record Contact(String name, long phone) {
  @Override
  public final String toString() {
    return "Contact[" + name() + ", " + phone() + "]";
  }

  @Override
  public final boolean equals(Object o) {
    if(!(o instanceof Contact c)) return false;
    return name() == c.name();
  }

  @Override
  public final int hashCode() {
    return Objects.hash(name());
  }
}
