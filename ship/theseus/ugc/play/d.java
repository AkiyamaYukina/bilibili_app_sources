package com.bilibili.ship.theseus.ugc.play;

import com.bilibili.ship.theseus.united.page.videoquality.A0;
import com.bilibili.ship.theseus.united.page.videoquality.O;
import com.bilibili.ship.theseus.united.page.videoquality.ShowQualityListImpl;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/d.class */
public final /* synthetic */ class d implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShowQualityListImpl f98105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f98106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A0 f98107c;

    public /* synthetic */ d(ShowQualityListImpl showQualityListImpl, CoroutineScope coroutineScope, A0 a02) {
        this.f98105a = showQualityListImpl;
        this.f98106b = coroutineScope;
        this.f98107c = a02;
    }

    @Override // com.bilibili.ship.theseus.united.page.videoquality.O
    public final void invoke() {
        this.f98105a.invoke();
        BuildersKt.launch$default(this.f98106b, (CoroutineContext) null, (CoroutineStart) null, new UGCShowQualityListModule$provide$1$1(this.f98107c, null), 3, (Object) null);
    }
}
