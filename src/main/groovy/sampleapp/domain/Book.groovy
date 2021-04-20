package sampleapp.domain

import grails.artefact.Artefact
import org.grails.core.artefact.DomainClassArtefactHandler
import org.grails.datastore.gorm.GormEntity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Artefact(DomainClassArtefactHandler.TYPE)
@Table(name="BOOKS")
class Book implements GormEntity<Book> {

    @GeneratedValue
    @Id
    Long id
    String name
}
