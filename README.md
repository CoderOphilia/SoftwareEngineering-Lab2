Browser opens http://localhost:8082/
<img width="881" height="280" alt="image" src="https://github.com/user-attachments/assets/6c2e2cbd-4d53-41d1-8ee1-02d2f8499097" />

Spring sends the request to CustomerController.InitialPage()
InitialPage() calls Repo.initialdata()
Repo returns a list with Joe inside
Controller puts:
customers
customer
into the model
Spring renders Main.html
Thymeleaf reads ${customers} and shows the table
User clicks Edit/Delete or submits the form
Those actions call controller methods again
Controller updates the list and reloads the page

****
Entity = Customer.java
Repository = Repo.java
Controller = CustomerController.java
View = Main.html
Config = application.properties
Startup = Lab1IntroductionToThymeLeafApplication.java
