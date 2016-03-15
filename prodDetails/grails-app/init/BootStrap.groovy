import com.ols.ProdDetail

class BootStrap {

    def init = { servletContext ->
       new ProdDetail(pid:'101', title:'No Highway', author:'Nevil Shute', category:'fiction', year:1948).save(failOnError:true)
       new ProdDetail(pid:'214', title:'In the Country of Men', author:'Hisham Matar', category:'misery', year:2007).save(failOnError:true)
       new ProdDetail(pid:'105', title:'Big Data: A Revolution...', category:'big data', author:'Schonberger & Cukier', year:2013).save(failOnError:true)
       new ProdDetail(pid:'111', title:'Yellow Crocus', category:'history', author:'Laila Ibrahim', year:2014).save(failOnError:true)
       new ProdDetail(pid:'123', title:'The Color of Secrets', category:'family saga', author:'Lindsay Ashford', year:2014).save(failOnError:true)
       new ProdDetail(pid:'107', title:'And the Mountains Echoed', author:'Khaled Hosseini', category:'misery', year:2013).save(failOnError:true)
       new ProdDetail(pid:'215', title:'Anatomy of a Disappearance', author:'Hisham Matar', category:'mystery', year:2011).save(failOnError:true)
    }

    def destroy = {
    }
}
