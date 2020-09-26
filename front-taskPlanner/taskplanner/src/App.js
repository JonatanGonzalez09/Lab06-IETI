import React, {Component} from 'react';
import {Todo} from './Todo'

class App extends Component {
    
    constructor(props) {
        super(props);
        this.state = {
            userList: [],
      };
    }

  componentDidMount() {
      fetch('http://ietilab6jonatan.eastus2.azurecontainer.io:8080/user/all')
          .then(response => response.json())
          .then(data => {
              let lista = [];
              this.setState({userList: data});
          });
  }

  render() {
    const todoList = this.state.userList.map((todo, i) => {
        return (
            <Todo key={i} id={todo.id} email={todo.email} password={todo.password} name={todo.name}/>
        );
    });
      return (
          <div>
              {todoList}
          </div>
      );
  }
}

export default App;