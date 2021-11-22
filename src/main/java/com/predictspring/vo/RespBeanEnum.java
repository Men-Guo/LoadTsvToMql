package com.predictspring.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Enum for code and message.
 */
@Getter
@ToString
@AllArgsConstructor
public enum RespBeanEnum {
    SUCCESS(200,"SUCCESS"),
    ERROR(500, "SERVICE FAILED"),
    ;
    private final Integer code;
    private final String message;
}
