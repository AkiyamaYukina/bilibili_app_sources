package com.bilibili.studio.kaleidoscope.adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.studio.kaleidoscope.adapter.param.StreamingContextParam;
import com.bilibili.studio.kaleidoscope.sdk.StreamingContext;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/adapter/Editor.class */
public interface Editor {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/adapter/Editor$ICreateStreamingContextCallbackWrapper.class */
    public interface ICreateStreamingContextCallbackWrapper {
        void onLoadResult(int i7, String str);
    }

    void clearCachedResources(StreamingContext streamingContext, boolean z6);

    StreamingContext createAuxiliaryStreamingContext(@NonNull StreamingContextParam streamingContextParam) throws NullPointerException;

    StreamingContext createStreamingContext(@NonNull Context context, @NonNull StreamingContextParam streamingContextParam, @Nullable ICreateStreamingContextCallbackWrapper iCreateStreamingContextCallbackWrapper);

    void destroyAuxiliaryStreamingContext(StreamingContext streamingContext);

    void destroyStreamingContext(StreamingContext streamingContext);

    String getEditType();

    @Nullable
    StreamingContext getStreamingContext();

    void setCheckEnable(boolean z6);

    void setDebugLevel(boolean z6);
}
