package io.github.username.spongetemplate;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id = "exampleplugin", name = "Example Plugin", version = "1.0")
public class ExamplePlugin {

    @Inject
    private Logger logger;

    @Inject
    private void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Inject
    public ExamplePlugin(Logger logger) {
        this.logger = logger;
    }

    private Logger getLogger() {
        return logger;
    }

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        getLogger().debug("Server is started!");
    }

}
