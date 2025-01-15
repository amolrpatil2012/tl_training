// Create Pipe Using interface PipeTransform

import { Pipe, PipeTransform } from '@angular/core';

@Pipe({ name: 'tempConverter' })
export class TempConverter implements PipeTransform {
  transform(value: number, unit: string) {
    // === checks type and content
    if (unit === 'C') {
      let temp = (value - 32) / 1.8;
      return temp;
    } else {
      let temp = value * 1.8 + 32;
      return temp;
    }
  }
}
