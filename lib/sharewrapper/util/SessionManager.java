package com.bilibili.lib.sharewrapper.util;

import java.util.UUID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/util/SessionManager.class */
public final class SessionManager {

    @NotNull
    public static final SessionManager INSTANCE = new SessionManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static String f64461a = "";

    public final void generateSessionId() {
        f64461a = UUID.randomUUID().toString();
    }

    @NotNull
    public final String getSessionId() {
        return f64461a;
    }

    public final void setSessionId(@NotNull String str) {
        f64461a = str;
    }
}
