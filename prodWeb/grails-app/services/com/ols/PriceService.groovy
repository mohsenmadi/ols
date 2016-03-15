package com.ols

import grails.plugins.rest.client.RestBuilder

import grails.transaction.Transactional

@Transactional
class PriceService {

   String priceQueryUrl

   def getPrices() {
      def rest = new RestBuilder()
      def json = rest.get("$priceQueryUrl").json
      def result = json.collectEntries { pp ->
         [pp.pid, [price:pp.price]]
      }
      result
   }
}
