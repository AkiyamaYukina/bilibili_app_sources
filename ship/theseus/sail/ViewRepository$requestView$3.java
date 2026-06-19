package com.bilibili.ship.theseus.sail;

import com.bapis.bilibili.app.viewunite.common.Module;
import com.bapis.bilibili.app.viewunite.v1.ECode;
import com.bapis.bilibili.app.viewunite.v1.TabModule;
import com.bapis.bilibili.app.viewunite.v1.ViewReq;
import com.bapis.bilibili.playershared.BizType;
import com.bilibili.ship.theseus.sail.f;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/sail/ViewRepository$requestView$3.class */
final class ViewRepository$requestView$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends e>>, Object> {
    final f.a $param;
    final ViewReq $request;
    int label;
    final f this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/sail/ViewRepository$requestView$3$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f96148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f96149b;

        static {
            int[] iArr = new int[ECode.values().length];
            try {
                iArr[ECode.CODE_404.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ECode.CODE_TEENAGER.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[ECode.CODE_ARC_PRIVACY.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f96148a = iArr;
            int[] iArr2 = new int[BizType.values().length];
            try {
                iArr2[BizType.BIZ_TYPE_UGC.ordinal()] = 1;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr2[BizType.BIZ_TYPE_PGC.ordinal()] = 2;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr2[BizType.BIZ_TYPE_PUGV.ordinal()] = 3;
            } catch (NoSuchFieldError e12) {
            }
            f96149b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewRepository$requestView$3(f fVar, ViewReq viewReq, f.a aVar, Continuation<? super ViewRepository$requestView$3> continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$request = viewReq;
        this.$param = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence invokeSuspend$lambda$0(TabModule tabModule) {
        return tabModule.getTabType().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence invokeSuspend$lambda$2$0(Module module) {
        return module.getType().toString();
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ViewRepository$requestView$3(this.this$0, this.$request, this.$param, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends e>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0314  */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 1300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.sail.ViewRepository$requestView$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
