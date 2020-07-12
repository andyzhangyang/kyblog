package com.zhang.validator.annotion;



import com.zhang.validator.Messages;
import com.zhang.validator.constraint.RangValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * 字符串范围约束
 *
 * @author 陌溪
 * @date 2019年12月4日22:48:34
 */
@Target({TYPE, ANNOTATION_TYPE, FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {RangValidator.class})
public @interface Range {

    long min() default 0;

    long max() default Long.MAX_VALUE;

    String message() default Messages.CK_RANGE_DEFAULT;

    String value() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}