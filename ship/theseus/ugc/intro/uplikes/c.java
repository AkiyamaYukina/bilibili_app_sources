package com.bilibili.ship.theseus.ugc.intro.uplikes;

import I.E;
import Vu0.I;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.widget.BubbleBackgroundConstraintLayout;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.n;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.RoundingParams;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/c.class */
@StabilityInferred(parameters = 0)
public final class c implements UIComponent<n<I>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StateFlow<b> f97703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f97704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f97705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<a> f97706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final SharedFlow<a> f97707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f97708f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/c$a.class */
    @StabilityInferred(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/c$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0888a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0888a f97709a = new a();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/c$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f97710a = new a();
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.c$a$c, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/c$a$c.class */
        @StabilityInferred(parameters = 1)
        public static final class C0889c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0889c f97711a = new a();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/c$b.class */
    @StabilityInferred(parameters = 1)
    public static abstract class b {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/c$b$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f97712a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final String f97713b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final String f97714c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public final String f97715d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @NotNull
            public final String f97716e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final boolean f97717f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @NotNull
            public final String f97718g;
            public final boolean h;

            public a() {
                this("", "", "", "", "", "", false, false);
            }

            public a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z6, boolean z7) {
                this.f97712a = str;
                this.f97713b = str2;
                this.f97714c = str3;
                this.f97715d = str4;
                this.f97716e = str5;
                this.f97717f = z6;
                this.f97718g = str6;
                this.h = z7;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f97712a, aVar.f97712a) && Intrinsics.areEqual(this.f97713b, aVar.f97713b) && Intrinsics.areEqual(this.f97714c, aVar.f97714c) && Intrinsics.areEqual(this.f97715d, aVar.f97715d) && Intrinsics.areEqual(this.f97716e, aVar.f97716e) && this.f97717f == aVar.f97717f && Intrinsics.areEqual(this.f97718g, aVar.f97718g) && this.h == aVar.h;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.h) + E.a(z.a(E.a(E.a(E.a(E.a(this.f97712a.hashCode() * 31, 31, this.f97713b), 31, this.f97714c), 31, this.f97715d), 31, this.f97716e), 31, this.f97717f), 31, this.f97718g);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(name=");
                sb.append(this.f97712a);
                sb.append(", icon0Path=");
                sb.append(this.f97713b);
                sb.append(", icon1Path=");
                sb.append(this.f97714c);
                sb.append(", icon2Path=");
                sb.append(this.f97715d);
                sb.append(", icon3Path=");
                sb.append(this.f97716e);
                sb.append(", icon4Visible=");
                sb.append(this.f97717f);
                sb.append(", msg=");
                sb.append(this.f97718g);
                sb.append(", moreVisible=");
                return androidx.appcompat.app.i.a(sb, this.h, ")");
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.c$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/c$b$b.class */
        @StabilityInferred(parameters = 1)
        public static final class C0890b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0890b f97719a = new b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull StateFlow<? extends b> stateFlow, @NotNull StateFlow<Boolean> stateFlow2, @NotNull StateFlow<Integer> stateFlow3) {
        this.f97703a = stateFlow;
        this.f97704b = stateFlow2;
        this.f97705c = stateFlow3;
        MutableSharedFlow<a> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 3, (BufferOverflow) null, 5, (Object) null);
        this.f97706d = mutableSharedFlowMutableSharedFlow$default;
        this.f97707e = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.f97708f = new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new com.bilibili.ship.theseus.ugc.intro.uplikes.a(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(android.content.Context r8, kotlin.jvm.internal.Ref.IntRef r9, final Vu0.I r10, com.bilibili.ship.theseus.ugc.intro.uplikes.c r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.uplikes.c.a(android.content.Context, kotlin.jvm.internal.Ref$IntRef, Vu0.I, com.bilibili.ship.theseus.ugc.intro.uplikes.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void b(BiliImageView biliImageView, Context context, String str) {
        if (str.length() == 0) {
            biliImageView.setVisibility(8);
        } else {
            biliImageView.setVisibility(0);
            BiliImageLoader.INSTANCE.with(context).url(str).roundingParams(RoundingParams.Companion.asCircle().setBorder(ThemeUtils.getColorById(context, R$color.f64616Wh0), ScreenUtil.dip2px(context, 1.0f))).into(biliImageView);
        }
    }

    public static final void c(I i7, int i8) {
        ViewGroup.LayoutParams layoutParams = i7.f25842n.getLayoutParams();
        if (layoutParams.width != i8) {
            layoutParams.width = i8;
            i7.f25842n.setLayoutParams(layoutParams);
        }
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        n nVar = (n) viewEntry;
        I i7 = (I) nVar.a;
        BubbleBackgroundConstraintLayout bubbleBackgroundConstraintLayout = i7.f25830a;
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UgcUpLikesComponent$bindToView$2(i7, this, bubbleBackgroundConstraintLayout, nVar, bubbleBackgroundConstraintLayout.getContext(), new Ref.IntRef(), null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new n(I.inflate(LayoutInflater.from(context), viewGroup, false));
    }
}
