package com.bilibili.mini.player.common.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;
import uh0.C8734c;
import vh0.AbstractC8809a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/common/utils/MiniPlayerUtilsKt$getPanelSuspend$2.class */
public final class MiniPlayerUtilsKt$getPanelSuspend$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC8809a>, Object> {
    final Context $context;
    final vh0.c $pool;
    final C8734c $req;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniPlayerUtilsKt$getPanelSuspend$2(C8734c c8734c, vh0.c cVar, Context context, Continuation<? super MiniPlayerUtilsKt$getPanelSuspend$2> continuation) {
        super(2, continuation);
        this.$req = c8734c;
        this.$pool = cVar;
        this.$context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(vh0.c cVar, AbstractC8809a abstractC8809a) {
        abstractC8809a.n();
        int i7 = abstractC8809a.f128254e;
        if (((ConcurrentHashMap) cVar.f128258b.getValue()).size() >= cVar.f128257a) {
            BLog.i("MiniPlayerViewPool", "put panel failed, pool is full");
        } else {
            BLog.i("MiniPlayerViewPool", "put panel success, panel:" + abstractC8809a);
            ((ConcurrentHashMap) cVar.f128258b.getValue()).put(Integer.valueOf(i7), abstractC8809a);
        }
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MiniPlayerUtilsKt$getPanelSuspend$2(this.$req, this.$pool, this.$context, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC8809a> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Exception {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int iHashCode = this.$req.f127868b.hashCode();
        AbstractC8809a abstractC8809a = (AbstractC8809a) ((ConcurrentHashMap) this.$pool.f128258b.getValue()).get(Integer.valueOf(iHashCode));
        BLog.i("MiniPlayerViewPool", "get panel, panel:" + abstractC8809a);
        AbstractC8809a abstractC8809a2 = abstractC8809a;
        if (abstractC8809a == null) {
            try {
                AbstractC8809a abstractC8809aNewInstance = this.$req.f127868b.newInstance();
                Context context = this.$context;
                Configuration configuration = new Configuration(this.$context.getResources().getConfiguration());
                Context context2 = this.$context;
                configuration.uiMode &= -49;
                configuration.uiMode = MultipleThemeUtils.isNightTheme(context2) ? configuration.uiMode | 32 : configuration.uiMode | 16;
                Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
                if (abstractC8809aNewInstance != null) {
                    abstractC8809aNewInstance.f128255f = contextCreateConfigurationContext.getApplicationContext();
                    abstractC8809aNewInstance.f128256g = abstractC8809aNewInstance.i(LayoutInflater.from(contextCreateConfigurationContext));
                    abstractC8809aNewInstance.e();
                    abstractC8809aNewInstance.l();
                }
                abstractC8809a2 = abstractC8809aNewInstance;
                if (abstractC8809aNewInstance != null) {
                    abstractC8809aNewInstance.f128254e = iHashCode;
                    abstractC8809a2 = abstractC8809aNewInstance;
                }
            } catch (Exception e7) {
                BLog.e("MiniPlayerPanelTool", "create panel failed, requires a no-parameter constructor");
                throw e7;
            }
        }
        if (abstractC8809a2 != null) {
            final vh0.c cVar = this.$pool;
            abstractC8809a2.h.add(new Function1(cVar) { // from class: com.bilibili.mini.player.common.utils.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final vh0.c f66106a;

                {
                    this.f66106a = cVar;
                }

                public final Object invoke(Object obj2) {
                    return MiniPlayerUtilsKt$getPanelSuspend$2.invokeSuspend$lambda$1(this.f66106a, (AbstractC8809a) obj2);
                }
            });
        }
        if (abstractC8809a2 != null) {
            return abstractC8809a2;
        }
        throw new Exception("MiniPlayerPanelTool,can not return null panel for mini player");
    }
}
