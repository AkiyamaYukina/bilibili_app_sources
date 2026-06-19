package com.bilibili.playerbizcommonv2.videomentioned;

import android.content.Context;
import android.view.ViewGroup;
import com.bilibili.app.gemini.ui.UIComponent;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/s.class */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UIComponent f82044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f82045b;

    public /* synthetic */ s(UIComponent uIComponent, CoroutineScope coroutineScope) {
        this.f82044a = uIComponent;
        this.f82045b = coroutineScope;
    }

    public final Object invoke(Object obj) {
        UIComponent uIComponent = this.f82044a;
        UIComponent.ViewEntry viewEntryCreateViewEntry$default = UIComponent.createViewEntry$default(uIComponent, (Context) obj, (ViewGroup) null, 2, (Object) null);
        BuildersKt.launch$default(this.f82045b, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new VideoMentionedDialogComponent$Section$1$1$1$1$1$1$1$1(uIComponent, viewEntryCreateViewEntry$default, null), 1, (Object) null);
        return viewEntryCreateViewEntry$default.getRoot();
    }
}
