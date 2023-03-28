package io.github.yakami129.lowcode.plugin.api.dto;

import java.util.Map;

/**
 * Created by alan on 2023/3/28.
 * 插件执行参数
 */
public class PluginRequestDTO {

    /**
     * 当前任务所有变量
     */
    private Map<String, Object> allVariables;

    /**
     * 当前任务所有的自定义属性
     */
    private Map<String, String> extensionProperties;

    public Map<String, Object> getAllVariables() {
        return allVariables;
    }

    public void setAllVariables(Map<String, Object> allVariables) {
        this.allVariables = allVariables;
    }

    public Map<String, String> getExtensionProperties() {
        return extensionProperties;
    }

    public void setExtensionProperties(Map<String, String> extensionProperties) {
        this.extensionProperties = extensionProperties;
    }
}
