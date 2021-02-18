//Home Component...Externally
import React from 'react';


//Home Component [parent Component]
const Home=()=> { 


    var styles={
            marginBottom:'0rem',
            backgroundImage:'url(./images/jumbotron-backgrounds.png)',
            backgroundRepeat:'no-repeat',
            backgroundSize:'100%'
    }

    return(<React.Fragment>
           
<div className="jumbotron text-white" style={styles}>

<div className="container">

    <div className="row">

    <div className="col-lg-6 ">
    
     
        <h1 className="h1 pt-5 mt-5 text-white">I am Pujitha.Anumalasetty</h1>
            <h5 className="bg-success p-2 mt-3 w-75 text-center">Fullstack Developer & Instructor</h5>            
        </div>

        <div className="col-lg-6">
            <img src="images/profile.jpg" className="w-75 mx-auto img-thumbnail" align="center"/>
        </div>
    </div>

</div>
</div>

    </React.Fragment>);
}

export default Home
