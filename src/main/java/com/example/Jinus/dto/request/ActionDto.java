package com.example.Jinus.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActionDto {
    private String name;
    private ClientExtraDto clientExtra;
    private ActionParamsDto params;
    private String id;
    private DetailParamsItemDto detailParams;
}
