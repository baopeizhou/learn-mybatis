package org.bob.learn.web.model;

import lombok.Data;

@Data
public class Result {
    private String code;

    private String message;

    private Object content;
}
