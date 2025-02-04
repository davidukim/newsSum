import './App.css';
import React, { useEffect, useState } from 'react';
import Loading from './components/Loading';
import { MainPage } from './pages/mainPage';

function App() {
  const [news, setNews] = useState([]);
  const [loading, setLoading] = useState(true);

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

  if (loading) return <Loading/>
  return (<MainPage news={news}/>)
}
export default App;
