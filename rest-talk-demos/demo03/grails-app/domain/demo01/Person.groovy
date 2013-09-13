package demo01

import grails.rest.*

@Resource
class Person {

	String firstName
	String lastName
	Integer age

    static constraints = {
    }
}
