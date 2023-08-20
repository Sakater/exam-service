package exam.application.File.api;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.WebContext;

import javax.swing.text.html.HTMLDocument;
import java.io.IOException;

@Service
@Slf4j
public class FileServiceImpl {

    public void getPDFfromHTML(String string) {

    }
    public ResponseEntity<?> getPDF(HttpServletRequest request, HttpServletResponse response) throws IOException {

        log.info(request.toString());
        return null;
    }
}
