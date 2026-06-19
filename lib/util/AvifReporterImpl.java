package com.bilibili.lib.util;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/util/AvifReporterImpl.class */
public final class AvifReporterImpl {

    @NotNull
    public static final AvifReporterImpl INSTANCE = new AvifReporterImpl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static Reporter f65026a;

    public final void initReporter(@NotNull Reporter reporter) {
        f65026a = reporter;
    }

    public final void report(@NotNull String str, @NotNull Map<String, String> map, boolean z6, @NotNull Function0<Boolean> function0) {
        Reporter reporter = f65026a;
        if (reporter != null) {
            reporter.onReport(str, map, z6, function0);
        }
    }
}
