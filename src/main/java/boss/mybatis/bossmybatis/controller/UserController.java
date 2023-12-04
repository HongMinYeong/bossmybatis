package boss.mybatis.bossmybatis.controller;

import boss.mybatis.bossmybatis.domain.Hong;
import boss.mybatis.bossmybatis.domain.User;
import boss.mybatis.bossmybatis.dto.HongDTO;
import boss.mybatis.bossmybatis.dto.UserDTO;
import boss.mybatis.bossmybatis.service.HongService;
import boss.mybatis.bossmybatis.service.UserService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class UserController {
//    @Autowired
//    UserService userService;
@Autowired
    HongService hongService;

//    @GetMapping("/")
//    public String getUsers(Model model){
//        List<UserDTO> users = userService.getUserList();
//        model.addAttribute("list",users);
//        return "user";
//    }
@GetMapping("/")
public String getHongs(Model model){
    List<HongDTO> users = hongService.getUserList();
    model.addAttribute("list",users);
    return "hong";
}

@PostMapping("/board")
@ResponseBody
public String postHongs(@RequestBody HongDTO hongDTO,Model model){
    Hong board = new Hong();
    board.setWriter(hongDTO.getWriter());
    board.setTitle(hongDTO.getTitle());
    board.setContent(hongDTO.getContent());

    hongService.insertUser(board);
    return "redirect:/";
}

    @PatchMapping("/board")
    @ResponseBody
    public String patchHongs(@RequestBody HongDTO hongDTO,Model model){
        Hong board = new Hong();
        board.setWriter(hongDTO.getWriter());
        board.setTitle(hongDTO.getTitle());
        board.setContent(hongDTO.getContent());

        hongService.insertUser(board);
        return "redirect:/";
    }

    @DeleteMapping("/board/{id}")
    @ResponseBody
    public String deleteHongs(@RequestParam int id,Model model){
//        hongService.getUserList()
        Hong board = new Hong();
        board.setWriter(hongDTO.getWriter());
        board.setTitle(hongDTO.getTitle());
        board.setContent(hongDTO.getContent());

        hongService.insertUser(board);
        return "redirect:/";
    }


//    @GetMapping("user")
//    public String getUserInsert(@RequestParam String name, @RequestParam String nickname, Model model){
//
//        User user = new User();
//        user.setName(name);
//        user.setNickname(nickname);
//
//        userService.insertUser(user);
//
//       return "redirect:/";
//    }
}