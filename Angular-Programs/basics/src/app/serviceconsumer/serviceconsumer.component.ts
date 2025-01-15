import { Component } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-serviceconsumer',
  imports: [],
  templateUrl: './serviceconsumer.component.html',
  styleUrl: './serviceconsumer.component.css',
})
export class ServiceconsumerComponent {
  products!: Product[];
  //pservice: ProductService;

  // Dependency Injection -- Autowiring
  constructor(private pservice: ProductService) {
    //this.pservice = new ProductService();
  }
  getProducts() {
    this.products = this.pservice.getProducts();
  }
}
