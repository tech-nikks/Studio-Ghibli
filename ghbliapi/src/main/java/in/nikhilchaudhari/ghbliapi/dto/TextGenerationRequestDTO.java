package in.nikhilchaudhari.ghbliapi.dto;

import lombok.Data;

@Data
public class TextGenerationRequestDTO {

    private String prompt;
    private String style;
}
