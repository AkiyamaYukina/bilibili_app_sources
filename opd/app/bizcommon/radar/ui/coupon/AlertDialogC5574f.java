package com.bilibili.opd.app.bizcommon.radar.ui.coupon;

import ES0.q0;
import ES0.s0;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.api.base.Config;
import com.bilibili.bplus.im.aichat.conversation.M;
import com.bilibili.lib.gripper.api.hiltlike.Component_jvmKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.opd.app.bizcommon.context.download.KtExtensionKt;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerAction;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerContent;
import dagger.internal.Preconditions;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kntr.app.tribee.search.viewModels.TribeeSearchViewModel;
import kntr.base.hilt.component.HiltSingletonComponent_androidKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.a;

/* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.radar.ui.coupon.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/f.class */
@StabilityInferred(parameters = 0)
public final class AlertDialogC5574f extends in0.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final RadarTriggerContent f74265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final dn0.d f74266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f74267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f74268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f74269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f74270n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f74271o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Lazy f74272p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Lazy f74273q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Lazy f74274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Lazy f74275s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Lazy f74276t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f74277u;

    public AlertDialogC5574f(@NotNull RadarTriggerContent radarTriggerContent, @NotNull Context context, @NotNull String str, @NotNull dn0.d dVar) {
        super(radarTriggerContent, context, str);
        this.f74265i = radarTriggerContent;
        this.f74266j = dVar;
        this.f74267k = LazyKt.lazy(new q0(this, 4));
        this.f74268l = LazyKt.lazy(new Ji.g(this, 2));
        this.f74269m = LazyKt.lazy(new C5573e(this));
        this.f74270n = LazyKt.lazy(new GE.d(this, 5));
        this.f74271o = LazyKt.lazy(new Od1.k(this, 3));
        this.f74272p = LazyKt.lazy(new Ji.m(this, 2));
        this.f74273q = LazyKt.lazy(new Be1.j(this, 2));
        this.f74274r = LazyKt.lazy(new Be1.k(this, 2));
        this.f74275s = LazyKt.lazy(new Be1.l(this, 6));
        this.f74276t = LazyKt.lazy(new Be1.m(this, 6));
    }

    @Override // in0.e
    @Nullable
    public final View b() {
        return null;
    }

    public final void k(final RadarTriggerAction radarTriggerAction, boolean z6, TextView textView) {
        if (z6) {
            textView.setBackground(ContextCompat.getDrawable(getContext(), 2131237547));
            textView.setTextColor(ThemeUtils.getColorById(getContext(), R$color.f64616Wh0));
        } else {
            textView.setBackground(ContextCompat.getDrawable(getContext(), 2131237549));
            textView.setTextColor(ThemeUtils.getColorById(getContext(), R$color.Ga7));
        }
        textView.setOnClickListener(new View.OnClickListener(radarTriggerAction, this) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RadarTriggerAction f74261a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AlertDialogC5574f f74262b;

            {
                this.f74261a = radarTriggerAction;
                this.f74262b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RadarTriggerAction radarTriggerAction2 = this.f74261a;
                AlertDialogC5574f alertDialogC5574f = this.f74262b;
                if (KtExtensionKt.isNotNullAndNotEmpty(radarTriggerAction2.getActionUrl())) {
                    in0.e.i(alertDialogC5574f, radarTriggerAction2.getActionUrl(), radarTriggerAction2.getActionId(), radarTriggerAction2.getJumpAction(), 0, null, 24);
                    return;
                }
                int noUrlClickClose = alertDialogC5574f.f74265i.getNoUrlClickClose();
                if (noUrlClickClose == 0) {
                    if (Config.isDebuggable()) {
                        BLog.d("nov_test", "no dismiss dialog");
                        return;
                    }
                    return;
                }
                if (noUrlClickClose != 1) {
                    alertDialogC5574f.f("");
                    return;
                }
                if (!Intrinsics.areEqual(radarTriggerAction2.getPageAction(), "CLOSE_CURRENT_PAGE")) {
                    String actionId = radarTriggerAction2.getActionId();
                    alertDialogC5574f.f(actionId != null ? actionId : "");
                } else {
                    alertDialogC5574f.f74277u = true;
                    String actionId2 = radarTriggerAction2.getActionId();
                    alertDialogC5574f.f(actionId2 != null ? actionId2 : "");
                }
            }
        });
    }

    @Override // in0.e, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        Object obj;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setDimAmount(0.8f);
        }
        setContentView(2131499185);
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(JSON.parseObject(this.f74265i.getExtra()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.isSuccess-impl(obj)) {
            JSONObject jSONObject = (JSONObject) obj;
            String string = jSONObject != null ? jSONObject.getString(TextSource.CFG_CONTENT) : null;
            Long l7 = jSONObject != null ? jSONObject.getLong("remainSecond") : null;
            String string2 = jSONObject != null ? jSONObject.getString("couponDesc") : null;
            String string3 = jSONObject != null ? jSONObject.getString("discount") : null;
            String string4 = jSONObject != null ? jSONObject.getString("discountCondition") : null;
            String string5 = jSONObject != null ? jSONObject.getString("couponUsageTime") : null;
            RadarCouponCountDownView radarCouponCountDownView = (RadarCouponCountDownView) this.f74267k.getValue();
            String str = string == null ? "" : string;
            long jLongValue = l7 != null ? l7.longValue() : 0L;
            radarCouponCountDownView.getClass();
            if (StringsKt.n(str, "%remainSecond")) {
                List listR = StringsKt.R(str, new String[]{"%remainSecond"}, 0, 6);
                String str2 = (String) CollectionsKt.getOrNull(listR, 0);
                String str3 = str2;
                if (str2 == null) {
                    str3 = "";
                }
                String str4 = (String) CollectionsKt.getOrNull(listR, 1);
                if (str4 == null) {
                    str4 = "";
                }
                Group group = radarCouponCountDownView.f74251g;
                if (group == null || group.getVisibility() == 0) {
                    group = null;
                }
                if (group != null) {
                    group.setVisibility(0);
                }
                TintTextView tintTextView = radarCouponCountDownView.f74245a;
                if (tintTextView != null) {
                    tintTextView.setText(str3);
                }
                TintTextView tintTextView2 = radarCouponCountDownView.f74250f;
                if (tintTextView2 != null) {
                    tintTextView2.setText(str4);
                }
                Disposable disposable = radarCouponCountDownView.h;
                if (disposable != null) {
                    disposable.dispose();
                }
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (jLongValue < 0) {
                    jLongValue = 0;
                }
                radarCouponCountDownView.h = Observable.interval(0L, 1L, timeUnit).subscribeOn(AndroidSchedulers.mainThread()).observeOn(AndroidSchedulers.mainThread()).map(new Zm0.b(jLongValue)).take(jLongValue + 1).subscribe(new QK.h(radarCouponCountDownView, 1));
            } else {
                Group group2 = radarCouponCountDownView.f74251g;
                if (group2 == null || group2.getVisibility() == 8) {
                    group2 = null;
                }
                if (group2 != null) {
                    group2.setVisibility(8);
                }
                TintTextView tintTextView3 = radarCouponCountDownView.f74245a;
                if (tintTextView3 != null) {
                    tintTextView3.setText(str);
                }
            }
            boolean z6 = string != null && StringsKt.n(string, "%remainSecond");
            final String str5 = string3;
            final String str6 = string4;
            final String str7 = string2;
            final String str8 = string5;
            com.bilibili.opd.app.bizcommon.radar.b.h((View) this.f74268l.getValue(), z6, new Function1(this, str5, str6, str7, str8) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AlertDialogC5574f f74252a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f74253b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f74254c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f74255d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final String f74256e;

                {
                    this.f74252a = this;
                    this.f74253b = str5;
                    this.f74254c = str6;
                    this.f74255d = str7;
                    this.f74256e = str8;
                }

                public final Object invoke(Object obj2) {
                    AlertDialogC5574f alertDialogC5574f = this.f74252a;
                    com.bilibili.opd.app.bizcommon.radar.b.g((TextView) alertDialogC5574f.f74270n.getValue(), this.f74253b, com.bilibili.opd.app.bizcommon.radar.b.i(44), (TextView) alertDialogC5574f.f74269m.getValue(), 52);
                    com.bilibili.opd.app.bizcommon.radar.b.g((TextView) alertDialogC5574f.f74271o.getValue(), this.f74254c, com.bilibili.opd.app.bizcommon.radar.b.i(67), null, 60);
                    ((TextView) alertDialogC5574f.f74272p.getValue()).setText(this.f74255d);
                    ((TextView) alertDialogC5574f.f74273q.getValue()).setText(this.f74256e);
                    return Unit.INSTANCE;
                }
            }, 2);
            com.bilibili.opd.app.bizcommon.radar.b.h((TextView) this.f74274r.getValue(), !z6, new s0(string2, 2), 2);
            List<RadarTriggerAction> actions = this.f74265i.getActions();
            RadarTriggerAction radarTriggerAction = actions != null ? (RadarTriggerAction) CollectionsKt.firstOrNull(actions) : null;
            com.bilibili.opd.app.bizcommon.radar.b.h((TextView) this.f74275s.getValue(), radarTriggerAction != null, new M(1, radarTriggerAction, this), 2);
            List<RadarTriggerAction> actions2 = this.f74265i.getActions();
            RadarTriggerAction radarTriggerAction2 = actions2 != null ? (RadarTriggerAction) CollectionsKt.getOrNull(actions2, 1) : null;
            final int i7 = 0;
            final RadarTriggerAction radarTriggerAction3 = radarTriggerAction2;
            com.bilibili.opd.app.bizcommon.radar.b.h((TextView) this.f74276t.getValue(), radarTriggerAction2 != null, new Function1(i7, radarTriggerAction3, this) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f74257a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f74258b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f74259c;

                {
                    this.f74257a = i7;
                    this.f74258b = radarTriggerAction3;
                    this.f74259c = this;
                }

                public final Object invoke(Object obj2) {
                    switch (this.f74257a) {
                        case 0:
                            TextView textView = (TextView) obj2;
                            RadarTriggerAction radarTriggerAction4 = (RadarTriggerAction) this.f74258b;
                            if (radarTriggerAction4 != null) {
                                String actionText = radarTriggerAction4.getActionText();
                                String str9 = actionText;
                                if (actionText == null) {
                                    str9 = "";
                                }
                                boolean showTimeCountdown = radarTriggerAction4.getShowTimeCountdown();
                                AlertDialogC5574f alertDialogC5574f = (AlertDialogC5574f) this.f74259c;
                                alertDialogC5574f.d(textView, str9, showTimeCountdown);
                                alertDialogC5574f.k(radarTriggerAction4, radarTriggerAction4.getDestructive(), textView);
                            }
                            return Unit.INSTANCE;
                        default:
                            a.x1 x1VarL0 = ((kntr.app.tribee.search.viewModels.a) Component_jvmKt.entryPoint(HiltSingletonComponent_androidKt.getHiltSingletonComponent(), Reflection.getOrCreateKotlinClass(kntr.app.tribee.search.viewModels.a.class))).L0();
                            Preconditions.checkNotNull((CoroutineScope) this.f74258b);
                            m21.g gVar = (m21.g) this.f74259c;
                            Preconditions.checkNotNull(gVar);
                            return (TribeeSearchViewModel) new a.y1(x1VarL0.a, gVar).b.get();
                    }
                }
            }, 2);
        }
        if (Result.exceptionOrNull-impl(obj) != null) {
            this.f74266j.e(this.f74277u);
        }
        setOnDismissListener(new DialogInterface.OnDismissListener(this) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AlertDialogC5574f f74260a;

            {
                this.f74260a = this;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AlertDialogC5574f alertDialogC5574f = this.f74260a;
                alertDialogC5574f.f74266j.e(alertDialogC5574f.f74277u);
                Disposable disposable2 = ((RadarCouponCountDownView) alertDialogC5574f.f74267k.getValue()).h;
                if (disposable2 != null) {
                    disposable2.dispose();
                }
            }
        });
    }
}
