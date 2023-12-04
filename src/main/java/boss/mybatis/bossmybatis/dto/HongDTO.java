package boss.mybatis.bossmybatis.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class HongDTO {
    private int id;
    private String title;
    private String registered;
    private String writer;
    private int no;
    private String content;



}
