package io.github.yakami129.lowcode.plugin.api.dto;

import io.github.yakami129.lowcode.plugin.api.enums.PluginResponseCodeEnum;

import java.util.Map;

/**
 * Created by alan on 2023/3/28.
 * 插件执行结果
 */
public class PluginResponseDTO {

    private Integer code;
    private String message;
    private Map<String, String> data;

    public PluginResponseDTO(Integer code, String message, Map<String, String> data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static PluginResponseDTO success() {
        return new PluginResponseDTO(PluginResponseCodeEnum.success.getCode(),
                PluginResponseCodeEnum.success.name(), null);
    }

    public static PluginResponseDTO success(Map<String, String> data) {
        return new PluginResponseDTO(PluginResponseCodeEnum.success.getCode(),
                PluginResponseCodeEnum.success.name(), data);
    }

    public static PluginResponseDTO fail() {
        return new PluginResponseDTO(PluginResponseCodeEnum.fail.getCode(),
                PluginResponseCodeEnum.fail.name(), null);
    }

    public static PluginResponseDTO fail(String message) {
        return new PluginResponseDTO(PluginResponseCodeEnum.fail.getCode(), message, null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
