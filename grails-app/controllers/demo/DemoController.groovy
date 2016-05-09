package demo

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class DemoController {

    def index() {
        Person.withTransaction {
            // ...
        }
        render 'Success!'
    }
}
