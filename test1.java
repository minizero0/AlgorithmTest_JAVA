import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class test1 {
    static class Member{
        String name;
        int age;

        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();

        members.add(new Member("카리나", 24));
        members.add(new Member("지젤", 24));
        members.add(new Member("윈터", 23));
        members.add(new Member("닝닝", 22));

        members.stream()
                .filter(m -> m.age == 24)
                .map(m -> m.name)
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
