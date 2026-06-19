package com.bilibili.ogv.pub.payment.pay;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.bilibili.bililive.room.ui.official.views.widgets.e;
import com.bilibili.lib.image2.BiliImageLoader;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.util.AppResUtil;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/pay/a.class */
public final class a extends Dialog {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f71558e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f71559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TextView f71560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextView f71561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final View f71562d;

    /* JADX INFO: renamed from: com.bilibili.ogv.pub.payment.pay.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/pay/a$a.class */
    public static final class C0448a {
        @JvmStatic
        @NotNull
        public static void a(@NotNull Context context, @NotNull String str, @NotNull String str2, @Nullable String str3) {
            a aVar = new a(context);
            if (str3 != null && str3.length() != 0) {
                aVar.f71561c.setText(str3);
            }
            aVar.f71560b.setText(aVar.getContext().getString(2131835813, str, str2));
            aVar.f71562d.setOnClickListener(new Dw.b(1, aVar, false));
            aVar.f71559a.setOnClickListener(new e(aVar, 1));
            aVar.show();
        }
    }

    public a(@NotNull Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(context).inflate(2131500300, (ViewGroup) null);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.requestFeature(1);
            window.setContentView(viewInflate);
        }
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        this.f71559a = viewInflate.findViewById(2131308247);
        this.f71560b = (TextView) viewInflate.findViewById(2131299243);
        this.f71561c = (TextView) viewInflate.findViewById(2131299190);
        this.f71562d = viewInflate.findViewById(2131298371);
        BiliImageLoader.INSTANCE.with(context).url(AppResUtil.getImageUrl("ic_movie_pay_order_error.webp")).into(findViewById(2131308861));
    }
}
