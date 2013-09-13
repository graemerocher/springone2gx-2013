package demo01

import grails.rest.*

class PersonController extends RestfulController {

	static responseFormats = ['person', 'people']

    PersonController() {
    	super(Person)
    }

    def index(Integer max) {
    	respond Person.list(max:max, offset:params.offset), 
    			model:[personInstanceCount:Person.count()],
    			formats:['people']
    }
}
