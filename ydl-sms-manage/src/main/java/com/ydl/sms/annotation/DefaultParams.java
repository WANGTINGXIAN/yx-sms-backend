package com.ydl.sms.annotation;

import java.lang.annotation.*;

/**
 * @author 王廷宪
 */
@Documented //javadoc
@Retention(RetentionPolicy.RUNTIME) //哪里起作用
@Target(ElementType.METHOD) //放在哪些地方
public @interface DefaultParams {

}
