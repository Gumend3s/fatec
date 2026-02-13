// Importar o módulo HTTP nativo do Node.js
const http = require("http");
const fs = require("fs");
const path = require("path");
// Definir a porta onde o servidor vai rodar
const PORT = 3000;
// Criar o servidor
const server = http.createServer((req, res) => {
  // Se a requisição for para a página inicial
  if (req.url === "/" || req.url === "/index.html") {
    // Ler o arquivo HTML
    fs.readFile(
      path.join(__dirname, "public", "index.html"),
      (err, content) => {
        if (err) {
          // Se houver erro ao ler o arquivo
          res.writeHead(500, { "Content-Type": "text/plain" });
          res.end("Erro no servidor");
        } else {
          // Sucesso: enviar o HTML
          res.writeHead(200, { "Content-Type": "text/html" });
          res.end(content);
        }
      },
    );
  } else {
    // Página não encontrada (404)
    res.writeHead(404, { "Content-Type": "text/plain" });
    res.end("Página não encontrada");
  }
});
// Iniciar o servidor
server.listen(PORT, () => {
  console.log("Servidor rodando em http://localhost:3000");
  console.log("Acesse o navegador e veja sua aplicação!");
});
