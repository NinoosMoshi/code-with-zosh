import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { lehngacholiPage2 } from 'src/Data/Saree/lenghaCholiPage2';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.scss']
})
export class ProductDetailsComponent {

  selectedSize:any;
  reviews = [1,2,3];
  relatedProducts:any

  constructor(private router:Router){}


  ngOnInit(){
    this.relatedProducts = lehngacholiPage2;
  }


  handleAddToCart(){
    console.log(this.selectedSize)
    this.router.navigate(['cart'])
  }



}
