package boss.mybatis.bossmybatis.mapper;

import boss.mybatis.bossmybatis.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    //sql 과 객체를 매핑해주는 곳 -> 실제로 db 에 접속할 때 실행할 sql 문 정의

    // 1. xml 파일을 참고하겠다.
    List<User> retreiveAll(); //select
    // 2. xml 파일을 참고하지 않고 직접 sql 문을 작성하겠다.
    @Insert("insert into user2(name,nickname) values(#{name},#{nickname})")
    void  insertUser(User user); //객체로 전달할 수 도 있음
    //void insertUser(String name, String nickname)

}
