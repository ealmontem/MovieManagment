package net.elvisalmonte.projects.moviemanagment.persistence.repository;

import net.elvisalmonte.projects.moviemanagment.persistence.entity.Movie;
import net.elvisalmonte.projects.moviemanagment.util.MovieGenre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieCrudRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByContaining(String title);
    List<Movie> findByGenre(MovieGenre genre);
    List<Movie>findByGenreAndTitleContainig(MovieGenre genre, String title);
}
