package com.bilibili.ogvvega.tunnel;

import com.bilibili.ogvvega.protobuf.ProtoAny;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/FramesKt.class */
public final class FramesKt {

    @NotNull
    private static final AtomicLong NEXT_GENERATED_SEQ = new AtomicLong(0);

    @NotNull
    public static final VegaFrameVO newVegaFrame(@NotNull String str, @NotNull Object obj, @NotNull String str2) {
        long jNextSeq = nextSeq();
        FrameOptionVO frameOptionVO = new FrameOptionVO();
        frameOptionVO.setReqId(String.valueOf(jNextSeq));
        frameOptionVO.setSequence(jNextSeq);
        return new VegaFrameVO(frameOptionVO, str, ProtoAny.Companion.pack(obj, str2), new ProtoAny());
    }

    public static final long nextSeq() {
        return NEXT_GENERATED_SEQ.getAndIncrement();
    }
}
