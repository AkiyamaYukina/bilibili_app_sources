package com.bilibili.ship.theseus.united.page.floatlayer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.screen.adjust.widget.ScreenAdjustFloatLayerManager;
import com.bilibili.live.streaming.source.TextSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/i.class */
public final class i implements ScreenAdjustFloatLayerManager.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef<Object> f99760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UIComponent<Object> f99761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f99762c;

    public i(Ref.ObjectRef<Object> objectRef, UIComponent<Object> uIComponent, String str) {
        this.f99760a = objectRef;
        this.f99761b = uIComponent;
        this.f99762c = str;
    }

    public final View a(Context context, ViewGroup viewGroup) {
        UIComponent.ViewEntry viewEntry;
        UIComponent.ViewEntry viewEntryCreateViewEntry = this.f99761b.createViewEntry(context, viewGroup);
        this.f99760a.element = viewEntryCreateViewEntry;
        if (viewEntryCreateViewEntry == null) {
            Intrinsics.throwUninitializedPropertyAccessException(TextSource.CFG_CONTENT);
            viewEntry = null;
        } else {
            viewEntry = viewEntryCreateViewEntry;
        }
        return viewEntry.getRoot();
    }

    public final Object bindToView(Continuation<? super Unit> continuation) {
        UIComponent.ViewEntry viewEntry;
        Object obj = this.f99760a.element;
        if (obj == null) {
            Intrinsics.throwUninitializedPropertyAccessException(TextSource.CFG_CONTENT);
            viewEntry = null;
        } else {
            viewEntry = (UIComponent.ViewEntry) obj;
        }
        Object objBindToView = this.f99761b.bindToView(viewEntry, continuation);
        return objBindToView == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objBindToView : Unit.INSTANCE;
    }

    public final String toString() {
        return C8770a.a(new StringBuilder("FloatLayer("), this.f99762c, ")");
    }
}
