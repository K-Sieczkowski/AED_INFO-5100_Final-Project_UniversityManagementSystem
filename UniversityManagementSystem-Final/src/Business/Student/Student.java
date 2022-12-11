/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student;

import Business.Network.Network;
import javax.swing.ImageIcon;

/**
 *
 * @author ksiec
 */
public class Student {
    private String name;
    private String id;
    private int age;
    private String sex;
    private String address;
    private String email;
    private String phoneNumber;
    private ImageIcon profilePic;
    private String username;
    private String password;
    private Network network;
    
    public Student(String name, String id, int age, String sex, String address, String email, String phoneNumber, String username, String password, Network network){
        this.name = name;
        this.id = id;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        this.network = network;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ImageIcon getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(ImageIcon profilePic) {
        this.profilePic = profilePic;
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

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }
   
    

   
}
