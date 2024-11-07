
# Full-Stack eCommerce Website Project

Welcome to the **Full-Stack eCommerce Website** project repository! This project is designed to help developers build a complete eCommerce platform from scratch using modern technologies. Whether you're looking to enhance your resume or gain hands-on experience in building production-level applications, this project is the perfect opportunity.

## Tech Stack:
- **Frontend:**
  - React
  - Material-UI (MUI)
  - Tailwind CSS
  - Redux
  - React Router DOM

- **Backend:**
  - Spring Boot
  - MySQL
  - Razorpay (for payment gateway integration)

## Key Features:
This repository will guide you through creating a comprehensive, full-featured eCommerce website with both frontend and backend components.

### 1. **Frontend Development (React)**:
   - **Visually appealing interface:** Designed using Material-UI and Tailwind CSS for a modern and responsive layout.
   - **Product Browsing:** Features like dynamic carousel, product filtering, sorting, and pagination to provide an intuitive shopping experience.
   - **User Authentication:** Secure login/signup functionality with JWT for user authentication and authorization.
   - **Product Pages:** Dynamic product pages with detailed descriptions and images.

### 2. **Backend Development (Spring Boot)**:
   - **Scalable and Secure Backend:** A RESTful Spring Boot application that connects to a MySQL database.
   - **Database Integration:** Manage product information, user profiles, and order details in a structured way.
   - **Order Management:** Handle order creation, update, and status tracking.

### 3. **Payment Gateway Integration (Razorpay)**:
   - **Secure Payments:** Implemented Razorpay payment gateway for smooth and secure transactions during checkout.
   - **Order Summary:** Customers can review their orders before confirming the payment.

### 4. **Admin Dashboard**:
   - **Product Management:** Admin users can add, edit, and delete products from the inventory.
   - **Order Management:** Admins can track and process orders efficiently.
   - **User Management:** Admins have control over user roles and permissions.

## Getting Started:
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/Saicharanw/ecommerce-Application.git
   ```

2. **Frontend Setup:**
   - Navigate to the `frontend` directory.
   - Install dependencies:
     ```bash
     npm install
     ```
   - Run the frontend application:
     ```bash
     npm start
     ```

3. **Backend Setup:**
   - Navigate to the `backend` directory.
   - Install dependencies and run the Spring Boot application:
     ```bash
     ./mvnw spring-boot:run
     ```

4. **Database Setup:**
   - Set up a MySQL database and configure the connection in the application properties.

5. **Payment Integration:**
   - Set up Razorpay credentials in the backend to enable secure transactions.

## Contributing:
Feel free to fork the repository, submit issues, and create pull requests. Whether you're fixing a bug, improving documentation, or adding new features, your contributions are welcome!

## License:
This project is licensed under the MIT License.
