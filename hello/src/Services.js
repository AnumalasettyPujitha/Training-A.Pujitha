import React from 'react';

//Fontawesome Icons Package
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faBaby,faPollH,faSnowboarding } from '@fortawesome/free-solid-svg-icons'

const Services=()=> {    

    const styles={ backgroundColor:'#12151c' }

    return(<>

<div className="container-fluid" style={styles}>
      <div className="container p-5 text-center">
       
        <h1 className="pt-2 pb-5 text-white">SERVICES</h1>

        <div className="row">


  <div className="col-lg-4">
    <div className="card text-center text-white p-3 " style={styles}>
        <p>
                <FontAwesomeIcon icon={faBaby} size="3x" spin className="text-weight-bold text-success" />
        </p>
    <div className="card-body">
      <h3 className="py-3">UX/UI DESIGN</h3>
      <p className="text-justify">In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content</p>
    </div>
    </div>
  </div>


  <div className="col-lg-4">
    <div className="card text-center text-white p-3" style={styles}>
    <p>
                <FontAwesomeIcon icon={faPollH} size="3x" spin className="text-success text-weight-bold" />
    </p>
      
    <div className="card-body">
      <h3 className="py-3">MARKETING</h3>
      <p className="text-justify">In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content</p>
    </div>
    </div>
  </div>


  <div className="col-lg-4">
    <div className="card text-center text-white p-3" style={styles}>

    <p>
                <FontAwesomeIcon icon={faSnowboarding} size="3x" spin className="text-success text-weight-bold" />
    </p>

    <div className="card-body">
      <h3 className="py-3">BRANDING</h3>
      <p className="text-justify">In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content</p>
    </div>
    </div>
  </div>
        </div>

      </div>
    </div>
              
        </>);
}

export default Services
