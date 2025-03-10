import React from 'react';
import { Header } from './components/Header'; // Importa el Header desde la carpeta components
import { SideMenu } from './components/SideMenu'; // Importa el SideMenu desde la misma carpeta

function App() {
  return (
    <div className="IBL">
      <Header />
      <SideMenu /> 
      <main>
        <p>Somos tu mejor opción

        </p>
      </main>
    </div>
  );
}

export default App;