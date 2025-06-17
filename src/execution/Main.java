package execution;

import base.Person;
import fils.Student;
import org.w3c.dom.ls.LSOutput;

public class Main {

        public void parle(){
            System.out.println("je parle personne");
        }
        public static  int somme(int a,int b ){
            return a+ b  ;
        }
        public static  int somme(int a , int b ,int c )
        {return a + b + c;
        }
        public int somme (int a,int b ,int c , int d ) {
            return a + b + c + d;
        }

        public static void main(String[] args) {
            //Student
       /* Student etudiant = new Student("Ahmed", 20, "12345", 18.5);

        System.out.println("=== Étudiant : Informations générales ===");
        etudiant.displayInfo();
        System.out.println("=== Étudiant : Détails scolaires ===");
        etudiant.displayInfoStudent();


        etudiant.setName("vvvvv");
        System.out.println("=== Étudiant : Après modification du nom ===");
        etudiant.displayInfo();
        System.out.println("=== Vérification via getters ===");
        System.out.println("Nom : " + etudiant.getName());
        System.out.println("ID : " + etudiant.getStudentId());
        System.out.println("Moyenne : " + etudiant.getAverageScore());
        System.out.println("Age : " + etudiant.getAge());

//        Teacher
        Teacher enseignant = new Teacher("Hamadi", 40, "INFO", 10);

        System.out.println("\n=== Enseignant : Informations générales ===");
        enseignant.displayInfo();
        System.out.println("=== Enseignant : Détails professionnels ===");
        enseignant.displayInfoTeacher();

        enseignant.setName("Hamadi Hamadi");
        System.out.println("=== Enseignant : Après modification du nom ===");
        enseignant.displayInfo();

        enseignant.setAge(35);
        System.out.println("=== Enseignant : Après modification de l'âge ===");
        enseignant.displayInfo();
        System.out.println("=== Vérification via getters ===");
        System.out.println("Nom : " + enseignant.getName());
        System.out.println("Âge : " + enseignant.getAge());
        System.out.println("Spécialité : " + enseignant.getCourseName());
        System.out.println("Années d'expérience : " + enseignant.getYearsOfExperience());

        */


            System.out.println("hello "+ Person.minVar(2, 4));

            Person p =new Student("ali",3 ,"m", 5.5);
            p.parle();


            System.out.println("before changes to sahar's information");
            Main m = new Main();
            System.out.println(m.somme(5,15));
            System.out.println(m.somme(5 , 15, 25));
            System.out.println(m.somme(5, 15 ,25 ,35));



        }
}


