package com.musicproject.demo.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="albums")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private int year_released;

    @ManyToMany
    @JoinTable
            (
                    name="album_artist",
                    joinColumns={@JoinColumn(name="album_id")},
                    inverseJoinColumns={@JoinColumn(name="artist_id")}
            )
    private List<Artist> artists;

    @ManyToMany
    @JoinTable
            (
                    name="album_song",
                    joinColumns={@JoinColumn(name="album_id")},
                    inverseJoinColumns={@JoinColumn(name="song_id")}
            )
    private List<Song> songs;


    public Album(){};

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

    public int getYear_released() {
        return year_released;
    }

    public void setYear_released(int year_released) {
        this.year_released = year_released;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }
}
