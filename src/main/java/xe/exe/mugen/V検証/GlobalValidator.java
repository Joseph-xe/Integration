package xe.exe.mugen.V検証;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import xe.exe.mugen.Mモデル.Rqワークフロー.FintechRq;

public class GlobalValidator implements ConstraintValidator<GlobalValidation, FintechRq> {

    // VALIDASI UNTUK MENGECEK KTP NAME DAN MOTHERS MAIDEN NAME
    @Override
    public boolean isValid(FintechRq request, ConstraintValidatorContext context) {
        if(request.getMothersMaidenName().equalsIgnoreCase(request.getKtpName())){
            context.disableDefaultConstraintViolation();
            // MENAMPILKAN PESAN KESALAHAN DALAM ANOTASI
            context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate())
                    .addConstraintViolation();
            return false;
        }
        return true;
    }
}
