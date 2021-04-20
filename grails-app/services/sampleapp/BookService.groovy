package sampleapp

import grails.gorm.services.Service
import sampleapp.domain.Book

@Service(Book)
interface BookService {

    Book save(String name)
}
