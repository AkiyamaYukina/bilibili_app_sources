package com.bilibili.tgwt.square;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/m.class */
@StabilityInferred(parameters = 0)
public final class m implements UIComponent.ViewEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f112142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f112143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f112144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f112145d;

    public m(@NotNull View view) {
        this.f112142a = view;
        this.f112143b = (TextView) view.findViewById(2131310619);
        this.f112144c = (TextView) view.findViewById(2131314850);
        this.f112145d = view.findViewById(2131305635);
    }

    @NotNull
    public final View getRoot() {
        return this.f112142a;
    }
}
