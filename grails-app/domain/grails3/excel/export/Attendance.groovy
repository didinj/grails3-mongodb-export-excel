package grails3.excel.export

class Attendance {

  static belongsTo = [employee:Employee]
  Date attDate
  String timeIn
  String timeOut

  static constraints = {
    timeIn nullable: true
    timeOut nullable: true
  }
}
