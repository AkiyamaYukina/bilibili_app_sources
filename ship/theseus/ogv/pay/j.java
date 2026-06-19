package com.bilibili.ship.theseus.ogv.pay;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import com.bilibili.droid.WindowManagerHelper;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.C6387l;
import com.bilibili.ship.theseus.united.page.restrictionlayer.InterfaceC6388m;
import com.bilibili.ship.theseus.united.page.restrictionlayer.P;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.s;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zu0.AbstractC9254t;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/j.class */
@StabilityInferred(parameters = 0)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f94196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageReportService f94197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.report.d f94198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC6388m f94199d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/j$a.class */
    public final class a extends Dialog {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final PopWinVo f94200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final d f94201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j f94202c;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.pay.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/j$a$a.class */
        public static final class C0741a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a f94203a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final j f94204b;

            public C0741a(a aVar, j jVar) {
                this.f94203a = aVar;
                this.f94204b = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
            @Override // com.bilibili.ship.theseus.ogv.pay.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(int r6) {
                /*
                    Method dump skipped, instruction units count: 269
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.pay.j.a.C0741a.a(int):void");
            }

            @Override // com.bilibili.ship.theseus.ogv.pay.c
            public final void b() {
                this.f94203a.dismiss();
            }

            public final void c(TextVo textVo) {
                s sVar = textVo.f102713j;
                if (sVar == null) {
                    return;
                }
                s sVarA = sVar;
                if (sVar instanceof P) {
                    sVarA = P.a((P) sVar, null, "preview", false, 23);
                }
                this.f94204b.f94199d.a(sVarA);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull j jVar, PopWinVo popWinVo) {
            super(jVar.f94196a);
            this.f94202c = jVar;
            this.f94200a = popWinVo;
            Context context = getContext();
            d dVar = new d();
            ReportVo reportVo = dVar.f94189a;
            ReportVo reportVo2 = popWinVo.h;
            if (!Intrinsics.areEqual(reportVo2, reportVo)) {
                dVar.f94189a = reportVo2;
                dVar.notifyPropertyChanged(481);
            }
            String str = dVar.f94190b;
            String str2 = popWinVo.f94173a;
            if (!Intrinsics.areEqual(str2, str)) {
                dVar.f94190b = str2;
                dVar.notifyPropertyChanged(286);
            }
            TextVo textVo = dVar.f94191c;
            TextVo textVo2 = popWinVo.f94174b;
            if (!Intrinsics.areEqual(textVo2, textVo)) {
                dVar.f94191c = textVo2;
                dVar.notifyPropertyChanged(640);
            }
            TextVo textVoC = popWinVo.c();
            if (!Intrinsics.areEqual(textVoC, dVar.f94192d)) {
                dVar.f94192d = textVoC;
                dVar.notifyPropertyChanged(609);
            }
            TextVo textVo3 = (TextVo) CollectionsKt.getOrNull(popWinVo.f94177e, 0);
            if (textVo3 != null) {
                CharSequence charSequenceA = C6387l.a(textVo3, context);
                if (!Intrinsics.areEqual(charSequenceA, dVar.f94193e)) {
                    dVar.f94193e = charSequenceA;
                    dVar.notifyPropertyChanged(213);
                }
            } else {
                textVo3 = null;
            }
            if (!Intrinsics.areEqual(textVo3, dVar.f94194f)) {
                dVar.f94194f = textVo3;
                dVar.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_BODY_STATURE);
            }
            TextVo textVo4 = (TextVo) CollectionsKt.getOrNull(popWinVo.f94177e, 1);
            if (textVo4 != null) {
                String string = C6387l.a(textVo4, context).toString();
                if (!Intrinsics.areEqual(string, dVar.f94195g)) {
                    dVar.f94195g = string;
                    dVar.notifyPropertyChanged(539);
                }
            } else {
                textVo4 = null;
            }
            if (!Intrinsics.areEqual(textVo4, dVar.h)) {
                dVar.h = textVo4;
                dVar.notifyPropertyChanged(536);
            }
            this.f94201b = dVar;
            C0741a c0741a = new C0741a(this, jVar);
            Window window = getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.requestFeature(1);
            }
            View viewInflate = LayoutInflater.from(getContext()).inflate(2131500306, (ViewGroup) null);
            AbstractC9254t abstractC9254t = (AbstractC9254t) DataBindingUtil.bind(viewInflate);
            if (abstractC9254t != null) {
                abstractC9254t.r(dVar);
                abstractC9254t.q(c0741a);
                setContentView(viewInflate);
            }
            setCancelable(false);
            setCanceledOnTouchOutside(false);
        }

        @Override // android.app.Dialog, android.view.Window.Callback
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            Window window = getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = (int) (Math.min(WindowManagerHelper.getDisplayWidth(window.getContext()), WindowManagerHelper.getDisplayHeight(window.getContext())) * 0.74666667f);
                window.setAttributes(attributes);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
        @Override // android.app.Dialog
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void show() {
            /*
                Method dump skipped, instruction units count: 296
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.pay.j.a.show():void");
        }
    }

    @Inject
    public j(@NotNull Context context, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.united.page.report.d dVar, @NotNull InterfaceC6388m interfaceC6388m) {
        this.f94196a = context;
        this.f94197b = pageReportService;
        this.f94198c = dVar;
        this.f94199d = interfaceC6388m;
    }
}
