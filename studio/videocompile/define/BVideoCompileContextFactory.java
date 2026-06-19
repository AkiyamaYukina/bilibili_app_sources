package com.bilibili.studio.videocompile.define;

import KA0.a;
import com.bilibili.studio.kaleidoscope.sdk.StreamingContext;
import com.bilibili.studio.kaleidoscope.sdk.montage.MonTimelineImpl;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import mA0.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/define/BVideoCompileContextFactory.class */
public final class BVideoCompileContextFactory {

    @NotNull
    public static final BVideoCompileContextFactory INSTANCE = new BVideoCompileContextFactory();

    @JvmStatic
    @NotNull
    public static final KaleidoscopeVideoCompileContext newKaleidoscopeCompileContext(@NotNull Object obj, @NotNull Object obj2) {
        StreamingContext streamingContextA = b.a(obj);
        return new KaleidoscopeVideoCompileContext(streamingContextA, obj2 instanceof MonTimelineImpl ? (MonTimelineImpl) obj2 : streamingContextA.asTimeline(obj2));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [KA0.a, com.bilibili.studio.videocompile.define.BVideoCompileContext] */
    @Deprecated(message = "弃用，后续请使用newKaleidoscopeCompileContext")
    @JvmStatic
    @NotNull
    public static final a newMeicamCompileContext(@NotNull Object obj, @NotNull Object obj2) {
        StreamingContext streamingContextA = b.a(obj);
        return new BVideoCompileContext(streamingContextA, obj2 instanceof MonTimelineImpl ? (MonTimelineImpl) obj2 : streamingContextA.asTimeline(obj2), null);
    }
}
