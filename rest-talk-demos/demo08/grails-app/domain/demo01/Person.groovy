package demo01

import grails.rest.*

@Resource(formats=['person'])
class Person {

	String firstName
	String lastName
	Integer age

    static constraints = {
    }
}
