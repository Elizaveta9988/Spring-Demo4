package security;

@Controller
public class WebController {

    @GetMapping("/public")
    public String publicPage() {
        return "publicPage";
    }

    @GetMapping("/private")
    public String privatePage() {
        return "privatePage";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
