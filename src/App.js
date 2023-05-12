
import './App.css';

import Student from './components/Student';
import Footer from './components/Footer'
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Main from './components/Main';
import About from './components/About';
import Home from './components/Home';
import Details from './components/Details';
import Contact from './components/Contact';
function App() {
  return (
    <Router>
    <div className="App">
     <div className='welcome'> Wel-COME</div>  
     <header className='header'><Main/></header>
      
<Routes>
<Route path='/'>
          <Route path="/app" element={<Home />}/>
            <Route index element={Home}></Route></Route>
           
            <Route path="/about" element={<About/>}/>
            <Route path='/contact' element={<Contact/>}/>
            <Route path='/details' element={<Details/>}/>
</Routes>

<footer className='footer'>
      <Footer/>
    </footer>
</div>
    </Router>


    
   
 
 
  );                                              
}

export default App;
