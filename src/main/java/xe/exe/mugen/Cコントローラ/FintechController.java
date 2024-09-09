package xe.exe.mugen.Cコントローラ;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xe.exe.mugen.E例外.ErrorRs;
import xe.exe.mugen.E例外.ExceptionRs;
import xe.exe.mugen.Mモデル.Rqワークフロー.FintechRq;
import xe.exe.mugen.Mモデル.Rs応答.FintechRs;
import xe.exe.mugen.Pペイロード.Response;
import xe.exe.mugen.Wワークフロー.FintechWorkflow;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/fintech")
public class FintechController {

    // MENGAMBIL NAMA CLASS SEKARANG
    private final String className = this.getClass().getSimpleName().toUpperCase();

    @Autowired
    private FintechWorkflow fintechWorkflow;

    @PostMapping("/application")
    private ResponseEntity<?> fintechAplikan(@Valid @RequestBody FintechRq fintechRq, BindingResult bindingResult){
        String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
        log.info("[{} - {}][LINK START]", className, methodName);
        Response<FintechRs> response;

        if(bindingResult.hasErrors()){
            Map<String, String> errors = new HashMap<>();
            // MENAMPILKAN VALIDASI FIELD / VARIABEL
            for(FieldError err : bindingResult.getFieldErrors()){
                errors.put(err.getField(), err.getDefaultMessage());
            }
            // MENAMPILKAN VALIDASI GLOBAL / KELAS
            for(ObjectError err : bindingResult.getGlobalErrors()){
                errors.put(err.getObjectName(), err.getDefaultMessage());
            }
            ErrorRs errorRs = new ErrorRs(
                    HttpStatus.BAD_REQUEST.value(),
                    errors,
                    null
            );
            return new ResponseEntity<>(errorRs, HttpStatus.BAD_REQUEST);
        }

        try{
            String fintechRN;
            fintechRN = fintechWorkflow.fintechFlow(
                    fintechRq.getMitraFintech(),
                    fintechRq.getLeadsId(),
                    fintechRq.getNik(),
                    fintechRq.getKtpName(),
                    fintechRq.getCardName(),
                    fintechRq.getPlaceOfBirth(),
                    fintechRq.getDateOfBirth(),
                    fintechRq.getGender(),
                    fintechRq.getMothersMaidenName(),
                    fintechRq.getNpwp(),
                    fintechRq.getHomeAddress1(),
                    fintechRq.getHomeAddress2(),
                    fintechRq.getHomeAddress3(),
                    fintechRq.getHomeAddress4(),
                    fintechRq.getCityHome(),
                    fintechRq.getZipCodeHome(),
                    fintechRq.getHomeTelephoneNumber(),
                    fintechRq.getCustomerCellNumber(),
                    fintechRq.getPosition(),
                    fintechRq.getYearlyIncome(),
                    fintechRq.getOfficeAddress1(),
                    fintechRq.getOfficeAddress2(),
                    fintechRq.getOfficeAddress3(),
                    fintechRq.getOfficeAddress4(),
                    fintechRq.getCityOffice(),
                    fintechRq.getZipCodeOffice(),
                    fintechRq.getOfficePhoneNumber(),
                    fintechRq.getBankAccountNumber(),
                    fintechRq.getProduct(),
                    fintechRq.getCreditLimit(),
                    fintechRq.getCashLimit(),
                    fintechRq.getBillingCycle(),
                    fintechRq.getTenor(),
                    fintechRq.getRiskGrade(),
                    fintechRq.getEcName(),
                    fintechRq.getRelationWithEc(),
                    fintechRq.getEcPhoneNumber()
            );
            FintechRs fintechRs = new FintechRs(fintechRN);
            response = new Response<>(
                    200,
                    "[SUCCESS APPLY FINTECH]",
                    fintechRq.getMitraFintech().toUpperCase(),
                    fintechRs
            );
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch(ExceptionRs exceptionRs){
            log.error("[{} - {}][ERROR - {}]", className, methodName, exceptionRs.getMessage());
            ErrorRs errorRs = new ErrorRs(
                    exceptionRs.getStatus(),
                    exceptionRs.getMessage(),
                    exceptionRs.getChannel()
            );
            return new ResponseEntity<>(errorRs, HttpStatus.BAD_REQUEST);
        }finally {
            log.info("[{} - {}][LINK END]", className, methodName);
        }
    }
}
