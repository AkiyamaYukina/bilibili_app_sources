package com.bilibili.opd.app.bizcommon.radar.ui.coupon;

import ES0.K0;
import ES0.L0;
import ES0.M0;
import ES0.N0;
import ES0.O0;
import ES0.Z0;
import ES0.a1;
import ES0.b1;
import ES0.c1;
import ES0.d1;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.api.base.Config;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.opd.app.bizcommon.context.download.KtExtensionKt;
import com.bilibili.opd.app.bizcommon.radar.data.CouponItemsBean;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerAction;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerContent;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/m.class */
@StabilityInferred(parameters = 0)
public final class m extends in0.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final Lazy f74290A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public Disposable f74291B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final RadarTriggerContent f74292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final dn0.d f74293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f74294k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f74295l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f74296m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f74297n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f74298o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Lazy f74299p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Lazy f74300q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Lazy f74301r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Lazy f74302s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Lazy f74303t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Lazy f74304u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Lazy f74305v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Lazy f74306w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Lazy f74307x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Lazy f74308y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Lazy f74309z;

    public m(@NotNull RadarTriggerContent radarTriggerContent, @NotNull Context context, @NotNull String str, @NotNull dn0.d dVar) {
        super(radarTriggerContent, context, str);
        this.f74292i = radarTriggerContent;
        this.f74293j = dVar;
        this.f74294k = LazyKt.lazy(new Z0(this, 3));
        this.f74295l = LazyKt.lazy(new Be1.q(this, 4));
        this.f74296m = LazyKt.lazy(new Be1.r(this, 5));
        this.f74297n = LazyKt.lazy(new Be1.s(this, 2));
        this.f74298o = LazyKt.lazy(new Be1.t(this, 3));
        this.f74299p = LazyKt.lazy(new K0(this, 5));
        this.f74300q = LazyKt.lazy(new L0(this, 4));
        this.f74301r = LazyKt.lazy(new M0(this, 4));
        this.f74302s = LazyKt.lazy(new N0(this, 3));
        this.f74303t = LazyKt.lazy(new O0(this, 5));
        this.f74304u = LazyKt.lazy(new a1(this, 1));
        this.f74305v = LazyKt.lazy(new b1(this, 3));
        this.f74306w = LazyKt.lazy(new c1(this, 3));
        this.f74307x = LazyKt.lazy(new d1(this, 3));
        this.f74308y = LazyKt.lazy(new Bg1.c(this, 3));
        this.f74309z = LazyKt.lazy(new Bg1.d(this, 4));
        this.f74290A = LazyKt.lazy(new Be1.p(this, 4));
    }

    @Override // in0.e
    @NotNull
    public final View b() {
        return (View) this.f74295l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v57, types: [com.bilibili.opd.app.bizcommon.radar.ui.coupon.j] */
    @Override // in0.e, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        Object obj;
        List listTake;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setDimAmount(0.8f);
        }
        setContentView(2131499189);
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(JSON.parseObject(this.f74292i.getExtra()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.isSuccess-impl(obj)) {
            JSONObject jSONObject = (JSONObject) obj;
            String imgUrl = this.f74292i.getImgUrl();
            String string = jSONObject != null ? jSONObject.getString("title") : null;
            String string2 = jSONObject != null ? jSONObject.getString("couponValue") : null;
            String string3 = jSONObject != null ? jSONObject.getString("couponExpire") : null;
            List array = JSON.parseArray(jSONObject != null ? jSONObject.getString("couponItemList") : null, CouponItemsBean.class);
            final String jumpUrl = this.f74292i.getJumpUrl();
            List<RadarTriggerAction> actions = this.f74292i.getActions();
            RadarTriggerAction radarTriggerAction = actions != null ? (RadarTriggerAction) CollectionsKt.firstOrNull(actions) : null;
            boolean showClose = this.f74292i.getShowClose();
            ImageRequestBuilder imageRequestBuilderWith = BiliImageLoader.INSTANCE.with(getContext());
            if ((imgUrl == null || imgUrl.length() == 0) || StringsKt.Z(imgUrl, "http")) {
                imageRequestBuilderWith.url(imgUrl);
            } else {
                imageRequestBuilderWith.url("https:" + imgUrl);
            }
            imageRequestBuilderWith.into((BiliImageView) this.f74294k.getValue());
            TextView textView = (TextView) this.f74296m.getValue();
            boolean zIsNotNullAndNotEmpty = KtExtensionKt.isNotNullAndNotEmpty(string);
            final String str = string;
            final String str2 = string2;
            ?? r02 = new Function1(str, str2) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f74284a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f74285b;

                {
                    this.f74284a = str;
                    this.f74285b = str2;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r8) {
                    /*
                        r7 = this;
                        r0 = r8
                        android.widget.TextView r0 = (android.widget.TextView) r0
                        r12 = r0
                        r0 = r7
                        java.lang.String r0 = r0.f74284a
                        r13 = r0
                        r0 = r13
                        if (r0 == 0) goto L83
                        r0 = r13
                        java.lang.String r1 = "%s"
                        boolean r0 = kotlin.text.StringsKt.n(r0, r1)
                        r1 = 1
                        if (r0 != r1) goto L83
                        r0 = r7
                        java.lang.String r0 = r0.f74285b
                        r11 = r0
                        r0 = r11
                        boolean r0 = com.bilibili.opd.app.bizcommon.context.download.KtExtensionKt.isNotNullAndNotEmpty(r0)
                        if (r0 == 0) goto L83
                        r0 = 0
                        r9 = r0
                        r0 = r13
                        java.lang.String r1 = "%s"
                        r2 = 0
                        r3 = 0
                        r4 = 6
                        int r0 = kotlin.text.StringsKt.A(r0, r1, r2, r3, r4)
                        r10 = r0
                        r0 = r11
                        if (r0 == 0) goto L43
                        r0 = r11
                        int r0 = r0.length()
                        r9 = r0
                    L43:
                        r0 = r11
                        r8 = r0
                        r0 = r11
                        if (r0 != 0) goto L4e
                        java.lang.String r0 = ""
                        r8 = r0
                    L4e:
                        android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
                        r1 = r0
                        r2 = r13
                        java.lang.String r3 = "%s"
                        r4 = r8
                        java.lang.String r2 = kotlin.text.StringsKt.O(r2, r3, r4)
                        r1.<init>(r2)
                        r8 = r0
                        r0 = r8
                        android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
                        r2 = r1
                        r3 = 1
                        r2.<init>(r3)
                        r2 = r10
                        r3 = r9
                        r4 = r10
                        int r3 = r3 + r4
                        r4 = 33
                        r0.setSpan(r1, r2, r3, r4)
                        r0 = r12
                        com.bilibili.opd.app.bizcommon.radar.ui.coupon.g r1 = new com.bilibili.opd.app.bizcommon.radar.ui.coupon.g
                        r2 = r1
                        r3 = r12
                        r4 = r8
                        r2.<init>(r3, r4)
                        boolean r0 = r0.post(r1)
                        goto L95
                    L83:
                        r0 = r12
                        Ky0.e0 r1 = new Ky0.e0
                        r2 = r1
                        r3 = 1
                        r4 = r12
                        r5 = r13
                        r2.<init>(r3, r4, r5)
                        boolean r0 = r0.post(r1)
                    L95:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.radar.ui.coupon.j.invoke(java.lang.Object):java.lang.Object");
                }
            };
            if (zIsNotNullAndNotEmpty) {
                textView.setVisibility(0);
                r02.invoke(textView);
            } else {
                textView.setVisibility(4);
            }
            Long lValueOf = string3 != null ? Long.valueOf(Long.parseLong(string3)) : null;
            TextView textView2 = (TextView) this.f74297n.getValue();
            if (lValueOf == null || lValueOf.longValue() < 0) {
                textView2.setVisibility(4);
            } else {
                textView2.setVisibility(0);
                Disposable disposable = this.f74291B;
                if (disposable != null) {
                    disposable.dispose();
                }
                long jLongValue = lValueOf.longValue();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long j7 = jLongValue;
                if (jLongValue < 0) {
                    j7 = 0;
                }
                this.f74291B = Observable.interval(0L, 1L, timeUnit).subscribeOn(AndroidSchedulers.mainThread()).observeOn(AndroidSchedulers.mainThread()).map(new Zm0.b(j7)).take(j7 + 1).subscribe(new l(this, textView2));
                Unit unit = Unit.INSTANCE;
            }
            List listMutableListOf = CollectionsKt.mutableListOf(new View[]{(View) this.f74298o.getValue(), (View) this.f74302s.getValue(), (View) this.f74306w.getValue()});
            List listMutableListOf2 = CollectionsKt.mutableListOf(new BiliImageView[]{(BiliImageView) this.f74299p.getValue(), (BiliImageView) this.f74303t.getValue(), (BiliImageView) this.f74307x.getValue()});
            List listMutableListOf3 = CollectionsKt.mutableListOf(new BiliImageView[]{(BiliImageView) this.f74300q.getValue(), (BiliImageView) this.f74304u.getValue(), (BiliImageView) this.f74308y.getValue()});
            List listMutableListOf4 = CollectionsKt.mutableListOf(new TextView[]{(TextView) this.f74301r.getValue(), (TextView) this.f74305v.getValue(), (TextView) this.f74309z.getValue()});
            if (array != null && (listTake = CollectionsKt.take(array, 3)) != null) {
                int i7 = 0;
                for (Object obj2 : listTake) {
                    if (i7 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    final CouponItemsBean couponItemsBean = (CouponItemsBean) obj2;
                    ((View) listMutableListOf.get(i7)).setOnClickListener(new View.OnClickListener(couponItemsBean, this) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.k

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final CouponItemsBean f74286a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final m f74287b;

                        {
                            this.f74286a = couponItemsBean;
                            this.f74287b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            CouponItemsBean couponItemsBean2 = this.f74286a;
                            m mVar = this.f74287b;
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.add(Long.valueOf(couponItemsBean2.getItemsId()));
                            in0.e.i(mVar, couponItemsBean2.getJumpUrl(), null, null, 1, jSONArray.toJSONString(), 6);
                        }
                    });
                    BiliImageLoader biliImageLoader = BiliImageLoader.INSTANCE;
                    ImageRequestBuilder imageRequestBuilderWith2 = biliImageLoader.with(getContext());
                    com.bilibili.opd.app.bizcommon.radar.b.b(imageRequestBuilderWith2, couponItemsBean.getBgImg());
                    imageRequestBuilderWith2.into((BiliImageView) listMutableListOf2.get(i7));
                    ImageRequestBuilder imageRequestBuilderWith3 = biliImageLoader.with(getContext());
                    com.bilibili.opd.app.bizcommon.radar.b.b(imageRequestBuilderWith3, couponItemsBean.getImg());
                    imageRequestBuilderWith3.into((BiliImageView) listMutableListOf3.get(i7));
                    View view = (View) listMutableListOf4.get(i7);
                    if (KtExtensionKt.isNotNullAndNotEmpty(couponItemsBean.getItemDesc())) {
                        view.setVisibility(0);
                        ((TextView) view).setText(couponItemsBean.getItemDesc());
                        Unit unit2 = Unit.INSTANCE;
                    } else {
                        view.setVisibility(4);
                    }
                    i7++;
                }
            }
            ImageView imageView = (ImageView) this.f74290A.getValue();
            if (showClose) {
                imageView.setVisibility(0);
                imageView.setOnClickListener(new com.bilibili.app.comm.ugc.miniplayer.common.e(this, 1));
                Unit unit3 = Unit.INSTANCE;
            } else {
                imageView.setVisibility(8);
            }
            final RadarTriggerAction radarTriggerAction2 = radarTriggerAction;
            ((View) this.f74295l.getValue()).setOnClickListener(new View.OnClickListener(jumpUrl, this, radarTriggerAction2) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f74280a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final m f74281b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final RadarTriggerAction f74282c;

                {
                    this.f74280a = jumpUrl;
                    this.f74281b = this;
                    this.f74282c = radarTriggerAction2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str3 = this.f74280a;
                    m mVar = this.f74281b;
                    RadarTriggerAction radarTriggerAction3 = this.f74282c;
                    if (KtExtensionKt.isNotNullAndNotEmpty(str3)) {
                        in0.e.i(mVar, str3, radarTriggerAction3 != null ? radarTriggerAction3.getActionId() : null, radarTriggerAction3 != null ? radarTriggerAction3.getJumpAction() : null, 0, null, 24);
                        return;
                    }
                    int noUrlClickClose = mVar.f74292i.getNoUrlClickClose();
                    if (noUrlClickClose == 0) {
                        if (Config.isDebuggable()) {
                            BLog.d("nov_test", "no dismiss dialog");
                        }
                    } else {
                        if (noUrlClickClose != 1) {
                            mVar.f("");
                            return;
                        }
                        String actionId = "";
                        if (radarTriggerAction3 != null) {
                            actionId = radarTriggerAction3.getActionId();
                            if (actionId == null) {
                                actionId = "";
                            }
                        }
                        mVar.f(actionId);
                    }
                }
            });
            ((ImageView) this.f74290A.getValue()).setOnClickListener(new h90.j(this));
        }
        if (Result.exceptionOrNull-impl(obj) != null) {
            this.f74293j.e(false);
        }
        setOnDismissListener(new DialogInterface.OnDismissListener(this) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final m f74283a;

            {
                this.f74283a = this;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                m mVar = this.f74283a;
                mVar.f74293j.e(false);
                Disposable disposable2 = mVar.f74291B;
                if (disposable2 != null) {
                    disposable2.dispose();
                }
            }
        });
    }
}
