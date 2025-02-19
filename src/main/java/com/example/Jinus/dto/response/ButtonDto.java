package com.example.Jinus.dto.response;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.inject.Any;
import java.util.Map;

@Getter
@Setter
public class ButtonDto {
    private String label;
    private String action;
    private String webLinkUrl;
    private String blockId;
    private Map<String, Object> extra;

    public ButtonDto(String label, String action, String webLinkUrl, String blockId) {
        this.label = label;
        this.action = action;
        this.webLinkUrl = webLinkUrl;
        this.blockId = blockId;
    }

    public ButtonDto(String label, String action) {
        this.label = label;
        this.action = action;
    }

    public ButtonDto(String label, String action, String webLinkUrl) {
        this.label = label;
        this.action = action;
        this.webLinkUrl = webLinkUrl;
    }

    public ButtonDto(String label, String action, String webLinkUrl, String blockId, Map<String, Object> extra) {
        this.label = label;
        this.action = action;
        this.webLinkUrl = webLinkUrl;
        this.blockId = blockId;
        this.extra = extra;
    }

    public ButtonDto(String label, String action, String blockId, Map<String, Object> extra) {
        this.label = label;
        this.action = action;
        this.blockId = blockId;
        this.extra = extra;
    }
}
