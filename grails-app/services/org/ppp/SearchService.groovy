package org.ppp

import grails.transaction.Transactional
import wslite.rest.RESTClient

@Transactional
class SearchService {

  RESTClient restClient

  def addPolicy(Policy policy) {
    def response = restClient.post(path:'/policy'){
      json policy.properties
    }
    response.json
  }

  def queryFor(String q){
    def response = restClient.get(path:'/policy/_search', query:[query:q, pretty:true])
    response.json
  }

}
