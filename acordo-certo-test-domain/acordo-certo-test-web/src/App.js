import React, { Component } from 'react';
import './App.css';
import ReactDOM from 'react-dom';
import { BrowserRouter } from 'react-router-dom';
import { Route, Switch, Link } from 'react-router-dom';
import RegistrarCliente from './components/RegistrarCliente';

class App extends Component {

  render() {

    return (
      <div className="App">

      <h1><b>Acordo Certo Form without CSS - Test - 2019</b></h1>
        <Switch>
          <Route exact path="/" component={RegistrarCliente} />
        </Switch>
      </div>
    );
  }
}

export default App;

