package com.app.notepad.dal.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

/**
 * @author navneet on 05/26/2022
 */

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="NTKR_USERS")
public class NTKRUsersEntity {

    @Id
    @GeneratedValue(strategy=SEQUENCE, generator="CUST_SEQ")
    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "EMAIL_ID")
    private String emailId;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "REGISTRATION_TIMESTAMP")
    private String registrationTimeStamp;
}
