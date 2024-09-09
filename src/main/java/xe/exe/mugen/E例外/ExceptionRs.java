package xe.exe.mugen.E例外;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionRs extends RuntimeException {
    private int status;
    private String message;
    private String channel;

    public ExceptionRs(int status, String message, String channel) {
        super(message);
        this.status = status;
        this.message = message;
        this.channel = channel;
    }

    public ExceptionRs(int status, String message){
        super(message);
        this.status = status;
        this.message = message;
    }
}
