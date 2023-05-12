import React from 'react'
import { NavLink } from "react-router-dom";
const Main = () => {
  return (
    <div>
    <div >
         <NavLink to={'/app'}>Home</NavLink>
        <NavLink to={'/about'}>About</NavLink>
        <NavLink to={'/contact'}>Contact</NavLink>
        <NavLink to={'/details'}>Details</NavLink>
        
    </div>
    </div>
   
  )
}

export default Main