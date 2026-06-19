package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4;

import H41.h;
import H41.i;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaDateAttr;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaSortedItem;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem;
import com.bilibili.studio.videoeditor.loader.ImageItem;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/f.class */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f107477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f107478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f107479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<String, MediaStrategyItem> f107480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<String, MediaStrategyItem> f107481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TreeSet<MediaSortedItem> f107482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f107483g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f107484i;

    public f(@NotNull uz0.b bVar) {
        this.f107477a = bVar.a;
        int i7 = bVar.b;
        this.f107478b = i7 != 1 ? i7 != 2 ? i7 != 3 ? MediaStrategyItem.SOURCE_FROM_OTHER : "视频" : "图片" : MediaStrategyItem.SOURCE_FROM_ALL;
        this.f107479c = bVar.g;
        this.f107480d = new ConcurrentHashMap<>();
        this.f107481e = new ConcurrentHashMap<>();
        this.f107482f = new TreeSet<>(new MediaSortedItem());
        this.h = LazyKt.lazy(new h(7));
        this.f107484i = LazyKt.lazy(new i(7));
    }

    public final void a(MediaStrategyItem mediaStrategyItem) {
        MediaDateAttr dateAttr;
        int iIntValue;
        Integer num;
        String label = mediaStrategyItem.getLabel();
        if (label == null || label.length() == 0) {
            return;
        }
        Lazy lazy = this.f107484i;
        List list = (List) lazy.getValue();
        if (list == null || list.isEmpty()) {
            return;
        }
        if (mediaStrategyItem.isVideo()) {
            MediaDateAttr.Companion.getClass();
            dateAttr = MediaDateAttr.VIDEO;
        } else {
            dateAttr = mediaStrategyItem.getDateAttr();
            if (dateAttr == null) {
                MediaDateAttr.a aVar = MediaDateAttr.Companion;
                ImageItem source = mediaStrategyItem.getSource();
                Long lValueOf = source != null ? Long.valueOf(source.addTime) : null;
                List list2 = (List) lazy.getValue();
                aVar.getClass();
                dateAttr = MediaDateAttr.a.a(lValueOf, list2);
            }
        }
        String str = mediaStrategyItem.isVideo() ? "视频" : "图片";
        String strA = U1.i.a(str, "&&", label, "&&", dateAttr.getTypeStr());
        String strA2 = B0.a.a(str, "&&", label);
        Lazy lazy2 = this.h;
        Map map = (Map) lazy2.getValue();
        if (map == null || (num = (Integer) map.get(strA)) == null) {
            Map map2 = (Map) lazy2.getValue();
            Integer num2 = null;
            if (map2 != null) {
                num2 = (Integer) map2.get(strA2);
            }
            if (num2 == null) {
                return;
            } else {
                iIntValue = num2.intValue();
            }
        } else {
            iIntValue = num.intValue();
        }
        mediaStrategyItem.setPriority(iIntValue);
        mediaStrategyItem.setDateAttr(dateAttr);
    }
}
