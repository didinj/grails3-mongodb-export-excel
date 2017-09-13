package grails3.excel.export

import java.text.SimpleDateFormat

class BootStrap {

    def init = { servletContext ->
      def emp1 = Employee.findByEmployeeId("EMP001")?:new Employee(employeeId:"EMP001", employeeName:"John Doe").save(flush:true, failOnError:true)
      def emp2 = Employee.findByEmployeeId("EMP002")?:new Employee(employeeId:"EMP002", employeeName:"Jane Doe").save(flush:true, failOnError:true)
      def att1 = Attendance.findByEmployeeAndAttDate(emp1,new SimpleDateFormat("dd/MM/yyyy").parse("01/08/2017"))?:new Attendance(employee: emp1, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("01/08/2017"), timeIn: "08:01", timeOut: "16:11").save(flush:true, failOnError: true)
      def att2 = Attendance.findByEmployeeAndAttDate(emp1,new SimpleDateFormat("dd/MM/yyyy").parse("02/08/2017"))?:new Attendance(employee: emp1, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("02/08/2017"), timeIn: "08:01", timeOut: "16:11").save(flush:true, failOnError: true)
      def att3 = Attendance.findByEmployeeAndAttDate(emp1,new SimpleDateFormat("dd/MM/yyyy").parse("03/08/2017"))?:new Attendance(employee: emp1, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("03/08/2017"), timeIn: "08:01", timeOut: "16:11").save(flush:true, failOnError: true)
      def att4 = Attendance.findByEmployeeAndAttDate(emp1,new SimpleDateFormat("dd/MM/yyyy").parse("04/08/2017"))?:new Attendance(employee: emp1, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("04/08/2017"), timeIn: "08:01", timeOut: "16:11").save(flush:true, failOnError: true)
      def att5 = Attendance.findByEmployeeAndAttDate(emp1,new SimpleDateFormat("dd/MM/yyyy").parse("05/08/2017"))?:new Attendance(employee: emp1, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("05/08/2017"), timeIn: "08:01", timeOut: "16:11").save(flush:true, failOnError: true)
      def att6 = Attendance.findByEmployeeAndAttDate(emp1,new SimpleDateFormat("dd/MM/yyyy").parse("06/08/2017"))?:new Attendance(employee: emp1, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("06/08/2017"), timeIn: "08:01", timeOut: "16:11").save(flush:true, failOnError: true)
      def att7 = Attendance.findByEmployeeAndAttDate(emp1,new SimpleDateFormat("dd/MM/yyyy").parse("07/08/2017"))?:new Attendance(employee: emp1, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("07/08/2017"), timeIn: "08:01", timeOut: "16:11").save(flush:true, failOnError: true)
      def att8 = Attendance.findByEmployeeAndAttDate(emp1,new SimpleDateFormat("dd/MM/yyyy").parse("08/08/2017"))?:new Attendance(employee: emp1, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("08/08/2017")).save(flush:true, failOnError: true)
      def att9 = Attendance.findByEmployeeAndAttDate(emp1,new SimpleDateFormat("dd/MM/yyyy").parse("09/08/2017"))?:new Attendance(employee: emp1, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("09/08/2017")).save(flush:true, failOnError: true)
      def att10 = Attendance.findByEmployeeAndAttDate(emp1,new SimpleDateFormat("dd/MM/yyyy").parse("10/08/2017"))?:new Attendance(employee: emp1, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("10/08/2017"), timeIn: "08:01", timeOut: "16:11").save(flush:true, failOnError: true)
      def att11 = Attendance.findByEmployeeAndAttDate(emp1,new SimpleDateFormat("dd/MM/yyyy").parse("11/08/2017"))?:new Attendance(employee: emp1, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("11/08/2017"), timeIn: "08:01", timeOut: "16:11").save(flush:true, failOnError: true)
      def att12 = Attendance.findByEmployeeAndAttDate(emp2,new SimpleDateFormat("dd/MM/yyyy").parse("01/08/2017"))?:new Attendance(employee: emp2, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("01/08/2017"), timeIn: "08:01", timeOut: "16:11").save(flush:true, failOnError: true)
      def att13 = Attendance.findByEmployeeAndAttDate(emp2,new SimpleDateFormat("dd/MM/yyyy").parse("02/08/2017"))?:new Attendance(employee: emp2, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("02/08/2017")).save(flush:true, failOnError: true)
      def att14 = Attendance.findByEmployeeAndAttDate(emp2,new SimpleDateFormat("dd/MM/yyyy").parse("03/08/2017"))?:new Attendance(employee: emp2, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("03/08/2017"), timeIn: "08:01", timeOut: "16:11").save(flush:true, failOnError: true)
      def att15 = Attendance.findByEmployeeAndAttDate(emp2,new SimpleDateFormat("dd/MM/yyyy").parse("04/08/2017"))?:new Attendance(employee: emp2, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("04/08/2017"), timeIn: "08:01", timeOut: "16:11").save(flush:true, failOnError: true)
      def att16 = Attendance.findByEmployeeAndAttDate(emp2,new SimpleDateFormat("dd/MM/yyyy").parse("05/08/2017"))?:new Attendance(employee: emp2, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("05/08/2017"), timeIn: "08:01", timeOut: "16:11").save(flush:true, failOnError: true)
      def att17 = Attendance.findByEmployeeAndAttDate(emp2,new SimpleDateFormat("dd/MM/yyyy").parse("06/08/2017"))?:new Attendance(employee: emp2, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("06/08/2017")).save(flush:true, failOnError: true)
      def att18 = Attendance.findByEmployeeAndAttDate(emp2,new SimpleDateFormat("dd/MM/yyyy").parse("07/08/2017"))?:new Attendance(employee: emp2, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("07/08/2017"), timeIn: "08:01", timeOut: "16:11").save(flush:true, failOnError: true)
      def att19 = Attendance.findByEmployeeAndAttDate(emp2,new SimpleDateFormat("dd/MM/yyyy").parse("08/08/2017"))?:new Attendance(employee: emp2, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("08/08/2017"), timeIn: "08:01", timeOut: "16:11").save(flush:true, failOnError: true)
      def att20 = Attendance.findByEmployeeAndAttDate(emp2,new SimpleDateFormat("dd/MM/yyyy").parse("09/08/2017"))?:new Attendance(employee: emp2, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("09/08/2017"), timeIn: "08:01", timeOut: "16:11").save(flush:true, failOnError: true)
      def att21 = Attendance.findByEmployeeAndAttDate(emp2,new SimpleDateFormat("dd/MM/yyyy").parse("10/08/2017"))?:new Attendance(employee: emp2, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("10/08/2017"), timeIn: "08:01", timeOut: "16:11").save(flush:true, failOnError: true)
      def att22 = Attendance.findByEmployeeAndAttDate(emp2,new SimpleDateFormat("dd/MM/yyyy").parse("11/08/2017"))?:new Attendance(employee: emp2, attDate: new SimpleDateFormat("dd/MM/yyyy").parse("11/08/2017"), timeIn: "08:01", timeOut: "16:11").save(flush:true, failOnError: true)
    }
    def destroy = {
    }
}
