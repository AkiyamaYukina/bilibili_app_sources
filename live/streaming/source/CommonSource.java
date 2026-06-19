package com.bilibili.live.streaming.source;

import com.bilibili.live.streaming.AVContext;
import com.bilibili.live.streaming.filter.FilterBase;
import com.bilibili.live.streaming.filter.IVideoSource;
import com.bilibili.live.streaming.log.LivePusherLog;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/CommonSource.class */
public final class CommonSource extends FilterBase {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String ID = "CommonSource";

    @NotNull
    public static final String SOURCE_ID = "source_id";

    @Nullable
    private Integer sourceId;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/CommonSource$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void changeSourceID(@Nullable Integer num) {
        this.sourceId = num;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void destroy() {
        LivePusherLog.i$default(ID, this + ", destroy!!", null, 4, null);
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    @Nullable
    public IVideoSource findInnerFilter(@Nullable String str) {
        IVideoSource iVideoSourceFindInnerFilter = super.findInnerFilter(str);
        IVideoSource iVideoSourceFindInnerFilter2 = iVideoSourceFindInnerFilter;
        if (iVideoSourceFindInnerFilter == null) {
            AVContext aVContext = this.mCtx;
            Integer num = this.sourceId;
            FilterBase commonSource = aVContext.getCommonSource(num != null ? num.intValue() : -1);
            iVideoSourceFindInnerFilter2 = commonSource != null ? commonSource.findInnerFilter(str) : null;
        }
        return iVideoSourceFindInnerFilter2;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public int getHeight() {
        AVContext aVContext = this.mCtx;
        Integer num = this.sourceId;
        FilterBase commonSource = aVContext.getCommonSource(num != null ? num.intValue() : -1);
        return commonSource != null ? commonSource.getHeight() : 0;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    @NotNull
    public String getID() {
        return ID;
    }

    @Nullable
    public final Integer getSourceId() {
        return this.sourceId;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public int getWidth() {
        AVContext aVContext = this.mCtx;
        Integer num = this.sourceId;
        FilterBase commonSource = aVContext.getCommonSource(num != null ? num.intValue() : -1);
        return commonSource != null ? commonSource.getWidth() : 0;
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public void loadConfig(@Nullable JSONObject jSONObject) {
        super.loadConfig(jSONObject);
        if (jSONObject != null) {
            this.sourceId = Integer.valueOf(jSONObject.optInt(SOURCE_ID));
        }
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public int preferFitMode() {
        AVContext aVContext = this.mCtx;
        Integer num = this.sourceId;
        FilterBase commonSource = aVContext.getCommonSource(num != null ? num.intValue() : -1);
        return commonSource != null ? commonSource.preferFitMode() : super.preferFitMode();
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public boolean render(int i7) {
        AVContext aVContext = this.mCtx;
        Integer num = this.sourceId;
        FilterBase commonSource = aVContext.getCommonSource(num != null ? num.intValue() : -1);
        return commonSource != null ? commonSource.render(i7) : true;
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    @NotNull
    public JSONObject saveConfig() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SOURCE_ID, this.sourceId);
        } catch (JSONException e7) {
            LivePusherLog.e(ID, "saveConfig: fail to generate json", e7);
        }
        return jSONObject;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void tick(long j7) {
    }
}
