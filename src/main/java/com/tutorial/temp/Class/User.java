package com.tutorial.temp.Class;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * User기능명
 *
 * @작성일 : 19.06.21
 * @작성자 : leekj
 * @클래스설명 :
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 500, nullable= false)
    private String user_id;

    @Column(length=1024, nullable=false)
    private String user_pwd;

    @Column(length=500, nullable=true)
    private String user_nm;

    @Builder
    public User(String user_id, String user_pwd, String user_nm){
        this.user_id = user_id;
        this.user_pwd = user_pwd;
        this.user_nm = user_nm;
    }
}
