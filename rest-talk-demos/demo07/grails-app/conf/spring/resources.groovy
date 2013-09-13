// Place your Spring DSL code here
import demo01.*

import grails.rest.*
import grails.rest.render.*
import grails.rest.render.json.*
import org.codehaus.groovy.grails.web.mime.*

beans = {
	personRenderer(JsonRenderer, 
				   Person, 
				   new MimeType("application/vnd.foo.org.person+json"))
	peopleRenderer(PersonContainerRenderer)

}

class PersonContainerRenderer 
	extends JsonRenderer 
	implements ContainerRenderer<List,Person>  {

	PersonContainerRenderer() {
		super(List, new MimeType("application/vnd.foo.org.people+json"))
	}

	Class<Person> getComponentType() { Person }		
}
