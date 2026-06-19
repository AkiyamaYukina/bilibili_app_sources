package com.bilibili.ogv.operation3.module.operable.delivery;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import javax.inject.Inject;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentScope;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/operable/delivery/DeliveryReport.class */
@StabilityInferred(parameters = 0)
public final class DeliveryReport {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f71388a;

    @Inject
    public DeliveryReport(@NotNull a aVar) {
        this.f71388a = aVar;
    }

    public final void a(@NotNull KomponentScope<?> komponentScope, int i7, @NotNull Map<String, String> map) {
        KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new DeliveryReport$invoke$1(this, map, i7, null), 3, (Object) null);
    }
}
