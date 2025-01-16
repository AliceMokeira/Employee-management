import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http: HttpClient) { }

  postEmployee(employeeRequest: any): Observable<any>{
    return this.http.post('http://localhost:8081/api/employees/employee',employeeRequest);
  }

  getAllEmployees(): Observable<any>{
    return this.http.get('http://localhost:8081/api/employees/all');
  }
}
