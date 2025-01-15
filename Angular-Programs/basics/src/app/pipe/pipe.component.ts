import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { TempConverter } from './temp-convertor.pipe';

@Component({
  selector: 'app-pipe',
  imports: [CommonModule, TempConverter],
  templateUrl: './pipe.component.html',
  styleUrl: './pipe.component.css',
})
export class PipeComponent {
  tdate: Date = new Date();
  msg: string = 'Hello How are you';
  num: number = 9542.14554;
  per: number = 0.7414;
  cur: number = 175;
  tempC: number = 35;
}
