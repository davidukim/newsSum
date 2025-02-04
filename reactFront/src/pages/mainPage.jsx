export function MainPage({news}){
    return (
        <div
          style={{
            height: "100vh", // Make it take full viewport height
            display: "flex",
            flexDirection: "column",
          }}
        >
          <h2 style={{ textAlign: "center", padding: "1rem" }}>News Articles</h2>
          <div
            style={{
              flex: 1, // Takes all available space
              overflowY: "auto", // Enables scrolling
              padding: "1rem",
            }}
          >
            {news.length === 0 ? (
              <p>Loading articles...</p>
            ) : (
              news.map((article, index) => (
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
              ))
            )}
          </div>
        </div>
      );
}