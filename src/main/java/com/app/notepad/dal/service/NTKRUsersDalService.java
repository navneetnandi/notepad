package com.app.notepad.dal.service;

import com.app.notepad.dal.entity.NTKRUsersEntity;
import com.app.notepad.dal.repository.NTKRUsersRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author navneet on 06/14/2022
 */

@Service
@Slf4j
public class NTKRUsersDalService {

    @Autowired
    public NTKRUsersRepository ntkrUsersRepository;

    //TODO : Add retry logic to this save method
    public NTKRUsersEntity save(NTKRUsersEntity ntkrUsersEntity){

        log.info("NTKRUsersDalService :: save : Id : {}", ntkrUsersEntity.getUserId());
        try{
            NTKRUsersEntity entity = ntkrUsersRepository.save(ntkrUsersEntity);
            log.info("NTKRUsersDalService :: save : Id : {} successfully saved to database", ntkrUsersEntity.getUserId());
            return entity;
        } catch (Exception e){
            log.error("Exception {} while saving to database", e );
        }
        return ntkrUsersEntity;
    }

    public NTKRUsersEntity getUserByEmail(String emailId){

        NTKRUsersEntity ntkrUsersEntity = NTKRUsersEntity.builder().build();

        log.info("NTKRUsersDalService :: getUserByEmail : emailId : {}", emailId);
        try{
            NTKRUsersEntity entity = ntkrUsersRepository.getUserByEmail(emailId);
            log.info("NTKRUsersDalService :: getUserByEmail successfully retrieved from database");
            return entity;
        } catch (Exception e){
            log.error("Exception {} while fetching from database", e );
        }
        return ntkrUsersEntity;
    }

}
