# expertech-homework
Программное обеспечение представлет собой RESTfull web-сервис, который предназначен для записи информации о книгах в базу данных MySql. 
Сервис принимает информацию в формате JSON, взаимодействие с сервисом осуществляется посредством нижеописанного API:
1. Поместить описание книг в базу данных: HTTP POST запрос по адресу /books, в теле запроса должно быть описание книг в формате JSON (формат приведён ниже)
2. Получить описание всех книг в базе: HTTP GET запрос по адресу /books
3. Получить описание книги в базе с идентификатором ISBN: HTTP GET запрос по адресу /books/{ISBN}
4. Изменить описание книги в базе: HTTP PUT запрос по адресу /books, в теле запроса должно быть описание книги в формате JSON (формат приведён ниже)
5. Удалить книгу с идентификатором ISBN из базы: HTTP DELETE запрос по адресу /books/{ISBN}



Формат JSON для добавления книг в базу:

{
  "books": [
    {
      "isbn": "9781593275846",
      "title": "Eloquent JavaScript, Second Edition",
      "subtitle": "A Modern Introduction to Programming",
      "author": "Marijn Haverbeke",
      "published": "2014-12-14T00:00:00.000Z",
      "publisher": "No Starch Press",
      "pages": 472,
      "description": "JavaScript lies at the heart of almost every modern web application, from social apps to the newest browser-based games. Though simple for beginners to pick up and play with, JavaScript is a flexible, complex language that you can use to build full-scale applications.",
      "website": "http://eloquentjavascript.net/"
    },
    {
      "isbn": "9781449331818",
      "title": "Learning JavaScript Design Patterns",
      "subtitle": "A JavaScript and jQuery Developer's Guide",
      "author": "Addy Osmani",
      "published": "2012-07-01T00:00:00.000Z",
      "publisher": "O'Reilly Media",
      "pages": 254,
      "description": "With Learning JavaScript Design Patterns, you'll learn how to write beautiful, structured, and maintainable JavaScript by applying classical and modern design patterns to the language. If you want to keep your code efficient, more manageable, and up-to-date with the latest best practices, this book is for you.",
      "website": "http://www.addyosmani.com/resources/essentialjsdesignpatterns/book/"
    }]
  }
  
  
  Формат JSON для изменения описания книги
  
  {
      "isbn": "9781449331818",
      "title": "Learning JavaScript Design Patterns",
      "subtitle": "A JavaScript and jQuery Developer's Guide",
      "author": "Addy Osmani",
      "published": "2012-07-01T00:00:00.000Z",
      "publisher": "O'Reilly Media",
      "pages": 254,
      "description": "With Learning JavaScript Design Patterns, you'll learn how to write beautiful, structured, and maintainable JavaScript by applying classical and modern design patterns to the language. If you want to keep your code efficient, more manageable, and up-to-date with the latest best practices, this book is for you.",
      "website": "http://www.addyosmani.com/resources/essentialjsdesignpatterns/book/"
    }
