Browser opens http://localhost:8082/
<img width="881" height="280" alt="image" src="https://github.com/user-attachments/assets/6c2e2cbd-4d53-41d1-8ee1-02d2f8499097" />

## How the App Works

1. Spring sends the request to `CustomerController.InitialPage()`.

2. `InitialPage()` calls `Repo.initialdata()`.

3. `Repo` returns a list with Joe inside.

4. The controller puts `customers` and `customer` into the model.

5. Spring renders `Main.html`.

6. Thymeleaf reads `${customers}` and shows the table.

7. The user clicks Edit, Delete, or submits the form.

8. Those actions call controller methods again.

9. The controller updates the list and reloads the page.


