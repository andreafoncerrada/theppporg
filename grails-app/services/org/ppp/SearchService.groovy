package org.ppp

import grails.transaction.Transactional
import wslite.rest.RESTClient

@Transactional
class SearchService {

  RESTClient restClient

  def addPolicy(Policy policy) {
    def response = restClient.post(path:'/policy'){
    }
    response.json
  }

  def queryFor(String q){
    def response = restClient.get(path:'/blog/post/_search', query:[query:"dilbert", pretty:true])
    response.json
  }
}
