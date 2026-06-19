package com.bilibili.ship.theseus.ogv;

import androidx.compose.runtime.internal.StabilityInferred;
import ev0.InterfaceC7008a;
import javax.inject.Inject;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/e.class */
@StabilityInferred(parameters = 0)
public final class C6153e implements InterfaceC7008a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C8043a f91908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC7008a f91909b;

    @Inject
    public C6153e(@NotNull C8043a c8043a, @NotNull InterfaceC7008a interfaceC7008a) {
        this.f91908a = c8043a;
        this.f91909b = interfaceC7008a;
    }

    public static void f(C6153e c6153e, Long l7, Long l8, int i7, String str, int i8, int i9) {
        if ((i9 & 2) != 0) {
            l8 = null;
        }
        if ((i9 & 4) != 0) {
            i7 = 0;
        }
        InterfaceC7008a.C1258a c1258a = new InterfaceC7008a.C1258a(0L, null, 0L, null, str, null, c6153e.f91908a.a().f123882d, null, null, null, null, null, 0L, false, 0, false, 65455);
        c1258a.m10991setTagpIAwiHE(com.bilibili.ship.theseus.united.bean.e.f98758a.a, new com.bilibili.ship.theseus.united.bean.d(l7, null, l8, null, null, 58));
        c1258a.m10991setTagpIAwiHE(com.bilibili.ship.theseus.ogv.continuousplay.e.f91815a.a, Integer.valueOf(i7));
        InterfaceC7008a.c(c6153e.f91909b, c1258a, null, null, null, false, i8, 30);
    }

    @Override // ev0.InterfaceC7008a
    public final void a() {
        this.f91909b.a();
    }

    @Override // ev0.InterfaceC7008a
    public final void b(long j7, @NotNull String str, long j8, @Nullable String str2, @NotNull String str3, @NotNull String str4, int i7, @Nullable String str5, boolean z6) {
        this.f91909b.b(j7, str, j8, str2, str3, str4, i7, str5, z6);
    }

    @Override // ev0.InterfaceC7008a
    public final void d(@NotNull InterfaceC7008a.C1258a c1258a, @Nullable ev0.h hVar, @Nullable ev0.l lVar, @Nullable ev0.g gVar, boolean z6, int i7) {
        this.f91909b.d(c1258a, hVar, lVar, gVar, z6, i7);
    }
}
