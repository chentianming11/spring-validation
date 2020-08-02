package com.github.chentianming11.spring.validation.base.Validation;

import lombok.experimental.Delegate;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

public class ValidationList<E> implements List<E> {

    @Delegate
    @Valid // 一定要加@Valid注解
    public List<E> list = new ArrayList<>();

}
