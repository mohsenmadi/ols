package com.ols

import grails.rest.Resource

@Resource(uri='/prodPrices', formats = ['json'])
class ProdPrice {

   Integer pid
   BigDecimal price

   static constraints = {
   }
}
