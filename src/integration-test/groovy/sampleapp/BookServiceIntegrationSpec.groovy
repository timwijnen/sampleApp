package sampleapp

import grails.gorm.transactions.Rollback
import grails.testing.mixin.integration.Integration
import sampleapp.domain.Book
import spock.lang.Specification

@Integration(applicationClass = Application)
@Rollback
class BookServiceIntegrationSpec extends Specification {

    void "test something"() {
        given:
        Book book = new Book()
        book.name = "The Hobbit"
        book.save(flush: true)

        expect:
        (Book.findAll().first() as Book).name == "The Hobbit"
    }
}
