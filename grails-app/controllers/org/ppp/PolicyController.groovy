package org.ppp

import jxl.Sheet
import jxl.Workbook


class PolicyController {

  static scaffold = Policy

  def policyService

  def upload() { }

  def doUpload() {
    def file = request.getFile('file')
    Workbook workbook = Workbook.getWorkbook(file.getInputStream());
   int numRows
    (0..workbook.numberOfSheets-1).each{ sheetNo ->
      Sheet page = workbook.getSheet(sheetNo)
      int numColumns = page.columns
      numRows = page.rows
      String data
      (1..numRows-1).each { row ->
        def listElementInRow = []
        (0..57).each { column ->
          data = page.getCell(column, row).contents
          listElementInRow.add(data)
        }
        policyService.createPolicyEntity(listElementInRow)
        println 1
      }
    }
    redirect (action:'list')
  }

  def list() {
    render view: "list", model:[policyities: Policy.getAll()]
  }

}
