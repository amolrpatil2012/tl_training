export class Product {
  productID: number;
  name: string;
  price: number;

  constructor(productID: number, name: string, price: number) {
    this.name = name;
    this.price = price;
    this.productID = productID;
  }
}
