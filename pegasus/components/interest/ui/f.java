package com.bilibili.pegasus.components.interest.ui;

import android.view.ViewGroup;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.magicasakura.widgets.TintView;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/f.class */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TintTextView f76403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SubCategoryInterestChooseDialog f76404b;

    public f(TintTextView tintTextView, SubCategoryInterestChooseDialog subCategoryInterestChooseDialog) {
        this.f76403a = tintTextView;
        this.f76404b = subCategoryInterestChooseDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TintTextView tintTextView = this.f76403a;
        SubCategoryInterestChooseDialog subCategoryInterestChooseDialog = this.f76404b;
        KProperty<Object>[] kPropertyArr = SubCategoryInterestChooseDialog.f76378i;
        TintView tintView = subCategoryInterestChooseDialog.jf().f53907k;
        ViewGroup.LayoutParams layoutParams = this.f76404b.jf().f53907k.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.topMargin = tintTextView.getBottom();
            marginLayoutParams = marginLayoutParams2;
        }
        tintView.setLayoutParams(marginLayoutParams);
    }
}
