# sampleApp
Test using JPA entities with Grails

## Issues

### Running integration test will result in
Either class [sampleapp.domain.Book] is not a domain class or GORM has not been initialized correctly or has already been shutdown. Ensure GORM is loaded and configured correctly before calling any methods on a GORM entity.
java.lang.IllegalStateException: Either class [sampleapp.domain.Book] is not a domain class or GORM has not been initialized correctly or has already been shutdown. Ensure GORM is loaded and configured correctly before calling any methods on a GORM entity.

### IntelliJ is not recognizing GORM save method of Book domain.
