package exam.application.File.rest;

import exam.application.File.api.FileServiceImpl;
import exam.application.File.domain.File;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.HTMLDocument;
import java.io.IOException;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1/file")
@Slf4j
public class FileController {
    private final FileServiceImpl service;

    @Autowired
    public FileController(FileServiceImpl service) {
        this.service = service;
    }

    @GetMapping
    ResponseEntity<?> getPDF(@RequestBody String s) {

        ResponseEntity<?> response = service.getPDF(s);
        log.info(Objects.requireNonNull(response.getBody()).toString());
        return response;
    }
}
