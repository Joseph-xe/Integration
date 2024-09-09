package xe.exe.mugen.E例外;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorRs {
    private int status;
    private String message;
    private String channel;
    private Map<String, String> validation;

    public ErrorRs(int status, Map<String, String> validation, String channel) {
        this.status = status;
        this.validation = validation;
        this.channel = channel;
    }

    public ErrorRs(int status, String message, String channel) {
        this.status = status;
        this.message = message;
        this.channel = channel;
    }
}
