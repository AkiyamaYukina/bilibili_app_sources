package com.bilibili.studio.videoeditor.template;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tv.danmaku.bili.change.k;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/U.class */
public final /* synthetic */ class U implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f110003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function f110004c;

    public /* synthetic */ U(int i7, Object obj, Function function) {
        this.f110002a = i7;
        this.f110003b = obj;
        this.f110004c = function;
    }

    public final Object invoke(Object obj) {
        switch (this.f110002a) {
            case 0:
                Throwable th = (Throwable) obj;
                BiliTemplateEngineManager biliTemplateEngineManager = (BiliTemplateEngineManager) this.f110003b;
                com.bilibili.upper.module.contribute.picker.model.p pVar = biliTemplateEngineManager.f109912c;
                if (pVar != null) {
                    pVar.invoke(th);
                }
                BiliTemplateResource biliTemplateResource = BiliTemplateResource.TemplateMaterial;
                Boolean bool = Boolean.FALSE;
                String message = th.getMessage();
                String str = message;
                if (message == null) {
                    str = "";
                }
                this.f110004c.invoke(biliTemplateResource, bool, str, (Object) null);
                biliTemplateEngineManager.f109911b = null;
                biliTemplateEngineManager.f109912c = null;
                break;
            default:
                LazyListScope lazyListScope = (LazyListScope) obj;
                tv.danmaku.bili.change.n nVar = (tv.danmaku.bili.change.n) this.f110003b;
                LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(769585005, true, new tv.danmaku.bili.change.g(nVar)), 3, null);
                List list = nVar.a;
                int size = list.size();
                k.a aVar = new k.a(list);
                Function1 function1 = this.f110004c;
                lazyListScope.items(size, null, aVar, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new k.b(list, nVar, function1)));
                LazyListScope.item$default(lazyListScope, null, null, tv.danmaku.bili.change.r.c, 3, null);
                LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-194264779, true, new tv.danmaku.bili.change.h(function1, nVar)), 3, null);
                break;
        }
        return Unit.INSTANCE;
    }
}
