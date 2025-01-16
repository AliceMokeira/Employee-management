import { NgModule } from '@angular/core';
import { RouterModule, Routes } from'@angular/router';
import { ListEmployeesComponent } from './components/list-employees/list-employees.component';
import { PostEmployeesComponent } from './components/post-employees/post-employees.component';

const routes: Routes = [
  {path: "", component:ListEmployeesComponent},
  {path: "postEmployee",component:PostEmployeesComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
