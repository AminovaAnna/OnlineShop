package ru.skypro.shop.model;

import org.springframework.security.core.userdetails.UserDetails;
import ru.skypro.shop.dto.RoleDto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class AppUser {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "user_Id")
 private long userId;
 @Column(name = "user_name")
 private String userName;
 @Column(name = "email")
 private String email;
 @Column(name = "password")
 private String password;
 @Column(name = "first_name")
 private String firstName;
 @Column(name = "last_name")
 private String lastName;
 @Column(name = "phone")
 private String phone;
 @Column(nullable = false)
 @Enumerated(EnumType.STRING)
 private Role role;
 @Column(name = "image")
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

 public String getUserName() {
  return userName;
 }

 public void setUserName(String userName) {
  this.userName = userName;
 }

 public Role getRole() {
  return role;
 }

 public void setRole(Role role) {
  this.role = role;
 }

 public String getImage() {
  return image;
 }

 public void setImage(String image) {
  this.image = image;
 }


 public void setUser(UserDetails build) {
 }

 @Override
 public boolean equals(Object o) {
  if (this == o) return true;
  if (o == null || getClass() != o.getClass()) return false;
  AppUser user = (AppUser) o;
  return Objects.equals(email, user.email);
 }

 @Override
 public int hashCode() {
  return Objects.hash(userId, userName, email, password, firstName, lastName, phone, role, image);
 }
}
