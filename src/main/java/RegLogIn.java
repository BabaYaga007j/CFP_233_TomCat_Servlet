public enum RegLogIn {
    USERNAME_START_WITH_CAPITAL("^[A-Z][A-Za-z]{3,}$"),
    PASSWORD_HAVE_ONE_SPECIAL_CHARACHTER("^[A-Za-z_0-9]+[@#$%&][A-Za-z_0-9]+$");

    String constant;
    RegLogIn(String constant) {
        this.constant = constant;
    }

    public String getConstant(){
        return constant;
    }

}
