package com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.cmtime;

import Pb.F;
import Pb.G;
import Ur0.a;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C3259x;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.cmtime.b;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sr0.C8620c;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.utils.TimeFormater;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/cmtime/n.class */
@StabilityInferred(parameters = 0)
public final class n extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f81059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ImageView f81060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TextView f81061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public LinearLayout f81062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public b.a f81063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Ur0.a f81064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Ur0.a f81065g;

    @Nullable
    public Ur0.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public View f81066i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/cmtime/n$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f81068b;

        public a(int i7, @NotNull String str) {
            this.f81067a = i7;
            this.f81068b = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f81067a == aVar.f81067a && Intrinsics.areEqual(this.f81068b, aVar.f81068b);
        }

        public final int hashCode() {
            return this.f81068b.hashCode() + (Integer.hashCode(this.f81067a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("DialogArgs(height=");
            sb.append(this.f81067a);
            sb.append(", title=");
            return C8770a.a(sb, this.f81068b, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/cmtime/n$b.class */
    public static final class b implements a.d {
        @Override // Ur0.a.d
        public final String format(int i7) {
            return (i7 < 0 || i7 >= 10) ? String.valueOf(i7) : C3259x.a(i7, "0");
        }
    }

    public n(@NotNull Context context, @NotNull a aVar) {
        super(context, 2131886241);
        this.f81059a = aVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        Contract contractAb = ConfigManager.Companion.ab();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!androidx.appcompat.app.n.a(threadCurrentThread)) {
                IllegalStateException illegalStateException = new IllegalStateException(F.b("Dialog.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("Dialog.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
            }
        }
        super.dismiss();
        this.f81063e = null;
    }

    @Override // android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setGravity(80);
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(2131493841, (ViewGroup) null, false);
        setContentView(viewInflate);
        this.f81060b = (ImageView) viewInflate.findViewById(2131296853);
        this.f81061c = (TextView) viewInflate.findViewById(2131298598);
        this.f81062d = (LinearLayout) viewInflate.findViewById(2131308868);
        this.f81066i = viewInflate.findViewById(2131297454);
        ((TextView) viewInflate.findViewById(2131308958)).setText(this.f81059a.f81068b);
        View viewFindViewById = viewInflate.findViewById(2131298614);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = this.f81059a.f81067a;
        viewFindViewById.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v82, types: [Ur0.a$d, java.lang.Object] */
    @Override // android.app.Dialog
    public final void onStart() {
        C8620c c8620c;
        super.onStart();
        Context context = getContext();
        b.a aVar = this.f81063e;
        if (aVar == null) {
            return;
        }
        View view = this.f81066i;
        if (view != null) {
            view.setOnClickListener(new Oe1.a(this, 2));
        }
        ImageView imageView = this.f81060b;
        if (imageView != null) {
            imageView.setOnClickListener(new XK0.c(this, 2));
        }
        TextView textView = this.f81061c;
        if (textView != null) {
            textView.setOnClickListener(new Hx.c(aVar, this));
        }
        TimeFormater timeFormater = TimeFormater.INSTANCE;
        com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.cmtime.b bVar = aVar.f81026a;
        List listAsReversed = CollectionsKt.asReversed(StringsKt.R(TimeFormater.formatTime$default(timeFormater, bVar.f81021b.a().f126291b, false, false, 6, (Object) null), new String[]{":"}, 0, 6));
        Integer intOrNull = StringsKt.toIntOrNull((String) (2 < listAsReversed.size() ? listAsReversed.get(2) : "0"));
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
        Integer intOrNull2 = StringsKt.toIntOrNull((String) (1 < listAsReversed.size() ? listAsReversed.get(1) : "0"));
        int iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
        Integer intOrNull3 = StringsKt.toIntOrNull((String) (listAsReversed.size() > 0 ? listAsReversed.get(0) : "0"));
        int iIntValue3 = intOrNull3 != null ? intOrNull3.intValue() : 0;
        String draft$playerbizcommonv2_release = null;
        if (aVar.f81027b) {
            C8620c c8620c2 = bVar.f81024e;
            if (c8620c2 != null) {
                c8620c = c8620c2;
                draft$playerbizcommonv2_release = c8620c.getDraft$playerbizcommonv2_release();
            }
        } else {
            C8620c c8620c3 = bVar.f81025f;
            if (c8620c3 != null) {
                c8620c = c8620c3;
                draft$playerbizcommonv2_release = c8620c.getDraft$playerbizcommonv2_release();
            }
        }
        String str = draft$playerbizcommonv2_release;
        if (draft$playerbizcommonv2_release == null) {
            str = "";
        }
        List listAsReversed2 = CollectionsKt.asReversed(StringsKt.R(str, new String[]{":"}, 0, 6));
        Integer intOrNull4 = StringsKt.toIntOrNull((String) (2 < listAsReversed2.size() ? listAsReversed2.get(2) : "0"));
        int iIntValue4 = intOrNull4 != null ? intOrNull4.intValue() : 0;
        Integer intOrNull5 = StringsKt.toIntOrNull((String) (1 < listAsReversed2.size() ? listAsReversed2.get(1) : "0"));
        int iIntValue5 = intOrNull5 != null ? intOrNull5.intValue() : 0;
        Integer intOrNull6 = StringsKt.toIntOrNull((String) (listAsReversed2.size() > 0 ? listAsReversed2.get(0) : "0"));
        int iIntValue6 = intOrNull6 != null ? intOrNull6.intValue() : 0;
        ?? obj = new Object();
        if (iIntValue > 0) {
            Ur0.a aVar2 = new Ur0.a(context);
            aVar2.setFormatter((a.d) obj);
            aVar2.setMinValue(0);
            aVar2.setMaxValue(iIntValue);
            aVar2.setCurrentValue(iIntValue4);
            aVar2.setTextColorResource(R$color.Text1);
            aVar2.setTextSize(18.0f);
            aVar2.setSelectedTextColorResource(R$color.Text1);
            aVar2.setSelectedTextSize(18.0f);
            LinearLayout linearLayout = this.f81062d;
            if (linearLayout != null) {
                linearLayout.addView(aVar2);
            }
            LinearLayout linearLayout2 = this.f81062d;
            if (linearLayout2 != null) {
                TextView textView2 = new TextView(context);
                textView2.setText(":");
                textView2.setTextSize(18.0f);
                textView2.setTextColor(context.getResources().getColor(R$color.Text1));
                linearLayout2.addView(textView2);
            }
            this.f81064f = aVar2;
            ViewGroup.LayoutParams layoutParams = aVar2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = this.f81059a.f81067a - NewPlayerUtilsKt.toPx(64);
            aVar2.setLayoutParams(layoutParams);
        }
        Ur0.a aVar3 = new Ur0.a(context);
        aVar3.setFormatter((a.d) obj);
        aVar3.setMinValue(0);
        aVar3.setMaxValue(iIntValue > 0 ? 59 : iIntValue2);
        aVar3.setCurrentValue(iIntValue5);
        aVar3.setTextColorResource(R$color.Text1);
        aVar3.setTextSize(18.0f);
        aVar3.setSelectedTextColorResource(R$color.Text1);
        aVar3.setSelectedTextSize(18.0f);
        LinearLayout linearLayout3 = this.f81062d;
        if (linearLayout3 != null) {
            linearLayout3.addView(aVar3);
        }
        LinearLayout linearLayout4 = this.f81062d;
        if (linearLayout4 != null) {
            TextView textView3 = new TextView(context);
            textView3.setText(":");
            textView3.setTextSize(18.0f);
            textView3.setTextColor(context.getResources().getColor(R$color.Text1));
            linearLayout4.addView(textView3);
        }
        this.f81065g = aVar3;
        ViewGroup.LayoutParams layoutParams2 = aVar3.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = this.f81059a.f81067a - NewPlayerUtilsKt.toPx(64);
        aVar3.setLayoutParams(layoutParams2);
        Ur0.a aVar4 = new Ur0.a(context);
        aVar4.setFormatter((a.d) obj);
        aVar4.setMinValue(0);
        if (iIntValue2 > 0 || iIntValue > 0) {
            iIntValue3 = 59;
        }
        aVar4.setMaxValue(iIntValue3);
        aVar4.setCurrentValue(iIntValue6);
        aVar4.setTextColorResource(R$color.Text1);
        aVar4.setTextSize(18.0f);
        aVar4.setSelectedTextColorResource(R$color.Text1);
        aVar4.setSelectedTextSize(18.0f);
        LinearLayout linearLayout5 = this.f81062d;
        if (linearLayout5 != null) {
            linearLayout5.addView(aVar4);
        }
        this.h = aVar4;
        ViewGroup.LayoutParams layoutParams3 = aVar4.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.height = this.f81059a.f81067a - NewPlayerUtilsKt.toPx(64);
        aVar4.setLayoutParams(layoutParams3);
    }
}
