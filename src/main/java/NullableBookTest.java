import java.util.Optional;

public class NullableBookTest {
    public static void main(String args[]){
        NullableBook nullableBook = new NullableBook(Optional.ofNullable(null));
        Optional<String> name = nullableBook.getName();
       // name.ifPresent(System.out::println).orElse("EMPTY");
    }
}
