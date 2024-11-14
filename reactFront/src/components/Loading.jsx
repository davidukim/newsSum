import logo from '../logo.svg';

function Loading() {
    return (
    <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <p>
            Now loading ... 
          </p>
        </header>
    </div>
    )
}

export default Loading;