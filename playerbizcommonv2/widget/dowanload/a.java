package com.bilibili.playerbizcommonv2.widget.dowanload;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/a.class */
@StabilityInferred(parameters = 0)
public final class a extends com.bilibili.app.gemini.ui.m<Dr0.g> {
    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        return Unit.INSTANCE;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return Dr0.g.inflate(LayoutInflater.from(context), viewGroup, false);
    }
}
