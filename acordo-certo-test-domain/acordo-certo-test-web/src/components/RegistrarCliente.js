import React from 'react';

class RegistrarCliente extends React.Component {

    state = {
        habilitacao_obj: []
    }

    onNameChange = (e) => {
        this.setState({ nome: e.target.value });
    }

    onGeneroChange = (e) => {
        this.setState({ genero: e.target.value });
    }

    onAChange = (e) => {
        var array = this.state.habilitacao_obj;
        array.push({ tipo: 'A' });
        this.setState({ habilitacao: array });
    }

    onBChange = (e) => {
        var array = this.state.habilitacao_obj;
        array.push({ tipo: 'B' });
        this.setState({ habilitacao: array });
    }

    onCChange = (e) => {
        var array = this.state.habilitacao_obj;
        array.push({ tipo: 'C' });
        this.setState({ habilitacao: array });
    }

    onDChange = (e) => {
        var array = this.state.habilitacao_obj;
        array.push({ tipo: 'D' });
        this.setState({ habilitacao: array });
    }

    createClient(event) {
        const axios = require('axios');
       
        axios.post('http://localhost:8090/acordocertoservice/saveOneClient/', {
            nome: this.state.nome,
            genero: this.state.genero,
            habilitacoes: this.state.habilitacao
           
        })
            .then(res => {
                console.log(res.data);
            }).catch(error => {
                console.error('Error', error);
            })
    }

    render() {
        return (
            <div>

                <h1>Cadastrar Usuário</h1>
                <hr />
                Nome <input onChange={this.onNameChange} /><br />
              
                <h2>Genero</h2>
                <hr />
                Masculino <input name="radioGenero" type="radio" value="masculino" onChange={this.onGeneroChange} /><br />
                Feminino <input name="radioGenero" type="radio" value="feminino" onChange={this.onGeneroChange} /><br />

                <h2>Habilitação</h2>
                <hr />
                A <input name="checkA" type="checkbox" value="a" onChange={this.onAChange} />
                B <input name="checkB" type="checkbox" value="b" onChange={this.onBChange} />
                C <input name="checkB" type="checkbox" value="c" onChange={this.onCChange} />
                D <input name="checkC" type="checkbox" value="d" onChange={this.onDChange} /><br />

                <button onClick={this.createClient.bind(this)}>Cadastrar</button>
                <br />

                <br />

            </div>
        )
    }

}


export default RegistrarCliente;