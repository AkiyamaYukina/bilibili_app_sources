package com.bilibili.ship.theseus.united.page.intro.module.relate.cheese;

import I.E;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.i;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.framework.exposure.core.ExposureEntryV;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.playerbizcommon.utils.PlayerExtensionsKt;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6302a;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6306c;
import com.bilibili.ship.theseus.united.page.intro.module.relate.z0;
import com.bilibili.ship.theseus.united.page.view.StatInfoData;
import dv0.C6858c0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.ForegroundConstraintLayout;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.bili.widget.text.TintFixedLineSpacingTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/cheese/a.class */
@StabilityInferred(parameters = 0)
public final class a extends m<C6858c0> implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ExposureEntryV f101148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C1043a f101149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<c> f101150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SharedFlow<c> f101151d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.cheese.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/cheese/a$a.class */
    @StabilityInferred(parameters = 0)
    public static final class C1043a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f101152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f101153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f101154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f101155d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final StatInfoData f101156e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f101157f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final String f101158g;

        @Nullable
        public final C6302a h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final C6302a f101159i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f101160j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final b f101161k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f101162l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f101163m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public final String f101164n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        public final C6306c f101165o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f101166p;

        public C1043a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull StatInfoData statInfoData, @NotNull String str5, @NotNull String str6, @Nullable C6302a c6302a, @Nullable C6302a c6302a2, boolean z6, @NotNull b bVar, boolean z7, int i7, @NotNull String str7, @NotNull C6306c c6306c, boolean z8) {
            this.f101152a = str;
            this.f101153b = str2;
            this.f101154c = str3;
            this.f101155d = str4;
            this.f101156e = statInfoData;
            this.f101157f = str5;
            this.f101158g = str6;
            this.h = c6302a;
            this.f101159i = c6302a2;
            this.f101160j = z6;
            this.f101161k = bVar;
            this.f101162l = z7;
            this.f101163m = i7;
            this.f101164n = str7;
            this.f101165o = c6306c;
            this.f101166p = z8;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1043a)) {
                return false;
            }
            C1043a c1043a = (C1043a) obj;
            return Intrinsics.areEqual(this.f101152a, c1043a.f101152a) && Intrinsics.areEqual(this.f101153b, c1043a.f101153b) && Intrinsics.areEqual(this.f101154c, c1043a.f101154c) && Intrinsics.areEqual(this.f101155d, c1043a.f101155d) && Intrinsics.areEqual(this.f101156e, c1043a.f101156e) && Intrinsics.areEqual(this.f101157f, c1043a.f101157f) && Intrinsics.areEqual(this.f101158g, c1043a.f101158g) && Intrinsics.areEqual(this.h, c1043a.h) && Intrinsics.areEqual(this.f101159i, c1043a.f101159i) && this.f101160j == c1043a.f101160j && Intrinsics.areEqual(this.f101161k, c1043a.f101161k) && this.f101162l == c1043a.f101162l && this.f101163m == c1043a.f101163m && Intrinsics.areEqual(this.f101164n, c1043a.f101164n) && Intrinsics.areEqual(this.f101165o, c1043a.f101165o) && this.f101166p == c1043a.f101166p;
        }

        public final int hashCode() {
            int iA = z.a(E.a(E.a((this.f101156e.hashCode() + E.a(E.a(E.a(this.f101152a.hashCode() * 31, 31, this.f101153b), 31, this.f101154c), 31, this.f101155d)) * 31, 31, this.f101157f), 31, this.f101158g), 31, true);
            int iHashCode = 0;
            C6302a c6302a = this.h;
            int iHashCode2 = c6302a == null ? 0 : c6302a.hashCode();
            C6302a c6302a2 = this.f101159i;
            if (c6302a2 != null) {
                iHashCode = c6302a2.hashCode();
            }
            return Boolean.hashCode(this.f101166p) + ((this.f101165o.hashCode() + E.a(I.a(this.f101163m, z.a((this.f101161k.hashCode() + z.a((((iA + iHashCode2) * 31) + iHashCode) * 31, 31, this.f101160j)) * 31, 31, this.f101162l), 31), 31, this.f101164n)) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("CheeseCardData(cover=");
            sb.append(this.f101152a);
            sb.append(", coverGif=");
            sb.append(this.f101153b);
            sb.append(", title=");
            sb.append(this.f101154c);
            sb.append(", author=");
            sb.append(this.f101155d);
            sb.append(", viewTime=");
            sb.append(this.f101156e);
            sb.append(", danmakus=");
            sb.append(this.f101157f);
            sb.append(", duration=");
            sb.append(this.f101158g);
            sb.append(", showUpName=true, badgeInfo=");
            sb.append(this.h);
            sb.append(", recommendReason=");
            sb.append(this.f101159i);
            sb.append(", isWatched=");
            sb.append(this.f101160j);
            sb.append(", colors=");
            sb.append(this.f101161k);
            sb.append(", showMore=");
            sb.append(this.f101162l);
            sb.append(", style=");
            sb.append(this.f101163m);
            sb.append(", coverRightText=");
            sb.append(this.f101164n);
            sb.append(", coverDimension=");
            sb.append(this.f101165o);
            sb.append(", showRcmdStyle=");
            return i.a(sb, this.f101166p, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/cheese/a$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Integer f101167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Integer f101168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Integer f101169c;

        public b(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
            this.f101167a = num;
            this.f101168b = num2;
            this.f101169c = num3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f101167a, bVar.f101167a) && Intrinsics.areEqual(this.f101168b, bVar.f101168b) && Intrinsics.areEqual(this.f101169c, bVar.f101169c);
        }

        public final int hashCode() {
            int iHashCode = 0;
            Integer num = this.f101167a;
            int iHashCode2 = num == null ? 0 : num.hashCode();
            Integer num2 = this.f101168b;
            int iHashCode3 = num2 == null ? 0 : num2.hashCode();
            Integer num3 = this.f101169c;
            if (num3 != null) {
                iHashCode = num3.hashCode();
            }
            return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Colors(textColorInt=");
            sb.append(this.f101167a);
            sb.append(", lightTextColorInt=");
            sb.append(this.f101168b);
            sb.append(", dividerColorColorInt=");
            return e4.c.a(sb, this.f101169c, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/cheese/a$c.class */
    @StabilityInferred(parameters = 1)
    public static abstract class c {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.cheese.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/cheese/a$c$a.class */
        @StabilityInferred(parameters = 0)
        public static final class C1044a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final Rect f101170a;

            public C1044a(@NotNull Rect rect) {
                this.f101170a = rect;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/cheese/a$c$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f101171a = new c();
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.cheese.a$c$c, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/cheese/a$c$c.class */
        @StabilityInferred(parameters = 0)
        public static final class C1045c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final Rect f101172a;

            public C1045c(@NotNull Rect rect) {
                this.f101172a = rect;
            }
        }
    }

    public a(@NotNull ExposureEntryV exposureEntryV, @NotNull C1043a c1043a) {
        this.f101148a = exposureEntryV;
        this.f101149b = c1043a;
        MutableSharedFlow<c> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(0, 4, BufferOverflow.DROP_OLDEST);
        this.f101150c = MutableSharedFlow;
        this.f101151d = FlowKt.asSharedFlow(MutableSharedFlow);
    }

    public static final void c(TintFixedLineSpacingTextView tintFixedLineSpacingTextView, Context context, VectorTextView vectorTextView, VectorTextView vectorTextView2, VectorTextView vectorTextView3, TintImageView tintImageView, b bVar, boolean z6, boolean z7) {
        Integer num = bVar.f101167a;
        tintFixedLineSpacingTextView.setTextColor(num != null ? num.intValue() : z6 ? ContextCompat.getColor(context, 2131100812) : ContextCompat.getColor(context, R$color.Ga10));
        Integer num2 = bVar.f101168b;
        int iIntValue = num2 != null ? num2.intValue() : ContextCompat.getColor(context, R$color.Ga5);
        vectorTextView.setTextColor(iIntValue);
        vectorTextView2.setTextColor(iIntValue);
        vectorTextView3.setTextColor(iIntValue);
        tintImageView.setColorFilter(iIntValue);
        Drawable drawable = z7 ? AppCompatResources.getDrawable(context, 2131235257) : AppCompatResources.getDrawable(context, 2131235038);
        int iDip2px = ScreenUtil.dip2px(context, 16.0f);
        rh1.a.a(vectorTextView, iDip2px, drawable, iIntValue);
        rh1.a.a(vectorTextView2, iDip2px, AppCompatResources.getDrawable(context, 2131235033), iIntValue);
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        C6858c0 c6858c0 = (C6858c0) viewBinding;
        ForegroundConstraintLayout foregroundConstraintLayout = c6858c0.f116923a;
        Context context = foregroundConstraintLayout.getContext();
        TextView textView = c6858c0.f116927e;
        TintTextView tintTextView = c6858c0.f116931j;
        PlayerExtensionsKt.setGone(tintTextView);
        TintTextView tintTextView2 = c6858c0.f116932k;
        PlayerExtensionsKt.setGone(tintTextView2);
        if (!this.f101149b.f101166p) {
            tintTextView2 = tintTextView;
        }
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new RelatedCheeseComponent$bind$2(c6858c0.f116926d, this, c6858c0.f116933l, c6858c0.f116924b, c6858c0.f116928f, textView, c6858c0.f116925c, c6858c0.h, tintTextView2, c6858c0.f116930i, c6858c0.f116929g, context, c6858c0, foregroundConstraintLayout, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C6858c0.inflate(layoutInflater, viewGroup, false);
    }
}
