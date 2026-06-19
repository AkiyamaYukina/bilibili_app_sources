package com.bilibili.ship.theseus.ogv.pay;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import j5.C7642d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.util.AppResUtil;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/a.class */
@StabilityInferred(parameters = 0)
public final class a extends AlertDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f94181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f94182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f94183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f94184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f94185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f94186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public TextView f94187g;

    @NotNull
    public Function1<? super Boolean, Unit> h;

    public a(@NotNull Context context, @NotNull String str, @NotNull String str2, boolean z6, boolean z7) {
        super(context);
        this.f94181a = context;
        this.f94182b = str;
        this.f94183c = str2;
        this.f94184d = z6;
        this.f94185e = z7;
        this.h = new U80.b(1);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        int id = view.getId();
        if (id == 2131301778) {
            boolean z6 = this.f94186f;
            this.f94186f = !z6;
            this.f94187g.setCompoundDrawablesWithIntrinsicBounds(!z6 ? 2131240951 : 2131240882, 0, 0, 0);
        } else if (id == 2131297884 || id == 2131298076) {
            dismiss();
        } else if (id == 2131298124) {
            dismiss();
            this.h.invoke(Boolean.valueOf(this.f94186f));
        }
    }

    @Override // androidx.appcompat.app.AlertDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = View.inflate(this.f94181a, 2131500303, null);
        setContentView(viewInflate);
        C7642d.a(getWindow(), 0);
        BiliImageLoader.INSTANCE.with(this.f94181a).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).url(AppResUtil.getImageUrl("bili_2233_bangumi_detail_ic_pay_tip_unstart.webp")).into(viewInflate.findViewById(2131301546));
        viewInflate.findViewById(2131297884).setOnClickListener(this);
        viewInflate.findViewById(2131298076).setOnClickListener(this);
        viewInflate.findViewById(2131298124).setOnClickListener(this);
        this.f94186f = true;
        ((TextView) viewInflate.findViewById(2131308958)).setText(this.f94182b);
        TextView textView = (TextView) viewInflate.findViewById(2131307623);
        String string = textView.getContext().getString(2131854844);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(B0.a.a(string, this.f94183c, textView.getContext().getString(2131854808)));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(textView.getContext(), 2131104016)), string.length(), this.f94183c.length() + string.length(), 33);
        textView.setText(spannableStringBuilder);
        TextView textView2 = (TextView) viewInflate.findViewById(2131301778);
        textView2.setVisibility(this.f94184d ? 8 : 0);
        textView2.setText(this.f94185e ? textView2.getContext().getString(2131848972) : textView2.getContext().getString(2131848910));
        textView2.setCompoundDrawablesWithIntrinsicBounds(2131240951, 0, 0, 0);
        textView2.setOnClickListener(this);
        this.f94187g = textView2;
    }
}
