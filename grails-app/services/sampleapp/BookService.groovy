package sampleapp

import grails.gorm.transactions.Transactional
import sampleapp.domain.Book

@Transactional
class BookService {

    def save(Book book) {
        book.save()
    }
}
