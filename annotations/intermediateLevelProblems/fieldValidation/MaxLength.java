package intermediateLevelProblems.fieldValidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Make it  available at runtime 
@Target(ElementType.FIELD) // Can only be Applied to fields
public @interface MaxLength {
    int value();
}
