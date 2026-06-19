package com.bilibili.tgwt.square;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.ogvcommon.widget.AvatarAnimatorLayout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/g.class */
@StabilityInferred(parameters = 0)
public final class g implements UIComponent.ViewEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f112122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiliImageView f112123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f112124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TextView f112125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f112126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AvatarAnimatorLayout f112127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f112128g;
    public final TextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final TextView f112129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BiliImageView f112130j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f112131k;

    public g(@NotNull View view) {
        this.f112122a = view;
        this.f112123b = view.findViewById(2131308246);
        this.f112124c = (TextView) view.findViewById(2131310619);
        this.f112125d = (TextView) view.findViewById(2131315289);
        this.f112126e = (TextView) view.findViewById(2131298167);
        this.f112127f = (AvatarAnimatorLayout) view.findViewById(2131296302);
        this.f112128g = view.findViewById(2131299639);
        this.h = (TextView) view.findViewById(2131314539);
        this.f112129i = (TextView) view.findViewById(2131314538);
        this.f112130j = view.findViewById(2131297891);
        this.f112131k = (TextView) view.findViewById(2131298053);
    }

    @NotNull
    public final View getRoot() {
        return this.f112122a;
    }
}
