package demo01

import grails.rest.*

@Resource
class City {

	String name

	static hasMany = [citizens:Person]

    static constraints = {
    }
}
