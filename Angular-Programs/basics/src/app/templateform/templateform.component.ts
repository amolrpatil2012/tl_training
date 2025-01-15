import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

export class Country {
  id: string;
  name: string;

  constructor(id: string, name: string) {
    this.id = id;
    this.name = name;
  }
}

@Component({
  selector: 'app-templateform',
  imports: [FormsModule],
  templateUrl: './templateform.component.html',
  styleUrl: './templateform.component.css',
})
export class TemplateformComponent {
  // Will execute on submit click
  onSubmit(contactForm: any) {
    console.log(contactForm.value);
  }

  countryList: Country[] = [
    new Country('1', 'India'),
    new Country('2', 'USA'),
    new Country('3', 'UK'),
  ];
}
