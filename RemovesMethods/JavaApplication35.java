/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication35;
import java.util.ArrayList;
/**
 *
 * @author Student
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> programmingLanguages = new ArrayList<>();
        ArrayList<String> scriptingLanguages = new ArrayList<>();
        
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");
        
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");
        
     System.out.println("Initial List: "+ programmingLanguages);
        
     programmingLanguages.remove(5);
     System.out.println("After remove(5): "+ programmingLanguages);
     
     programmingLanguages.remove("Kotlin");
     System.out.println("After remove(\"Kotlin\"): " + programmingLanguages);
     
     ArrayList str2 = scriptingLanguages;
     programmingLanguages.removeAll(str2);
     System.out.println("After removeAll(scriptingLanguages): "+ programmingLanguages);

     programmingLanguages.removeIf(s -> s.startsWith("C"));
     System.out.println("After removing all elements that start with \"C\": "+ programmingLanguages);
     
     programmingLanguages.clear();
     System.out.println("After clear: "+ programmingLanguages);
    }
    
}
