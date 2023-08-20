package exam.application.File.domain;

import lombok.Builder;
import lombok.Data;

import java.text.DateFormat;
import java.util.List;

@Data
@Builder
public class File {
    private String title;
    private String author;
    private DateFormat date;
    private List<Task> tasks;
}
