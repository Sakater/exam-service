package exam.application.File.api;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
@Slf4j
public class FileServiceImpl {

    public void getPDFfromHTML(String string) {

    }

    public ResponseEntity<?> getPDF(String s) {
        /*BufferedReader reader = request.getReader();
        log.info(reader.readLine());*/
        /*File file= new File("demo-html.html");
        FileWriter myWriter = new FileWriter(file.getPath());
        myWriter.write(s);
        myWriter.close();
        File newFile=new File(file.getPath());
        log.warn("Hallo "+newFile.getAbsolutePath());
        PdfWriter pdfWriter =new PdfWriter(new File("demo.pdf"));
        *//* Setup Source and target I/O streams *//*
        pdfWriter.close();*/
        ByteArrayOutputStream target = new ByteArrayOutputStream();

        /*Setup converter properties. */
        ConverterProperties converterProperties = new ConverterProperties();
        converterProperties.setBaseUri("http://localhost:8080");

        /* Call convert method */
        HtmlConverter.convertToPdf(s, target, converterProperties);

        /* extract output as bytes */
        byte[] bytes = target.toByteArray();


        /* Send the response as downloadable PDF */

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_PDF)
                .body(bytes);
       /* HtmlConverter.convertToPdf(s, pdfWriter, new ConverterProperties());

        //HtmlConverter.convertToPdf(newFile,new File("demo.pdf"));
        return new ResponseEntity<>(s,HttpStatus.ACCEPTED);
        //HtmlConverter.convertToPdf(request.getInputStream(),new File("demo-html.pdf"));*/

    }
}
