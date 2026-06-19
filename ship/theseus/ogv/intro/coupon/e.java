package com.bilibili.ship.theseus.ogv.intro.coupon;

import I60.I;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.droid.WindowManagerHelper;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ship.theseus.ogv.pay.DialogCoupon;
import com.bilibili.ship.theseus.ogv.pay.OgvPayService;
import com.bilibili.ship.theseus.ogv.pay.PopWinVo;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.InterfaceC6388m;
import com.bilibili.ship.theseus.united.page.restrictionlayer.P;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.s;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import zu0.r;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/coupon/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PageReportService f92342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvPayService f92343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final yW0.a f92344c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/coupon/e$a.class */
    public final class a extends DataBindingComponent<r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Um.e f92345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final i f92346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final g f92347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e f92348d;

        public a(@NotNull e eVar, @NotNull PopWinVo popWinVo, Um.e eVar2) {
            this.f92348d = eVar;
            this.f92345a = eVar2;
            i iVar = new i(popWinVo);
            this.f92346b = iVar;
            this.f92347c = new g(iVar.f92365d, new I(this, 3));
            iVar.f92362a.addOnPropertyChangedCallback(new c(this));
        }

        public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
            List<TextVo> list;
            DialogCoupon dialogCoupon;
            Long l7;
            final r rVar = (r) viewDataBinding;
            final e eVar = this.f92348d;
            PageReportService.i(eVar.f92342a, "pgc.pgc-video-detail.use-coupon-pop.0.show", null, 6);
            i iVar = this.f92346b;
            rVar.q(iVar);
            rVar.f130854A.setAdapter(this.f92347c);
            Context context = rVar.getRoot().getContext();
            GradientDrawable gradientDrawable = new GradientDrawable();
            float f7 = 12;
            gradientDrawable.setCornerRadius(Uj0.c.a(f7, context));
            gradientDrawable.setColor(ContextCompat.getColor(context, R$color.f64616Wh0));
            rVar.f130855B.setBackground(gradientDrawable);
            TextView textView = rVar.f130859x;
            i iVar2 = rVar.f130857D;
            String str = (iVar2 == null || (dialogCoupon = iVar2.f92365d.get(iVar2.f92362a.get())) == null || (l7 = dialogCoupon.f94143b) == null || l7.longValue() != 4) ? "1" : "2";
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            mapCreateMapBuilder.put("button", str);
            final Map mapBuild = MapsKt.build(mapCreateMapBuilder);
            PageReportService pageReportService = eVar.f92342a;
            PageReportService.i(pageReportService, "pgc.pgc-video-detail.use-coupon-pop.btn.show", mapBuild, 4);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            float f8 = 4;
            gradientDrawable2.setCornerRadius(Uj0.c.a(f8, context));
            gradientDrawable2.setColor(ContextCompat.getColor(context, R$color.Ye5));
            final Um.e eVar2 = this.f92345a;
            textView.setOnClickListener(new View.OnClickListener(eVar, mapBuild, rVar, eVar2) { // from class: com.bilibili.ship.theseus.ogv.intro.coupon.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final e f92334a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Map f92335b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final r f92336c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Um.e f92337d;

                {
                    this.f92334a = eVar;
                    this.f92335b = mapBuild;
                    this.f92336c = rVar;
                    this.f92337d = eVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DialogCoupon dialogCoupon2;
                    e eVar3 = this.f92334a;
                    Map map = this.f92335b;
                    r rVar2 = this.f92336c;
                    Um.e eVar4 = this.f92337d;
                    PageReportService.g(eVar3.f92342a, "pgc.pgc-video-detail.use-coupon-pop.btn.click", map, 4);
                    i iVar3 = rVar2.f130857D;
                    if (iVar3 == null || (dialogCoupon2 = iVar3.f92365d.get(iVar3.f92362a.get())) == null) {
                        return;
                    }
                    String strA = dialogCoupon2.a();
                    if (strA == null || strA.length() == 0 || dialogCoupon2.f94143b == null) {
                        BLog.e("OgvTicketPaySelectorFactory-initView$lambda$1$1$0", "[theseus-ogv-OgvTicketPaySelectorFactory-initView$lambda$1$1$0] DialogCoupon is null", (Throwable) null);
                    } else if (dialogCoupon2.f94150j == DialogCoupon.PurchaseType.EXCHANGE) {
                        Long lB = dialogCoupon2.b();
                        eVar3.f92343b.c(strA, lB != null ? lB.longValue() : 0L);
                    } else {
                        OgvPayService.a(eVar3.f92343b, strA, null, null, null, 14);
                    }
                    eVar4.invoke();
                }
            });
            textView.setBackground(gradientDrawable2);
            LinearLayout linearLayout = rVar.f130858w;
            linearLayout.removeAllViews();
            i iVar3 = rVar.f130857D;
            if (iVar3 != null && (list = iVar3.f92366e) != null) {
                int i7 = 0;
                for (Object obj : list) {
                    if (i7 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    final TextVo textVo = (TextVo) obj;
                    TextView textView2 = new TextView(linearLayout.getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, Uj0.c.b(44, textView2.getContext()));
                    layoutParams.topMargin = i7 == 0 ? 0 : Uj0.c.b(f7, textView2.getContext());
                    textView2.setLayoutParams(layoutParams);
                    textView2.setGravity(17);
                    textView2.setText(textVo.f102705a);
                    textView2.setTextSize(0, textView2.getResources().getDimension(2131167029));
                    textView2.setTextColor(ContextCompat.getColor(textView2.getContext(), R$color.Ye5));
                    GradientDrawable gradientDrawable3 = new GradientDrawable();
                    float fA = Uj0.c.a(f8, textView2.getContext());
                    gradientDrawable3.setCornerRadii(new float[]{fA, fA, fA, fA, fA, fA, fA, fA});
                    gradientDrawable3.setStroke(Uj0.c.b(0.5f, textView2.getContext()), ContextCompat.getColor(textView2.getContext(), R$color.Ye5));
                    textView2.setBackground(gradientDrawable3);
                    if (textVo.f102713j instanceof P) {
                        linearLayout.setVisibility(0);
                        PageReportService.i(pageReportService, "pgc.pgc-video-detail.use-coupon-pop.vipbtn.show", null, 6);
                    } else {
                        linearLayout.setVisibility(8);
                    }
                    textView2.setOnClickListener(new View.OnClickListener(textVo, eVar, eVar2) { // from class: com.bilibili.ship.theseus.ogv.intro.coupon.b

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final TextVo f92338a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final e f92339b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final Um.e f92340c;

                        {
                            this.f92338a = textVo;
                            this.f92339b = eVar;
                            this.f92340c = eVar2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            TextVo textVo2 = this.f92338a;
                            e eVar3 = this.f92339b;
                            Um.e eVar4 = this.f92340c;
                            s sVar = textVo2.f102713j;
                            if (sVar == null) {
                                return;
                            }
                            boolean z6 = sVar instanceof P;
                            if (z6) {
                                PageReportService.g(eVar3.f92342a, "pgc.pgc-video-detail.use-coupon-pop.vipbtn.click", null, 6);
                            }
                            s sVarA = sVar;
                            if (z6) {
                                sVarA = P.a((P) sVar, "pgc.pgc-video-detail.use-coupon-pop.vipbtn.click", null, false, 29);
                            }
                            ((InterfaceC6388m) eVar3.f92344c.get()).a(sVarA);
                            eVar4.invoke();
                        }
                    });
                    linearLayout.addView(textView2);
                    i7++;
                }
            }
            iVar.f92362a.set(0);
            return Unit.INSTANCE;
        }

        public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            r rVarInflate = r.inflate(layoutInflater, viewGroup, false);
            rVarInflate.f130854A.addItemDecoration(new RecyclerView.ItemDecoration());
            return rVarInflate;
        }
    }

    @Inject
    public e(@NotNull PageReportService pageReportService, @NotNull OgvPayService ogvPayService, @NotNull yW0.a aVar) {
        this.f92342a = pageReportService;
        this.f92343b = ogvPayService;
        this.f92344c = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.activity.ComponentDialog, androidx.lifecycle.LifecycleOwner, com.bilibili.ship.theseus.ogv.intro.coupon.OgvTicketPaySelectorFactory$createDialog$dialog$1, java.lang.Object] */
    @NotNull
    public final OgvTicketPaySelectorFactory$createDialog$dialog$1 a(@NotNull final Context context, @NotNull PopWinVo popWinVo) {
        ?? r02 = new ComponentDialog(context) { // from class: com.bilibili.ship.theseus.ogv.intro.coupon.OgvTicketPaySelectorFactory$createDialog$dialog$1
            {
                int i7 = 0;
                int i8 = 2;
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // androidx.activity.ComponentDialog, android.app.Dialog
            public void onCreate(Bundle bundle) {
                super.onCreate(bundle);
                Window window = getWindow();
                if (window != null) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.width = (int) (Math.min(WindowManagerHelper.getDisplayWidth(window.getContext()), WindowManagerHelper.getDisplayHeight(window.getContext())) * 0.9f);
                    window.setAttributes(attributes);
                }
            }
        };
        a aVar = new a(this, popWinVo, new Um.e((Object) r02, 7));
        ViewDataBinding viewDataBindingD = aVar.d(context, LayoutInflater.from(context), null);
        com.bilibili.app.gemini.ui.d dVar = new com.bilibili.app.gemini.ui.d(viewDataBindingD);
        r02.setContentView(viewDataBindingD.getRoot());
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(r02), (CoroutineContext) null, (CoroutineStart) null, new OgvTicketPaySelectorFactory$createDialog$1(aVar, dVar, null), 3, (Object) null);
        return r02;
    }
}
