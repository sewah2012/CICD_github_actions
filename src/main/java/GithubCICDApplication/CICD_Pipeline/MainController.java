package GithubCICDApplication.CICD_Pipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping
    public String cicd(){
        return "This app is using Github actions for CI/CD";
    }
}
