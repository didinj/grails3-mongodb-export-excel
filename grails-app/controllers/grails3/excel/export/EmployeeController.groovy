package grails3.excel.export

import java.text.SimpleDateFormat

class EmployeeController {

  def exportService

  def index(Integer max) {
    params.max = Math.min(max ?: 10, 100)
    respond Employee.list(params), model:[employeeCount: Employee.count()]
  }

  def exportExcel() {
    params.exportFormat = "excel"
    params.extension = "xls"

    if(params.exportFormat && params.exportFormat != "html") {

      def employees = Employee.list(params)

      def results = []
      employees.each { e ->
        def map = [:]
        map.put("employeeId",e.employeeId)
        map.put("employeeName",e.employeeName)

        def attendances = Attendance.findAllByEmployee(e, [sort: "attDate", order: "asc"])
        attendances.each { a ->
          if(a.timeIn && a.timeOut) {
            map.put(new SimpleDateFormat("MMM dd, yyyy").format(a.attDate),a.timeIn+" - "+a.timeOut)
          } else {
            map.put(new SimpleDateFormat("MMM dd, yyyy").format(a.attDate),"-")
          }
        }

        results.add(map)
      }

      response.contentType = grailsApplication.config.grails.mime.types[params.exportFormat]
      response.setHeader("Content-disposition", "attachment; filename=attendance-"+new SimpleDateFormat("ddMMyyy").format(new Date())+".xls")

      List fields = [
        "employeeId",
        "employeeName"
      ]

      Map labels = ["employeeId": "Employee ID", "employeeName": "Employee Name"]

      def atts = Attendance.findAllByEmployee(employees[0])

      atts.each { a ->
        fields.add(new SimpleDateFormat("MMM dd, yyyy").format(a.attDate))
        labels.put(new SimpleDateFormat("MMM dd, yyyy").format(a.attDate), new SimpleDateFormat("MMM dd, yyyy").format(a.attDate))
      }

      Map formatters = [:]
      Map parameters = [:]

      exportService.export(params.exportFormat, response.outputStream, results, fields, labels, formatters, parameters)
    }
  }
}
