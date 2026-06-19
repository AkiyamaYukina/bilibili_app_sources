package com.bilibili.upper.module.aistory.view.dragflowlayout;

import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import com.bilibili.upper.module.aistory.bean.AIStoryMaterialBean;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/aistory/view/dragflowlayout/d.class */
public abstract class d<T> {
    @NonNull
    public abstract AIStoryMaterialBean a(View view);

    @LayoutRes
    public abstract int b();

    public abstract void c(View view, Object obj);
}
