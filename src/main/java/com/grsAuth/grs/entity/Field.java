package com.grsAuth.grs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "msg_log")
public class Field {
    @Id
    @Column(name = "ID")
    long id;
    @Column(name = "MESSAGE_TYPE")
    String messageType;
    @Column(name = "STATUS")
    String status;
    @Column(name = "CREATED_ON")
    String createdOn;
    @Column(name = "UPDATED_ON")
    String updatedOn;
    @Column(name = "MESSAGE")
    String message;

    public String getMessage() {
        return this.message;
    }
}
