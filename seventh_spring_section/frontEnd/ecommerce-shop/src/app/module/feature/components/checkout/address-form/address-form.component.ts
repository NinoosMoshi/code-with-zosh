import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-address-form',
  templateUrl: './address-form.component.html',
  styleUrls: ['./address-form.component.scss']
})
export class AddressFormComponent {

  addresses = [1,1,1];

  myForm:FormGroup = this.formBuilder.group({
    firstName:["", Validators.required],
    lastName:["", Validators.required],
    streetAddress:["", Validators.required],
    ciry:["", Validators.required],
    state:["", Validators.required],
    zipCode:["", Validators.required],
    mobile:["", Validators.required],
  })

  constructor(private formBuilder:FormBuilder){}

  ngOnInit(){

  }


  handleCreateOrder(item){

  }


  handleSubmit = () =>{
    const formValue = this.myForm.value;
    console.log(formValue)
  }

}
