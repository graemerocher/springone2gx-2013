// Place your Spring DSL code here
import grails.rest.render.json.*
import demo01.*

beans = {
	personRenderer(JsonRenderer,  Person) {
		excludes = ['class', 'age']
	}
}
