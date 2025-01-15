import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ServiceconsumerComponent } from './serviceconsumer.component';

describe('ServiceconsumerComponent', () => {
  let component: ServiceconsumerComponent;
  let fixture: ComponentFixture<ServiceconsumerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ServiceconsumerComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ServiceconsumerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
