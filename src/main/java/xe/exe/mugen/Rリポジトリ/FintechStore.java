package xe.exe.mugen.Rリポジトリ;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;
import xe.exe.mugen.E例外.ExceptionRs;

import java.sql.Types;
import java.util.Map;

@Slf4j
@Repository
public class FintechStore {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // MENGAMBIL NAMA CLASS SEKARANG
    private final String className = this.getClass().getSimpleName().toUpperCase();

    public Integer isFintechChannelExists(String mitra){
        // MENGAMBIL NAMA METHOD YANG SEDANG BERJALAN SEKARANG
        String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
        log.info("[{} - {}][LINK START]", className, methodName);
        try{
            SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                    .withProcedureName("SP_FINTECH_CHANNEL")
                    .declareParameters(
                            new SqlParameter("IN_MITRA", Types.VARCHAR),
                            new SqlOutParameter("OUT_EXISTS", Types.INTEGER)
                    );
            Map<String, Object> queryExec = simpleJdbcCall.execute(mitra.toUpperCase());
            Integer outCheckChannel = (Integer) queryExec.get("OUT_EXISTS");
            log.info("[{} - {}][OUTPUT - {}]", className, methodName, outCheckChannel);
            return outCheckChannel;
        }catch(DataAccessException dataAccessException){
            log.info("[{} - {}][ERROR - {}]", className, methodName, dataAccessException.getMessage());
            throw new ExceptionRs(
                    HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    "PROCEDURE INVALID",
                    mitra
            );
        }finally{
            log.info("[{} - {}][LINK END]", className, methodName);
        }
    }

    public String fintechApplication(
            String mitra_fintech,
            String leadsId,
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
    ){
        String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
        log.info("[{} - {}][LINK START]", className, methodName);
        try{
            SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                    .withProcedureName("SP_FINTECH_APPLICATION")
                    .declareParameters(
                            new SqlParameter("IN_MITRA_FINTECH", Types.VARCHAR),
                            new SqlParameter("IN_LEADS_ID", Types.VARCHAR),
                            new SqlParameter("IN_NIK", Types.VARCHAR),
                            new SqlParameter("IN_KTP_NAME", Types.VARCHAR),
                            new SqlParameter("IN_CARD_NAME", Types.VARCHAR),
                            new SqlParameter("IN_PLACE_OF_BIRTH", Types.VARCHAR),
                            new SqlParameter("IN_DATE_OF_BIRTH", Types.VARCHAR),
                            new SqlParameter("IN_GENDER", Types.VARCHAR),
                            new SqlParameter("IN_MOTHERS_MAIDEN_NAME", Types.VARCHAR),
                            new SqlParameter("IN_NPWP", Types.VARCHAR),
                            new SqlParameter("IN_HOME_ADDRESS_1", Types.VARCHAR),
                            new SqlParameter("IN_HOME_ADDRESS_2", Types.VARCHAR),
                            new SqlParameter("IN_HOME_ADDRESS_3", Types.VARCHAR),
                            new SqlParameter("IN_HOME_ADDRESS_4", Types.VARCHAR),
                            new SqlParameter("IN_CITY_HOME", Types.VARCHAR),
                            new SqlParameter("IN_ZIP_CODE_HOME", Types.VARCHAR),
                            new SqlParameter("IN_HOME_TELEPHONE_NUMBER", Types.VARCHAR),
                            new SqlParameter("IN_CUSTOMER_CELL_NUMBER", Types.VARCHAR),
                            new SqlParameter("IN_POSITION", Types.VARCHAR),
                            new SqlParameter("IN_CITY_HOME", Types.VARCHAR),
                            new SqlParameter("IN_YEARLY_INCOME", Types.BIGINT),
                            new SqlParameter("IN_OFFICE_ADDRESS_1", Types.VARCHAR),
                            new SqlParameter("IN_OFFICE_ADDRESS_2", Types.VARCHAR),
                            new SqlParameter("IN_OFFICE_ADDRESS_3", Types.VARCHAR),
                            new SqlParameter("IN_OFFICE_ADDRESS_4", Types.VARCHAR),
                            new SqlParameter("IN_CITY_OFFICE", Types.VARCHAR),
                            new SqlParameter("IN_ZIP_CODE_OFFICE", Types.VARCHAR),
                            new SqlParameter("IN_OFFICE_PHONE_NUMBER", Types.VARCHAR),
                            new SqlParameter("IN_BANK_ACCOUNT_NUMBER", Types.VARCHAR),
                            new SqlParameter("IN_PRODUCT", Types.VARCHAR),
                            new SqlParameter("IN_CREDIT_LIMIT", Types.BIGINT),
                            new SqlParameter("IN_CASH_LIMIT", Types.BIGINT),
                            new SqlParameter("IN_BILLING_CYCLE", Types.VARCHAR),
                            new SqlParameter("IN_TENOR", Types.BIGINT),
                            new SqlParameter("IN_RISK_GRADE", Types.VARCHAR),
                            new SqlParameter("IN_EMERGENCY_CONTACT_NAME", Types.VARCHAR),
                            new SqlParameter("IN_RELATION_WITH_EMERGENCY_CONTACT", Types.VARCHAR),
                            new SqlParameter("IN_EMERGENCY_CONTACT_PHONE_NUMBER", Types.VARCHAR),
                            new SqlOutParameter("OUT_REGISTRATION_NUMBER", Types.VARCHAR)
                    );
            Map<String, Object> queryExec = simpleJdbcCall.execute(
                    mitra_fintech,
                    leadsId,
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
            String output = (String) queryExec.get("OUT_APPLICATION_ID");
            log.info("[{} - {}][OUTPUT - {}]", className, methodName, output);
            return output;
        }catch(DataAccessException dataAccessException){
            log.info("[{} - {}][ERROR - {}]", className, methodName, dataAccessException.getMessage());
            throw new ExceptionRs(
                    HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    "PROCEDURE INVALID",
                    mitra_fintech
            );
        }finally{
            log.info("[{} - {}][LINK END]", className, methodName);
        }
    }
}
