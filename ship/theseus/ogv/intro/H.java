package com.bilibili.ship.theseus.ogv.intro;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import com.bilibili.ship.theseus.united.page.restrictionlayer.DeviceManagementAction;
import ev0.InterfaceC7008a;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/H.class */
public final class H implements com.bilibili.ship.theseus.united.page.restrictionlayer.t<DeviceManagementAction> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.ship.theseus.united.page.screenstate.c f92216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f92217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f92218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lifecycle f92219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC7008a f92220e;

    public H(com.bilibili.ship.theseus.united.page.screenstate.c cVar, Context context, CoroutineScope coroutineScope, Lifecycle lifecycle, InterfaceC7008a interfaceC7008a) {
        this.f92216a = cVar;
        this.f92217b = context;
        this.f92218c = coroutineScope;
        this.f92219d = lifecycle;
        this.f92220e = interfaceC7008a;
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final void a(DeviceManagementAction deviceManagementAction) {
        this.f92216a.g();
        Qj0.g.e(this.f92217b, Uri.parse(deviceManagementAction.f102525a));
        BuildersKt.launch$default(this.f92218c, (CoroutineContext) null, (CoroutineStart) null, new OgvOperationActionHandlerModule$deviceManagement$1$1(this.f92219d, this.f92220e, null), 3, (Object) null);
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final Class<DeviceManagementAction> b() {
        return DeviceManagementAction.class;
    }
}
