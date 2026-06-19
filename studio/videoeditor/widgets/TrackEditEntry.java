package com.bilibili.studio.videoeditor.widgets;

import android.graphics.Rect;
import androidx.annotation.Keep;
import androidx.collection.LongSparseArray;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/TrackEditEntry.class */
@Keep
public class TrackEditEntry {
    public String clipContent;
    public int defaultInPointPosition;
    public long defaultTrimIn;
    public long inPoint;
    public int longPressDragOffsetPosition;
    public LongSparseArray<String> musicTag;
    public long outPoint;
    public Rect rect;
    public long totalTime;
    public long trimIn;
    public long trimOut;

    public TrackEditEntry(Rect rect, long j7, long j8, long j9, int i7, long j10) {
        this.rect = rect;
        this.trimIn = j7;
        this.trimOut = j8;
        this.totalTime = j9;
        this.defaultInPointPosition = i7;
        this.defaultTrimIn = j10;
    }

    public TrackEditEntry(String str, Rect rect, long j7, long j8, long j9, long j10, long j11) {
        this.clipContent = str;
        this.rect = rect;
        this.totalTime = j7;
        this.inPoint = j8;
        this.outPoint = j9;
        this.trimIn = j10;
        this.trimOut = j11;
    }

    public int getHandleOffsetPosition() {
        return (this.rect.left - this.defaultInPointPosition) - this.longPressDragOffsetPosition;
    }
}
