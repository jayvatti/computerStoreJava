# computerStoreJava


## Buying/Selling System
This Java-based buying/selling system allows users to create accounts, trade, buy, and sell computers. It employs concepts such as Inheritance, Abstract Classes, File IO, Serialization, and various data types like Vectors.

## Project Overview
This is a freshman year project focusing on the implementation of a user-friendly system where users can create an account to buy, sell, or trade computers with other users. The system is also equipped with an admin functionality, allowing admin users to manage the overall process, including user account removal and product updates. The initial data, consisting of products available for selling, is populated through File IO and includes serialization.

## Features
- **User Account Management:** Users can create, login, or trade with their accounts. Each user has a unique user ID.
- **Admin Control:** Admin users have the ability to add, update, and remove users and manage products.
- **Trade-In Options:** Users can trade computers with others, subject to mutual agreement.
- **User Bank:** Manages and stores user money, allowing increments and decrements.

## User Flow
1. **Login/Account Creation:** Users/admins start by logging in. New users can create an account.
2. **View Products:** Upon successful login, users can view available products and their trade values.
3. **Buying, Selling, Trading:** Users can choose to buy, sell, or initiate trades with other users.
4. **Admin Management:** Admins can oversee and manage users and products in the system.

## Technical Framework
- **Language:** Java
- **Concepts Used:** Inheritance, Abstract Classes, File IO, Serialization
- **Data Types:** Vectors, ArrayLists, etc.

## Data Design
- **File IO:** Initial product data are read from a CSV file, creating objects in an object array.
- **Serialization:** Included to manage user data effectively.

## Class Structure
- **User Class:** Manages user-specific functionalities, storing computers bought and trade values.
- **Admin Class:** Extends from the login class, manages user accounts and product data.
- **Login Class:** Handles login functionalities and stores usernames and passwords.
- **Bank Class:** Manages user money with appropriate getter and setter methods.
- **Trade Class:** Enables trade between users, storing necessary objects and serial numbers.

## How to Run
1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Compile and run the Java files.

