package com.example.easynotes.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "notes")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, 
        allowGetters = true)
public class Note implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String content;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

    
     public void  setTitle(String a)
     {
    	 this.title = a;
    	
     } 
     public String  getTitle()
     {
    	return title;
    	
     }
    public String  getContent()
     {
    	return content;
    	
     }
     
     public void  setContent(String b)
     {
    	 this.content = b;
    	
     }
     public Long  getId()
     {
    	return id;
    	
     }
     
     public void  setId(Long c)
     {
    	 this.id = c;
    	
     }

     
     
     
     
     
    // Getters and Setters ... (Omitted for brevity)
}