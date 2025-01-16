import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { EmployeeService } from '../../services/employee.service';

@Component({
  selector: 'app-post-employees',
  standalone: false,
  
  templateUrl: './post-employees.component.html',
  styleUrl: './post-employees.component.scss'
})
export class PostEmployeesComponent {

  employeesForm!: FormGroup;

  constructor(private employeeService: EmployeeService,
    private formBuilder: FormBuilder,
  ){}

  ngOnInit(){
    this.employeesForm=this.formBuilder.group({
      name: [null],
      email:[null, [Validators.email]],
      age:[null],
      phoneNumber:[null],
      department:[null],
      salary:[null]
    });
  }

  postEmployee(){
    this.employeeService.postEmployee(this.employeesForm.value).subscribe((res)=>
    {
      this.employeesForm = res;
      this.employeesForm.reset();
    }
    );
  }



}
