package com.bilibili.ship.theseus.ugc.pages;

import android.text.SpannableStringBuilder;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bilibili.ship.theseus.ugc.pages.k;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/j.class */
public final class j implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f98026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f98027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.b f98028c;

    public j(TextView textView, SpannableStringBuilder spannableStringBuilder, k.b bVar) {
        this.f98026a = textView;
        this.f98027b = spannableStringBuilder;
        this.f98028c = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f98026a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        k.b bVar = this.f98028c;
        TextView textView = this.f98026a;
        this.f98027b.toString();
        textView.post(new h(bVar, bVar.f98036b, textView, bVar.f98038d));
    }
}
