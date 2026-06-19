package com.bilibili.playerbizcommonv2.widget.setting;

import F3.C1867y;
import F3.C1874z;
import M3.C2592k;
import WQ.r4;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.playerbizcommonv2.widget.setting.channel.SingleExposeEntry;
import com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingType;
import com.bilibili.playerbizcommonv2.widget.setting.channel.h;
import com.bilibili.playerbizcommonv2.widget.setting.channel.t;
import com.bilibili.playerbizcommonv2.widget.setting.channel.x;
import java.util.List;
import java.util.Map;
import kntr.base.localization.Locale;
import kntr.base.localization.Localization;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/W.class */
@StabilityInferred(parameters = 1)
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f83163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<String, Unit> f83164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function1<Map<String, String>, Unit> f83165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function1<Map<String, String>, Unit> f83166d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/W$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f83167a;

        static {
            int[] iArr = new int[VideoSettingJumpType.values().length];
            try {
                iArr[VideoSettingJumpType.WEB_IN_BROWSER.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[VideoSettingJumpType.WEB_IN_HALF.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f83167a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public W(@NotNull Function0<Unit> function0, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Map<String, String>, Unit> function12, @NotNull Function1<? super Map<String, String>, Unit> function13) {
        this.f83163a = function0;
        this.f83164b = function1;
        this.f83165c = function12;
        this.f83166d = function13;
    }

    public static com.bilibili.playerbizcommonv2.widget.setting.channel.c a(W w7, X x6, b0 b0Var, MutableStateFlow mutableStateFlow, r4 r4Var, Function0 function0, Function1 function1, Function1 function12, int i7) {
        if ((i7 & 4) != 0) {
            mutableStateFlow = StateFlowKt.MutableStateFlow(x6.f83169b);
        }
        if ((i7 & 8) != 0) {
            r4Var = new C2592k(2);
        }
        if ((i7 & 16) != 0) {
            function0 = new C1874z(13);
        }
        if ((i7 & 32) != 0) {
            function1 = w7.f83165c;
        }
        Function1<Map<String, String>, Unit> function13 = w7.f83166d;
        if ((i7 & 256) != 0) {
            function12 = new VideoSettingAdapter$createButtonComponentData$3(null);
        }
        w7.getClass();
        return new com.bilibili.playerbizcommonv2.widget.setting.channel.c(x6.f83168a, x6.f83172e, b0Var.f83198d, mutableStateFlow, new U(function1, x6, r4Var, true, w7, b0Var, function0), function12, new SingleExposeEntry(new com.bilibili.app.authorspace.local.e(1, function13, x6)));
    }

    public static com.bilibili.playerbizcommonv2.widget.setting.channel.h b(final W w7, final X x6, final Z z6, VideoSettingType videoSettingType, StateFlow stateFlow, StateFlow stateFlow2, Function1 function1, Function0 function0, Function0 function02, int i7) {
        if ((i7 & 8) != 0) {
            stateFlow = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        }
        if ((i7 & 16) != 0) {
            stateFlow2 = StateFlowKt.MutableStateFlow(z6.f83177b);
        }
        if ((i7 & 32) != 0) {
            function1 = w7.f83165c;
        }
        Function1<Map<String, String>, Unit> function12 = w7.f83166d;
        if ((i7 & 256) != 0) {
            function0 = new C2592k(2);
        }
        if ((i7 & 1024) != 0) {
            function02 = new C1867y(11);
        }
        w7.getClass();
        final Function1 function13 = function1;
        final Function0 function03 = function0;
        final boolean z7 = true;
        final Function0 function04 = function02;
        return new com.bilibili.playerbizcommonv2.widget.setting.channel.h(new h.a(x6.f83169b, x6.f83168a, null, stateFlow, stateFlow2, z6.f83178c, x6.h, new Function0(function13, x6, function03, z7, w7, z6, function04) { // from class: com.bilibili.playerbizcommonv2.widget.setting.T

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Function1 f83147a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final X f83148b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Function0 f83149c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final boolean f83150d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final W f83151e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final Z f83152f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Function0 f83153g;

            {
                this.f83147a = function13;
                this.f83148b = x6;
                this.f83149c = function03;
                this.f83150d = z7;
                this.f83151e = w7;
                this.f83152f = z6;
                this.f83153g = function04;
            }

            public final Object invoke() {
                Unit unit;
                X x7 = this.f83148b;
                this.f83147a.invoke(x7.f83174g);
                boolean zBooleanValue = ((Boolean) this.f83149c.invoke()).booleanValue();
                boolean z8 = this.f83150d;
                W w8 = this.f83151e;
                if (zBooleanValue) {
                    if (z8) {
                        w8.f83163a.invoke();
                    }
                    unit = Unit.INSTANCE;
                } else {
                    Z z9 = this.f83152f;
                    if (!w8.e(x7, z9.f83176a, z9.f83180e, z9.f83179d)) {
                        this.f83153g.invoke();
                    }
                    if (z8) {
                        w8.f83163a.invoke();
                    }
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }, null, z6.f83181f, 0, 0, 0, 0, videoSettingType, x6.f83173f ? new SingleExposeEntry(new com.bilibili.app.authorspace.local.c(2, function12, x6)) : null, 30756));
    }

    public static com.bilibili.app.gemini.ui.m c(W w7, X x6, VideoSettingType videoSettingType, List list, StateFlow stateFlow, int i7, Function1 function1, int i8) {
        if ((i8 & 16) != 0) {
            i7 = 0;
        }
        w7.getClass();
        t.b bVar = new t.b(x6.f83169b, x6.f83168a, null, 16, -10, list, stateFlow, i7, function1, 0, 0, 0, 0, 0, 0, 0, videoSettingType, false, 392204);
        return kntr.base.localization.q.c((Locale) Localization.INSTANCE.getLocaleFlow().getValue()) ? new com.bilibili.playerbizcommonv2.widget.setting.channel.t(bVar) : new com.bilibili.playerbizcommonv2.widget.setting.channel.o(bVar);
    }

    public static com.bilibili.playerbizcommonv2.widget.setting.channel.x d(W w7, X x6, a0 a0Var, VideoSettingType videoSettingType, StateFlow stateFlow, Function0 function0, Function0 function02, final Function0 function03, int i7) {
        if ((i7 & 32) != 0) {
            function0 = null;
        }
        if ((i7 & 64) != 0) {
            function02 = null;
        }
        w7.getClass();
        String str = x6.f83169b;
        String str2 = x6.h;
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        final int i8 = 0;
        return new com.bilibili.playerbizcommonv2.widget.setting.channel.x(new x.a(str, x6.f83168a, null, stateFlow, new Function0(function03, i8) { // from class: com.bilibili.playerbizcommonv2.widget.setting.V

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f83161a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Function0 f83162b;

            {
                this.f83161a = i8;
                this.f83162b = function03;
            }

            public final Object invoke() {
                switch (this.f83161a) {
                    case 0:
                        this.f83162b.invoke();
                        break;
                    default:
                        this.f83162b.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        }, a0Var.f83189a, str3, function02, false, 0, 0, 0, 0, 0, 0, videoSettingType, function0, 32260));
    }

    public final boolean e(X x6, String str, VideoSettingJumpType videoSettingJumpType, boolean z6) {
        if (x6.f83170c) {
            bilibili.live.app.service.resolver.b.a(new StringBuilder("click disabled setting, "), x6.f83169b, "VideoSettingAdapter");
            com.bilibili.playerbizcommonv2.utils.p.k(x6.f83171d);
            return true;
        }
        if (z6 && !com.bilibili.playerbizcommonv2.utils.p.b(FoundationAlias.getFapp())) {
            BLog.i("VideoSettingAdapter", "click setting with url, need login");
            return true;
        }
        if (StringsKt.isBlank(str)) {
            return false;
        }
        BLog.i("VideoSettingAdapter", "click setting with url, " + str + " " + videoSettingJumpType);
        int i7 = a.f83167a[videoSettingJumpType.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                BLRouter.routeTo(ec.c.a(str), FoundationAlias.getFapp());
                return true;
            }
            this.f83164b.invoke(str);
            return true;
        }
        try {
            Application fapp = FoundationAlias.getFapp();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE);
            fapp.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e7) {
            BLog.e("VideoSettingAdapter", str + " cannot be opened through the system's default browser ");
            return true;
        }
    }
}
