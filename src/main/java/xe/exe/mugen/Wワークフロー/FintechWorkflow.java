package xe.exe.mugen.Wワークフロー;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import xe.exe.mugen.E例外.ExceptionRs;
import xe.exe.mugen.Rリポジトリ.FintechStore;

@Slf4j
@Service
public class FintechWorkflow {

    @Autowired
    private FintechStore fintechStore;

    // MENGAMBIL NAMA CLASS SEKARANG
    private final String className = this.getClass().getSimpleName().toUpperCase();

    public String fintechFlow(
            String mitra_fintech,
            String application_id,
            String nik,
            String ktp_name,
            String card_name,
            String place_of_birth,
            String date_of_birth,
            String gender,
            String mothers_maiden_name,
            String npwp,
            String home_address_1,
            String home_address_2,
            String home_address_3,
            String home_address_4,
            String city_home,
            String zip_code_home,
            String home_telephone_number,
            String customer_cell_number,
            String position,
            Long yearly_income,
            String office_address_1,
            String office_address_2,
            String office_address_3,
            String office_address_4,
            String city_office,
            String zip_code_office,
            String office_phone_number,
            String bank_account_number,
            String product,
            Long credit_limit,
            Long cash_limit,
            String billing_cycle,
            Long tenor,
            String risk_grade,
            String emergency_contact_name,
            String relation_with_emergency_contact,
            String emergency_contact_phone_number
    ) {
        String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
        log.info("[{} - {}][LINK START]", className, methodName);
        String output;
        int checkChannel = fintechStore.isFintechChannelExists(mitra_fintech);
        if(checkChannel == 0){
            log.error("[{} - {}][INVALID CHANNEL - {}]", className, methodName, mitra_fintech.toUpperCase());
            throw new ExceptionRs(
                    HttpStatus.BAD_REQUEST.value(), // Status HTTP
                    "INVALID CHANNEL",              // Pesan kesalahan
                    mitra_fintech.toUpperCase()
            );
        }else{
            output = fintechStore.fintechApplication(
                    mitra_fintech,
                    application_id,
                    nik,
                    ktp_name,
                    card_name,
                    place_of_birth,
                    date_of_birth,
                    gender,
                    mothers_maiden_name,
                    npwp,
                    home_address_1,
                    home_address_2,
                    home_address_3,
                    home_address_4,
                    city_home,
                    zip_code_home,
                    home_telephone_number,
                    customer_cell_number,
                    position,
                    yearly_income,
                    office_address_1,
                    office_address_2,
                    office_address_3,
                    office_address_4,
                    city_office,
                    zip_code_office,
                    office_phone_number,
                    bank_account_number,
                    product,
                    credit_limit,
                    cash_limit,
                    billing_cycle,
                    tenor,
                    risk_grade,
                    emergency_contact_name,
                    relation_with_emergency_contact,
                    emergency_contact_phone_number
            );
            log.info("[{} - {}][SUCCESS SUBMIT]", className, methodName);
        }
        log.info("[{} - {}][LINK START]", className, methodName);
        return output;
    }
}
