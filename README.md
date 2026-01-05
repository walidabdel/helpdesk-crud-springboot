# Helpdesk CRUD - Spring Boot

Olá! 👋  
Este é um projeto de exemplo de **CRUD de chamados** desenvolvido em **Java com Spring Boot**.  
O objetivo é demonstrar minhas habilidades em **desenvolvimento de APIs REST**, organização de código e boas práticas de projeto.

---

## 🚀 Funcionalidades

O projeto permite gerenciar chamados de um sistema de helpdesk:

- **Criar chamado** → POST `/chamados`
- **Listar chamados** → GET `/chamados`
- **Atualizar chamado** → PUT `/chamados/{id}`
- **Deletar chamado** → DELETE `/chamados/{id}`

---

## 🏗️ Estrutura do projeto

src/
└─ main/
├─ java/com/walid/helpdesk/
│ ├─ controller/ChamadoController.java # Endpoints da API
│ ├─ service/ChamadoService.java # Lógica de negócio
│ ├─ model/Chamado.java # Entidade Chamado
│ └─ repository/ChamadoRepository.java # Acesso ao banco
└─ resources/application.properties # Configurações do Spring
---

## 💻 Tecnologias usadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database** (em memória)
- **Maven** (gerenciamento de dependências)
- **Postman** (teste de endpoints)
