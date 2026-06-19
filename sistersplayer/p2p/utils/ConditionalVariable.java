package com.bilibili.sistersplayer.p2p.utils;

import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/utils/ConditionalVariable.class */
public final class ConditionalVariable {

    @NotNull
    private final List<Continuation<Boolean>> notifyList = new ArrayList();

    @NotNull
    private final List<Continuation<Boolean>> notifyingList = new ArrayList();

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.utils.ConditionalVariable$waitUntilAsync$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/utils/ConditionalVariable$waitUntilAsync$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        Object result;
        final ConditionalVariable this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConditionalVariable conditionalVariable, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = conditionalVariable;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.waitUntilAsync(null, null, this);
        }
    }

    private final void notify(boolean z6) {
        Continuation continuation = (Continuation) CollectionsKt.removeFirstOrNull(this.notifyingList);
        if (continuation == null) {
            return;
        }
        continuation.resumeWith(Result.constructor-impl(Boolean.valueOf(z6)));
    }

    private final void prepareNotify() {
        this.notifyingList.addAll(this.notifyList);
        this.notifyList.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Path cross not found for [B:33:0x015a, B:35:0x015f], limit reached: 41 */
    /* JADX WARN: Path cross not found for [B:35:0x015f, B:33:0x015a], limit reached: 41 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0140 -> B:31:0x0146). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object waitUntilAsync(kotlinx.coroutines.sync.Mutex r7, kotlin.jvm.functions.Function0<java.lang.Boolean> r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.utils.ConditionalVariable.waitUntilAsync(kotlinx.coroutines.sync.Mutex, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void notifyOne() {
        prepareNotify();
        notify(false);
    }

    public final void notifyWhole() {
        prepareNotify();
        notify(true);
    }

    @Nullable
    public final Object waitUntil(@NotNull Mutex mutex, @NotNull Function0<Boolean> function0, @NotNull Continuation<? super Unit> continuation) {
        Object objWaitUntilAsync;
        if (!((Boolean) function0.invoke()).booleanValue() && (objWaitUntilAsync = waitUntilAsync(mutex, function0, continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objWaitUntilAsync;
        }
        return Unit.INSTANCE;
    }
}
