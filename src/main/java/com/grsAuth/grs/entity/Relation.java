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
@Table(name = "msg_relation")
public class Relation {
    @Id
    @Column(name = "ID")
    long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMsg1() {
        return msg1;
    }

    public void setMsg1(long msg1) {
        this.msg1 = msg1;
    }

    public long getMsg2() {
        return msg2;
    }

    public void setMsg2(long msg2) {
        this.msg2 = msg2;
    }

    @Column(name = "MSG1")
    long msg1;
    @Column(name = "MSG2")
    long msg2;
}
