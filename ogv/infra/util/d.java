package com.bilibili.ogv.infra.util;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/util/d.class */
public final class d {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long a(long r9, long r11, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r13) {
        /*
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto Lf
            r0 = 1631316471(0x613be9f7, float:2.1665E20)
            r1 = 0
            r2 = -1
            java.lang.String r3 = "com.bilibili.ogv.infra.util.countdown (Countdown.kt:8)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        Lf:
            r0 = r13
            java.lang.Object r0 = r0.rememberedValue()
            r17 = r0
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            r18 = r0
            r0 = r17
            r16 = r0
            r0 = r17
            r1 = r18
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L40
            r0 = r9
            kotlin.time.Duration r0 = kotlin.time.Duration.box-impl(r0)
            r1 = 0
            r2 = 2
            r3 = 0
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(r0, r1, r2, r3)
            r16 = r0
            r0 = r13
            r1 = r16
            r0.updateRememberedValue(r1)
        L40:
            r0 = r16
            androidx.compose.runtime.MutableState r0 = (androidx.compose.runtime.MutableState) r0
            r20 = r0
            r0 = r9
            kotlin.time.Duration r0 = kotlin.time.Duration.box-impl(r0)
            r19 = r0
            r0 = r13
            r1 = r11
            boolean r0 = r0.changed(r1)
            r14 = r0
            r0 = r13
            r1 = r9
            boolean r0 = r0.changed(r1)
            r15 = r0
            r0 = r13
            java.lang.Object r0 = r0.rememberedValue()
            r17 = r0
            r0 = r14
            r1 = r15
            r0 = r0 | r1
            if (r0 != 0) goto L80
            r0 = r17
            r16 = r0
            r0 = r17
            r1 = r18
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L97
        L80:
            com.bilibili.ogv.infra.util.CountdownKt$countdown$1$1 r0 = new com.bilibili.ogv.infra.util.CountdownKt$countdown$1$1
            r1 = r0
            r2 = r11
            r3 = r9
            r4 = r20
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r16 = r0
            r0 = r13
            r1 = r16
            r0.updateRememberedValue(r1)
        L97:
            r0 = r19
            r1 = r16
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r2 = r13
            r3 = 0
            androidx.compose.runtime.EffectsKt.LaunchedEffect(r0, r1, r2, r3)
            r0 = r20
            java.lang.Object r0 = r0.getValue()
            kotlin.time.Duration r0 = (kotlin.time.Duration) r0
            long r0 = r0.unbox-impl()
            r9 = r0
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto Lbb
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Lbb:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.infra.util.d.a(long, long, androidx.compose.runtime.Composer):long");
    }
}
