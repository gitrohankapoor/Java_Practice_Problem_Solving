import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalTest {
    public static void main(String args[]){
        Optional<String> checkOptional = Optional.of("Test");
        List<User> listOfUsers = new ArrayList<>();
        listOfUsers.add(new User("Rohan","1"));
        listOfUsers.add(new User("Kapoor","2"));
        List<User> sortedList = listOfUsers.stream().sorted(Comparator.comparing(User::getId).reversed()).collect(Collectors.toList());
        sortedList.forEach(System.out::println);
        String test = "Rohan";
        checkOptional = Optional.of(Optional.of(test).orElse("String is Empty"));
        System.out.println(checkOptional.isPresent());
        System.out.println(checkOptional.get());
        checkOptional.ifPresent(a->System.out.println(a));

        Optional <User> namePresent = checIfNamePresent(new User("Rohan","1"));
        //if(namePresent.isPresent()) System.out.println("Present");
        namePresent.ifPresent(u->u.setId(u.getId()));
        //System.out.println(namePresent.get().getId());
        User namePresentWithoutOptional = checkIfNamePresentWithoutOptional(new User("Rohan","1"));
        //if(!namePresentWithoutOptional.getName().equalsIgnoreCase("Rohan")) System.out.println("Not Equal");
        namePresent.ifPresent(u->System.out.println(u.getName()));

    }

    private static Optional<User> checIfNamePresent(User user) {
        user =null;
        return Optional.ofNullable(user);
    }
    private static User checkIfNamePresentWithoutOptional(User user){
        user.setId(null);
        return user;
    }
}
class User{

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String name;
    String id;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
