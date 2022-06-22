package com.app.notepad.dal.repository;

import com.app.notepad.dal.entity.NTKRUsersEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
/**
 * By default DataJpaTest replaces your DataSource with an embedded database but you don't have one
 * So, if you want to test with MySQL, replace your test by adding the above annotation
 * Otherwise you'll get Error creating bean with name 'dataSource'
 */
public class NTKRUsersRepositoryTest {

    @Autowired
    NTKRUsersRepository ntkrUsersRepository;

    /** Test case for saving a User to database */
    @Test
    public void saveUserTest(){

        NTKRUsersEntity ntkrUsersEntity = NTKRUsersEntity.builder()
                .userId(1001L)
                .emailId("navneetn@buffalo.edu")
                .password("123hahaha")
                .registrationTimeStamp("06-12-2022 13:00")
                .build();

        ntkrUsersRepository.save(ntkrUsersEntity);

        Assertions.assertEquals(ntkrUsersEntity.getUserId(), 1001L);
    }

    @Test
    public void getUserByEmailTest(){

        NTKRUsersEntity ntkrUsersEntity = NTKRUsersEntity.builder()
                .userId(1002L)
                .emailId("navneetn@buffalo.edu")
                .password("123hahaha")
                .registrationTimeStamp("06-12-2022 13:00")
                .build();

        ntkrUsersRepository.save(ntkrUsersEntity);
//        Assertions.assertNotEquals(null, ntkrUsersRepository.getUserByEmail("navneetn@buffalo.edu"));
//        Assertions.assertEquals(ntkrUsersEntity, ntkrUsersRepository.getUserByEmail("navneetn@buffalo.edu"));
//        Assertions.assertEquals(ntkrUsersEntity, ntkrUsersRepository.getByUserId(1002L));
        Assertions.assertNotNull(ntkrUsersRepository.getUserByEmail("navneetn@buffalo.edu"));


    }


}
