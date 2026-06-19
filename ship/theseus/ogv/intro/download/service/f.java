package com.bilibili.ship.theseus.ogv.intro.download.service;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/service/f.class */
@StabilityInferred(parameters = 0)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f92408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d f92409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<a> f92410c;

    @Inject
    public f(@NotNull Context context) {
        d ogvKOfflineClient;
        CoroutineScope coroutineScopeMainScope = CoroutineScopeKt.MainScope();
        this.f92408a = coroutineScopeMainScope;
        if (kj0.e.a()) {
            ogvKOfflineClient = new OgvKOfflineClient(coroutineScopeMainScope);
        } else {
            e eVar = new e();
            eVar.h(context);
            ogvKOfflineClient = eVar;
        }
        this.f92409b = ogvKOfflineClient;
        this.f92410c = new ArrayList();
    }
}
