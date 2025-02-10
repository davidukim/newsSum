import { Loading } from "./Loading";

export function NewsListing({news}) {
    if (!news || news.length===0){
        return <Loading/>
    }

    return (
        <div style={{ flex: 1, overflowY: "auto", padding: "1rem" }}>
          {news.map((article, index) => (
            <div
              key={index}
              style={{
                border: "1px solid #ddd",
                padding: "1rem",
                marginBottom: "1rem",
                borderRadius: "8px",
                boxShadow: "0px 2px 5px rgba(0,0,0,0.1)",
              }}
            >
              <h3>{article.title}</h3>
              <p>{article.description}</p>
              <a href={article.url} target="_blank" rel="noopener noreferrer">
                Read more
              </a>
            </div>
          ))}
        </div>
      );
}