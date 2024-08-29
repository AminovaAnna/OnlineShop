package ru.skypro.shop.model;

import ru.skypro.shop.dto.RoleDto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user")
public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "userId")
 private long userId;
 private String email;
 private String userName;
 private String password;
 private String firstName;
 private String lastName;
 private String phone;
 private RoleDto role;
 private String image;


 public long getUserId() {
  return userId;
 }

 public void setUserId(long userId) {
  this.userId = userId;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public String getUserName() {
  return userName;
 }

 public void setUserName(String userName) {
  this.userName = userName;
 }

 public String getPassword() {
  return password;
 }

 public void setPassword(String password) {
  this.password = password;
 }

 public String getFirstName() {
  return firstName;
 }

 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }

 public String getLastName() {
  return lastName;
 }

 public void setLastName(String lastName) {
  this.lastName = lastName;
 }

 public String getPhone() {
  return phone;
 }

 public void setPhone(String phone) {
  this.phone = phone;
 }

 public RoleDto getRole() {
  return role;
 }

 public void setRole(RoleDto role) {
  this.role = role;
 }

 public String getImage() {
  return image;
 }

 public void setImage(String image) {
  this.image = image;
 }



}
