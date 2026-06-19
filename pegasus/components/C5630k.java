package com.bilibili.pegasus.components;

import android.R;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.bilibili.lib.theme.R$color;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.pegasus.components.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/k.class */
public final class C5630k extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Resources f77071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<View, Unit> f77072b;

    /* JADX WARN: Multi-variable type inference failed */
    public C5630k(@NotNull Resources resources, @NotNull Function1<? super View, Unit> function1) {
        this.f77071a = resources;
        this.f77072b = function1;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@NotNull View view) {
        TextView textView = view instanceof TextView ? (TextView) view : null;
        if (textView != null) {
            textView.setHighlightColor(this.f77071a.getColor(R.color.transparent));
        }
        this.f77072b.invoke(view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@NotNull TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.f77071a.getColor(R$color.main_Lb6));
    }
}
