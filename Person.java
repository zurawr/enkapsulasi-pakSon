/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package person;

/**
 *
 * @author SMK TELKOM 001
 */
public class Person {
        private String username;
        private String password;
        private String name;
        
        public Person(){
            System.out.println("eksekusi method constructor");
        }
        
        public Person(String a){
            System.out.println("eksekusi method constructor");
        }
        
        public String getName(){
            return name;
        }
        
        public void setName(String name){
            this.name = name;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
} 
