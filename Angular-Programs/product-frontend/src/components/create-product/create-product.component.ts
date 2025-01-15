import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Product } from '../../product';
import { ProductServiceService } from '../../services/product-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-product',
  imports: [FormsModule],
  templateUrl: './create-product.component.html',
  styleUrl: './create-product.component.css',
})
export class CreateProductComponent {
  product: Product = new Product();
  constructor(private service: ProductServiceService, private router: Router) {}

  saveProduct() {
    this.service
      .createProduct(this.product)
      .subscribe((data) => console.log(data));
    this.router.navigate(['/products']);
  }
  onSubmit() {
    console.log(this.product);
    this.saveProduct();
  }
}
