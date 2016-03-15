package com.ols


import grails.rest.*
import grails.converters.*

class ProdDetailController extends RestfulController {
   static responseFormats = ['json', 'xml']

   ProdDetailController() {
      super(ProdDetail)
   }

   protected List<ProdDetail> listAllResources(Map params) {

//      println "== $params"

      try {
         ProdDetail.where {
            if (params.category && params.maxYear) {
               category == params.category && year <= params.int('maxYear')
            } else if (params.category) {
               category == params.category
            } else if (params.maxYear) {
               year <= params.int('maxYear')
            } else {
               pid > 0
            }
         }.list()
      } catch (Exception e) {
         []
      }
   }
}
