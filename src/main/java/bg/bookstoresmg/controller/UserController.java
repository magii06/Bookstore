package bg.bookstoresmg.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {
    @GetMapping("/")
public String viewHomePage(Model model) {
    return index);
}
}
