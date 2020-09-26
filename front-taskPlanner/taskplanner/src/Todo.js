import React from 'react';

export class Todo extends React.Component {

    render() {
        return (
            <div>
                <div><b>id:</b> {this.props.id}</div>
                <div><b>email:</b> {this.props.email}</div>
                <div><b>password:</b> {this.props.password}</div>
                <div><b>name:</b> {this.props.name}</div>
            </div>
            
        );
    }

}