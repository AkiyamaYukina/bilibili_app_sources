package com.bilibili.sistersplayer.p2p.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/utils/BMutex.class */
public final class BMutex {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static AtomicInteger maxMutexId = new AtomicInteger(0);
    private boolean isLocked;

    @NotNull
    private final List<Continuation<Object>> waitingList = new ArrayList();
    private final int mutexId = maxMutexId.getAndAdd(1);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/utils/BMutex$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getMaxMutexId$annotations() {
        }

        @NotNull
        public final AtomicInteger getMaxMutexId() {
            return BMutex.maxMutexId;
        }

        public final void setMaxMutexId(@NotNull AtomicInteger atomicInteger) {
            BMutex.maxMutexId = atomicInteger;
        }
    }

    @NotNull
    public static final AtomicInteger getMaxMutexId() {
        return Companion.getMaxMutexId();
    }

    public static final void setMaxMutexId(@NotNull AtomicInteger atomicInteger) {
        Companion.setMaxMutexId(atomicInteger);
    }

    public final int getId() {
        return this.mutexId;
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    @Nullable
    public final Object lock(@NotNull Continuation<? super Unit> continuation) {
        if (!this.isLocked) {
            this.isLocked = true;
            return Unit.INSTANCE;
        }
        Continuation<Object> safeContinuation = new SafeContinuation<>(IntrinsicsKt.intercepted(continuation));
        this.waitingList.add(safeContinuation);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : Unit.INSTANCE;
    }

    public final void unlock() {
        Continuation continuation = (Continuation) CollectionsKt.removeFirstOrNull(this.waitingList);
        if (continuation == null) {
            this.isLocked = false;
        } else {
            continuation.resumeWith(Result.constructor-impl((Object) null));
        }
    }
}
