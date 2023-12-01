import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { FooterComponent } from './components/footer/footer.component';
import { NavContentComponent } from './components/nav-bar/nav-content/nav-content.component';
import { DemoAngularMaterialModules } from 'src/app/DemoAngularMaterialModules';



@NgModule({
  declarations: [
    NavBarComponent,
    FooterComponent,
    NavContentComponent
  ],
  imports: [
    CommonModule,
    DemoAngularMaterialModules
  ],
  exports: [
    NavBarComponent,
    FooterComponent
  ]
})
export class SharedModule { }
