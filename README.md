# Library Management System Documentation

## Project Overview

The Library Management System (LMS) is a console-based application designed to manage a library's book inventory and member records. The system is developed to demonstrate the core principles of Object-Oriented Programming (OOP): Encapsulation, Inheritance, Polymorphism, and Abstraction. The primary goal of this project is to create a functional, user-friendly system that efficiently handles library operations while adhering to OOP best practices.

## Objectives

- **Develop a functional LMS:** Implement features for managing books and library members.
- **Showcase OOP principles:** Demonstrate encapsulation, inheritance, polymorphism, and abstraction.
- **Provide a user-friendly interface:** Create an intuitive console interface for user interaction.
- **Implement robust error handling:** Ensure the system can gracefully handle errors and invalid inputs.

## UML Diagram

To visualize the class hierarchy and relationships in the LMS, a UML diagram has been created. The diagram outlines the primary classes and their interactions. You can view the UML diagram at the following link:

[Library Management System UML Diagram](https://lucid.app/lucidchart/97702d8b-e813-4b9c-8023-b3ddab5468f3/edit?viewport_loc=-1041%2C-116%2C1480%2C625%2C0_0&invitationId=inv_93776a70-e6e6-46ec-9634-9140dd9a375d)

## Main Features

1. **Book Management**
    - **Add Book:** Add new books to the library's inventory.
    - **Remove Book:** Remove books from the inventory using the book ID.
    - **Search Book:** Search for books by title, author, or ID.
    - **View Book Details:** Display detailed information about a specific book.

2. **Member Management**
    - **Add Member:** Register new members to the library.
    - **Remove Member:** Remove members from the library database using member ID.
    - **View Member Details:** Display detailed information about a specific member.

3. **Borrowing and Returning Books**
    - **Borrow Book:** Allow members to borrow books from the library.
    - **Return Book:** Process the return of borrowed books.

4. **User Interaction**
    - **Console Interface:** Provide a text-based interface for user interaction with clear instructions and prompts.

5. **Error Handling**
    - **Input Validation:** Validate user inputs to ensure data integrity.
    - **Exception Handling:** Gracefully handle exceptions and provide user-friendly error messages.

## Class Design

The following classes are designed to implement the LMS:

- **Book Class**
    - **Attributes:** id (String), title (String), author (String)
    - **Methods:** getId(), getTitle(), getAuthor(), getInfo()

- **Member Class**
    - **Attributes:** id (String), name (String), borrowedBooks (List<Book>)
    - **Methods:** getId(), getName(), borrowBook(Book), returnBook(Book)

- **Library Class**
    - **Attributes:** books (ArrayList<Book>), members (ArrayList<Member>)
    - **Methods:** addBook(Book), removeBook(String bookId), searchBook(String query), addMember(Member), removeMember(String memberId), borrowBook(String memberId, String bookId), returnBook(String memberId, String bookId)

- **Main Class**
    - **Methods:** main(), displayMenu(), handleUserInput()

## Implementation Details

The implementation details include creating the necessary classes and their methods to handle the functionalities of the Library Management System. These details demonstrate how encapsulation, inheritance, polymorphism, and abstraction are applied to achieve a cohesive and functional system.

## Conclusion

This project provides a comprehensive example of a Library Management System that adheres to OOP principles. By implementing encapsulation, inheritance, polymorphism, and abstraction, the system is both functional and demonstrates good software engineering practices. The UML diagram linked above visually represents the class structure and relationships, aiding in understanding the system's design. This project serves as an excellent foundation for further development and enhancement.
