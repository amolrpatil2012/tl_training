import { NgStyle } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-second',
  imports: [NgStyle],
  templateUrl: './second.component.html',
  styleUrl: './second.component.css',
})
export class SecondComponent {
  studentList: any[] = [
    { roll: 1, name: 'Ramesh', city: 'Mumbai', isActive: false },
    { roll: 2, name: 'Rohit', city: 'Pune', isActive: true },
    { roll: 3, name: 'Suresh', city: 'Mumbai', isActive: false },
    { roll: 4, name: 'Prakash', city: 'Delhi', isActive: true },
    { roll: 5, name: 'Akash', city: 'Mumbai', isActive: false },
  ];

  customStyle: any = {
    color: 'red',
    'background-color': 'yellow',
    width: '200px',
    height: '200px',
    'border-radius': '50%',
  };
}
