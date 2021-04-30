package br.itau.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.projeto.model.User;
import br.itau.projeto.repository.UserRepo;

@RestController //indica que a classe é um Controller REST
@CrossOrigin("*") //aceita requisicao de qualquer dominio
@RequestMapping("/user") // é o caminho da url que vc vai chamar
public class UserController {
    
     /* @GetMapping("/test")
     public String teste(){
         return "Usuario";
     }  */
     
     @Autowired // injecao de dependencia - 
     private UserRepo repo;   
     
     @GetMapping("/id/{id}")
     public ResponseEntity<User> getUser(@PathVariable int id) {
         User usuarioEncontrado = repo.findById(id).orElse(null); //busca pela chave primaria (id)

         if(usuarioEncontrado != null){
             return ResponseEntity.ok(usuarioEncontrado); // ok = staus 200
         }
         return ResponseEntity.notFound().build();  //notFoud = status 404

    }
    
    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> lista = (List<User>) repo.findAll();

        if(lista != null) {
            return ResponseEntity.ok(lista);
        }
            return ResponseEntity.status(404).build();
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User userReceived){
        User userFound = repo.findByEmailOrRacf(userReceived.getEmail(),userReceived.getRacf() );
        
        if(userFound != null){
            if(userFound.getSenha().equals(userReceived.getSenha())){
                return ResponseEntity.ok(userFound); // ok = staus 200
            }
            
        }
        return ResponseEntity.notFound().build();  //notFoud = status 404

    }
}
