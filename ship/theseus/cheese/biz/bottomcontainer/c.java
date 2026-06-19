package com.bilibili.ship.theseus.cheese.biz.bottomcontainer;

import I.E;
import android.view.View;
import androidx.compose.animation.z;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import eu0.C6978A;
import eu0.C6987f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/c.class */
@Stable
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f89053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f89054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f89055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f89056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Function1<c, Unit> f89057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Function1<View, Unit> f89058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableState f89059g;

    @NotNull
    public final MutableState h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableState f89060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableState f89061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableState f89062k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableState f89063l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableState f89064m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableState f89065n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableState f89066o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableState f89067p;

    public c() {
        this(0, (String) null, false, (String) null, (Function1) null, 63);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.functions.Function1] */
    public /* synthetic */ c(int i7, String str, boolean z6, String str2, Function1 function1, int i8) {
        this((i8 & 1) != 0 ? 0 : i7, (i8 & 2) != 0 ? "" : str, (i8 & 4) != 0 ? true : z6, (i8 & 8) != 0 ? "" : str2, (Function1<? super c, Unit>) ((i8 & 16) != 0 ? new Object() : function1), (Function1<? super View, Unit>) new b(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(int i7, @NotNull String str, boolean z6, @NotNull String str2, @NotNull Function1<? super c, Unit> function1, @NotNull Function1<? super View, Unit> function12) {
        this.f89053a = i7;
        this.f89054b = str;
        this.f89055c = z6;
        this.f89056d = str2;
        this.f89057e = function1;
        this.f89058f = function12;
        this.f89059g = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.h = SnapshotStateKt.mutableStateOf$default("收藏", null, 2, null);
        this.f89060i = SnapshotStateKt.mutableStateOf$default("分享", null, 2, null);
        this.f89061j = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f89062k = SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.f89063l = SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.f89064m = SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.f89065n = SnapshotStateKt.mutableStateOf$default(new C6987f("", 0L, 0, false, 0), null, 2, null);
        this.f89066o = SnapshotStateKt.mutableStateOf$default(new C6978A("", "", "", "", ""), null, 2, null);
        this.f89067p = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f89053a == cVar.f89053a && Intrinsics.areEqual(this.f89054b, cVar.f89054b) && this.f89055c == cVar.f89055c && Intrinsics.areEqual(this.f89056d, cVar.f89056d) && Intrinsics.areEqual(this.f89057e, cVar.f89057e) && Intrinsics.areEqual(this.f89058f, cVar.f89058f);
    }

    public final int hashCode() {
        return this.f89058f.hashCode() + O4.b.a(E.a(z.a(E.a(Integer.hashCode(this.f89053a) * 31, 31, this.f89054b), 31, this.f89055c), 31, this.f89056d), 31, this.f89057e);
    }

    @NotNull
    public final String toString() {
        return "CheeseBottomContainerButton(type=" + this.f89053a + ", text=" + this.f89054b + ", disabled=" + this.f89055c + ", link=" + this.f89056d + ", onClick=" + this.f89057e + ", onExposure=" + this.f89058f + ")";
    }
}
