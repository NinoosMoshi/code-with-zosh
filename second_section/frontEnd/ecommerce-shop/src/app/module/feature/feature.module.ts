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



@NgModule({
    declarations: [
        FeatureComponent,
        HomeComponent,
        MainCarouselComponent,
        ProductSliderComponent,
        HomeProductCardComponent,
        ProductsComponent
    ],
    imports: [
      CommonModule,
      DemoAngularMaterialModules,
      SharedModule,
  ],

    exports: [FeatureComponent, HomeComponent, ProductsComponent]
})
export class FeatureModule { }
