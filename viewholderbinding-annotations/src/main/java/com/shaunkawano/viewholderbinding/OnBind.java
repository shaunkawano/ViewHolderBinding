package com.shaunkawano.viewholderbinding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Shohei Kawano
 */
@Target(ElementType.METHOD) @Retention(RetentionPolicy.SOURCE) public @interface OnBind {
}
