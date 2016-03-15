import com.ols.ProdPrice

class BootStrap {

    def init = { servletContext ->
       new ProdPrice(pid:'101', price:3.5).save(failOnError:true)
       new ProdPrice(pid:'214', price:10).save(failOnError:true)
       new ProdPrice(pid:'105', price:12.75).save(failOnError:true)
       new ProdPrice(pid:'111', price:8.5).save(failOnError:true)
       new ProdPrice(pid:'123', price:13.5).save(failOnError:true)
       new ProdPrice(pid:'107', price:8.25).save(failOnError:true)
       new ProdPrice(pid:'215', price:11.65).save(failOnError:true)
    }

    def destroy = {
    }
}
