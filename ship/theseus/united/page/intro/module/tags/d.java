package com.bilibili.ship.theseus.united.page.intro.module.tags;

import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bilibili.ship.theseus.united.page.intro.module.tags.f;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/d.class */
public final class d implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.b f101950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ref.IntRef f101952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f101953d;

    public d(f.b bVar, String str, Ref.IntRef intRef, String str2) {
        this.f101950a = bVar;
        this.f101951b = str;
        this.f101952c = intRef;
        this.f101953d = str2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        LifecycleCoroutineScope lifecycleScope;
        view.removeOnLayoutChangeListener(this);
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new TagsComponent$CellAdapter$onBindViewHolder$3$1(this.f101950a, this.f101951b, this.f101952c, this.f101953d, null), 3, (Object) null);
    }
}
