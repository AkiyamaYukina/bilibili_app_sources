package com.bilibili.teenagersmode.ui;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/B.class */
@StabilityInferred(parameters = 0)
public final class B extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final BiliImageView f110593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TintTextView f110594b;

    @JvmOverloads
    public B(@NotNull Context context) {
        this(context, 0);
    }

    public B(Context context, int i7) {
        super(context, null);
        View.inflate(context, 2131500147, this);
        this.f110593a = findViewById(2131297797);
        this.f110594b = (TintTextView) findViewById(2131315382);
    }
}
