package com.bilibili.topix.compose.create;

import android.widget.CompoundButton;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/v.class */
public final /* synthetic */ class v implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f112561a;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
        this.f112561a.invoke(Boolean.valueOf(z6));
    }
}
