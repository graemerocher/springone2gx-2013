package demo01.v2

import demo01.*
import grails.rest.*

class PersonV2Controller extends RestfulController {

	static responseFormats = ['json', 'xml']
	
    PersonV2Controller() {
    	super(Person)
    }

    def show() {
    	def p = Person.get(params.id)
    	if(p) {
    		render(contentType:'application/xml') {
    			person(version:'v2', firstName:p.firstName)
    		}
    	}
    	else {
    		render status:404
    	}
    }
}