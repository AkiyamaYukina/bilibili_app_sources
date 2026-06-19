package com.bilibili.tgwt.im.widget;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/B.class */
public final class B implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f111335a;

    public B(D d7) {
        this.f111335a = d7;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable != null) {
            D d7 = this.f111335a;
            d7.f111357i.setEnabled(editable.length() > 0);
            if (d7.f111357i.isEnabled()) {
                d7.f111357i.setTypeface(null, 1);
            } else {
                d7.f111357i.setTypeface(null, 0);
            }
            Editable text = d7.f111356g.getText();
            lV.z[] zVarArr = text != null ? (lV.z[]) text.getSpans(0, text.length(), lV.z.class) : null;
            if (zVarArr == null) {
                return;
            }
            for (lV.z zVar : zVarArr) {
                int spanStart = editable.getSpanStart(zVar);
                int spanEnd = editable.getSpanEnd(zVar);
                if (spanStart == spanEnd || !Intrinsics.areEqual(editable.subSequence(spanStart, spanEnd).toString(), zVar.a)) {
                    editable.removeSpan(zVar);
                    if (spanStart >= 0 && spanEnd >= 0 && spanEnd >= spanStart) {
                        editable.delete(spanStart, spanEnd);
                    }
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }
}
