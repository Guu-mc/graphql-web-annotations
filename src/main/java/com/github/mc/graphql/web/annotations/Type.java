package com.github.mc.graphql.web.annotations;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Type {
    /**
     * rtn ResultTypeNotNull 结果类型不能为空
     */
    boolean rtn() default false;
    /**
     * ran ResultArrayNotNull 结果数组不能为空
     */
    boolean ran() default false;
}
