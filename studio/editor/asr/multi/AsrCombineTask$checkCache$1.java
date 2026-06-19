package com.bilibili.studio.editor.asr.multi;

import com.alibaba.fastjson.JSON;
import com.bilibili.studio.editor.asr.bean.AsrResultWrapper;
import com.bilibili.studio.editor.asr.cache.AsrResultCacheV3;
import com.bilibili.studio.editor.asr.multi.a;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/AsrCombineTask$checkCache$1.class */
final class AsrCombineTask$checkCache$1 extends SuspendLambda implements Function2<a.C1186a, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrCombineTask$checkCache$1(a aVar, Continuation<? super AsrCombineTask$checkCache$1> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AsrCombineTask$checkCache$1 asrCombineTask$checkCache$1 = new AsrCombineTask$checkCache$1(this.this$0, continuation);
        asrCombineTask$checkCache$1.L$0 = obj;
        return asrCombineTask$checkCache$1;
    }

    public final Object invoke(a.C1186a c1186a, Continuation<? super Unit> continuation) {
        return create(c1186a, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        AsrResultCacheV3.Cache cache;
        Object obj2;
        AsrResultWrapper asrResultWrapper;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        a.C1186a c1186a = (a.C1186a) this.L$0;
        AsrResultCacheV3 asrResultCacheV3 = AsrResultCacheV3.f105530a;
        String str = c1186a.f105623b.f105602a;
        synchronized (asrResultCacheV3) {
            ConcurrentHashMap<String, AsrResultCacheV3.Cache> concurrentHashMap = AsrResultCacheV3.f105533d;
            cache = concurrentHashMap.get(str);
            if (AsrResultCacheV3.d(cache)) {
                Ew0.b.f4798a.i("成功获取内存缓存:" + str);
            } else {
                File file = new File((File) AsrResultCacheV3.f105531b.getValue(), str);
                if (file.exists()) {
                    try {
                        Result.Companion companion = Result.Companion;
                        Object object = JSON.parseObject(FilesKt.h(file), (Class<Object>) AsrResultCacheV3.Cache.class);
                        AsrResultCacheV3.Cache cache2 = (AsrResultCacheV3.Cache) object;
                        if (AsrResultCacheV3.d(cache2)) {
                            Ew0.b.f4798a.i("成功获取文件缓存:" + str);
                            AsrResultCacheV3.c().remove(str);
                            AsrResultCacheV3.c().add(str);
                            AsrResultCacheV3.g();
                            concurrentHashMap.put(str, cache2);
                        }
                        obj2 = Result.constructor-impl((AsrResultCacheV3.Cache) object);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(th));
                    }
                    Throwable th2 = Result.exceptionOrNull-impl(obj2);
                    if (th2 != null) {
                        Ew0.b.f4798a.e("BiliEditorMultiAsrManager", "获取文件缓存失败：" + th2);
                    }
                    if (Result.isFailure-impl(obj2)) {
                        obj2 = null;
                    }
                    cache = (AsrResultCacheV3.Cache) obj2;
                } else {
                    cache = null;
                }
            }
        }
        if (cache != null) {
            if (this.this$0.f105614a) {
                asrResultWrapper = new AsrResultWrapper(c1186a.f105622a, cache.getAsrUtterances(), null, cache.getAsrLabelResult(), 4, null);
            } else {
                asrResultWrapper = new AsrResultWrapper(c1186a.f105622a, cache.getAsrUtterances(), null, cache.getAsrLabelResult(), 4, null);
            }
            c1186a.f105625d = asrResultWrapper;
        }
        return Unit.INSTANCE;
    }
}
