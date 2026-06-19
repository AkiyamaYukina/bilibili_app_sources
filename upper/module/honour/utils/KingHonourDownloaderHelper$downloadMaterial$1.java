package com.bilibili.upper.module.honour.utils;

import com.bilibili.upper.module.honour.bean.KingHonourDownloadBean;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/utils/KingHonourDownloaderHelper$downloadMaterial$1.class */
final class KingHonourDownloaderHelper$downloadMaterial$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final KingHonourDownloadBean $materialInfo;
    int label;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KingHonourDownloaderHelper$downloadMaterial$1(KingHonourDownloadBean kingHonourDownloadBean, c cVar, Continuation<? super KingHonourDownloaderHelper$downloadMaterial$1> continuation) {
        super(2, continuation);
        this.$materialInfo = kingHonourDownloadBean;
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KingHonourDownloaderHelper$downloadMaterial$1(this.$materialInfo, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                String url = this.$materialInfo.getUrl();
                if (url != null && url.length() != 0) {
                    c cVar = this.this$0;
                    String url2 = this.$materialInfo.getUrl();
                    this.this$0.getClass();
                    String str = OC0.h.f17832x;
                    String strB = c.b(this.this$0, this.$materialInfo.getUrl());
                    this.label = 1;
                    if (c.a(cVar, url2, str, strB, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.this$0.getClass();
                BLog.e("KingHonourDownloaderHelper", "url is null, index is " + this.$materialInfo.getIndex());
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.getClass();
            String str2 = OC0.h.f17832x + c.b(this.this$0, this.$materialInfo.getUrl());
            a aVar = this.this$0.f113339b;
            if (aVar != null) {
                int index = this.$materialInfo.getIndex();
                c cVar2 = (c) aVar.f113331a;
                ((LinkedHashMap) cVar2.f113341d).clear();
                ((ArrayList) b.f113334c).remove(cVar2);
                if (b.f113337f != null) {
                    ((ArrayList) b.f113336e).add(new KingHonourDownloadBean(str2, index, false, 4, null));
                    b.f113332a.getClass();
                    b.b();
                }
            }
        } catch (Exception e7) {
            a aVar2 = this.this$0.f113340c;
            if (aVar2 != null) {
                e7.getMessage();
                c cVar3 = (c) aVar2.f113331a;
                ((LinkedHashMap) cVar3.f113341d).clear();
                ((ArrayList) b.f113334c).remove(cVar3);
                if (b.f113337f != null) {
                    b.f113332a.getClass();
                    b.b();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
