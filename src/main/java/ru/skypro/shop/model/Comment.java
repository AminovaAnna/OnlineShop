package ru.skypro.shop.model;

import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;


@Entity
@Table(name = "comments")

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;
    @Column(name = "sent_time")
    private Date sentTime;
    private String text;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private AppUser appUser; // тут не уверена
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ad_id")
    private Ad ad; // тут пока тоже


    public Comment(Date sentTime, String text, AppUser appUser, Ad ad) {

        this.sentTime = sentTime;
        this.text = text;
        this.appUser = appUser;
        this.ad = ad;
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Date getSentTime() {
        return sentTime;
    }

    public void setSentTime(Date sentTime) {
        this.sentTime = sentTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public Ad getAd() {
        return ad;
    }

    public void setAd(Ad ad) {
        this.ad = ad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(text, comment.text);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(text);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "pk=" + pk +
                ", sentTime=" + sentTime +
                ", text='" + text + '\'' +
                ", appUser=" + appUser +
                ", ad=" + ad +
                '}';
    }
}
