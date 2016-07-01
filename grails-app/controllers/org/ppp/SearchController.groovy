package org.ppp

import grails.converters.JSON

class SearchController {

  def searchService

  def index() {
    def results = (searchService.queryFor(params.q))
    List resultList = []
    results.hits.hits*._source.each {row ->
      resultList << new Policy(row)
    }
    println resultList
    render view:'/policy/list', model:[policyities:resultList]
  }
}
