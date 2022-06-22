package com.app.notepad.dal.entity;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

/**
   @author navneet on 06/08/2022
 */


@Data
@Entity
@Table(name="NTKR_TASKS")
public class NTKRTasksEntity {

    @Id
    @GeneratedValue(strategy=SEQUENCE, generator="CUST_SEQ")
    @Column(name = "TASK_ID")
    private Long taskId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "NOTE_ID")
    private Long noteId;

    //TODO Research whether done date should be string or some other datatype
    @Column(name = "DONE_DATE")
    private String doneDate;

}
