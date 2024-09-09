package xe.exe.mugen.Mモデル.Rs応答;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FintechRs {
    @JsonProperty("REGISTRATION_NUMBER")
    private String registrationNumber;
}
