package com.bilibili.studio.editor.moudle.intelligence.frame.data;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.collection.C3269h;
import com.bilibili.commons.tuple.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/data/FileTimePart.class */
@Keep
public class FileTimePart {
    public static final int FLAG_EDIT = 1;
    public static final int FLAG_NORMAL = 0;
    private static final String MIME_IMG = "image";
    private static final String MIME_VIDEO = "video";
    public final long duration;
    public String filePath;
    public long inPoint;
    public List<Integer> indexPart;
    public String mimeType;
    public long realDuration;
    public int rotation;
    public List<Long> times;
    public long trimIn;
    public int flag = 0;
    public final HashMap<Integer, List<Pair<Long, Integer>>> roundTimesMap = new HashMap<>();

    public FileTimePart(String str, long j7, long j8, int i7, String str2) {
        this.filePath = str;
        this.duration = j7;
        this.realDuration = j8;
        this.mimeType = str2;
        this.rotation = i7;
    }

    public void addFrameTime(long j7, int i7) {
        if (this.times == null) {
            this.times = new ArrayList();
        }
        this.times.add(Long.valueOf(j7));
        if (this.indexPart == null) {
            this.indexPart = new ArrayList();
        }
        this.indexPart.add(Integer.valueOf(i7));
    }

    public void addRoundFrameTime(long j7, int i7, int i8) {
        List<Pair<Long, Integer>> list = this.roundTimesMap.get(Integer.valueOf(i7));
        List<Pair<Long, Integer>> arrayList = list;
        if (list == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(Pair.of(Long.valueOf(j7), Integer.valueOf(i8)));
        this.roundTimesMap.put(Integer.valueOf(i7), arrayList);
    }

    public boolean isGif() {
        return !TextUtils.isEmpty(this.filePath) && StringsKt.t(this.filePath, "gif");
    }

    public boolean isImage() {
        return !TextUtils.isEmpty(this.mimeType) && this.mimeType.startsWith("image");
    }

    public boolean isVideo() {
        return !TextUtils.isEmpty(this.mimeType) && this.mimeType.startsWith("video");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FileTimePart{filePath='");
        sb.append(this.filePath);
        sb.append("', duration=");
        sb.append(this.duration);
        sb.append(", mimeType='");
        sb.append(this.mimeType);
        sb.append("', times=");
        sb.append(this.times);
        sb.append(", indexPart=");
        sb.append(this.indexPart);
        sb.append(", rotation=");
        return C3269h.a(sb, this.rotation, '}');
    }
}
