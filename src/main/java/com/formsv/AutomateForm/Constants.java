package com.formsv.AutomateForm;

public enum
Constants {

    SOMEERROROCCURRED("Some Error Occurred"),
    DATAALREADYEXIST("Data Already Exist"),
    CREATED("Data Created"),
    USERNOTFOUND("User Not Found");



    public final String value;
    private Constants(String value){
        this.value=value;
    }
}
