import { Injectable } from '@angular/core';
import { Product } from './product';

@Injectable({
  providedIn: 'root',
})
export class ProductService {
  constructor() {}

  public getProducts(): Product[] {
    let products: Product[];
    products = [
      new Product(1, 'Laptop', 40000),
      new Product(2, 'Desktop', 30000),
      new Product(3, 'Mobile', 20000),
    ];
    return products;
  }
}
