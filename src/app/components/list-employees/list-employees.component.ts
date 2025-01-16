import { Component } from '@angular/core';
import { EmployeeService } from '../../services/employee.service';

@Component({
  selector: 'app-list-employees',
  standalone: false,
  
  templateUrl: './list-employees.component.html',
  styleUrl: './list-employees.component.scss'
})
export class ListEmployeesComponent {

  employees: any = [];

  constructor(private employeeService:EmployeeService){}

  ngOnInit(){
    this.getAllEmployees();
  }

  getAllEmployees(){
    this.employeeService.getAllEmployees().subscribe((res) =>{this.employees = res});
  }

}
