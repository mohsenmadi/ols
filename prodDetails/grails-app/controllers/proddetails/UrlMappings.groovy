package proddetails

class UrlMappings {

    static mappings = {
       "/prodDetails"(resources:'prodDetail')
       "/prodDetails/category/$category?"(controller:'prodDetail', action:'index')
       "/prodDetails/yearUnder/$maxYear?"(controller:'prodDetail', action:'index')
       "/prodDetails/combo/$category"(controller:'prodDetail', action:'index')

       "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
