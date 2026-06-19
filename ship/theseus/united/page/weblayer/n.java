package com.bilibili.ship.theseus.united.page.weblayer;

import com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/n.class */
public final class n implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f104287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ref.ObjectRef<PlayerV3WebGeneralUIComponent> f104288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ref.BooleanRef f104289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ref.ObjectRef<String> f104290d;

    public n(l lVar, Ref.ObjectRef<PlayerV3WebGeneralUIComponent> objectRef, Ref.BooleanRef booleanRef, Ref.ObjectRef<String> objectRef2) {
        this.f104287a = lVar;
        this.f104288b = objectRef;
        this.f104289c = booleanRef;
        this.f104290d = objectRef2;
    }

    @Override // com.bilibili.ship.theseus.united.page.weblayer.i
    public final void a(String str, String str2, String str3) {
        Ref.BooleanRef booleanRef = this.f104289c;
        Ref.ObjectRef<String> objectRef = this.f104290d;
        BuildersKt.launch$default(this.f104287a.f104269a, Dispatchers.getMain().getImmediate(), (CoroutineStart) null, new TheseusV3WebService$show$requestClose$1(this.f104288b, booleanRef, str2, str3, objectRef, str, null), 2, (Object) null);
    }
}
