package com.bilibili.tgwt.square;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.lib.image2.view.BiliImageView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/e.class */
@StabilityInferred(parameters = 0)
public final class e implements UIComponent.ViewEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f112114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f112115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiliImageView f112116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f112117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TextView f112118e;

    public e(@NotNull View view) {
        this.f112114a = view;
        this.f112115b = (RelativeLayout) view.findViewById(2131310380);
        this.f112116c = view.findViewById(2131304441);
        this.f112117d = (TextView) view.findViewById(2131315071);
        this.f112118e = (TextView) view.findViewById(2131315070);
    }

    @NotNull
    public final View getRoot() {
        return this.f112114a;
    }
}
