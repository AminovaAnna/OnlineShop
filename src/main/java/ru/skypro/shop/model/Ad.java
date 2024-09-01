package ru.skypro.shop.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table (name = "ad")
public class Ad {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "ad_Id")
 private long id;

 private String description;
 private String image;

 private long price;
 private String title;
 @ManyToOne(fetch = FetchType.LAZY)
 private AppUser appUser;


 public long getId() {
  return id;
 }

 public void setId(long id) {
  this.id = id;
 }

 public String getDescription() {
  return description;
 }

 public void setDescription(String description) {
  this.description = description;
 }

 public String getImage() {
  return image;
 }

 public void setImage(String image) {
  this.image = image;
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

 public AppUser getAppUser() {
  return appUser;
 }

 public void setAppUser(AppUser appUser) {
  this.appUser = appUser;
 }

 @Override
 public boolean equals(Object o) {
  if (this == o) return true;
  if (o == null || getClass() != o.getClass()) return false;
  Ad ad = (Ad) o;
  return id == ad.id && price == ad.price && Objects.equals(description, ad.description) && Objects.equals(image, ad.image) && Objects.equals(title, ad.title) && Objects.equals(appUser, ad.appUser);
 }

 @Override
 public int hashCode() {
  return Objects.hash(id, description, image, price, title, appUser);
 }
}


