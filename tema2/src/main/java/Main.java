import controller.CauciucController;
import controller.LoginController;
import domain.Cauciuc;
import domain.LoginRequest;
import domain.SearchCauciucResearch;
import domain.User;

public class Main {

    public static void main(String[] args) {

        LoginController loginController = new LoginController();

        LoginRequest loginRequest = new LoginRequest("gigi", "alegeoaia");

        User result = loginController.handleLoginRequest(loginRequest);

        if (result != null) {
            System.out.println("autentificare cu succes");
        }else {
            System.out.println("mai incearca " + loginRequest.loginName);

        }
        CauciucController cauciucController = new CauciucController();

        SearchCauciucResearch searchCauciucResearch = new SearchCauciucResearch("250/70R18 97Y","18", "Cauciuc toate anotimpurile");

        Cauciuc output = cauciucController.handleSearchCauciucResearch(searchCauciucResearch);

        if (output != null) {
            System.out.println("Cauciuc disponibil pe stoc");
        }else {
            System.out.println("Cauciuc indisponibil pe stoc");
        }
    }
}



