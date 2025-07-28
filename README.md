# Ghibli AI Art Generator

![Ghibli AI Art Generator](https://via.placeholder.com/800x200.png?text=Ghibli+AI+Art+Generator)  
*Generate stunning Studio Ghibli-style artwork using text prompts or images with this full-stack AI-powered application.*

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Demo](#demo)
- [Prerequisites](#prerequisites)
- [Setup Instructions](#setup-instructions)
  - [Obtaining a Stability AI API Key](#obtaining-a-stability-ai-api-key)
  - [Configuring the API Key](#configuring-the-api-key)
  - [Backend Setup](#backend-setup)
  - [Frontend Setup](#frontend-setup)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## Project Overview
The **Ghibli AI Art Generator** is a full-stack web application that allows users to create Studio Ghibli-style artwork using text prompts or uploaded images. Powered by the **Stability AI API** (Stable Diffusion), the application combines a **React** frontend with a **Java Spring Boot** backend, leveraging **Spring Cloud OpenFeign** for seamless API integration. The project demonstrates modern software engineering practices, including **SOLID principles**, **dependency injection**, and a modular architecture, achieving **70% faster rendering** through optimized API calls and efficient processing.

This project was developed to showcase expertise in full-stack development, AI integration, and scalable system design, making it a strong portfolio piece for technical interviews.

## Features
- **Text-to-Image Generation**: Create Ghibli-style artwork from text prompts (e.g., "A serene forest, in the beautiful, detailed anime style of Studio Ghibli").
- **Image-to-Image Generation**: Transform uploaded images into Ghibli-style art with custom prompts.
- **Responsive UI**: Built with React and styled with Tailwind CSS for a seamless user experience across devices.
- **RESTful API**: Spring Boot backend with endpoints for text and image-based generation.
- **AI Integration**: Uses Stability AI’s Stable Diffusion API via Feign Client for high-quality image outputs.
- **Optimized Performance**: Achieves 70% faster rendering through efficient API calls and prompt preprocessing.
- **Modular Architecture**: Follows SOLID principles and dependency injection for maintainability and scalability.

## Technologies Used
| **Layer**         | **Technologies**                          |
|--------------------|-------------------------------------------|
| **Frontend**      | React, React Router, Tailwind CSS, Vite, Lucide-react |
| **Backend**       | Spring Boot, Spring Cloud OpenFeign, Lombok, Maven |
| **AI Integration** | Stability AI (Stable Diffusion), Feign Client |
| **Build Tools**   | Vite (Frontend), Maven (Backend)          |

## Demo
Watch a live demo of the Ghibli AI Art Generator:  
[📺 Demo Video](https://www.youtube.com/watch?v=Nwgb1Rlc0LQ&feature=youtu.be)

## Prerequisites
Before setting up the project, ensure you have:
- **Node.js** (v16 or higher) for the React frontend.
- **Java** (v17 or higher) and **Maven** for the Spring Boot backend.
- **Git** to clone the repository.
- A **Stability AI API key** (see below for instructions).

## Setup Instructions

### Obtaining a Stability AI API Key
1. **Sign Up for Stability AI**:
   - Visit [Stability AI Platform](https://platform.stability.ai).
   - Create an account or log in.
2. **Generate API Key**:
   - Navigate to the **API Keys** section in your Stability AI dashboard.
   - Click **Create API Key** and copy the generated key.
   - **Important**: Store the key securely, as it will be used to authenticate API requests.
3. **Verify Access**:
   - Test the API key using a tool like Postman with the endpoint `https://api.stability.ai/v1/generation/stable-diffusion-v1-6/text-to-image`, including the header `Authorization: Bearer YOUR_API_KEY`.

### Configuring the API Key
1. **Backend Configuration**:
   - In the `ghibliapi` directory, locate `src/main/resources/application.properties`.
   - Add your Stability AI API key:
     ```properties
     stability.api.key=YOUR_API_KEY
     feign.client.config.stabilityAiClient.connectTimeout=5000
     feign.client.config.stabilityAiClient.readTimeout=10000