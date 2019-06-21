package com.tutorial.temp.DTO;

import com.tutorial.temp.Class.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * UserDTO기능명
 *
 * @작성일 : 19.06.21
 * @작성자 : leekj
 * @클래스설명 :
 */

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
    private String user_id;
    private String user_nm;
    private String user_pwd;

    public User toEntity(){
        return User.builder()
                .user_id(user_id)
                .user_nm(user_nm)
                .user_pwd(user_pwd)
                .build();
    }
}
