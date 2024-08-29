package ru.skypro.shop.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table (name = "ad")
public class Ad {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "adId")
 private long id;
 private String authorFirstName;
 private String authorLastName;
 private String description;
 private String email;
 private String image;
 private String phone;
 private long price;
 private String title;


 public long getId() {
  return id;
 }

 public void setId(long id) {
  this.id = id;
 }

 public String getAuthorFirstName() {
  return authorFirstName;
 }

 public void setAuthorFirstName(String authorFirstName) {
  this.authorFirstName = authorFirstName;
 }

 public String getAuthorLastName() {
  return authorLastName;
 }

 public void setAuthorLastName(String authorLastName) {
  this.authorLastName = authorLastName;
 }

 public String getDescription() {
  return description;
 }

 public void setDescription(String description) {
  this.description = description;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public String getImage() {
  return image;
 }

 public void setImage(String image) {
  this.image = image;
 }

 public String getPhone() {
  return phone;
 }

 public void setPhone(String phone) {
  this.phone = phone;
 }

 public long getPrice() {
  return price;
 }

 public void setPrice(long price) {
  this.price = price;
 }

 public String getTitle() {
  return title;
 }

 public void setTitle(String title) {
  this.title = title;
 }

 @Override
 public boolean equals(Object o) {
  if (this == o) return true;
  if (o == null || getClass() != o.getClass()) return false;
  Ad ad = (Ad) o;
  return id == ad.id && price == ad.price && Objects.equals(authorFirstName, ad.authorFirstName) && Objects.equals(authorLastName, ad.authorLastName) && Objects.equals(description, ad.description) && Objects.equals(email, ad.email) && Objects.equals(image, ad.image) && Objects.equals(phone, ad.phone) && Objects.equals(title, ad.title);
 }

 @Override
 public int hashCode() {
  return Objects.hash(id, authorFirstName, authorLastName, description, email, image, phone, price, title);
 }
}


