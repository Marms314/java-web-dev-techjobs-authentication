package org.launchcode.javawebdevtechjobsauthentication.models.dto;

public class RegisterFormDTO extends LoginFormDTO {

    private String verifyPassword;

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

}
