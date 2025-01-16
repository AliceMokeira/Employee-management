import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PostEmployeesComponent } from './post-employees.component';

describe('PostEmployeesComponent', () => {
  let component: PostEmployeesComponent;
  let fixture: ComponentFixture<PostEmployeesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [PostEmployeesComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PostEmployeesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
