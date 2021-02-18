import React from 'react'
import { NavLink }  from 'react-router-dom';

const Header=()=> {

    const styles={
        backgroundColor:'grey',
        borderBottom:'0.5px white solid', 
        borderTop:'0.5px white solid'
    }

    return (<>

        <nav className="navbar navbar-expand-lg" style={styles}>

        <a className="navbar-brand text-white" href="#">Logo</a>

        <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav">
            <span className="navbar-toggler-icon"></span>
        </button>

        <div className="collapse navbar-collapse justify-content-end" id="navbarNav">

            <ul className="navbar-nav">
            
            <li className="nav-item active">
                    <NavLink className="nav-link text-white" activeClassName="text-white bg-dark" to="/home">Home</NavLink>
            </li>

            <li className="nav-item">
                   <NavLink className="nav-link text-white" activeClassName="text-danger bg-white" to="/about">About</NavLink>
            </li>

            <li className="nav-item">
                    <NavLink className="nav-link text-white" activeClassName="text-success bg-white" to="/services">Services</NavLink>
            </li>

            <li className="nav-item">
                    <NavLink className="nav-link text-white" activeClassName="text-success bg-white" to="/portfolios">Portfolios</NavLink>
            </li>
           
            <li className="nav-item">
                    <NavLink className="nav-link text-white" activeClassName="text-success bg-white" to="/blog">Blog</NavLink>
            </li>
           
            <li className="nav-item">
                    <NavLink className="nav-link" activeStyle={{ backgroundColor:'white', color:'purple' }} to="/contact">Contact</NavLink>
            </li>
           
            </ul>
        </div>
        </nav>

            </>)
}


export default Header