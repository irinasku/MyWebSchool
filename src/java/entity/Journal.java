/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author pupil
 */
@Entity
public class Journal implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private Subject subject;
   @Temporal(TemporalType.TIMESTAMP)
   private Date date;
   private int grade;
   private Person person;

    public Journal() {
    }

    public Journal(Subject subject, Date date, int grade, Person person) {
        this.subject = subject;
        this.date = date;
        this.grade = grade;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Jornal{" + "id=" + id + ", subject=" + subject + ", date=" + date + ", grade=" + grade + ", person=" + person + '}';
    }

   
  
}
