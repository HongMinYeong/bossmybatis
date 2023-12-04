package boss.mybatis.bossmybatis.service;

import boss.mybatis.bossmybatis.domain.Hong;
import boss.mybatis.bossmybatis.dto.HongDTO;
import boss.mybatis.bossmybatis.mapper.HongMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HongService {
    @Autowired
    private HongMapper hongMapper;

    public List<HongDTO> getUserList(){
        List<Hong> users = hongMapper.retreiveAll();
        List<HongDTO> result = new ArrayList<>();

        for (Hong user: users){
            HongDTO hongdto = HongDTO.builder()
                    .id(user.getId())
                    .no(user.getId()+10)
                    .writer(user.getWriter())
                    .title(user.getTitle())
                    .registered(user.getRegistered())
                    .build();
            result.add(hongdto);
        }
        return result;
    }


    public void insertUser(Hong user){
        hongMapper.insertUser(user);
    }

    public List<HongDTO> getUser(){
        List<Hong> users = hongMapper.retreiveAll();
        List<HongDTO> result = new ArrayList<>();

        for (Hong user: users){
            HongDTO hongdto = HongDTO.builder()
                    .id(user.getId())
                    .no(user.getId()+10)
                    .writer(user.getWriter())
                    .title(user.getTitle())
                    .registered(user.getRegistered())
                    .build();
            result.add(hongdto);
        }
        return result;
    }


}