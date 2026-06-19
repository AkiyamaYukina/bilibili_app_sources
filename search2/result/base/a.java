package com.bilibili.search2.result.base;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.BaseSearchItem;
import dt0.AbstractC6843f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/a.class */
@StabilityInferred(parameters = 0)
public abstract class a extends w<AbstractC6843f<BaseSearchItem>> {
    @Override // com.bilibili.search2.result.base.w
    @NotNull
    /* JADX INFO: renamed from: W */
    public AbstractC6843f onCreateViewHolder(int i7, @NotNull ViewGroup viewGroup) {
        Z7.c cVarA;
        try {
            cVarA = ((com.bilibili.search2.result.all.p) this).f87308f.a(i7, viewGroup);
        } catch (NullPointerException e7) {
            e7.printStackTrace();
            cVarA = null;
        }
        return cVarA instanceof AbstractC6843f ? (AbstractC6843f) cVarA : super.onCreateViewHolder(i7, viewGroup);
    }
}
