package io.github.yakami129.lowcode.plugin.api;

import io.github.yakami129.lowcode.plugin.api.dto.PluginRequestDTO;
import io.github.yakami129.lowcode.plugin.api.dto.PluginResponseDTO;
import org.pf4j.ExtensionPoint;

/**
 * Created by alan on 2023/3/28.
 * 外部任务插件接口类
 */
public interface ExternalTaskHandlerPlugin extends ExtensionPoint {

    /**
     * 执行插件逻辑
     *
     * @param pluginRequestDTO 插件请求参数
     * @return
     */
    PluginResponseDTO invoke(PluginRequestDTO pluginRequestDTO);

}
