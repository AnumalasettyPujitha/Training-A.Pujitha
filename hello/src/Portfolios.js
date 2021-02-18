import React from 'react'

const Portfolios=()=> {

    const heights={height:'80%'}
    
    return (<>
                 <div className="container-fluid" style={{ backgroundColor:'white' }}>
     
     <div className="container p-5 text-center">

       <h1 className="text-white"> PORTFOLIOS</h1> 

       <ul className="nav justify-content-lg-center py-4">

         <li className="nav-item">
           <a href="#" className="nav-link text-white">ALL</a>
         </li>

         <li className="nav-item">
           <a href="#" className="nav-link text-white">DEVELOPMENT</a>
         </li>

         <li className="nav-item">
           <a href="#" className="nav-link text-white">WEB DESIGN</a>
         </li>

         <li className="nav-item">
           <a href="#" className="nav-link text-white">ILLUSTRATION</a>
         </li>

        

       </ul>


       <div className="row">

         <div className="col-lg-4">
           <img src="./images/4.jpg" className="w-100" style={ heights } />
         </div>

         <div className="col-lg-4">
           <img src="./images/portfolios/portfolio-2.png" className="w-100" style={ heights }  />
         </div>

         <div className="col-lg-4">
           <img src="./images/portfolios/portfolio-3.jpeg" className="w-100" style={ heights } />
         </div>

         <div className="col-lg-4">
           <img src="./images/portfolios/portfolio-4.jpg" className="w-100" style={ heights }  />
         </div>

         <div className="col-lg-4">
           <img src="./images/portfolios/portfolio-5.jpg" className="w-100" style={ heights }  />
         </div>

         <div className="col-lg-4">
           <img src="./images/profile.jpg" className="w-100" style={ heights }  />
         </div>
       </div>

     </div>
   </div>

            </>)

}

export default Portfolios
