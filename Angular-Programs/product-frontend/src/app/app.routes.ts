import { Routes } from '@angular/router';
import { ProductListComponent } from '../components/product-list/product-list.component';
import { CreateProductComponent } from '../components/create-product/create-product.component';
import { UpdateProductComponent } from '../components/update-product/update-product.component';
import { ProductDetailsComponent } from '../components/product-details/product-details.component';

export const routes: Routes = [
  { path: 'products', component: ProductListComponent },
  { path: 'create-product', component: CreateProductComponent },
  { path: '', redirectTo: 'products', pathMatch: 'full' },
  { path: 'update-product/:id', component: UpdateProductComponent },
  { path: 'delete-product/:id', component: ProductDetailsComponent },
];
