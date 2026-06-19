package com.bilibili.pegasus.hot.tab;

import com.bilibili.lib.gripper.api.internal.ProducerLambda;
import javax.annotation.Nonnull;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/hot/tab/IndexHotFragmentV2Kt$$provideDownloadFetcherService$$Lambda.class */
public class IndexHotFragmentV2Kt$$provideDownloadFetcherService$$Lambda extends ProducerLambda<tv.danmaku.bili.hottopic.shareUtils.a> {
    public IndexHotFragmentV2Kt$$provideDownloadFetcherService$$Lambda(Continuation<?> continuation) {
        super(continuation);
    }

    @Nonnull
    public Continuation<Unit> create(@Nonnull Continuation<?> continuation) {
        return new IndexHotFragmentV2Kt$$provideDownloadFetcherService$$Lambda(continuation);
    }

    public Object invokeProducer() {
        return d.provideDownloadFetcherService();
    }
}
