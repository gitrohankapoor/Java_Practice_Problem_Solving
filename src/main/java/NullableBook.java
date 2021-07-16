import java.util.Optional;

public class NullableBook {
    Optional<String> bookname;
    public NullableBook(Optional<String> name){
        bookname = name;
    }
    public Optional<String> getName(){
        return bookname;
    }

}
