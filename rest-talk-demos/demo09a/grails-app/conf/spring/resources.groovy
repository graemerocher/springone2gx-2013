import org.grails.databinding.*
import org.grails.databinding.bindingsource.AbstractRequestBodyDataBindingSourceCreator
import grails.rest.*
import grails.rest.render.*
import grails.rest.render.json.*
import org.codehaus.groovy.grails.web.mime.*
import grails.converters.JSON
import demo01.*

def personMimeType = new MimeType("application/vnd.foo.org.person+json", [v:"1.0"])

beans = {
	personRenderer(MyCustomRenderer)
	personBindingSource(MyCustomBindingSource)
}

class MyCustomRenderer extends grails.rest.render.AbstractRenderer<Person> {
	MyCustomRenderer() {
		super( Person, 
			   new MimeType("application/vnd.foo.org.person+json", [v:"1.0"]))	
	}
	

	void render(Person p, RenderContext context) {
		context.contentType = mimeTypes[0].name
		def json = [first_name: p.firstName,
	     			last_name: p.lastName] as JSON
	    json.encoding = "UTF-8"
	    json.render(context.writer) 			
	}
}

class MyCustomBindingSource extends AbstractRequestBodyDataBindingSourceCreator {
    public MimeType[] getMimeTypes() {
        [new MimeType("application/vnd.foo.org.person+json", [v:"1.0"])] as MimeType[]
    }	

     protected DataBindingSource createBindingSource(Reader reader) {
     	def json = JSON.parse(reader)
     	def map = [
     		firstName:json.first_name,
     		lastName:json.last_name
     	]
     	new SimpleMapDataBindingSource(map)
     }
     protected 
     CollectionDataBindingSource createCollectionBindingSource(Reader reader) {
     	// noop
     }
}