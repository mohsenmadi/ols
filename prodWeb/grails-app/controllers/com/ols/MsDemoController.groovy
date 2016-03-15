package com.ols

class MsDemoController {

   def priceService
   def detailService

   def index() {
      def prices = priceService.prices
      def details = detailService.details

      // merge the maps, and add what's missing to the values of the same key
      def products = prices + details
      prices.each { k, v ->
         products[k] += prices[k]
      }

      def categories = products.values().category as Set

      [products:products, categories:categories]
   }

   def search(String categoryName) {
      def catEntries = detailService.getProdsWithCategory(categoryName)
      println catEntries
      render view:'resultsCategory',
            model:[categoryName:categoryName, catEntries:catEntries]
   }
}
