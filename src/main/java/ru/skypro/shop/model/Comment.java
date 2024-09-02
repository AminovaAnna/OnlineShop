package ru.skypro.shop.model;

import lombok.*;
import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;


@Entity
@Table(name = "comments")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;
    @Column(name = "sent_time")
    private Date sentTime;
    private String text;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private AppUser user; // тут не уверена
    @ManyToOne
    @JoinColumn(name = "ad_id")
    private Ad ad; // тут пока тоже



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
                ", user=" + user +
                ", ad=" + ad +
                '}';
    }
}
