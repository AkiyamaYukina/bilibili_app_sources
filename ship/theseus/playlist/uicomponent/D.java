package com.bilibili.ship.theseus.playlist.uicomponent;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.viewbinding.ViewBinding;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.ship.theseus.playlist.E;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.uicomponent.C6260i;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D.class */
@StabilityInferred(parameters = 0)
public final class D extends com.bilibili.app.gemini.ui.m<Pu0.e> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f95925p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g f95926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GridLayoutManager f95927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f95928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f95929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<c> f95930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SharedFlow<c> f95931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<b> f95932g;

    @NotNull
    public final SharedFlow<b> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<a> f95933i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final SharedFlow<a> f95934j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<d> f95935k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final SharedFlow<d> f95936l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<f> f95937m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final SharedFlow<f> f95938n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final C6260i f95939o;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.D$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0799a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0799a f95940a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C0799a);
            }

            public final int hashCode() {
                return -664837585;
            }

            @NotNull
            public final String toString() {
                return "LoadNextPage";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f95941a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 998758437;
            }

            @NotNull
            public final String toString() {
                return "LoadPrePage";
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$b.class */
    @StabilityInferred(parameters = 0)
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MultiTypeMedia f95942a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$b$a.class */
        @StabilityInferred(parameters = 0)
        public static final class a extends b {
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.D$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$b$b.class */
        @StabilityInferred(parameters = 0)
        public static final class C0800b extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final Rect f95943b;

            public C0800b(@NotNull MultiTypeMedia multiTypeMedia, @NotNull Rect rect) {
                super(multiTypeMedia);
                this.f95943b = rect;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$b$c.class */
        @StabilityInferred(parameters = 0)
        public static final class c extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final Ou0.c f95944b;

            public c(@NotNull MultiTypeMedia multiTypeMedia, @NotNull Ou0.c cVar) {
                super(multiTypeMedia);
                this.f95944b = cVar;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$b$d.class */
        @StabilityInferred(parameters = 0)
        public static final class d extends b {
        }

        public b(MultiTypeMedia multiTypeMedia) {
            this.f95942a = multiTypeMedia;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$c.class */
    public interface c {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$c$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f95945a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 747528047;
            }

            @NotNull
            public final String toString() {
                return "CancelAutoHideJob";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$c$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f95946a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1449301967;
            }

            @NotNull
            public final String toString() {
                return "OnClickDescExpand";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.D$c$c, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$c$c.class */
        @StabilityInferred(parameters = 1)
        public static final class C0801c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0801c f95947a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C0801c);
            }

            public final int hashCode() {
                return 807272152;
            }

            @NotNull
            public final String toString() {
                return "OnClickFavor";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$c$d.class */
        @StabilityInferred(parameters = 1)
        public static final class d implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f95948a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -271628903;
            }

            @NotNull
            public final String toString() {
                return "OnClickHiddenArrow";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$c$e.class */
        @StabilityInferred(parameters = 1)
        public static final class e implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final e f95949a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 580416445;
            }

            @NotNull
            public final String toString() {
                return "OnClickLike";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$c$f.class */
        @StabilityInferred(parameters = 1)
        public static final class f implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final f f95950a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 243062324;
            }

            @NotNull
            public final String toString() {
                return "OnClickSchedulingOrder";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$c$g.class */
        @StabilityInferred(parameters = 1)
        public static final class g implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final g f95951a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return 819466361;
            }

            @NotNull
            public final String toString() {
                return "OnClickShare";
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$d.class */
    public interface d {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$d$a.class */
        @StabilityInferred(parameters = 0)
        public static final class a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final E.b f95952a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f95953b;

            public a(@NotNull E.b bVar, boolean z6) {
                this.f95952a = bVar;
                this.f95953b = z6;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$e.class */
    @StabilityInferred(parameters = 0)
    public static final class e extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f95954a = NewPlayerUtilsKt.toPx(12.0f);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f95955b = NewPlayerUtilsKt.toPx(8.0f);

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            int childAdapterPosition;
            int i7;
            int i8;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            if (gridLayoutManager == null) {
                return;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            C6260i c6260i = adapter instanceof C6260i ? (C6260i) adapter : null;
            if (c6260i == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) == -1 || gridLayoutManager.getSpanSizeLookup().getSpanSize(childAdapterPosition) != 1 || c6260i.f96050d.size() == 0) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            GridLayoutManager.LayoutParams layoutParams2 = null;
            if (layoutParams instanceof GridLayoutManager.LayoutParams) {
                layoutParams2 = (GridLayoutManager.LayoutParams) layoutParams;
            }
            int spanIndex = layoutParams2 != null ? layoutParams2.getSpanIndex() : 0;
            int spanCount = gridLayoutManager.getSpanCount();
            int i9 = this.f95954a;
            int i10 = this.f95955b;
            if (spanCount == 2) {
                if (spanIndex == 0) {
                    i7 = i10 / 2;
                    i8 = i9;
                } else {
                    i8 = i10 / 2;
                    i7 = i9;
                }
            } else if (spanIndex == 0) {
                i7 = i10 / 2;
                i8 = i9;
            } else if (spanIndex != 1) {
                i8 = i10 / 2;
                i7 = i9;
            } else {
                i8 = i10 / 2;
                i7 = i10 / 2;
            }
            int i11 = i10 / 2;
            int i12 = i10 / 2;
            int i13 = i9;
            if ((c6260i.f96049c - spanIndex) + childAdapterPosition < c6260i.f96050d.size()) {
                i13 = c6260i.getItemViewType((childAdapterPosition + c6260i.f96049c) - spanIndex) != 2 ? i9 : i12;
            }
            rect.set(i8, i11, i7, i13);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$f.class */
    public interface f {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$f$a.class */
        @StabilityInferred(parameters = 0)
        public static final class a implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final FrameLayout f95956a;

            public a(@NotNull FrameLayout frameLayout) {
                this.f95956a = frameLayout;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.f95956a, ((a) obj).f95956a);
            }

            public final int hashCode() {
                return this.f95956a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "OnPlayListBindToView(danmakuView=" + this.f95956a + ")";
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$g.class */
    @StabilityInferred(parameters = 0)
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Flow<a> f95957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Flow<List<b>> f95958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final StateFlow<PlaylistRepository.b> f95959c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final StateFlow<E.b> f95960d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final SharedFlow<Unit> f95961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final StateFlow<WindowSizeClass> f95962f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final StateFlow<Integer> f95963g;
        public final int h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f95964i;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$g$a.class */
        @StabilityInferred(parameters = 0)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f95965a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final String f95966b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f95967c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public final String f95968d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final long f95969e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final boolean f95970f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final int f95971g;
            public final boolean h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final int f95972i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final int f95973j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            @NotNull
            public final String f95974k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            @NotNull
            public final String f95975l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            @NotNull
            public final c f95976m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final boolean f95977n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final boolean f95978o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final boolean f95979p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public final boolean f95980q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final boolean f95981r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final boolean f95982s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final boolean f95983t;

            /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public a(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.Nullable java.lang.String r6, int r7, @org.jetbrains.annotations.NotNull java.lang.String r8, long r9, boolean r11, int r12, boolean r13, int r14, int r15, @org.jetbrains.annotations.NotNull java.lang.String r16, @org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.playlist.uicomponent.D.g.c r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23) {
                /*
                    r4 = this;
                    r0 = r4
                    r0.<init>()
                    r0 = r4
                    r1 = r5
                    r0.f95965a = r1
                    r0 = r4
                    r1 = r6
                    r0.f95966b = r1
                    r0 = r4
                    r1 = r7
                    r0.f95967c = r1
                    r0 = r4
                    r1 = r8
                    r0.f95968d = r1
                    r0 = r4
                    r1 = r9
                    r0.f95969e = r1
                    r0 = r4
                    r1 = r11
                    r0.f95970f = r1
                    r0 = r4
                    r1 = r12
                    r0.f95971g = r1
                    r0 = r4
                    r1 = r13
                    r0.h = r1
                    r0 = r4
                    r1 = r14
                    r0.f95972i = r1
                    r0 = r4
                    r1 = r15
                    r0.f95973j = r1
                    r0 = r4
                    r1 = r16
                    r0.f95974k = r1
                    r0 = r4
                    r1 = r17
                    r0.f95975l = r1
                    r0 = r4
                    r1 = r18
                    r0.f95976m = r1
                    r0 = r4
                    r1 = r19
                    r0.f95977n = r1
                    r0 = r4
                    r1 = r20
                    r0.f95978o = r1
                    r0 = r4
                    r1 = r21
                    r0.f95979p = r1
                    r0 = r4
                    r1 = r22
                    r0.f95980q = r1
                    r0 = r4
                    r1 = r23
                    r0.f95981r = r1
                    r0 = 0
                    r13 = r0
                    r0 = r7
                    if (r0 <= 0) goto L7a
                    r0 = 1
                    r11 = r0
                    goto L7d
                L7a:
                    r0 = 0
                    r11 = r0
                L7d:
                    r0 = r4
                    r1 = r11
                    r0.f95982s = r1
                    r0 = r20
                    if (r0 != 0) goto L96
                    r0 = r21
                    if (r0 != 0) goto L96
                    r0 = r13
                    r11 = r0
                    r0 = r22
                    if (r0 == 0) goto L99
                L96:
                    r0 = 1
                    r11 = r0
                L99:
                    r0 = r4
                    r1 = r11
                    r0.f95983t = r1
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.uicomponent.D.g.a.<init>(java.lang.String, java.lang.String, int, java.lang.String, long, boolean, int, boolean, int, int, java.lang.String, java.lang.String, com.bilibili.ship.theseus.playlist.uicomponent.D$g$c, boolean, boolean, boolean, boolean, boolean):void");
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f95965a, aVar.f95965a) && Intrinsics.areEqual(this.f95966b, aVar.f95966b) && this.f95967c == aVar.f95967c && Intrinsics.areEqual(this.f95968d, aVar.f95968d) && this.f95969e == aVar.f95969e && this.f95970f == aVar.f95970f && this.f95971g == aVar.f95971g && this.h == aVar.h && this.f95972i == aVar.f95972i && this.f95973j == aVar.f95973j && Intrinsics.areEqual(this.f95974k, aVar.f95974k) && Intrinsics.areEqual(this.f95975l, aVar.f95975l) && Intrinsics.areEqual(this.f95976m, aVar.f95976m) && this.f95977n == aVar.f95977n && this.f95978o == aVar.f95978o && this.f95979p == aVar.f95979p && this.f95980q == aVar.f95980q && this.f95981r == aVar.f95981r;
            }

            public final int hashCode() {
                int iHashCode = this.f95965a.hashCode();
                String str = this.f95966b;
                return Boolean.hashCode(this.f95981r) + androidx.compose.animation.z.a(androidx.compose.animation.z.a(androidx.compose.animation.z.a(androidx.compose.animation.z.a((this.f95976m.hashCode() + I.E.a(I.E.a(androidx.compose.animation.core.I.a(this.f95973j, androidx.compose.animation.core.I.a(this.f95972i, androidx.compose.animation.z.a(androidx.compose.animation.core.I.a(this.f95971g, androidx.compose.animation.z.a(C3554n0.a(I.E.a(androidx.compose.animation.core.I.a(this.f95967c, ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f95968d), 31, this.f95969e), 31, this.f95970f), 31), 31, this.h), 31), 31), 31, this.f95974k), 31, this.f95975l)) * 31, 31, this.f95977n), 31, this.f95978o), 31, this.f95979p), 31, this.f95980q);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("HeaderInfo(title=");
                sb.append(this.f95965a);
                sb.append(", titleSuffix=");
                sb.append(this.f95966b);
                sb.append(", totalMedia=");
                sb.append(this.f95967c);
                sb.append(", desc=");
                sb.append(this.f95968d);
                sb.append(", views=");
                sb.append(this.f95969e);
                sb.append(", isLike=");
                sb.append(this.f95970f);
                sb.append(", likes=");
                sb.append(this.f95971g);
                sb.append(", isFav=");
                sb.append(this.h);
                sb.append(", favs=");
                sb.append(this.f95972i);
                sb.append(", shares=");
                sb.append(this.f95973j);
                sb.append(", favSelectedStr=");
                sb.append(this.f95974k);
                sb.append(", favUnselectedStr=");
                sb.append(this.f95975l);
                sb.append(", orderRes=");
                sb.append(this.f95976m);
                sb.append(", orderEnable=");
                sb.append(this.f95977n);
                sb.append(", likeEnable=");
                sb.append(this.f95978o);
                sb.append(", favEnable=");
                sb.append(this.f95979p);
                sb.append(", shareEnable=");
                sb.append(this.f95980q);
                sb.append(", hideTitleSort=");
                return androidx.appcompat.app.i.a(sb, this.f95981r, ")");
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$g$b.class */
        @StabilityInferred(parameters = 0)
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final Object f95984a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f95985b;

            public b(@NotNull Object obj, int i7) {
                this.f95984a = obj;
                this.f95985b = i7;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f95984a, bVar.f95984a) && this.f95985b == bVar.f95985b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f95985b) + (this.f95984a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("ListItem(data=");
                sb.append(this.f95984a);
                sb.append(", type=");
                return C4277b.a(this.f95985b, ")", sb);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$g$c.class */
        @StabilityInferred(parameters = 0)
        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f95986a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final Drawable f95987b;

            public c(@NotNull String str, @Nullable Drawable drawable) {
                this.f95986a = str;
                this.f95987b = drawable;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.areEqual(this.f95986a, cVar.f95986a) && Intrinsics.areEqual(this.f95987b, cVar.f95987b);
            }

            public final int hashCode() {
                int iHashCode = this.f95986a.hashCode();
                Drawable drawable = this.f95987b;
                return (iHashCode * 31) + (drawable == null ? 0 : drawable.hashCode());
            }

            @NotNull
            public final String toString() {
                return "PlaylistOrderRes(desc=" + this.f95986a + ", icon=" + this.f95987b + ")";
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public g(@NotNull Flow<a> flow, @NotNull Flow<? extends List<b>> flow2, @NotNull StateFlow<PlaylistRepository.b> stateFlow, @NotNull StateFlow<? extends E.b> stateFlow2, @NotNull SharedFlow<Unit> sharedFlow, @NotNull StateFlow<WindowSizeClass> stateFlow3, @NotNull StateFlow<Integer> stateFlow4, int i7, boolean z6) {
            this.f95957a = flow;
            this.f95958b = flow2;
            this.f95959c = stateFlow;
            this.f95960d = stateFlow2;
            this.f95961e = sharedFlow;
            this.f95962f = stateFlow3;
            this.f95963g = stateFlow4;
            this.h = i7;
            this.f95964i = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Intrinsics.areEqual(this.f95957a, gVar.f95957a) && Intrinsics.areEqual(this.f95958b, gVar.f95958b) && Intrinsics.areEqual(this.f95959c, gVar.f95959c) && Intrinsics.areEqual(this.f95960d, gVar.f95960d) && Intrinsics.areEqual(this.f95961e, gVar.f95961e) && Intrinsics.areEqual(this.f95962f, gVar.f95962f) && Intrinsics.areEqual(this.f95963g, gVar.f95963g) && this.h == gVar.h && this.f95964i == gVar.f95964i;
        }

        public final int hashCode() {
            int iHashCode = this.f95957a.hashCode();
            int iA = androidx.core.content.b.a(this.f95960d, androidx.core.content.b.a(this.f95959c, (this.f95958b.hashCode() + (iHashCode * 31)) * 31, 31), 31);
            return Boolean.hashCode(this.f95964i) + androidx.compose.animation.core.I.a(this.h, androidx.core.content.b.a(this.f95963g, androidx.core.content.b.a(this.f95962f, (this.f95961e.hashCode() + iA) * 31, 31), 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("State(headerInfoFlow=");
            sb.append(this.f95957a);
            sb.append(", mediaListFlow=");
            sb.append(this.f95958b);
            sb.append(", loaderStateFlow=");
            sb.append(this.f95959c);
            sb.append(", uiStateFlow=");
            sb.append(this.f95960d);
            sb.append(", scrollToSelectedFlow=");
            sb.append(this.f95961e);
            sb.append(", windowSizeFlow=");
            sb.append(this.f95962f);
            sb.append(", horizontalPaddingFlow=");
            sb.append(this.f95963g);
            sb.append(", playlistType=");
            sb.append(this.h);
            sb.append(", draggable=");
            return androidx.appcompat.app.i.a(sb, this.f95964i, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/D$h.class */
    public static final class h implements C6260i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D f95988a;

        public h(D d7) {
            this.f95988a = d7;
        }

        @Override // com.bilibili.ship.theseus.playlist.uicomponent.C6260i.a
        public final void a(MultiTypeMedia multiTypeMedia) {
            this.f95988a.f95932g.tryEmit(new b(multiTypeMedia));
        }

        @Override // com.bilibili.ship.theseus.playlist.uicomponent.C6260i.a
        public final void b(MultiTypeMedia multiTypeMedia, Rect rect) {
            this.f95988a.f95932g.tryEmit(new b.C0800b(multiTypeMedia, rect));
        }

        @Override // com.bilibili.ship.theseus.playlist.uicomponent.C6260i.a
        public final void c(MultiTypeMedia multiTypeMedia) {
            this.f95988a.f95932g.tryEmit(new b(multiTypeMedia));
        }
    }

    public D(@NotNull g gVar) {
        this.f95926a = gVar;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f95928c = mutableSharedFlowMutableSharedFlow$default;
        this.f95929d = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<c> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f95930e = mutableSharedFlowMutableSharedFlow$default2;
        this.f95931f = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<b> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f95932g = mutableSharedFlowMutableSharedFlow$default3;
        this.h = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        MutableSharedFlow<a> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f95933i = mutableSharedFlowMutableSharedFlow$default4;
        this.f95934j = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<d> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f95935k = mutableSharedFlowMutableSharedFlow$default5;
        this.f95936l = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<f> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f95937m = mutableSharedFlowMutableSharedFlow$default6;
        this.f95938n = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
        this.f95939o = new C6260i(new h(this), gVar.h);
    }

    public static void d(int i7, View view) {
        float height = view.getHeight();
        float translationY = view.getTranslationY() - i7;
        float f7 = translationY;
        if (translationY < 0.0f) {
            f7 = translationY;
            if (Math.abs(translationY) > height) {
                f7 = -height;
            }
        }
        if (f7 > 0.0f) {
            f7 = 0.0f;
        }
        view.setTranslationY(f7);
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Pu0.e eVar = (Pu0.e) viewBinding;
        Context context = eVar.f19315a.getContext();
        Pu0.a aVar = eVar.f19317c;
        final ConstraintLayout constraintLayout = aVar.f19291a;
        BottomSheetBehavior<View> bottomSheetBehaviorFrom = BottomSheetBehavior.from(eVar.f19320f);
        g gVar = this.f95926a;
        bottomSheetBehaviorFrom.setDraggable(gVar.f95964i);
        final PlaylistRecyclerView playlistRecyclerView = eVar.f19321g;
        playlistRecyclerView.f96009d = bottomSheetBehaviorFrom;
        boolean z6 = gVar.f95964i;
        playlistRecyclerView.f96010e = z6;
        Pu0.l lVar = eVar.f19316b;
        lVar.f19375b.setVisibility(z6 ? 0 : 8);
        FrameLayout frameLayout = lVar.f19376c;
        int i7 = 8;
        if (z6) {
            i7 = 0;
        }
        frameLayout.setVisibility(i7);
        FrameLayout frameLayout2 = eVar.h;
        if (!z6) {
            Drawable background = eVar.f19320f.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setCornerRadius(0.0f);
            }
            ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = NewPlayerUtilsKt.toPx(40.0f);
            frameLayout2.setLayoutParams(layoutParams);
        }
        View view = eVar.f19319e;
        playlistRecyclerView.addOnScrollListener(new E(this, constraintLayout));
        constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new I(constraintLayout, playlistRecyclerView));
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener(this, playlistRecyclerView, constraintLayout) { // from class: com.bilibili.ship.theseus.playlist.uicomponent.C

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final D f95922a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final PlaylistRecyclerView f95923b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ConstraintLayout f95924c;

            {
                this.f95922a = this;
                this.f95923b = playlistRecyclerView;
                this.f95924c = constraintLayout;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                D d7 = this.f95922a;
                PlaylistRecyclerView playlistRecyclerView2 = this.f95923b;
                ConstraintLayout constraintLayout2 = this.f95924c;
                if (i11 - i9 != i15 - i13) {
                    d7.c(constraintLayout2, playlistRecyclerView2);
                }
            }
        };
        playlistRecyclerView.addOnLayoutChangeListener(onLayoutChangeListener);
        TextView textView = aVar.f19292b;
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new F(textView, aVar.f19293c));
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(eVar.f19315a, new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new AF.c(this, 7)));
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new PlaylistUIComponent$bind$7(this, playlistRecyclerView, eVar, bottomSheetBehaviorFrom, view, lVar, aVar, context, constraintLayout, eVar.f19315a, onLayoutChangeListener, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Pu0.e eVarInflate = Pu0.e.inflate(LayoutInflater.from(context), viewGroup, false);
        PlaylistRecyclerView playlistRecyclerView = eVarInflate.f19321g;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
        this.f95927b = gridLayoutManager;
        gridLayoutManager.setSpanSizeLookup(new J(this));
        GridLayoutManager gridLayoutManager2 = this.f95927b;
        GridLayoutManager gridLayoutManager3 = gridLayoutManager2;
        if (gridLayoutManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
            gridLayoutManager3 = null;
        }
        playlistRecyclerView.setLayoutManager(gridLayoutManager3);
        playlistRecyclerView.addItemDecoration(new e());
        playlistRecyclerView.setLoadEventCallback(new K(this));
        playlistRecyclerView.setAdapter(this.f95939o);
        ((SimpleItemAnimator) playlistRecyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        return eVarInflate;
    }

    public final void c(View view, RecyclerView recyclerView) {
        GridLayoutManager gridLayoutManager = this.f95927b;
        GridLayoutManager gridLayoutManager2 = gridLayoutManager;
        if (gridLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
            gridLayoutManager2 = null;
        }
        View childAt = gridLayoutManager2.getChildAt(0);
        if (childAt != null && gridLayoutManager2.getChildCount() > 0) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            int top = childAt.getTop();
            float height = view.getHeight() - Math.abs(view.getTranslationY());
            if (top <= height || childAdapterPosition != 0) {
                return;
            }
            d(((int) height) - top, view);
        }
    }
}
