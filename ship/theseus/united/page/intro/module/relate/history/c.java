package com.bilibili.ship.theseus.united.page.intro.module.relate.history;

import AX.g;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.bililive.room.ui.roomv3.setting.i;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.ExposureEntryV;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintProgressBar;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.playerbizcommonv2.utils.p;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6306c;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6327n;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6328o;
import com.bilibili.ship.theseus.united.page.intro.module.relate.InterfaceC6308d;
import com.bilibili.ship.theseus.united.page.intro.module.relate.Y;
import com.bilibili.ship.theseus.united.page.intro.module.relate.z0;
import dv0.C6862e0;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.widget.ForegroundConstraintLayout;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.bili.widget.text.TintFixedLineSpacingTextView;
import zK.y;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/history/c.class */
@StabilityInferred(parameters = 0)
public final class c extends m<C6862e0> implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f101230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ExposureEntryV f101231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C6327n f101232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C6328o f101233d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/history/c$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f101234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f101235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f101236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f101237d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f101238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f101239f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final String f101240g;
        public final boolean h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow f101241i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final double f101242j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final C6306c f101243k;

        public a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z6, @NotNull MutableStateFlow mutableStateFlow, double d7, @NotNull C6306c c6306c) {
            this.f101234a = str;
            this.f101235b = str2;
            this.f101236c = str3;
            this.f101237d = str4;
            this.f101238e = str5;
            this.f101239f = str6;
            this.f101240g = str7;
            this.h = z6;
            this.f101241i = mutableStateFlow;
            this.f101242j = d7;
            this.f101243k = c6306c;
        }
    }

    public c(@NotNull a aVar, @NotNull ExposureEntryV exposureEntryV, @NotNull C6327n c6327n, @NotNull C6328o c6328o) {
        this.f101230a = aVar;
        this.f101231b = exposureEntryV;
        this.f101232c = c6327n;
        this.f101233d = c6328o;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        C6862e0 c6862e0 = (C6862e0) viewBinding;
        ForegroundConstraintLayout foregroundConstraintLayout = c6862e0.f116962a;
        Context context = foregroundConstraintLayout.getContext();
        TextView textView = c6862e0.f116966e;
        InterfaceC6308d.a aVar = InterfaceC6308d.f101173a;
        a aVar2 = this.f101230a;
        C6306c c6306c = aVar2.f101243k;
        CardView cardView = c6862e0.f116965d;
        aVar.getClass();
        InterfaceC6308d.a.d(cardView, c6306c);
        StringBuilder sb = new StringBuilder("视频，");
        String str = aVar2.f101234a;
        sb.append(str);
        sb.append("，up主");
        String str2 = aVar2.f101235b;
        sb.append(str2);
        g.a(foregroundConstraintLayout, sb.toString());
        ImageExtentionKt.displayImageWithGif$default(c6862e0.f116964c, aVar2.f101236c, aVar2.f101237d, (Function0) null, (Function0) null, 0, 0, (ImageLoadingListener) null, (ImageLoadingListener) null, false, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_SEGMENT_RESULT_BLUR, (Object) null);
        TintFixedLineSpacingTextView tintFixedLineSpacingTextView = c6862e0.f116969i;
        tintFixedLineSpacingTextView.setText(str);
        VectorTextView vectorTextView = c6862e0.f116963b;
        vectorTextView.setText(str2);
        String str3 = aVar2.f101238e;
        textView.setText(str3);
        textView.setVisibility(!StringsKt.isBlank(str3) ? 0 : 8);
        double d7 = aVar2.f101242j;
        TintProgressBar tintProgressBar = c6862e0.h;
        if (d7 <= 0.0d || d7 >= 100.0d) {
            Lazy lazy = p.f81943a;
            tintProgressBar.setVisibility(4);
        } else {
            Lazy lazy2 = p.f81943a;
            tintProgressBar.setVisibility(0);
            tintProgressBar.setProgress(RangesKt.coerceAtMost(MathKt.roundToInt(((double) 100) * d7), 100));
        }
        int i7 = 8;
        if (aVar2.h) {
            i7 = 0;
        }
        final TintImageView tintImageView = c6862e0.f116968g;
        tintImageView.setVisibility(i7);
        c6862e0.f116970j.setText(aVar2.f101239f);
        BiliImageLoader.INSTANCE.with(context).url(aVar2.f101240g).into(c6862e0.f116971k);
        int iDpToPx = DimenUtilsKt.dpToPx(aVar2.f101243k.f101145b);
        List listEmptyList = CollectionsKt.emptyList();
        List listListOf = CollectionsKt.listOf(new Integer[]{Boxing.boxInt(c6862e0.f116967f.getId()), Boxing.boxInt(vectorTextView.getId())});
        ForegroundConstraintLayout foregroundConstraintLayout2 = c6862e0.f116962a;
        if (foregroundConstraintLayout2 != null) {
            int iCoerceAtLeast = RangesKt.coerceAtLeast(iDpToPx, InterfaceC6308d.a.f101175b);
            InterfaceC6308d.a aVar3 = InterfaceC6308d.a.f101174a;
            boolean zB = InterfaceC6308d.a.b(foregroundConstraintLayout2, listEmptyList);
            boolean zB2 = InterfaceC6308d.a.b(foregroundConstraintLayout2, listListOf);
            boolean z6 = zB;
            if (iCoerceAtLeast < InterfaceC6308d.a.f101177d) {
                z6 = zB;
                if (zB) {
                    z6 = zB;
                    if (zB2) {
                        InterfaceC6308d.a.c(foregroundConstraintLayout2, listEmptyList);
                        z6 = false;
                    }
                }
            }
            if (iCoerceAtLeast < InterfaceC6308d.a.f101176c) {
                if (z6) {
                    InterfaceC6308d.a.c(foregroundConstraintLayout2, listEmptyList);
                }
                if (zB2) {
                    InterfaceC6308d.a.c(foregroundConstraintLayout2, listListOf);
                }
            }
        }
        final int i8 = 0;
        tintImageView.setOnClickListener(new View.OnClickListener(i8, this, tintImageView) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.history.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f101225a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f101226b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f101227c;

            {
                this.f101225a = i8;
                this.f101226b = this;
                this.f101227c = tintImageView;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f101225a) {
                    case 0:
                        ((c) this.f101226b).f101233d.invoke(Y.a((TintImageView) this.f101227c), Boolean.FALSE);
                        break;
                    default:
                        y yVar = (y) this.f101226b;
                        i iVar = (i) this.f101227c;
                        yVar.d = !yVar.d;
                        iVar.c.invoke(yVar);
                        break;
                }
            }
        });
        foregroundConstraintLayout.setOnClickListener(new com.bilibili.app.comm.ugc.miniplayer.common.d(this, 1));
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(foregroundConstraintLayout, this.f101231b);
        foregroundConstraintLayout.setOnLongClickListener(new View.OnLongClickListener(this, tintImageView) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.history.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final c f101228a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TintImageView f101229b;

            {
                this.f101228a = this;
                this.f101229b = tintImageView;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                this.f101228a.f101233d.invoke(Y.a(this.f101229b), Boolean.TRUE);
                return true;
            }
        });
        Object objCollectLatest = FlowKt.collectLatest(aVar2.f101241i, new RelateHistoryAvComponent$bind$5(tintFixedLineSpacingTextView, context, null), continuation);
        if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCollectLatest = Unit.INSTANCE;
        }
        return objCollectLatest;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C6862e0.inflate(layoutInflater, viewGroup, false);
    }
}
