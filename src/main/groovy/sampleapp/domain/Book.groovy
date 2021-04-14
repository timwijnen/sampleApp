package sampleapp.domain

import javax.persistence.*

@Entity
@Table(name="BOOKS")
class Book {
    @Id
    @GeneratedValue
    private Integer id
    private String name

    String getName() {
        name
    }

    void setName(String name) {
        this.name = name
    }
}
