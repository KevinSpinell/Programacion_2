
package com.mycompany.poo;

public class simpson {
    String name;
        String occupation;
        int age;
        String phrase;
        
        /*Constructor*/
        public simpson(String name, String occupation, int age, String phrase) {
            this.name = name;
            this.occupation = occupation;
            this.age = age;
            this.phrase = phrase;
        }
        public simpson(){
            
        }
        /*Getters and Setters*/
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getOccupation() {
            return occupation;
        }
        public void setOccupation(String occupation) {
            this.occupation = occupation;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getPhrase() {
            return phrase;
        }
        public void setPhrase(String phrase) {
            this.phrase = phrase;
        }
        void greeting(){
            System.out.println(this.phrase);
        }
}
