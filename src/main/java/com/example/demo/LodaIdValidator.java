package com.example.demo;

import org.hibernate.validator.internal.engine.constraintvalidation.ConstraintValidatorContextImpl;
import org.hibernate.validator.internal.metadata.descriptor.ConstraintDescriptorImpl;
import org.hibernate.validator.internal.util.annotation.ConstraintAnnotationDescriptor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LodaIdValidator implements ConstraintValidator<LodaId, Object> {
    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        ConstraintAnnotationDescriptor descriptor = ((ConstraintDescriptorImpl) ((ConstraintValidatorContextImpl) context).getConstraintDescriptor()).getAnnotationDescriptor();
        int maxInt = (int) descriptor.getAttribute("maxInt", Number.class);
        return maxInt > (Integer) value;
    }
}
