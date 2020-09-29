import React, { Component } from 'react'

class EmpForm extends Component{

    constructor(){
        super()
        this.state={
            ename:"",
            empno:"",
            gender:"",
            location:[],
            projects:""
    
    }
    }

    setLocation(e){

        console.log(e.target.value)
        var loc = this.state.location
        var current_location = e.target.value

        var index = loc.indexOf(current_location);

        if(index>-1){
            loc.splice(index)
        }else{
            
            loc.push(current_location);
            console.log("else")
        }
    
        this.setState({location:loc})
    }
    
    render(){
        const{ename,empno,gender,projects} = this.state;
        return(
            <div>
                <h1>Employee Form</h1>

                <table>

                   <tbody>
                        <tr>
                            <td><label>Name </label></td>
                            <td><input type="text" value={ename} onChange={(e)=>this.setState({ename:e.target.value})} /></td>
                        </tr>
                        <tr>
                            <td><label>Empno </label></td>
                            <td><input type="text" value={empno} onChange={(e)=>this.setState({empno:e.target.value})} /></td>
                        </tr>
                        <tr>
                            <td><label>Gender </label></td>
                            <td><input type="radio" name="gender" onChange={(e)=>this.setState({gender:"male"})} /> Male
                            <input type="radio" name="gender" onChange={(e)=>this.setState({gender:"female"})} /> Female
                            </td>
                        </tr>
                        <tr>
                            <td>Location</td>
                            <td><input type="checkbox" value="Vijayawada" onChange={(e)=>{this.setLocation(e)}} /> Vijayawada <br/>
                            <input type="checkbox" value="Hyderabad"  onChange={(e)=>{this.setLocation(e)}}/> Hyderabad  <br/>
                            <input type="checkbox" value="Pune"  onChange={(e)=>{this.setLocation(e)}}/> Pune</td>
                        </tr>

                        <tr>
                            <td>Projects</td>
                            <td><select value={projects} onChange={(e)=>{this.setState({projects:e.target.value})}}> <option value="">Select a Project</option> <option value="react">React</option><option value="spring">Spring</option></select></td>
                        </tr>
                        <tr>
                            <td colSpan="2"><input type="submit" /></td>
                        </tr>
                   </tbody>
                </table>
        <h3>Empno : {empno}</h3>       
        <h3>Ename : {ename}</h3>
        <h3>Gender : {gender}</h3>
        <h3>Projects : {projects}</h3>
        <h3>Location : {this.state.location.map((loc) => <li>{loc}</li>)}</h3>
            </div>
        );
    }
}

export default EmpForm
