package demo01

import grails.rest.*

class PersonController extends RestfulController {

	static responseFormats = ['json', 'xml']

    PersonController() {
    	super(Person)
    }
}
