import React from 'react';
import { BrowserRouter, Route, Switch, Redirect }  from 'react-router-dom';


//import Information/view Components...
import Header from './Header.js'
import Footer from './Footer.js'

import Home from './Home.js'
import About from './About.js'
import Services from './Services.js'
import Blog from './Blog.js'
import Portfolios from './Portfolios.js'
import Contact from './Contact.js'
import Pagenotfound from './Pagenotfound.js'



const Routings=()=> 
{
    return (<>

<BrowserRouter>

               {/* navbar Component */ }
               
                <Header />   
               
               {/* navbar Component */ }
              
            <Switch>
                <Route exact path="/" component={Home} />
                <Route path="/home" component={Home} />
                <Route path="/about" component={About} />
                <Route path="/services" component={Services} />
                <Route path="/portfolios" component={Portfolios} />
                <Route path="/blog" component={Blog} /> 
                <Route path="/contact" component={Contact} />
                <Redirect to="/home" />
                <Route  component={Pagenotfound} />
            </Switch>


                  {/* Footer Component */ }
               
                  <Footer /> 
               
                  {/* Footer Component */ }

                
</BrowserRouter>

    </>)
}


export default Routings