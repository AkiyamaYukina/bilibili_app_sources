package com.bilibili.studio.videoeditor.generalrender.model;

import Ih0.InterfaceC2297a;
import android.app.Activity;
import com.bilibili.commons.io.FileUtils;
import com.bilibili.studio.videoeditor.generalrender.bean.GRResourceInfo;
import com.bilibili.studio.videoeditor.generalrender.model.p;
import java.io.File;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/GRUrlDownloadManager$downloadGeneralResource$1.class */
final class GRUrlDownloadManager$downloadGeneralResource$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Activity $act;
    final InterfaceC2297a $callback;
    final GRResourceInfo $info;
    final String $resourcePath;
    final String $resourceUrl;
    long J$0;
    int label;
    final p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GRUrlDownloadManager$downloadGeneralResource$1(Activity activity, GRResourceInfo gRResourceInfo, p pVar, InterfaceC2297a interfaceC2297a, String str, String str2, Continuation<? super GRUrlDownloadManager$downloadGeneralResource$1> continuation) {
        super(2, continuation);
        this.$act = activity;
        this.$info = gRResourceInfo;
        this.this$0 = pVar;
        this.$callback = interfaceC2297a;
        this.$resourceUrl = str;
        this.$resourcePath = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GRUrlDownloadManager$downloadGeneralResource$1(this.$act, this.$info, this.this$0, this.$callback, this.$resourceUrl, this.$resourcePath, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            v vVar = v.f109656a;
            Activity activity = this.$act;
            vVar.getClass();
            v.a(activity, false);
            BLog.i("GRUrlDownloadManager", "downloadGeneralResource2:" + Thread.currentThread() + " url" + this.$info.getSource());
            jCurrentTimeMillis = System.currentTimeMillis();
            p pVar = this.this$0;
            Activity activity2 = this.$act;
            GRResourceInfo gRResourceInfo = this.$info;
            InterfaceC2297a interfaceC2297a = this.$callback;
            this.J$0 = jCurrentTimeMillis;
            this.label = 1;
            Lazy<p> lazy = p.f109641c;
            Object objA = pVar.a(activity2, gRResourceInfo, interfaceC2297a, null, this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jCurrentTimeMillis = this.J$0;
            ResultKt.throwOnFailure(obj);
        }
        p.a aVar = (p.a) obj;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        v vVar2 = v.f109656a;
        Activity activity3 = this.$act;
        vVar2.getClass();
        v.a(activity3, true);
        if (aVar.f109644a == 0) {
            xC0.a.c.a(this.$act).b(this.$info);
            String str = this.$resourcePath;
            try {
                Result.Companion companion = Result.Companion;
                obj2 = Result.constructor-impl(Boxing.boxLong(FileUtils.sizeOf(new File(str))));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Object obj3 = obj2;
            if (Result.isFailure-impl(obj2)) {
                obj3 = null;
            }
            Long l7 = (Long) obj3;
            wC0.a.a("template_url", this.$info.getName(), this.$info.getSource(), this.$info.getRange(), jCurrentTimeMillis2, l7 != null ? l7.longValue() : 0L, 0, (String) null, Boxing.boxLong(this.$info.getTemplateId()), false, 0L, 1728);
            this.$callback.a(k.g(this.$info, 0, null, this.$resourceUrl, 48));
        } else {
            this.$callback.a(k.g(this.$info, -600, aVar.f109645b, null, 56));
            wC0.a.a("template_url", this.$info.getName(), this.$info.getSource(), this.$info.getRange(), jCurrentTimeMillis2, 0L, -600, aVar.f109645b, Boxing.boxLong(this.$info.getTemplateId()), false, 0L, 1568);
        }
        return Unit.INSTANCE;
    }
}
