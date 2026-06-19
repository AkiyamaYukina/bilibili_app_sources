package com.bilibili.ogvvega.tunnel;

import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.studio.material.util.UtilsKt;
import com.google.gson.JsonSyntaxException;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/VegaConfigKt.class */
public final class VegaConfigKt {
    private static final dd0.a config2Policy(BackoffConfig backoffConfig) {
        return new dd0.a(backoffConfig.getMaxTimes(), backoffConfig.getInitialDelay(), backoffConfig.getMaxDelay(), backoffConfig.getFactor(), backoffConfig.getJitter());
    }

    private static final HeartbeatConfig defHeartbeatConfig() {
        return new HeartbeatConfig(0L, 0L, 0, 7, null);
    }

    private static final BackoffConfig defReAuthConfig() {
        return new BackoffConfig(3, 1, 10, 1.6f, 0.2f);
    }

    private static final BackoffConfig defReconnectConfig() {
        return new BackoffConfig(Integer.MAX_VALUE, 1, 10, 1.6f, 0.2f);
    }

    private static final String getHeartbeatConfig() {
        return Hj0.a.c("ogv.grpc_heartbeat_config");
    }

    private static final String getReAuthConfig() {
        return Hj0.a.c("ogv.grpc_re_auth_config");
    }

    private static final String getReconnectConfig() {
        return Hj0.a.c("ogv.grpc_reconnect_config");
    }

    @NotNull
    public static final HeartbeatConfig heartbeatConfig() {
        HeartbeatConfig heartbeatConfig = (HeartbeatConfig) parseConfig(getHeartbeatConfig(), HeartbeatConfig.class);
        HeartbeatConfig heartbeatConfigDefHeartbeatConfig = heartbeatConfig;
        if (heartbeatConfig == null) {
            heartbeatConfigDefHeartbeatConfig = defHeartbeatConfig();
        }
        defpackage.a.b("[ogv-vega-VegaConfigKt-heartbeatConfig] ", "heartbeat config " + heartbeatConfigDefHeartbeatConfig + UtilsKt.DOT, "VegaConfigKt-heartbeatConfig");
        return heartbeatConfigDefHeartbeatConfig;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.gson.JsonSyntaxException */
    private static final <T> T parseConfig(String str, Class<T> cls) throws JsonSyntaxException {
        Object json = null;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                json = null;
            } else {
                try {
                    json = JsonUtilKt.parseJson(str, cls);
                } catch (Exception e7) {
                    com.bilibili.ogv.infra.util.e.b(e7);
                    json = null;
                }
            }
        }
        return (T) json;
    }

    @NotNull
    public static final dd0.a reAuthPolicy() {
        BackoffConfig backoffConfig = (BackoffConfig) parseConfig(getReAuthConfig(), BackoffConfig.class);
        BackoffConfig backoffConfigDefReAuthConfig = backoffConfig;
        if (backoffConfig == null) {
            backoffConfigDefReAuthConfig = defReAuthConfig();
        }
        defpackage.a.b("[ogv-vega-VegaConfigKt-reAuthPolicy] ", "re auth config " + backoffConfigDefReAuthConfig + UtilsKt.DOT, "VegaConfigKt-reAuthPolicy");
        return config2Policy(backoffConfigDefReAuthConfig);
    }

    @NotNull
    public static final dd0.a reconnectPolicy() {
        BackoffConfig backoffConfig = (BackoffConfig) parseConfig(getReconnectConfig(), BackoffConfig.class);
        BackoffConfig backoffConfigDefReconnectConfig = backoffConfig;
        if (backoffConfig == null) {
            backoffConfigDefReconnectConfig = defReconnectConfig();
        }
        defpackage.a.b("[ogv-vega-VegaConfigKt-reconnectPolicy] ", "Reconnect config " + backoffConfigDefReconnectConfig + UtilsKt.DOT, "VegaConfigKt-reconnectPolicy");
        return config2Policy(backoffConfigDefReconnectConfig);
    }
}
