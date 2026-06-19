package com.bilibili.ogv.secondary.part;

import androidx.compose.runtime.MutableState;
import com.bilibili.ogv.secondary.part.InterfaceC5531a;
import kntr.common.komponent.KomponentScope;
import kntr.common.trio.toast.Toaster;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/j.class */
public final class C5540j implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5531a f72843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KomponentScope<Unit> f72844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreateCategoryKomponentImpl f72845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f72846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f72847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableState<InterfaceC5531a> f72848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Toaster f72849g;

    public C5540j(MutableState mutableState, InterfaceC5531a interfaceC5531a, CreateCategoryKomponentImpl createCategoryKomponentImpl, String str, String str2, KomponentScope komponentScope, Toaster toaster) {
        this.f72843a = interfaceC5531a;
        this.f72844b = komponentScope;
        this.f72845c = createCategoryKomponentImpl;
        this.f72846d = str;
        this.f72847e = str2;
        this.f72848f = mutableState;
        this.f72849g = toaster;
    }

    public final Object invoke() {
        InterfaceC5531a.c cVar = (InterfaceC5531a.c) this.f72843a;
        cVar.f72807b.setValue(Boolean.TRUE);
        CreateCategoryKomponentImpl.a(this.f72844b, this.f72845c, this.f72846d, this.f72847e, this.f72848f, this.f72849g);
        return Unit.INSTANCE;
    }
}
