import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FeatureComponent } from './components/feature.component';
import { HomeComponent } from './components/home/home.component';
import { MainCarouselComponent } from './components/home/main-carousel/main-carousel.component';
import { ProductSliderComponent } from './components/home/product-slider/product-slider.component';
import { DemoAngularMaterialModules } from 'src/app/DemoAngularMaterialModules';
import { HomeProductCardComponent } from './components/home/home-product-card/home-product-card.component';
import { ProductsComponent } from './components/products/products.component';
import { SharedModule } from "../shared/shared.module";
import { CartComponent } from './components/cart/cart.component';
import { ProductDetailsComponent } from './components/product-details/product-details.component';
import { CheckoutComponent } from './components/checkout/checkout.component';
import { PaymentComponent } from './components/payment/payment.component';
import { PaymentSuccessComponent } from './components/payment-success/payment-success.component';
import { OrderComponent } from './components/order/order.component';
import { OrderDetailsComponent } from './components/order-details/order-details.component';
import { FormsModule } from '@angular/forms';
import { ProductReviewCardComponent } from './components/product-details/product-review-card/product-review-card.component';




@NgModule({
    declarations: [
        FeatureComponent,
        HomeComponent,
        MainCarouselComponent,
        ProductSliderComponent,
        HomeProductCardComponent,
        ProductsComponent,
        CartComponent,
        ProductDetailsComponent,
        CheckoutComponent,
        PaymentComponent,
        PaymentSuccessComponent,
        OrderComponent,
        OrderDetailsComponent,
        ProductReviewCardComponent
    ],
    imports: [
      CommonModule,
      DemoAngularMaterialModules,
      SharedModule,
      FormsModule
  ],

    exports: [FeatureComponent, HomeComponent, ProductsComponent]
})
export class FeatureModule { }
