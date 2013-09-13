// Place your Spring DSL code here
import demo01.*

import grails.rest.*
import grails.rest.render.*

import grails.rest.render.hal.*
import org.codehaus.groovy.grails.web.mime.*

beans = {
	personRenderer(HalJsonRenderer, 
				   Person, 
				   new MimeType("application/vnd.foo.org.person+json", [v:"1.0"]))

	personRendererV2(HalJsonRenderer, 
				   Person, 
				   new MimeType("application/vnd.foo.org.person+json", [v:"2.0"]))	{
		excludes = ['class', 'age']
	}
}
