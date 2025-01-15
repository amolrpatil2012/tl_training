import { Component } from '@angular/core';
import { ReactiveformComponent } from './reactiveform/reactiveform.component';
import { ServiceconsumerComponent } from './serviceconsumer/serviceconsumer.component';

// @Component -- Decorator --- like annotations in Java

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
  imports: [ServiceconsumerComponent],
})
export class AppComponent {
  title = 'First Angular Project';
}
