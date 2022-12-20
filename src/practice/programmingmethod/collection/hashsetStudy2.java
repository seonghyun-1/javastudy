package programmingmethod.collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) { // 자동타입변환 :: 자식타입을 부모타입으로 변환 -> parent instanceof Child -> 즉, obj객체가 Member클래스의 조상객체인지 확인
            Member member = (Member) obj; //강제타입변환 :: 부모타입을 자식타입으로 변환
            return member.name.equals(name) && (member.age == age);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}

public class hashsetStudy2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();
        set.add(new Member("홍길동",30));
        set.add(new Member("홍길동",30));
        System.out.println(set.size());
    }
}
