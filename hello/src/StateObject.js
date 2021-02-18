import React,{  setState } from 'react'

//child CLASSES
class StateObject extends  React.Component 
{

  constructor() 
  {
    super();

    //Step-1: Create state object and Initialization also
    this.state={ counter:0 }
  }


  //increments
  increments=()=>
  {
    
    if(this.state.counter<10)
    {
    this.setState({   counter: this.state.counter+1  })
    }


  }


 //Decrements
decrements=()=>
  {
    if(this.state.counter>0)
    {
       this.setState({   counter: this.state.counter-1 })
    }
  }

  render() {
     
     

      return(<>  

               <div class="container py-5">
                    <h3 className="text-center py-3">CLASS_COMPONENT_with_STATE_OBJECT</h3>

                    <p> counter : { this.state.counter } </p>

              

                    <button type="button"
                          className="btn btn-info" 
                          onClick={  this.increments }> 
                          Counter_Increment
                    </button>

                    &nbsp; &nbsp; &nbsp;

                    <button type="button"
                          className="btn btn-info" 
                          onClick={  this.decrements }> 
                          Counter_Decrement
                    </button>


               </div>
            </>)
  }

}

export default StateObject