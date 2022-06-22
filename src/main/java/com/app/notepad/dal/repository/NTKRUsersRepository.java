package com.app.notepad.dal.repository;

import com.app.notepad.dal.entity.NTKRUsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * author navneet on 06/08/2022
 */

@Repository
public interface NTKRUsersRepository extends JpaRepository<NTKRUsersEntity, Long> {

    NTKRUsersEntity getByUserId(Long userId);

    @Query("SELECT nue FROM NTKRUsersEntity nue WHERE nue.emailId = ?1")
    NTKRUsersEntity getUserByEmail(String emailId);

}
