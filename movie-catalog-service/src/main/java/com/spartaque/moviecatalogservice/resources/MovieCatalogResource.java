package com.spartaque.moviecatalogservice.resources;

import com.spartaque.moviecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

        return Collections.singletonList(
                new CatalogItem("Snatch", "Test", 4));
    }
}
