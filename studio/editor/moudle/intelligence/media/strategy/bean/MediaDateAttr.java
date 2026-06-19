package com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean;

import K7.O;
import androidx.annotation.Keep;
import com.bilibili.studio.config.bean.MediaStrategyFestivalConfig;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/bean/MediaDateAttr.class */
@Keep
public final class MediaDateAttr {

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    private static final MediaDateAttr VIDEO = new MediaDateAttr("1970", "", false, 4, null);
    private boolean isFestival;

    @NotNull
    private String start2End;

    @NotNull
    private String typeStr;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/bean/MediaDateAttr$a.class */
    public static final class a {
        @NotNull
        public static MediaDateAttr a(@Nullable Long l7, @Nullable List list) {
            MediaDateAttr mediaDateAttr;
            Object next;
            long jLongValue = (l7 != null ? l7.longValue() : 0L) * ((long) 1000);
            MediaStrategyFestivalConfig mediaStrategyFestivalConfig = null;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    next = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                    MediaStrategyFestivalConfig mediaStrategyFestivalConfig2 = (MediaStrategyFestivalConfig) next;
                    long startTime = mediaStrategyFestivalConfig2.getStartTime();
                    if (jLongValue <= mediaStrategyFestivalConfig2.getEndTime() && startTime <= jLongValue) {
                        break;
                    }
                }
                mediaStrategyFestivalConfig = (MediaStrategyFestivalConfig) next;
            }
            if (mediaStrategyFestivalConfig != null) {
                return new MediaDateAttr(ec.a.a(mediaStrategyFestivalConfig.getStartTime(), mediaStrategyFestivalConfig.getEndTime(), "-"), "节日", true);
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(jLongValue));
            int i7 = calendar.get(7);
            calendar.set(11, 0);
            calendar.set(12, 0);
            long jA = O.a(calendar, 13, 0, 14, 0);
            if (i7 == 1) {
                long j7 = 86400000;
                mediaDateAttr = new MediaDateAttr(ec.a.a(jA - j7, jA + j7, "-"), "周末", false, 4, null);
            } else if (i7 != 7) {
                long j8 = jA - ((long) ((i7 - 2) * 86400000));
                mediaDateAttr = new MediaDateAttr(ec.a.a(j8, ((long) 432000000) + j8, "-"), "工作日", false, 4, null);
            } else {
                mediaDateAttr = new MediaDateAttr(ec.a.a(jA, ((long) 172800000) + jA, "-"), "周末", false, 4, null);
            }
            return mediaDateAttr;
        }
    }

    public MediaDateAttr() {
        this("", "", false);
    }

    public MediaDateAttr(@NotNull String str, @NotNull String str2, boolean z6) {
        this.start2End = str;
        this.typeStr = str2;
        this.isFestival = z6;
    }

    public /* synthetic */ MediaDateAttr(String str, String str2, boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i7 & 4) != 0 ? false : z6);
    }

    @NotNull
    public final String getStart2End() {
        return this.start2End;
    }

    @NotNull
    public final String getTypeStr() {
        return this.typeStr;
    }

    public final boolean isFestival() {
        return this.isFestival;
    }

    public final void setFestival(boolean z6) {
        this.isFestival = z6;
    }

    public final void setStart2End(@NotNull String str) {
        this.start2End = str;
    }

    public final void setTypeStr(@NotNull String str) {
        this.typeStr = str;
    }
}
