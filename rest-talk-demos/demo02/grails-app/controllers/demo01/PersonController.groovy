package demo01

import grails.rest.*

class PersonController extends RestfulController{

	PersonController() {
		super(Person)	
	}	
    
    protected def queryForResource(Serializable id) {
		Person.findByCityAndId(City.load(params.cityId), id)    	
    }

    protected List listAllResources(Map params) {
    	Person.findAllByCity(City.load(params.cityId), params)
    }
}
