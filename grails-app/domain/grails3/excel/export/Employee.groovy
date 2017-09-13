package grails3.excel.export

class Employee {

  String employeeId
  String employeeName
  static hasMany = [attendances:Attendance]

  static constraints = {
  }
}
