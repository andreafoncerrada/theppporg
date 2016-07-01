package org.ppp

import grails.transaction.Transactional
import wslite.rest.RESTClient

@Transactional
class SearchService {

  RESTClient restClient

  def addPolicy(Policy policy) {
    def response = restClient.post(path:"/policy/${policy.id}"){
      json policy.properties
    }
    response.json
  }

  def queryFor(String q){
    def response = restClient.get(path:'/policy/_search', query:[q:q, pretty:true])
    response.json
  }

}
