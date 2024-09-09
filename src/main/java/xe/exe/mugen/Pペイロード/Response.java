package xe.exe.mugen.Pペイロード;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> {
    private int status;
    private String message;
    private String channelId;
    private T data;

    public Response(int status, String message, String channelId, T data) {
        this.status = status;
        this.message = message;
        this.channelId = channelId;
        this.data = data;
    }

    public Response(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public Response(int status, String message, String channelId) {
        this.status = status;
        this.message = message;
        this.channelId = channelId;
    }
}
