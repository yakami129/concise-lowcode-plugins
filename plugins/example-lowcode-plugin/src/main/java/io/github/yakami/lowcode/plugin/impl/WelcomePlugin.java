package io.github.yakami.lowcode.plugin.impl;

import io.github.yakami129.lowcode.plugin.api.ExternalTaskHandlerPlugin;
import io.github.yakami129.lowcode.plugin.api.dto.PluginRequestDTO;
import io.github.yakami129.lowcode.plugin.api.dto.PluginResponseDTO;
import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by alan on 2023/3/28.
 */
public class WelcomePlugin extends Plugin {

    private static final Logger logger = LoggerFactory.getLogger(WelcomePlugin.class);

    public WelcomePlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void start() {
        logger.info("[PLUGIN] start WelcomePlugin");
    }

    @Override
    public void stop() {
        logger.info("[PLUGIN] stop WelcomePlugin");
    }

    @Extension
    public static class ExternalTaskHandlerPluginImpl implements ExternalTaskHandlerPlugin {
        @Override
        public PluginResponseDTO invoke(PluginRequestDTO pluginRequestDTO) {
            logger.info("[PLUGIN] run WelcomePluginImpl");
            return PluginResponseDTO.success();
        }
    }
}
