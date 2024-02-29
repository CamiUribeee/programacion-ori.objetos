
package people;

/**
 *
 * @author SCIS2PC30
 */
public class Character {
    String name;
        int age;
        char gender; 
        String phrase;

        public Character(String name, int age, char gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            
        }

        public Character(String name, int age, char gender, String phrase) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.phrase = phrase;
        }
public void saySomething (){
        System.out.println();
        
    }      
}

