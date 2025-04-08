public record Person(String name, int age, double height) implements Comparable<Person> {
    @Override
    public int compareTo(Person p) {
        return Integer.compare(this.age, age());
    }
}