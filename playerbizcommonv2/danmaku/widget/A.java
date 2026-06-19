package com.bilibili.playerbizcommonv2.danmaku.widget;

import L3.k0;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.ComponentDialog;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.lib.theme.R$color;
import j5.C7642d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/A.class */
@StabilityInferred(parameters = 0)
public final class A extends ComponentDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f81567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f81568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f81569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f81570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f81571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f81572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f81573g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f81574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f81575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f81576k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Context context, String str, String str2, String str3, String str4, int i7, int i8, int i9, Function0 function0, Function0 function02, int i10) {
        super(context, 0, 2, null);
        str2 = (i10 & 4) != 0 ? "" : str2;
        str3 = (i10 & 8) != 0 ? context.getString(2131846021) : str3;
        str4 = (i10 & 16) != 0 ? context.getString(2131845801) : str4;
        i7 = (i10 & 32) != 0 ? R$color.Bg1_float : i7;
        i8 = (i10 & 64) != 0 ? R$color.Text1 : i8;
        int i11 = R$color.Text3;
        i9 = (i10 & 256) != 0 ? R$color.Line_regular : i9;
        int i12 = R$color.Brand_pink;
        function02 = (i10 & 2048) != 0 ? new k0(6) : function02;
        this.f81567a = str;
        this.f81568b = str2;
        this.f81569c = str3;
        this.f81570d = str4;
        this.f81571e = i7;
        this.f81572f = i8;
        this.f81573g = i11;
        this.h = i9;
        this.f81574i = i12;
        this.f81575j = function0;
        this.f81576k = function02;
        Window window = getWindow();
        if (window != null) {
            C7642d.a(window, 0);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.requestFeature(1);
        }
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-290461151, true, new com.bilibili.ad.reward.test.n(this, 2)));
        setContentView(composeView);
        Window window3 = getWindow();
        WindowManager.LayoutParams attributes = window3 != null ? window3.getAttributes() : null;
        if (attributes != null) {
            attributes.width = NewPlayerUtilsKt.toPx(280.0f);
        }
        if (attributes != null) {
            attributes.height = -2;
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setAttributes(attributes);
        }
        setCanceledOnTouchOutside(true);
    }
}
