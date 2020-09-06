package org.rudtyz.grpcserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
 public class Sample {
     @Id
     @Column
     String name;

     @Column
     int number;

    public Sample(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Sample() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
