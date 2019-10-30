package tres;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.CLASS;

@Retention(CLASS)
@Target({METHOD, PARAMETER, FIELD, LOCAL_VARIABLE, ANNOTATION_TYPE})
public @interface IntRange {
    /**
     * Smallest value, inclusive
     */
    long minimo() default Long.MIN_VALUE;

    /**
     * Largest value, inclusive
     */
    long maximo() default Long.MAX_VALUE;
}
