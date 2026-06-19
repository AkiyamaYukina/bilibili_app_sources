package com.bilibili.live.streaming.gl;

import E2.B;
import android.opengl.GLES31;
import androidx.compose.foundation.gestures.C3392f;
import com.bilibili.live.streaming.AVContext;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.gl.BGLP010Conversion;
import com.bilibili.live.streaming.gl.Shaders;
import com.bilibili.live.streaming.log.LivePusherLog;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.mall.videodetail.vd.united.page.intro.g;
import com.mall.videodetail.vd.united.widget.UnitedRecyclerView;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z.L;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLP010Conversion.class */
public final class BGLP010Conversion {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "P010ConversionContext";
    private AVContext avCtx;
    private int byteDepth;

    @Nullable
    private BGLFramebuffer dummyFramebuffer;

    @Nullable
    private BGLTexture dummyTexture;
    private int inputHeight;
    private int inputWidth;

    @Nullable
    private BGLProgram program;

    @Nullable
    private FloatBuffer vertexBuffer;

    @NotNull
    private BGLP010Conversion$refCount$1 refCount = new RefCount(this) { // from class: com.bilibili.live.streaming.gl.BGLP010Conversion$refCount$1
        final BGLP010Conversion this$0;

        {
            this.this$0 = this;
        }

        @Override // com.bilibili.live.streaming.gl.BGLP010Conversion.RefCount
        public void Destroy() {
            BGLFramebuffer bGLFramebuffer = this.this$0.dummyFramebuffer;
            if (bGLFramebuffer != null) {
                bGLFramebuffer.destroy();
            }
            this.this$0.dummyFramebuffer = null;
            BGLTexture bGLTexture = this.this$0.dummyTexture;
            if (bGLTexture != null) {
                bGLTexture.destroy();
            }
            this.this$0.dummyTexture = null;
            BGLProgram bGLProgram = this.this$0.program;
            if (bGLProgram != null) {
                bGLProgram.destroy();
            }
            this.this$0.program = null;
            this.this$0.vertexBuffer = null;
            LivePusherLog.i$default("P010ConversionContext", C3392f.a(this.this$0.hashCode(), "BGLP010Conversion [", "] destroyed"), null, 4, null);
        }
    };

    @NotNull
    private AtomicBoolean isDestroyed = new AtomicBoolean(false);

    @NotNull
    private final LinkedList<ConversionContext> idleContexts = new LinkedList<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLP010Conversion$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLP010Conversion$ConversionContext.class */
    public final class ConversionContext {
        private int availableOutDataSize;
        private int currentSliceHeight;
        private int currentStride;

        @Nullable
        private Object opaque;

        @Nullable
        private OpenGLESBuffer outSsbo;
        private long syncObject;
        final BGLP010Conversion this$0;

        public ConversionContext(BGLP010Conversion bGLP010Conversion) {
            this.this$0 = bGLP010Conversion;
        }

        private final void abandonSync() {
            long j7 = this.syncObject;
            if (j7 != 0) {
                GLES31.glDeleteSync(j7);
            }
            this.syncObject = 0L;
        }

        private final boolean clientWaitSyncAndReset(int i7) {
            long j7 = this.syncObject;
            boolean z6 = true;
            if (j7 != 0) {
                switch (GLES31.glClientWaitSync(j7, 1, ((long) i7) * TransitionInfo.DEFAULT_DURATION)) {
                    case 37146:
                    case 37148:
                        GLES31.glMemoryBarrier(8192);
                        z6 = true;
                        break;
                    default:
                        B.c(GLES31.glGetError(), "glClientWaitSync Error, code ", BGLP010Conversion.TAG);
                    case 37147:
                        z6 = false;
                        break;
                }
                abandonSync();
            }
            return z6;
        }

        private final void insertSync() {
            abandonSync();
            this.syncObject = GLES31.glFenceSync(37143, 0);
        }

        private final void waitSyncAndReset() {
            long j7 = this.syncObject;
            if (j7 != 0) {
                GLES31.glWaitSync(j7, 0, -1L);
                abandonSync();
            }
        }

        public final void destroy() {
            abandonSync();
            OpenGLESBuffer openGLESBuffer = this.outSsbo;
            if (openGLESBuffer != null) {
                openGLESBuffer.destroy();
            }
            this.outSsbo = null;
            this.currentStride = 0;
            LivePusherLog.i$default(BGLP010Conversion.TAG, C3392f.a(hashCode(), "ConversionContext [", "] destroyed"), null, 4, null);
            Release();
        }

        public final void feedInput(@NotNull BGLTexture bGLTexture, @Nullable Object obj) throws Throwable {
            BGLCurrentState bGLCurrentStateFramebuffer = BGLCurrentState.save().viewport().framebuffer();
            this.this$0.dummyFramebuffer.setAsRenderTarget();
            BGLException.ID id = BGLException.ID.GL_INSTRUMENT;
            BGLUtil.logGLErrAndThrow("SORAYUKI", id, "22222222");
            this.this$0.program.use();
            GLES31.glActiveTexture(33984);
            bGLTexture.bind();
            GLES31.glUniform1i(this.this$0.program.getUniParam("u_input_texture"), 0);
            GLES31.glBindBufferBase(this.outSsbo.BufferType(), 2, this.outSsbo.BufferId());
            GLES31.glUniform1i(3, this.currentStride);
            GLES31.glUniform1i(4, this.currentSliceHeight);
            int attrParam = this.this$0.program.getAttrParam("a_position");
            GLES31.glEnableVertexAttribArray(attrParam);
            GLES31.glVertexAttribPointer(attrParam, 2, 5126, false, 8, (Buffer) this.this$0.vertexBuffer);
            BGLUtil.logGLErrAndThrow("SORAYUKI", id, "55555555");
            GLES31.glDrawArrays(5, 0, 4);
            BGLUtil.logGLErrAndThrow("SORAYUKI", id, "66666666");
            GLES31.glDisableVertexAttribArray(attrParam);
            this.opaque = obj;
            insertSync();
            this.this$0.program.unuse();
            bGLTexture.unbind();
            bGLCurrentStateFramebuffer.restore();
        }

        @Nullable
        public final ConversionResult getResult() {
            OpenGLESBuffer openGLESBuffer;
            BGLP010Conversion$ConversionContext$getResult$1$1 bGLP010Conversion$ConversionContext$getResult$1$1 = null;
            if (hasResult() && (openGLESBuffer = this.outSsbo) != null) {
                BGLP010Conversion bGLP010Conversion = this.this$0;
                if (!clientWaitSyncAndReset(200)) {
                    return null;
                }
                ByteBuffer byteBufferMapBuffer = openGLESBuffer.MapBuffer(true, false, 0, this.availableOutDataSize);
                byteBufferMapBuffer.position(0);
                byteBufferMapBuffer.limit(this.availableOutDataSize);
                bGLP010Conversion$ConversionContext$getResult$1$1 = new BGLP010Conversion$ConversionContext$getResult$1$1(this, byteBufferMapBuffer, bGLP010Conversion, openGLESBuffer);
            }
            return bGLP010Conversion$ConversionContext$getResult$1$1;
        }

        public final boolean hasResult() {
            return this.syncObject != 0;
        }

        public final void init(int i7, int i8) throws BGLException {
            try {
                this.currentStride = i7;
                this.currentSliceHeight = i8;
                this.availableOutDataSize = (this.this$0.inputWidth * this.this$0.byteDepth) + L.a(this.this$0.inputHeight / 2, 1, i7 * 4, i7 * 4 * i8);
                OpenGLESBuffer openGLESBuffer = this.outSsbo;
                if (openGLESBuffer != null) {
                    openGLESBuffer.destroy();
                }
                int i9 = this.currentStride;
                int i10 = this.currentSliceHeight;
                OpenGLESBuffer openGLESBuffer2 = new OpenGLESBuffer(37074, (i10 + (i10 / 2)) * i9 * 4, 35041);
                openGLESBuffer2.init();
                this.outSsbo = openGLESBuffer2;
                AddRef();
                LivePusherLog.i$default(BGLP010Conversion.TAG, "ConversionContext [" + hashCode() + "] created", null, 4, null);
            } catch (BGLException e7) {
                destroy();
                throw e7;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLP010Conversion$Mode.class */
    public static final class Mode {
        private static final EnumEntries $ENTRIES;
        private static final Mode[] $VALUES;
        public static final Mode P010 = new Mode("P010", 0);
        public static final Mode NV12 = new Mode("NV12", 1);

        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{P010, NV12};
        }

        static {
            Mode[] modeArr$values = $values();
            $VALUES = modeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(modeArr$values);
        }

        private Mode(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<Mode> getEntries() {
            return $ENTRIES;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLP010Conversion$RefCount.class */
    public static abstract class RefCount {

        @NotNull
        private AtomicInteger refCount = new AtomicInteger(0);

        public final void AddRef() {
            this.refCount.incrementAndGet();
        }

        public abstract void Destroy();

        public final void Release() {
            if (this.refCount.decrementAndGet() == 0) {
                Destroy();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLP010Conversion$WhenMappings.class */
    public static final /* synthetic */ class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.P010.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Mode.NV12.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroy$lambda$4(BGLP010Conversion bGLP010Conversion) {
        LinkedList linkedList;
        synchronized (bGLP010Conversion.idleContexts) {
            bGLP010Conversion.isDestroyed.set(true);
            linkedList = (LinkedList) bGLP010Conversion.idleContexts.clone();
            bGLP010Conversion.idleContexts.clear();
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((ConversionContext) it.next()).destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void releaseConversionContext$lambda$8(BGLP010Conversion bGLP010Conversion, ConversionContext conversionContext) {
        if (bGLP010Conversion.isDestroyed.get()) {
            conversionContext.destroy();
            return;
        }
        synchronized (bGLP010Conversion.idleContexts) {
            bGLP010Conversion.idleContexts.add(conversionContext);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void destroy() {
        AVContext aVContext = this.avCtx;
        AVContext aVContext2 = aVContext;
        if (aVContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avCtx");
            aVContext2 = null;
        }
        aVContext2.runInBackground(0L, new Runnable(this) { // from class: com.bilibili.live.streaming.gl.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BGLP010Conversion f65330a;

            {
                this.f65330a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BGLP010Conversion.destroy$lambda$4(this.f65330a);
            }
        });
    }

    @Nullable
    public final ConversionContext doConversion(@NotNull BGLTexture bGLTexture, @Nullable Object obj) throws Throwable {
        ConversionContext conversionContext;
        ConversionContext conversionContextRemove;
        synchronized (this.idleContexts) {
            conversionContext = null;
            conversionContextRemove = !this.idleContexts.isEmpty() ? this.idleContexts.remove() : null;
        }
        if (conversionContextRemove != null) {
            conversionContextRemove.feedInput(bGLTexture, obj);
            conversionContext = conversionContextRemove;
        }
        return conversionContext;
    }

    public final void init(@NotNull AVContext aVContext, int i7, int i8, int i9, int i10, @NotNull Mode mode) throws BGLException {
        int i11;
        if (mode == Mode.P010 && i7 % 2 != 0) {
            throw new BGLException(BGLException.ID.ENCODER_ERROR, "P010ConversionContext Width must be MOD 2");
        }
        if (mode == Mode.NV12 && i7 % 4 != 0) {
            throw new BGLException(BGLException.ID.ENCODER_ERROR, "P010ConversionContext Width must be MOD 4");
        }
        this.avCtx = aVContext;
        int i12 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i12 == 1) {
            i11 = 2;
        } else {
            if (i12 != 2) {
                throw new BGLException(BGLException.ID.ENCODER_ERROR, "P010ConversionContext Unknown mode " + mode);
            }
            i11 = 1;
        }
        this.byteDepth = i11;
        this.inputWidth = i7;
        this.inputHeight = i8;
        try {
            IntIterator it = new IntRange(1, 3).iterator();
            while (it.hasNext()) {
                it.nextInt();
                LinkedList<ConversionContext> linkedList = this.idleContexts;
                ConversionContext conversionContext = new ConversionContext(this);
                conversionContext.init(i9, i10);
                linkedList.add(conversionContext);
            }
            Shaders.Transfer transfer = Shaders.Transfer.NO_CONV;
            Shaders.Primaries primaries = Shaders.Primaries.NO_CONV;
            Shaders shaders = new Shaders(transfer, primaries, Shaders.EETF.NO_CONV, primaries, transfer);
            this.program = BGLProgram.compile(shaders.getFullscreenVertexShader(), WhenMappings.$EnumSwitchMapping$0[mode.ordinal()] == 1 ? shaders.getRgbToP010YUVFragmentShader() : shaders.getRgbToSrgbNV12FragmentShader());
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
            this.vertexBuffer = floatBufferAsFloatBuffer;
            floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
            this.vertexBuffer.position(0);
            BGLTexture bGLTextureCreateTex2D = BGLTexture.createTex2D();
            this.dummyTexture = bGLTextureCreateTex2D;
            int i13 = this.byteDepth;
            if (i13 == 2) {
                this.dummyFramebuffer = bGLTextureCreateTex2D.createFramebuffer(this.inputWidth / 2, this.inputHeight / 2);
            } else if (i13 == 1) {
                this.dummyFramebuffer = bGLTextureCreateTex2D.createFramebuffer(this.inputWidth / 4, this.inputHeight / 2);
            }
            BGLFramebuffer bGLFramebuffer = this.dummyFramebuffer;
            if (bGLFramebuffer != null) {
                BGLCurrentState bGLCurrentStateFramebuffer = BGLCurrentState.save().framebuffer();
                bGLFramebuffer.setAsRenderTarget();
                BGLUtil.clear();
                bGLCurrentStateFramebuffer.restore();
            }
            LivePusherLog.i$default(TAG, "BGLP010Conversion [" + hashCode() + "] created", null, 4, null);
        } catch (BGLException e7) {
            destroy();
            throw e7;
        }
    }

    @NotNull
    public final AtomicBoolean isDestroyed() {
        return this.isDestroyed;
    }

    public final native void memcpy64(@Nullable ByteBuffer byteBuffer, int i7, @Nullable ByteBuffer byteBuffer2, int i8, int i9);

    public final void releaseConversionContext(@NotNull final ConversionContext conversionContext) {
        AVContext aVContext = this.avCtx;
        AVContext aVContext2 = aVContext;
        if (aVContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avCtx");
            aVContext2 = null;
        }
        final int i7 = 0;
        aVContext2.runInBackground(0L, new Runnable(i7, this, conversionContext) { // from class: com.bilibili.live.streaming.gl.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f65327a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f65328b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f65329c;

            {
                this.f65327a = i7;
                this.f65328b = this;
                this.f65329c = conversionContext;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f65327a) {
                    case 0:
                        BGLP010Conversion.releaseConversionContext$lambda$8((BGLP010Conversion) this.f65328b, (BGLP010Conversion.ConversionContext) this.f65329c);
                        break;
                    default:
                        ((g) this.f65328b).b((UnitedRecyclerView) this.f65329c);
                        break;
                }
            }
        });
    }

    public final void setDestroyed(@NotNull AtomicBoolean atomicBoolean) {
        this.isDestroyed = atomicBoolean;
    }
}
