package com.bilibili.live.streaming.gl;

import com.bilibili.live.streaming.AVContext;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.gl.BGLP010Conversion;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLP010Conversion$ConversionContext$getResult$1$1.class */
public final class BGLP010Conversion$ConversionContext$getResult$1$1 implements ConversionResult {
    final OpenGLESBuffer $it;
    final ByteBuffer $mappedBuffer;
    final BGLP010Conversion.ConversionContext this$0;
    final BGLP010Conversion this$1;

    public BGLP010Conversion$ConversionContext$getResult$1$1(BGLP010Conversion.ConversionContext conversionContext, ByteBuffer byteBuffer, BGLP010Conversion bGLP010Conversion, OpenGLESBuffer openGLESBuffer) {
        this.this$0 = conversionContext;
        this.$mappedBuffer = byteBuffer;
        this.this$1 = bGLP010Conversion;
        this.$it = openGLESBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void release$lambda$0(OpenGLESBuffer openGLESBuffer, BGLP010Conversion bGLP010Conversion, BGLP010Conversion.ConversionContext conversionContext) {
        openGLESBuffer.UnmapBuffer();
        bGLP010Conversion.releaseConversionContext(conversionContext);
    }

    @Override // com.bilibili.live.streaming.gl.ConversionResult
    public Object getOpaque() {
        return this.this$0.opaque;
    }

    @Override // com.bilibili.live.streaming.gl.ConversionResult
    public void release() {
        AVContext aVContext = this.this$1.avCtx;
        AVContext aVContext2 = aVContext;
        if (aVContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avCtx");
            aVContext2 = null;
        }
        final OpenGLESBuffer openGLESBuffer = this.$it;
        final BGLP010Conversion bGLP010Conversion = this.this$1;
        final BGLP010Conversion.ConversionContext conversionContext = this.this$0;
        aVContext2.runInBackground(0L, new Runnable(openGLESBuffer, bGLP010Conversion, conversionContext) { // from class: com.bilibili.live.streaming.gl.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OpenGLESBuffer f65331a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BGLP010Conversion f65332b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BGLP010Conversion.ConversionContext f65333c;

            {
                this.f65331a = openGLESBuffer;
                this.f65332b = bGLP010Conversion;
                this.f65333c = conversionContext;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BGLP010Conversion$ConversionContext$getResult$1$1.release$lambda$0(this.f65331a, this.f65332b, this.f65333c);
            }
        });
    }

    @Override // com.bilibili.live.streaming.gl.ConversionResult
    public int store(ByteBuffer byteBuffer) throws BGLException {
        if (byteBuffer.limit() - byteBuffer.position() < this.this$0.availableOutDataSize) {
            throw new BGLException(BGLException.ID.BUFFER_ERROR, "P010ConversionContext Buffer too small for output data");
        }
        if (this.$mappedBuffer.isDirect() && byteBuffer.isDirect()) {
            this.this$1.memcpy64(this.$mappedBuffer, 0, byteBuffer, 0, this.this$0.availableOutDataSize);
        } else {
            byteBuffer.put(this.$mappedBuffer);
        }
        return this.this$0.availableOutDataSize;
    }
}
