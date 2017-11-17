package controller;

import domain.LoginRequest;
import domain.User;
import service.AuthenticationService;

public class LoginController {
    private AuthenticationService authenticationService = new AuthenticationService();

    public User handleLoginRequest(LoginRequest loginRequest) {
        User user = this.authenticationService.authenticate(loginRequest);
        return user;

    }
}
