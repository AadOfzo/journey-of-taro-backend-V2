package JourneyOfTaroSpringTestV1.groupid.artefact.model;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name ="Users")
public class User {
    @Id
    @SequenceGenerator(
            name = "user_id_sequence",
            sequenceName = "user_id_sequence"
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE,
            generator = "user_id_sequence"
    )
    private Long id;
    @Column
    private String name;
    @Column
    private String artist;
    @Column
    private String email;
    @Column
    private Boolean admin;

    public User(Long id, String name, String artist, String email, Boolean admin) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.email = email;
        this.admin = admin;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(artist, user.artist) && Objects.equals(email, user.email) && Objects.equals(admin, user.admin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, artist, email, admin);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", email='" + email + '\'' +
                ", admin='" + admin + '\'' +
                '}';
    }
}
