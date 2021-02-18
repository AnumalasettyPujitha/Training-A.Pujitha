import React from 'react'
import './index.css'
const Conditionalrenderings=()=> {

    const today=new Date().getDay();
    const date=new Date().toString();
    

switch(today)
{
    case 0: return(<>
                    <h1>Today is Sunday</h1>
                        <p>{date}</p></>); break;
    case 1: return(<>
        <h1>Today is Monday</h1>
            <p>{date}</p></>); break
    case 2: return(<>
        <h1>Today is Tuesday</h1>
            <p>{date}</p></>); break
    case 3: return(<>
        <h1>Today is Wednesday</h1>
            <p>{date}</p></>); break
    case 4: return(<>
        <h1>Today is Thursday</h1>
            <p>{date}</p></>); break
    case 5: return(<>
        <h1>Today is Friday</h1>
            <p>{date}</p></>); break
    case 6: return(<>
        <h1>Today is Saturday</h1>
            <p>{date}</p></>); break
    default: return(<h1>Invalid Number </h1>)
}

    

}

export default Conditionalrenderings
