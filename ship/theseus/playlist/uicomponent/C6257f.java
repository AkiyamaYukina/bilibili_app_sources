package com.bilibili.ship.theseus.playlist.uicomponent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.droid.ScreenUtil;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/f.class */
@StabilityInferred(parameters = 0)
public final class C6257f extends com.bilibili.app.gemini.ui.m<Pu0.c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f96032c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f96033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final A8.h f96034b;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.f$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/f$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Flow<C0804a> f96035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Flow<Boolean> f96036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final StateFlow f96037c;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/f$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0804a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f96038a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final String f96039b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f96040c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f96041d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final boolean f96042e;

            public C0804a(@NotNull String str, @Nullable String str2, int i7, int i8) {
                this.f96038a = str;
                this.f96039b = str2;
                this.f96040c = i7;
                this.f96041d = i8;
                this.f96042e = i7 > 0;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0804a)) {
                    return false;
                }
                C0804a c0804a = (C0804a) obj;
                return Intrinsics.areEqual(this.f96038a, c0804a.f96038a) && Intrinsics.areEqual(this.f96039b, c0804a.f96039b) && this.f96040c == c0804a.f96040c && this.f96041d == c0804a.f96041d;
            }

            public final int hashCode() {
                int iHashCode = this.f96038a.hashCode();
                String str = this.f96039b;
                return Integer.hashCode(this.f96041d) + androidx.compose.animation.core.I.a(this.f96040c, ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("HeaderInfo(title=");
                sb.append(this.f96038a);
                sb.append(", titleSuffix=");
                sb.append(this.f96039b);
                sb.append(", totalMedia=");
                sb.append(this.f96040c);
                sb.append(", currentIndex=");
                return C4277b.a(this.f96041d, ")", sb);
            }
        }

        public a(@NotNull Flow flow, @NotNull Flow flow2, @NotNull StateFlow stateFlow) {
            this.f96035a = flow;
            this.f96036b = flow2;
            this.f96037c = stateFlow;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f96035a, aVar.f96035a) && Intrinsics.areEqual(this.f96036b, aVar.f96036b) && Intrinsics.areEqual(this.f96037c, aVar.f96037c);
        }

        public final int hashCode() {
            int iHashCode = this.f96035a.hashCode();
            return this.f96037c.hashCode() + ((this.f96036b.hashCode() + (iHashCode * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "State(headerInfoFlow=" + this.f96035a + ", showFloatingTitleFlow=" + this.f96036b + ", floatingContainerHeightFlow=" + this.f96037c + ")";
        }
    }

    public C6257f(@NotNull a aVar, @NotNull A8.h hVar) {
        this.f96033a = aVar;
        this.f96034b = hVar;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Pu0.c cVar = (Pu0.c) viewBinding;
        Pu0.b bVar = cVar.f19312d;
        bVar.f19304b.setRotation(180.0f);
        View view = cVar.f19310b;
        ConstraintLayout constraintLayout = cVar.f19309a;
        Context context = constraintLayout.getContext();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = NewPlayerUtilsKt.toPx(40.0f) + (RangesKt.coerceAtMost(ScreenUtil.getScreenWidth(context), DimenUtilsKt.dpToPx(496)) - NewPlayerUtilsKt.toPx(12.0f));
        view.setLayoutParams(layoutParams);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new PlaylistFloatingUIComponent$bind$3(bVar, this, constraintLayout, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return Pu0.c.inflate(layoutInflater, viewGroup, false);
    }
}
