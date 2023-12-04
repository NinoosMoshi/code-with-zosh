import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { FooterComponent } from './components/footer/footer.component';
import { NavContentComponent } from './components/nav-bar/nav-content/nav-content.component';
import { DemoAngularMaterialModules } from 'src/app/DemoAngularMaterialModules';
import { ProductCardComponent } from './components/product-card/product-card.component';
import { StarRatingComponent } from './components/star-rating/star-rating.component';



@NgModule({
  declarations: [
    NavBarComponent,
    FooterComponent,
    NavContentComponent,
    ProductCardComponent,
    StarRatingComponent
  ],
  imports: [
    CommonModule,
    DemoAngularMaterialModules
  ],
  exports: [
    NavBarComponent,
    FooterComponent,
    ProductCardComponent,
    StarRatingComponent
  ]
})
export class SharedModule { }
