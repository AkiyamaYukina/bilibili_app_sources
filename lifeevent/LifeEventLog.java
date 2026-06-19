package com.bilibili.lifeevent;

import Ag0.C1400a;
import com.bilibili.lib.gson.GsonKt;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lifeevent/LifeEventLog.class */
public final class LifeEventLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static a f65136a;

    @NotNull
    public static final LifeEventLog INSTANCE = new LifeEventLog();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f65137b = "life.event";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lifeevent/LifeEventLog$a.class */
    public interface a {
        void i(@Nullable String str, @Nullable String str2);
    }

    @JvmStatic
    public static final void report(@NotNull String str, @Nullable Map<String, String> map) {
        a aVar = f65136a;
        if (aVar != null) {
            aVar.i(f65137b, GsonKt.getSGlobalGson().toJson(new C1400a(str, map)));
        }
    }

    @JvmStatic
    public static final void setLogDelegate(@Nullable a aVar) {
        if (aVar != null) {
            f65136a = aVar;
        }
    }
}
