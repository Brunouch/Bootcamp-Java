package dio.web.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.web.api.handler.BusinessException;
import dio.web.api.handler.CampoObrigatorio;
import dio.web.api.model.Usuario;

@Repository
public class UserRepository {
    
    public void save(Usuario usuario){
        if(usuario.getLogin() == null)
            throw new CampoObrigatorio("login"); 
        
        if(usuario.getPassword() == null)
            throw new CampoObrigatorio("password");
        
        if(usuario.getId() == null){
            System.out.println("SAVE - Recebendo o usuário da camada de repositorio");
        }else{
            System.out.println("UPDATE - Recebendo o usuário da camada de repositorio");
        }

        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id para excluir um usuario"));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("bruno", "bruno2211"));
        usuarios.add(new Usuario("frank", "frank123"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id Recebendo o id: %d para localizar um usuario", id));
        return new Usuario("bruno", "bruno2211");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuario", username));
        return new Usuario("bruno", "bruno2211");
    }
}
