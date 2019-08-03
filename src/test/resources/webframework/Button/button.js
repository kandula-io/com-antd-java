'use strict';

const { Button } = antd;

class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = { clicked: false };
    }

    render() {

        if (this.state.clicked) {
            return <p><div id="result">Clicked</div></p>
        }

        return (<p><Button className="at__my_button" onClick={() => this.setState({ clicked : true })} type="primary">Primary</Button></p>);
    }
}

const domContainer = document.querySelector('#element_container');
ReactDOM.render(<App />, domContainer);
