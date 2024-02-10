package io.github.thiagopac.rest;

import lombok.Data;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
public class ApiErrors {

    @Getter
    List<String> errors;

    public ApiErrors(String mensagemErro){
        this.errors = Arrays.asList(mensagemErro);
    }
}
