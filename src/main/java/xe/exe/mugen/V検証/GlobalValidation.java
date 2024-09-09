package xe.exe.mugen.V検証;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = GlobalValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface GlobalValidation {
    String message() default "Global Validation Error";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
