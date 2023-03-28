package io.github.yakami129.lowcode.plugin.api.enums;

/**
 * Created by alan on 2023/3/28.
 * 插件执行结果
 */
public enum PluginResponseCodeEnum {

    // 成功
    success(200),
    // 失败
    fail(500);

    private Integer code;

    PluginResponseCodeEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
