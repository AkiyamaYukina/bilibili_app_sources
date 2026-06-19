package com.bilibili.ship.theseus.cheese.widget;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import com.bilibili.ship.theseus.cheese.widget.ExpandableTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/widget/a.class */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExpandableTextView f90807a;

    public a(ExpandableTextView expandableTextView) {
        this.f90807a = expandableTextView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int height;
        ExpandableTextView expandableTextView = this.f90807a;
        if (expandableTextView.f90797p) {
            expandableTextView.setOnClickListener(null);
        }
        this.f90807a.getViewTreeObserver().removeOnPreDrawListener(this);
        Layout layout = this.f90807a.getLayout();
        if (layout == null) {
            return false;
        }
        ExpandableTextView expandableTextView2 = this.f90807a;
        expandableTextView2.f90784b = true;
        if (TextUtils.isEmpty(expandableTextView2.f90792k.b()) || !expandableTextView2.f90794m) {
            height = expandableTextView2.getHeight();
        } else {
            CharSequence charSequence = expandableTextView2.h;
            ExpandableTextView.d dVar = expandableTextView2.f90800s;
            if (dVar != null) {
                if (expandableTextView2.f90790i == null) {
                    expandableTextView2.f90790i = dVar.b(charSequence, layout, expandableTextView2.f90792k, expandableTextView2.f90798q);
                }
                charSequence = expandableTextView2.f90790i;
            }
            StaticLayout staticLayout = new StaticLayout(charSequence, layout.getPaint(), layout.getWidth(), layout.getAlignment(), layout.getSpacingMultiplier(), layout.getSpacingAdd(), expandableTextView2.getIncludeFontPadding());
            height = Math.max(((layout.getBottomPadding() - layout.getTopPadding()) + staticLayout.getHeight()) - (staticLayout.getBottomPadding() - staticLayout.getTopPadding()), expandableTextView2.getHeight());
        }
        expandableTextView2.f90787e = height;
        int lineCount = layout.getLineCount();
        ExpandableTextView expandableTextView3 = this.f90807a;
        if (lineCount <= expandableTextView3.f90796o || TextUtils.isEmpty(expandableTextView3.h)) {
            ExpandableTextView expandableTextView4 = this.f90807a;
            expandableTextView4.f90783a = false;
            expandableTextView4.J();
            this.f90807a.requestLayout();
        } else {
            ExpandableTextView expandableTextView5 = this.f90807a;
            expandableTextView5.f90783a = true;
            expandableTextView5.K();
            this.f90807a.requestLayout();
            ExpandableTextView expandableTextView6 = this.f90807a;
            if (expandableTextView6.f90797p) {
                expandableTextView6.setOnClickListener(expandableTextView6.f90801t);
            }
        }
        ExpandableTextView.e eVar = this.f90807a.f90799r;
        return false;
    }
}
