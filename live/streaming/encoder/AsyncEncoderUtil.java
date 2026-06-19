package com.bilibili.live.streaming.encoder;

import I3.A2;
import I3.B2;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import com.bilibili.live.streaming.log.LivePusherLog;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/AsyncEncoderUtil.class */
public final class AsyncEncoderUtil extends MediaCodec.Callback {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "AsyncEncoderUtil";

    @NotNull
    private final MediaCodec encoder;

    @NotNull
    private final Handler handler;

    @NotNull
    private final AtomicBoolean stopped = new AtomicBoolean(false);

    @NotNull
    private final AtomicReference<MediaCodec.CodecException> exception = new AtomicReference<>();

    @NotNull
    private final LinkedList<Integer> inputBufferList = new LinkedList<>();

    @NotNull
    private final Semaphore inputBufferSem = new Semaphore(0);

    @NotNull
    private final LinkedList<Function3<MediaCodec, Integer, Function0<Unit>, Unit>> inputCallback = new LinkedList<>();

    @NotNull
    private final LinkedList<OutBuf> outputBufferList = new LinkedList<>();

    @NotNull
    private final Semaphore outputBufferSem = new Semaphore(0);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/AsyncEncoderUtil$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getTAG() {
            return AsyncEncoderUtil.TAG;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/AsyncEncoderUtil$OutBuf.class */
    public static final class OutBuf {
        private final int index;

        @Nullable
        private final MediaCodec.BufferInfo info;

        public OutBuf(int i7, @Nullable MediaCodec.BufferInfo bufferInfo) {
            this.index = i7;
            this.info = bufferInfo;
        }

        public final int getIndex() {
            return this.index;
        }

        @Nullable
        public final MediaCodec.BufferInfo getInfo() {
            return this.info;
        }
    }

    public AsyncEncoderUtil(@NotNull MediaCodec mediaCodec) {
        this.encoder = mediaCodec;
        Handler handler = new Handler(Looper.myLooper());
        this.handler = handler;
        mediaCodec.setCallback(this, handler);
    }

    private final int dequeueInputBuffer(long j7) {
        int iIntValue;
        if (this.inputBufferSem.tryAcquire(j7, TimeUnit.MICROSECONDS)) {
            synchronized (this.inputBufferList) {
                iIntValue = ((Number) CollectionsKt.first(this.inputBufferList)).intValue();
                this.inputBufferList.remove();
            }
        } else {
            iIntValue = -1;
        }
        return iIntValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroy$lambda$3(AsyncEncoderUtil asyncEncoderUtil) {
        Iterator<T> it = asyncEncoderUtil.inputCallback.iterator();
        while (it.hasNext()) {
            ((Function3) it.next()).invoke(asyncEncoderUtil.encoder, -1, new B2(10));
        }
        asyncEncoderUtil.inputCallback.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit destroy$lambda$3$lambda$2$lambda$1() {
        return Unit.INSTANCE;
    }

    private final void processInput() {
        final int iDequeueInputBuffer;
        if (this.inputCallback.isEmpty() || (iDequeueInputBuffer = dequeueInputBuffer(0L)) < 0) {
            return;
        }
        Function3 function3 = (Function3) CollectionsKt.first(this.inputCallback);
        this.inputCallback.remove();
        function3.invoke(this.encoder, Integer.valueOf(iDequeueInputBuffer), new Function0(this, iDequeueInputBuffer) { // from class: com.bilibili.live.streaming.encoder.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AsyncEncoderUtil f65253a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f65254b;

            {
                this.f65253a = this;
                this.f65254b = iDequeueInputBuffer;
            }

            public final Object invoke() {
                return AsyncEncoderUtil.processInput$lambda$11(this.f65253a, this.f65254b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit processInput$lambda$11(final AsyncEncoderUtil asyncEncoderUtil, final int i7) {
        asyncEncoderUtil.handler.post(new Runnable(asyncEncoderUtil, i7) { // from class: com.bilibili.live.streaming.encoder.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AsyncEncoderUtil f65255a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f65256b;

            {
                this.f65255a = asyncEncoderUtil;
                this.f65256b = i7;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AsyncEncoderUtil.processInput$lambda$11$lambda$10(this.f65255a, this.f65256b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processInput$lambda$11$lambda$10(AsyncEncoderUtil asyncEncoderUtil, int i7) {
        asyncEncoderUtil.onInputBufferAvailable(asyncEncoderUtil.encoder, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queueInput$lambda$9(AsyncEncoderUtil asyncEncoderUtil, Function3 function3) {
        if (asyncEncoderUtil.stopped.get()) {
            function3.invoke(asyncEncoderUtil.encoder, -1, new A2(10));
        } else {
            asyncEncoderUtil.inputCallback.add(function3);
            asyncEncoderUtil.processInput();
        }
    }

    public final int dequeueOutputBuffer(@NotNull MediaCodec.BufferInfo bufferInfo, long j7) {
        int index;
        if (this.stopped.get()) {
            bufferInfo.flags = 4;
            bufferInfo.size = 0;
            return 0;
        }
        MediaCodec.CodecException codecException = this.exception.get();
        if (codecException != null) {
            throw codecException;
        }
        if (this.outputBufferSem.tryAcquire(j7, TimeUnit.MICROSECONDS)) {
            synchronized (this.outputBufferList) {
                OutBuf outBuf = (OutBuf) CollectionsKt.first(this.outputBufferList);
                this.outputBufferList.remove();
                MediaCodec.BufferInfo info = outBuf.getInfo();
                if (info != null) {
                    bufferInfo.set(info.offset, info.size, info.presentationTimeUs, info.flags);
                }
                index = outBuf.getIndex();
            }
        } else {
            index = -1;
        }
        return index;
    }

    public final void destroy() {
        this.stopped.set(true);
        this.handler.post(new Mp0.d(this, 1));
    }

    public final void finalize() {
        if (this.inputCallback.isEmpty()) {
            return;
        }
        LivePusherLog.e$default(TAG, "inputCallback is not empty when finalize!!", null, 4, null);
    }

    @NotNull
    public final MediaCodec getEncoder() {
        return this.encoder;
    }

    @NotNull
    public final AtomicReference<MediaCodec.CodecException> getException() {
        return this.exception;
    }

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    @NotNull
    public final LinkedList<Integer> getInputBufferList() {
        return this.inputBufferList;
    }

    @NotNull
    public final Semaphore getInputBufferSem() {
        return this.inputBufferSem;
    }

    @NotNull
    public final LinkedList<Function3<MediaCodec, Integer, Function0<Unit>, Unit>> getInputCallback() {
        return this.inputCallback;
    }

    @NotNull
    public final LinkedList<OutBuf> getOutputBufferList() {
        return this.outputBufferList;
    }

    @NotNull
    public final Semaphore getOutputBufferSem() {
        return this.outputBufferSem;
    }

    @NotNull
    public final AtomicBoolean getStopped() {
        return this.stopped;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(@NotNull MediaCodec mediaCodec, @NotNull MediaCodec.CodecException codecException) {
        this.exception.set(codecException);
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(@NotNull MediaCodec mediaCodec, int i7) {
        synchronized (this.inputBufferList) {
            this.inputBufferList.add(Integer.valueOf(i7));
        }
        this.inputBufferSem.release();
        processInput();
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(@NotNull MediaCodec mediaCodec, int i7, @NotNull MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.outputBufferList) {
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
            this.outputBufferList.add(new OutBuf(i7, bufferInfo2));
        }
        this.outputBufferSem.release();
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(@NotNull MediaCodec mediaCodec, @NotNull MediaFormat mediaFormat) {
        synchronized (this.outputBufferList) {
            this.outputBufferList.add(new OutBuf(-2, null));
        }
        this.outputBufferSem.release();
    }

    public final void queueInput(@NotNull final Function3<? super MediaCodec, ? super Integer, ? super Function0<Unit>, Unit> function3) {
        this.handler.post(new Runnable(this, function3) { // from class: com.bilibili.live.streaming.encoder.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AsyncEncoderUtil f65257a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Function3 f65258b;

            {
                this.f65257a = this;
                this.f65258b = function3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AsyncEncoderUtil.queueInput$lambda$9(this.f65257a, this.f65258b);
            }
        });
    }
}
