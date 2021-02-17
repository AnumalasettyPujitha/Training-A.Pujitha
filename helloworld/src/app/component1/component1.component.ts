import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';


@Component({
  selector: 'app-component1',
  templateUrl: './component1.component.html',
  styleUrls: ['./component1.component.css'],

})
export class Component1Component implements OnInit {
  constructor() { 
  }

  ngOnInit(): void {
  }
  public responseforms=new FormGroup({

    uname:new FormControl('kumar'),
    email:new FormControl('kumar@gmail.com'),
    
    
    address:new FormGroup({
      state:new FormControl('TS'),
      city:new FormControl('HYD'),
      place:new FormControl('DILSUKHNAGAR'),
      pincode:new FormControl('500036'),
    })
    
  });	
  myFun(){
    alert("you submitted the form");
  }


}
