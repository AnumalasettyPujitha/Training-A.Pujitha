//About Component...Externally
import React from 'react';
import users from './userdata.json'
import './index.css'

//About Component
const About=()=> {    

    const finalresult=users.map( (result,index)=>{        
         return(<ul key={index}>
                    <li> {result.id} </li>
                    <li> {result.name} </li>
                    <li> {result.email} </li>
                    <li> {result.phno} </li>
                </ul>)
    })
    
        return(<>
                    <h1 align="center">ABOUT COMPONENT</h1>
                    <p>
                        Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                        Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                        Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                        Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                        Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                        Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                    </p>
    
                    { finalresult }
    
            </>);
    }
    
    export default About
    