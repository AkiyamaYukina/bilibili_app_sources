package com.bilibili.lib.projection.internal.feedback;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/feedback/g.class */
public final class g implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProjectionReportLayout f63207a;

    public g(ProjectionReportLayout projectionReportLayout) {
        this.f63207a = projectionReportLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        ProjectionReportLayout projectionReportLayout = this.f63207a;
        h hVar = projectionReportLayout.f63193f;
        if (hVar != null) {
            hVar.a(projectionReportLayout.getOtherStr());
        }
    }
}
