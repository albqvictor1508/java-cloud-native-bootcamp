public record Contact(String name, String number) {
    @Override
    public final String toString() {
        return "Contact[" + name + ", " + number + "]";
    }
    
    @Override
    public final boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Contact contact)) return false;
        return number() == contact.number();
    }
}
