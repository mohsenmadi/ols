package com.ols

class ProdDetail {

	Integer pid
	String title
	String category
	Integer year
   String author

    static constraints = {
		 pid nullable:false, unique:true
    }
}
