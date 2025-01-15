import { Component } from '@angular/core';
import { ProductServiceService } from '../../services/product-service.service';
import { Product } from '../../product';

@Component({
  selector: 'app-product-list',
  imports: [],
  templateUrl: './product-list.component.html',
  styleUrl: './product-list.component.css',
})
export class ProductListComponent {
  constructor(private service: ProductServiceService) {}

  products!: Product[];

  getProducts() {
    this.service.getProducts().subscribe((data) => (this.products = data));
  }

  ngOnInit(): void {
    this.getProducts();
  }
  deleteProduct(id: number) {
    this.service.deleteProduct(id).subscribe((data) => console.log(data));
    this.getProducts();
  }
}
