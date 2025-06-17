package exemple.abstraction.execution;
import exemple.abstraction.base.Animal;
        import exemple.abstraction.fils.Chat;
                import exemple.abstraction.fils.Chien;


public class Main {

public static void main(String[] args){
    Animal Cha =new Chat("katous : ") ;
    Cha.crier() ;

            Animal Chi=new Chien ("dog : ");
            Chi.crier();

}}
