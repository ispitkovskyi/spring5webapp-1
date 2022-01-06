package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by igors on 1/6/22
 */
@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model authorsModel){
        //Name of this attribute will be used by the Thymeleaf to get data for the thymeleaf template, used to represent this data.
        //Need to return "authors/list", because there is "authors" directory under "resources/templates", and there is a "list.html" file
        //So, "authors" sub-directory and "list" template-file -> "authors/list" path
        //This is how the Thymeleaf finds the template to render to html
        authorsModel.addAttribute("authors", authorRepository.findAll());

        return "authors/list";
    }
}
