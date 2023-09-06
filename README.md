# Credit-reclamation-application-with-Camunda-7-Spring-and-Angular
## Overview
This application is built to streamline and automate the credit reclamation process in a bank using a combination of Spring, Camunda 7 and Angular. It provides a user-friendly interface for users to initiate and track credit reclamation requests while ensuring efficient workflow management.


## Features

- **User Authentication:** Secure login and access control for authorized users : agency agent, headquarters CRC agent and headquarters Back office agent.
- **Dashboard:** An intuitive dashboard for users to initiate and monitor credit reclamation requests.
- **Workflow Automation:** Camunda is used for defining and managing the credit reclamation workflow, ensuring consistent and efficient processes.
- **Integration:** Seamless integration with backend systems to retrieve and update credit information.
- **Reporting:** Generate and export reports on credit reclamation requests and their status.

## Technologies Used

- **Backend**:
  - Spring Boot: Java-based framework for building robust and scalable backend services.
  - Camunda BPM: Workflow automation and business process management.
  - Spring Security: Authentication and authorization.
  - Database (e.g., MySQL): Data storage.

- **Frontend**:
  - Angular: A powerful framework for building dynamic web applications.
  - Angular Material: UI components for a consistent and responsive user interface.
  - Angular template : 

## Installation

1. **Clone the Repository:**
  - git clone https://github.com/your-username/credit-reclamation-app.git
  - cd credit-reclamation-app
2. **Backend Setup:**
- Configure your database settings in `application.properties`.
- Build and run the Spring Boot application.

3. **Frontend Setup:**
- Navigate to the `frontend` directory.
- Install Angular CLI globally if not already installed: `npm install -g @angular/cli`.
- Install frontend dependencies: `npm install`.
- Start the Angular development server: `ng serve`.

4. **Access the Application:**
Open a web browser and visit `http://localhost:4200` to use the application.

## Usage

1. **User Registration and Login:**
- Users can log in using their credentials.
- Sign up your users with a post request with Postman using this body format and specify the roles as AGENCE, CRC, BACK_OFFICE:
    {
    "login":"mylogin",
    "password":"mypassword",
    "roles":"AGENCE",
    "nom":"lastname",
    "prenom":"firstname"
    }



  
![image](https://github.com/syrinefekih/Credit-reclamation-application-with-Camunda-7-Spring-and-Angular/assets/108399432/b2b66aff-0140-435e-b144-3d73c51e1951)


2. **Dashboard:**
- Users can initiate credit reclamation requests.
- Monitor the progress of ongoing requests.
- View historical data and reports.

3. **Workflow Management:**
- Camunda BPM ensures seamless workflow management.
- Define custom workflows based on your organization's needs.
![image](https://github.com/syrinefekih/Credit-reclamation-application-with-Camunda-7-Spring-and-Angular/assets/108399432/9d9e58f5-ba8b-42eb-babd-9daef4197100)


## Contact

For any questions or inquiries, please contact:  syrine.fekih@etudiant-enit.utm.tn
