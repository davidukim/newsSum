import './App.css';
import React, { useEffect, useState } from 'react';
import {LoggedOutPage, LoggedInPage} from './pages';  
import { Loading } from './components/Loading';


function App() {
  const [news, setNews] = useState([]);
  const [loading, setLoading] = useState(true);
  const [loggedIn, setLoggedIn] = useState(false);

  useEffect(() => {
    const fetchNews = async() => {
      try{
        const response = await fetch("http://localhost:8080/route/get");
        if (!response.ok){
          throw new Error("Failed to fetch news from server..");
        }
         const result = await response.json();
         console.log(result);
         setNews(result);
      } catch (error){
        console.error("Error: ", error);
      } finally {
        setLoading(false);
      }
    }
    fetchNews();
  }, [])

  return (loading ? <Loading/>: 
    loggedIn ? <LoggedInPage news={news}/> : <LoggedOutPage news={news}/> )
  
}
export default App;
