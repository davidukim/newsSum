import { NewsListing } from "../components/NewsListing";

export function LoggedOutPage({news}){
    console.log("You are now in the LoggedOut Page!");
    return <NewsListing news={news}/>
    
}