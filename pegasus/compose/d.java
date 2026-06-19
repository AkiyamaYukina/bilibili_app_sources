package com.bilibili.pegasus.compose;

import F3.N6;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/compose/d.class */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f77265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<a> f77266b = CompositionLocalKt.staticCompositionLocalOf(new N6(9));

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.pegasus.compose.b] */
    static {
        final int i7 = 0;
        f77265a = new Function1(i7) { // from class: com.bilibili.pegasus.compose.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f77259a;

            {
                this.f77259a = i7;
            }

            public final Object invoke(Object obj) {
                switch (this.f77259a) {
                    case 0:
                        return new DefaultExposureCollector((e) obj);
                    default:
                        Map.Entry entry = (Map.Entry) obj;
                        return entry.getKey() + "\n " + CollectionsKt.p(((Map) entry.getValue()).entrySet(), "\n", "  ", (CharSequence) null, new com.bilibili.bplus.followinglist.page.opus.share.g(1), 28);
                }
            }
        };
    }

    @Composable
    @NotNull
    public static final a a(@Nullable Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1802904114, 0, -1, "com.bilibili.pegasus.compose.rememberCollectorHolder (Exposer.kt:137)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Object aVar = objRememberedValue;
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            aVar = new a();
            composer.updateRememberedValue(aVar);
        }
        a aVar2 = (a) aVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return aVar2;
    }

    public static Modifier b(Modifier modifier, final Object obj, final a aVar, final Function0 function0) {
        final b bVar = f77265a;
        final e eVar = new e(true, 0.0f, 1, 0L);
        return ComposedModifierKt.composed$default(modifier, null, new Function3(aVar, obj, eVar, bVar, function0) { // from class: com.bilibili.pegasus.compose.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a f77260a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f77261b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final e f77262c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Function1 f77263d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Function0 f77264e;

            {
                this.f77260a = aVar;
                this.f77261b = obj;
                this.f77262c = eVar;
                this.f77263d = bVar;
                this.f77264e = function0;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x00a7  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x00ed  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
                /*
                    Method dump skipped, instruction units count: 284
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.compose.c.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, 1, null);
    }
}
