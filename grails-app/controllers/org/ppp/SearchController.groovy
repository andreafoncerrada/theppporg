package org.ppp

import grails.converters.JSON

class SearchController {

  def searchService

  def index() {
    def results = (searchService.queryFor("dilbert"))
    render(contentType: 'application/json') {
      results
    }
  }
}
