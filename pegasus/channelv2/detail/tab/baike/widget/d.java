package com.bilibili.pegasus.channelv2.detail.tab.baike.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/widget/d.class */
@StabilityInferred(parameters = 0)
public final class d extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final TextView f75217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TintTextView f75218b;

    @JvmOverloads
    public d(@NotNull Context context) {
        this(context, 0);
    }

    public d(Context context, int i7) {
        super(context, null, 0);
        View.inflate(context, 2131496198, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setGravity(17);
        setOrientation(0);
        this.f75217a = (TextView) findViewById(2131310101);
        this.f75218b = (TintTextView) findViewById(2131310410);
    }

    public final void a() {
        TintTextView tintTextView = this.f75218b;
        if (tintTextView != null) {
            tintTextView.setVisibility(0);
        }
        TextView textView = this.f75217a;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.f75217a;
        if (textView2 != null) {
            textView2.setText(getResources().getString(2131845314));
        }
        setBackgroundColor(ContextCompat.getColor(getContext(), R$color.Ga1));
    }

    public final void b() {
        TintTextView tintTextView = this.f75218b;
        if (tintTextView != null) {
            tintTextView.setVisibility(8);
        }
        TextView textView = this.f75217a;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.f75217a;
        if (textView2 != null) {
            textView2.setText(getResources().getString(2131845137));
        }
        setBackgroundColor(ContextCompat.getColor(getContext(), R$color.Ga1));
    }

    public final void setRetryListener(@NotNull View.OnClickListener onClickListener) {
        TintTextView tintTextView = this.f75218b;
        if (tintTextView != null) {
            tintTextView.setOnClickListener(onClickListener);
        }
    }
}
