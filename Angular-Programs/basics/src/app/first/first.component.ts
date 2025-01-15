import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-first',
  imports: [FormsModule],
  templateUrl: './first.component.html',
  styleUrl: './first.component.css',
})
export class FirstComponent {
  firstName = 'Sachin';
  lastName = 'Tendulkar';
  color = 'blue';

  text1 = 'Good Afternoon';
  text2 = '<h1>Hello How Are You</h1>';

  getProfession(): string {
    return 'Cricketer';
  }

  count = 0;
  onClick() {
    this.count++;
  }
  text3 = '';
  // like Object -- Java
  onChange(e: any) {
    this.text3 = e.target.value;
  }

  text4 = '';
  
}
