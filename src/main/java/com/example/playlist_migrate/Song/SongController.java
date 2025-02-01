package com.example.playlist_migrate.Song;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {

  @GetMapping("/")
  public ArrayList<Integer> list() {
    var out = new ArrayList<Integer>();
    return out;
  }

}
