package xe.exe.mugen.Mモデル.Rqワークフロー;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import xe.exe.mugen.V検証.GlobalValidation;

@Data
@AllArgsConstructor
@NoArgsConstructor
@GlobalValidation(message = "Mothers Maiden Name Tidak Boleh Sama Dengan Ktp Name")
public class FintechRq {

    @JsonProperty("MITRA_FINTECH")
    @NotBlank(message = "Mitra Fintech Tidak Terisi")
    // ADD NOT IN BUSINESS PARAMETER
    private String mitraFintech;
    @JsonProperty("APPLICATION_ID")
    @NotBlank(message = "Application ID Tidak Terisi")
    private String applicationId;
    @JsonProperty("NIK")
    @NotBlank(message = "NIK Tidak Terisi")
    @Size(min = 15, max = 16, message = "NIK Tidak Sesuai")
    private String nik;
    @JsonProperty("KTP_NAME")
    @NotBlank(message = "Ktp Name Tidak Terisi")
    @Size(min = 3, message = "Ktp Name Tidak Sesuai")
    private String ktpName;
    @JsonProperty("CARD_NAME")
    @NotBlank(message = "Card Name Tidak Terisi")
    @Size(min = 3, message = "Card Name Tidak Sesuai")
    private String cardName;
    @JsonProperty("PLACE_OF_BIRTH")
    @NotBlank(message = "Place Of Birth Tidak Terisi")
    @Size(min = 3, message = "Place Of Birth Tidak Sesuai")
    private String placeOfBirth;
    @JsonProperty("DATE_OF_BIRTH")
    @NotBlank(message = "Date Of Birth Tidak Terisi")
    @Size(min = 10, max = 10, message = "Date Of Birth Tidak Sesuai")
    private String dateOfBirth;
    @JsonProperty("GENDER")
    @NotBlank(message = "Gender Tidak Terisi")
    // ADD NOT IN BUSINESS PARAMETER
    private String gender;
    @JsonProperty("MOTHERS_MAIDEN_NAME")
    @NotBlank(message = "Mothers Maiden Name Tidak Terisi")
    @Size(min = 3, message = "Mothers Maiden Name Tidak Sesuai")
    // ADD MOTHERS MAIDEN NAME != KTP NAME
    private String mothersMaidenName;
    @JsonProperty("NPWP")
    @NotBlank(message = "NPWP Tidak Terisi")
    @Size(min = 16, max = 16, message = "NPWP Tidak Sesuai")
    // CHECK IF SIZE > 16, WNA ?
    private String npwp;
    @JsonProperty("HOME_ADDRESS_1")
    @NotBlank(message = "Home Address 1 Tidak Terisi")
    private String homeAddress1;
    @JsonProperty("HOME_ADDRESS_2")
    private String homeAddress2;
    @JsonProperty("HOME_ADDRESS_3")
    private String homeAddress3;
    @JsonProperty("HOME_ADDRESS_4")
    private String homeAddress4;
    @JsonProperty("CITY_HOME")
    @NotBlank(message = "City Home Tidak Terisi")
    @Size(min = 3, message = "City Home Tidak Sesuai")
    private String cityHome;
    @JsonProperty("ZIP_CODE_HOME")
    @NotBlank(message = "Zip Code Home Tidak Terisi")
    @Size(min = 5, max = 5, message = "Zip Code Home Tidak Sesuai")
    private String zipCodeHome;
    @JsonProperty("HOME_TELEPHONE_NUMBER")
    @NotBlank(message = "Home Telephone Number Tidak Terisi")
    @Size(min = 7, message = "Home Telephone Number Tidak Sesuai")
    private String homeTelephoneNumber;
    @JsonProperty("CUSTOMER_CELL_NUMBER")
    @NotBlank(message = "Customer Cell Number Tidak Terisi")
    @Size(min = 8, message = "Customer Cell Number Tidak Sesuai")
    private String customerCellNumber;
    @JsonProperty("POSITION")
    @NotBlank(message = "Position Tidak Terisi")
    @Size(min = 3, message = "Position Tidak Sesuai")
    private String position;
    @JsonProperty("YEARLY_INCOME")
    @NotNull(message = "Yearly Income Tidak Terisi")
    private Long yearlyIncome;
    @JsonProperty("OFFICE_ADDRESS_1")
    @NotBlank(message = "Office Address 1 Tidak Terisi")
    @Size(min = 3, message = "Office Address 1 Tidak Sesuai")
    private String officeAddress1;
    @JsonProperty("OFFICE_ADDRESS_2")
    private String officeAddress2;
    @JsonProperty("OFFICE_ADDRESS_3")
    private String officeAddress3;
    @JsonProperty("OFFICE_ADDRESS_4")
    private String officeAddress4;
    @JsonProperty("CITY_OFFICE")
    @NotBlank(message = "City Office Tidak Terisi")
    @Size(min = 3, message = "City Office Tidak Sesuai")
    private String cityOffice;
    @JsonProperty("ZIP_CODE_OFFICE")
    @NotBlank(message = "Zip Code Office Tidak Terisi")
    @Size(min = 5, max = 5, message = "Zip Code Office Tidak Sesuai")
    private String zipCodeOffice;
    @JsonProperty("OFFICE_PHONE_NUMBER")
    @NotBlank(message = "Office Phone Number Tidak Terisi")
    @Size(min = 7, message = "Office Phone Number Tidak Sesuai")
    private String officePhoneNumber;
    @JsonProperty("BANK_ACCOUNT_NUMBER")
    @NotBlank(message = "Bank Account Number Tidak Terisi")
    @Size(min = 3, message = "Bank Account Number Tidak Sesuai")
    private String bankAccountNumber;
    @JsonProperty("PRODUCT")
    @NotBlank(message = "Product Tidak Terisi")
    // ADD NOT IN BUSINESS PARAMETER
    private String product;
    @JsonProperty("CREDIT_LIMIT")
    @NotNull(message = "Credit Limit Tidak Terisi")
    private Long creditLimit;
    @JsonProperty("CASH_LIMIT")
    @NotNull(message = "Cash Limit Tidak Terisi")
    private Long cashLimit;
    @JsonProperty("BILLING_CYCLE")
    @NotBlank(message = "Billing Cycle Tidak Terisi")
    @Size(min = 10, max = 10, message = "Billing Cycle Tidak Sesuai")
    private String billingCycle;
    @JsonProperty("TENOR")
    @NotNull(message = "Tenor Tidak Terisi")
    private Long tenor;
    @JsonProperty("RISK_GRADE")
    @NotBlank(message = "Risk Grade Tidak Terisi")
    private String riskGrade;
    @JsonProperty("EMERGENCY_CONTACT_NAME")
    private String ecName;
    @JsonProperty("RELATION_WITH_EMERGENCY_CONTACT")
    private String relationWithEc;
    @JsonProperty("EMERGENCY_CONTACT_PHONE_NUMBER")
    private String ecPhoneNumber;
}
