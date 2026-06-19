package com.bilibili.studio.media;

import com.alipay.sdk.app.PayTask;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/media/MediaFileReader.class */
public final class MediaFileReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f108570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f108571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f108572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f108573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<String> f108574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<String> f108575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f108576g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/media/MediaFileReader$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f108577a = 2000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f108578b = 8589934592L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f108579c = PayTask.f60018j;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f108580d = 1200000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final ArrayList<String> f108581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final ArrayList<String> f108582f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f108583g;

        public a() {
            ArrayList<String> arrayList = c.f108585a;
            this.f108581e = c.f108585a;
            ArrayList<String> arrayList2 = b.f108584a;
            this.f108582f = b.f108584a;
            this.f108583g = 200;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/media/MediaFileReader$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final ArrayList<String> f108584a = CollectionsKt.arrayListOf(new String[]{"image/jpeg", "image/png", "image/bmp"});
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/media/MediaFileReader$c.class */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final ArrayList<String> f108585a = CollectionsKt.arrayListOf(new String[]{"video/mp4", "video/webm", "video/mpeg"});
    }

    public MediaFileReader(a aVar) {
        int i7 = aVar.f108577a;
        long j7 = aVar.f108578b;
        long j8 = aVar.f108579c;
        long j9 = aVar.f108580d;
        ArrayList<String> arrayList = aVar.f108581e;
        ArrayList<String> arrayList2 = aVar.f108582f;
        int i8 = aVar.f108583g;
        this.f108570a = i7;
        this.f108571b = j7;
        this.f108572c = j8;
        this.f108573d = j9;
        this.f108574e = arrayList;
        this.f108575f = arrayList2;
        this.f108576g = i8;
    }

    @NotNull
    public final Flow<d> a() {
        return FlowKt.take(FlowKt.flow(new MediaFileReader$mediaFlow$1(this, null)), this.f108576g + 2);
    }
}
