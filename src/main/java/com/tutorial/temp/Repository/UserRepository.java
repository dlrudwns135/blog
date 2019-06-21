package com.tutorial.temp.Repository;

import com.tutorial.temp.Class.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository기능명
 *
 * @작성일 : 19.06.21
 * @작성자 : leekj
 * @클래스설명 :
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
