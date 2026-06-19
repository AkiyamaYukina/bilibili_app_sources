package com.bilibili.search2.result.holder.author;

import Pb.F;
import Pb.G;
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.PopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.config.BLRemoteConfig;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.search2.result.holder.author.n;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.fullscreen.state.d0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/n.class */
@StabilityInferred(parameters = 0)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f87881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public PopupWindow f87882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f87883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SearchAuthorShareGuide f87884d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/n$a.class */
    public static final class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f87885a;

        public a(n nVar) {
            this.f87885a = nVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            PopupWindow popupWindow = this.f87885a.f87882b;
            if (popupWindow != null) {
                Contract contractAb = ConfigManager.Companion.ab();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
                    Thread threadCurrentThread = Thread.currentThread();
                    if (!androidx.appcompat.app.n.a(threadCurrentThread)) {
                        IllegalStateException illegalStateException = new IllegalStateException(F.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                        Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
                    }
                }
                popupWindow.dismiss();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public n(@NotNull Context context) {
        Object searchAuthorShareGuide;
        this.f87881a = context;
        final int i7 = 0;
        this.f87883c = ListExtentionsKt.lazyUnsafe(new Function0(this, i7) { // from class: com.bilibili.search2.result.holder.author.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f87872a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f87873b;

            {
                this.f87872a = i7;
                this.f87873b = this;
            }

            public final Object invoke() {
                switch (this.f87872a) {
                    case 0:
                        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 0, 0.0f, 0, ListExtentionsKt.toPx(5));
                        translateAnimation.setDuration(1000L);
                        translateAnimation.setRepeatMode(2);
                        n nVar = (n) this.f87873b;
                        translateAnimation.setRepeatCount(nVar.f87884d.getAuthorShareGuideTime());
                        translateAnimation.setAnimationListener(new n.a(nVar));
                        return translateAnimation;
                    default:
                        ((Function1) this.f87873b).invoke(d0.a);
                        return Unit.INSTANCE;
                }
            }
        });
        String string = BLRemoteConfig.getInstance().getString("search_author_share_guide");
        if (string == null || StringsKt.isBlank(string)) {
            BLog.w("BLRemoteConfigUtil", "get search_author_share_guide BLRemote config json string null");
            searchAuthorShareGuide = new SearchAuthorShareGuide();
        } else {
            searchAuthorShareGuide = com.bilibili.app.comm.list.common.utils.a.b(string, "search_author_share_guide", SearchAuthorShareGuide.class, new SearchAuthorShareGuide());
        }
        this.f87884d = (SearchAuthorShareGuide) searchAuthorShareGuide;
    }
}
