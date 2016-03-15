package com.ols

import grails.plugins.rest.client.RestBuilder
import grails.transaction.Transactional

@Transactional
class DetailService {

   String detailQueryUrl

   def getDetails() {
      def rest = new RestBuilder()
      def json = rest.get("$detailQueryUrl").json
      def result = json.collectEntries { pd ->
         [pd.pid,
          [title:pd.title, category: pd.category,
           year:pd.year, author:pd.author]
         ]
      }
      result
   }

   def getProdsWithCategory(String category) {
      def rest = new RestBuilder();
      def json = rest.get("${detailQueryUrl}/category/${category}").json
      def result = json.collect { cat ->
         [pid:cat.pid, title:cat.title, author:cat.author]
      }
      result
   }
}
