package exemple.abstraction.fils;
import exemple.abstraction.base.Animal ;
public class Chat extends Animal{
    public Chat(String nom) {
        super(nom);
    }
  //  overide
    public void crier(){
        System.out.println(nom+"Miaule,MIeu");

    }
}








