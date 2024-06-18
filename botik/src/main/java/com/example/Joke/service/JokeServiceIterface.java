package com.example.Joke.service;

import com.example.Joke.model.DBJokes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface JokeServiceIterface {
    void addjoke(DBJokes Jokes);
    List<DBJokes> getAllJokes();
    Optional<DBJokes> getJokeById(Long id);
    ResponseEntity<String> deleteJokeById(Long id);
    Optional<DBJokes> editJokeById(Long id, String text);
}
