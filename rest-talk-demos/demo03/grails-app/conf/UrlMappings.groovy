class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')

        group '/v1', {
            "/people"(resources:'person')    
        }

        group '/v2', {
            "/people"(resources:'personV2')    
        }        
        
	}
}
