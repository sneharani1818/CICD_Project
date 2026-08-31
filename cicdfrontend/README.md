# React CI/CD Pipeline with GitHub Actions & Docker

A beginner-friendly DevOps project that demonstrates a complete CI/CD pipeline for a React (Vite) application.

## What this project does

On every push / pull request to `main`:

1. Runs automated tests with **Vitest**
2. Builds a production Docker image (multi-stage: Node build → Nginx)
3. Pushes the image to **Docker Hub** (only on push to `main`)

## Tech stack

| Tool | Purpose |
|------|---------|
| React + Vite | Frontend app |
| Vitest + Testing Library | Unit tests |
| Docker | Containerization |
| Nginx | Serve production build |
| GitHub Actions | CI/CD pipeline |
| Docker Hub | Image registry |

## Project structure

```text
cicdfrontend/
├── src/
│   ├── App.jsx
│   ├── App.test.jsx
│   └── setupTests.js
├── .github/workflows/
│   └── ci-cd.yml
├── Dockerfile
├── .dockerignore
├── vitest.config.js
├── package.json
└── README.md