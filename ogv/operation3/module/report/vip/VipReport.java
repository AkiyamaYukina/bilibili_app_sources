package com.bilibili.ogv.operation3.module.report.vip;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import javax.inject.Inject;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentScope;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/report/vip/VipReport.class */
@StabilityInferred(parameters = 0)
public final class VipReport {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final c f71411a;

    @Inject
    public VipReport(@NotNull c cVar) {
        this.f71411a = cVar;
    }

    public final void a(@NotNull KomponentScope<Object> komponentScope, long j7, @NotNull String str, @NotNull Map<String, String> map) {
        KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new VipReport$invoke$1(this, j7, str, map, null), 3, (Object) null);
    }
}
