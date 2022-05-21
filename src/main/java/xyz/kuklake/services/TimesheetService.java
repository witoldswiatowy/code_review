package xyz.kuklake.services;

import xyz.kuklake.employee.Employee;
import xyz.kuklake.model.Mood;
import xyz.kuklake.model.Timesheet;
import xyz.kuklake.repository.EmployeeRepository;
import xyz.kuklake.repository.TimesheetRepository;

import java.time.Month;

public class TimesheetService {

    public void reportHours(long employeeId, int hours, Month month) {

        EmployeeRepository employeeRepository = new EmployeeRepository();
        Employee employee = employeeRepository.find(employeeId);

        Timesheet timesheet = new Timesheet();
        timesheet.setEmployee(employee);
        timesheet.setMonth(month);
        timesheet.setNumberOfHours(hours);

        if (hours < 40) {
            timesheet.setMood_type(Mood.HAPPY);
        } else if (hours == 40) {
            timesheet.setMood_type(Mood.NORMAL);
        } else
            timesheet.setMood_type(Mood.SAD);

        TimesheetRepository timesheetRepository= new TimesheetRepository();

        timesheetRepository.save(timesheet);
    }

}
