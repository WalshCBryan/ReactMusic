package com.musicproject.demo.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "songs")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private int duration_in_sec;

    @ManyToMany(mappedBy = "albums")
    private List<Album> albums;

    public Song(){};

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration_in_sec() {
        return duration_in_sec;
    }

    public void setDuration_in_sec(int duration_in_sec) {
        this.duration_in_sec = duration_in_sec;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}
