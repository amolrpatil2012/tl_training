import { Component } from '@angular/core';
import {
  FormControl,
  FormGroup,
  ReactiveFormsModule,
  Validators,
} from '@angular/forms';

@Component({
  selector: 'app-reactiveform',
  imports: [ReactiveFormsModule],
  templateUrl: './reactiveform.component.html',
  styleUrl: './reactiveform.component.css',
})
export class ReactiveformComponent {
  contactForm = new FormGroup({
    firstname: new FormControl('', [
      Validators.required,
      Validators.minLength(10),
    ]),
    lastname: new FormControl(),
    email: new FormControl(),
    isMarried: new FormControl(),
    gender: new FormControl(),
    country: new FormControl(),
  });

  onSubmit() {
    console.log(this.contactForm.value);
  }

  countryList: Country[] = [
    new Country('1', 'India'),
    new Country('2', 'USA'),
    new Country('3', 'UK'),
  ];
}
export class Country {
  id: string;
  name: string;

  constructor(id: string, name: string) {
    this.id = id;
    this.name = name;
  }
}
