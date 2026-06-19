package com.bilibili.upper.widget.text;

import android.text.Editable;
import android.text.TextWatcher;
import com.bilibili.upper.widget.text.UpperCommonEditText;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/text/a.class */
public final class a implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpperCommonEditText f114605a;

    public a(UpperCommonEditText upperCommonEditText) {
        this.f114605a = upperCommonEditText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.f114605a.f114603c.getText() == null || this.f114605a.f114603c.getText().length() <= 0) {
            this.f114605a.f114604d.setVisibility(8);
        } else {
            this.f114605a.f114604d.setVisibility(0);
        }
        UpperCommonEditText upperCommonEditText = this.f114605a;
        UpperCommonEditText.a aVar = upperCommonEditText.f114601a;
        if (aVar != null) {
            aVar.a(upperCommonEditText.f114603c.getText().toString());
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }
}
