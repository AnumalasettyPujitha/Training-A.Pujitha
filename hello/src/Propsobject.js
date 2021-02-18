import React from 'react'
import Child from './Child.js'


function myfun()
{
       return("it's Parent Component Function")
}


const users={
              uid:1001,
              uname:'kumamr'
}


const Propsobject=()=> {

    const email="kumar@gmail.com"

    var cities=["Hyd","Chenni","Delhi"]

    

    return (<>

           <div className="container py-5">
           
                 <h3>PARENT COMPONENT</h3>
                  {  email } <br />

                  { myfun() }<br /><br />

                  {users.uid}- {users.uname} <br /><br />

              <ul>
                  {
                         cities.map( (res,index)=><li key={index}>{res}</li>)
                  }
              </ul>

                  <Child 
                  id="1" 
                  name="kumar" 
                  email={email} 
                  address={ ()=> "This is Function Type Attribute" }
                  my={ myfun }
                  uname={users.uid} uid={users.uname}

                  cities={cities}
                   />

           </div>

            </>)
}

export default Propsobject 
