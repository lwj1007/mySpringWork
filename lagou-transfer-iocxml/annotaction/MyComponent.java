package com.lagou.edu.annotaction;




import org.springframework.stereotype.Indexed;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Indexed
public @interface MyComponent {
    String value() default "";
}
