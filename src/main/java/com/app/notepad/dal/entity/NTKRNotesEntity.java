package com.app.notepad.dal.entity;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

/**
 * @author navneet on 05/26/2022
 */

@Data
@Entity
@Table(name="NTKR_NOTES")
public class NTKRNotesEntity {

    @Id
    @GeneratedValue(strategy=SEQUENCE, generator="CUST_SEQ")
    @Column(name = "NOTE_ID")
    private Long noteId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "AUTHOR_ID")
    private String authorId;
}
