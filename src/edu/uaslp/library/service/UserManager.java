package edu.uaslp.library.service;

import java.util.HashMap;

import edu.uaslp.library.model.User;

public class UserManager {

    private HashMap<String, User> usuarios=new HashMap<>();

    private User createUsuario(String clave, String nombre){
        User usuario = new User();

        usuario.setCode(clave);
        usuario.setName(nombre);

        return usuario;
    }

    public UserManager(){
        usuarios.put("12345", createUsuario("12345","Ricardo"));
        usuarios.put("23456", createUsuario("23456", "Betty"));
        usuarios.put("34567", createUsuario("34567","Armando"));
        usuarios.put("45678", createUsuario("45678","Marcela"));
        usuarios.put("56789", createUsuario("56789","Patricia"));
        usuarios.put("67890", createUsuario("67890","Mario"));
        usuarios.put("78901", createUsuario("78901","Nicolas"));
        usuarios.put("89012", createUsuario("89012","Catalina"));
        usuarios.put("90123", createUsuario("90123","Freddy"));
        usuarios.put("01234", createUsuario("01234","Hugo"));
    }


    public User dameUsuarioPorClave(String clave) {
        return usuarios.get(clave);
    }
}
