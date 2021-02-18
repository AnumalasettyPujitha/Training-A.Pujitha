import React from 'react'
import './index.css'

const Child=(props)=> {


    console.log(props)
  
    return (<>

           <div className="h3">
           
                 <h3>CHILD COMPONENT</h3>

                 { props.id }- { props.name }- { props.email } <br />
                 
                 { props.address() } <br /> <br />

                 { props.my() }  <br /> <br />

                 { props.uname }- {props.uid}  <br /> <br />

                 <ul>
                  {
                         props.cities.map( (res,index)=><li key={index}>{res}</li>)
                  }
              </ul>


           </div>

            </>)
}

export default Child
