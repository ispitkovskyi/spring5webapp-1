package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by igors on 1/6/22
 */
@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books", bookRepository.findAll());
        //Need to return "books/list", because there is "books" directory under "resources/templates", and there is a "list.html" file
        //So, "books" sub-directory and "list" template-file -> "books/list" path
        //This is how the Thymeleaf finds the template to render to html
        return "books/list";
    }
}
