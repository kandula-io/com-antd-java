'use strict';

const { Button } = antd;

class App extends React.Component {
    render() {
        return (<p><Button id="my-button" type="primary">Primary</Button></p>);
    }
}

const domContainer = document.querySelector('#element_container');
ReactDOM.render(<App />, domContainer);
