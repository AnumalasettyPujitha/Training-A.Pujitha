//Contact Component...Externally
import React from 'react';

//Contact Component
const Contact=()=> {    

    //arrow Function
    var users={
        id:1,
        name:'kumar',
        phone:7896541230,
        email:'kumar@gmail.com'
}
    const myaddress=()=>
    {
        return("this is javascript Function Statement Result...")
    }



    return(<>
                { myaddress()   }

                <h1>CONTACT COMPONENT</h1>
                
                <h1>User Details:</h1>
                <ul>
                    <li>{users.id}</li>
                    <li>{users.name}</li>
                    <li>{users.phone}</li>
                    <li>{users.email}</li>
                </ul>
            

                          


        </>);
}

export default Contact
