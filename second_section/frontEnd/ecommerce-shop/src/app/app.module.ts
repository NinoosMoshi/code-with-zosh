import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { DemoAngularMaterialModules } from './DemoAngularMaterialModules';
import { HomeProductCardComponent } from './module/feature/components/home/home-product-card/home-product-card.component';
import { HomeComponent } from './module/feature/components/home/home.component';
import { MainCarouselComponent } from './module/feature/components/home/main-carousel/main-carousel.component';
import { ProductSliderComponent } from './module/feature/components/home/product-slider/product-slider.component';
import { FooterComponent } from './module/shared/components/footer/footer.component';
import { NavBarComponent } from './module/shared/components/nav-bar/nav-bar.component';
import { NavContentComponent } from './module/shared/components/nav-bar/nav-content/nav-content.component';




@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    MainCarouselComponent,
    HomeProductCardComponent,
    ProductSliderComponent,
    NavBarComponent,
    NavContentComponent,
    FooterComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    DemoAngularMaterialModules,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
