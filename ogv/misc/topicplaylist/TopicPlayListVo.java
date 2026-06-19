package com.bilibili.ogv.misc.topicplaylist;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/topicplaylist/TopicPlayListVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class TopicPlayListVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("pn")
    private int f69627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("has_next")
    private boolean f69628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public List<TopicPlayListItemVo> f69629c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/topicplaylist/TopicPlayListVo$TopicPlayListItemVo.class */
    @StabilityInferred(parameters = 0)
    @Bson
    public static final class TopicPlayListItemVo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f69630a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f69631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f69632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @SerializedName("content_count")
        @Nullable
        private String f69633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @SerializedName("fav_ctime")
        private long f69634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public String f69635f;

        @Nullable
        public final String a() {
            return this.f69633d;
        }

        public final long b() {
            return this.f69634e;
        }

        public final void c(@Nullable String str) {
            this.f69633d = str;
        }

        public final void d(long j7) {
            this.f69634e = j7;
        }

        @NotNull
        public final String toString() {
            int i7 = this.f69630a;
            String str = this.f69631b;
            String str2 = this.f69632c;
            String str3 = this.f69633d;
            long j7 = this.f69634e;
            String str4 = this.f69635f;
            StringBuilder sbB = bilibili.live.app.service.resolver.a.b(i7, "TopicPlayListItemVo(id=", ", cover=", str, ", title=");
            B.a(str2, ", contentCount=", str3, ", favCreateTime=", sbB);
            G0.d.a(j7, ", link=", str4, sbB);
            sbB.append(") ");
            return sbB.toString();
        }
    }

    public final boolean a() {
        return this.f69628b;
    }

    public final int b() {
        return this.f69627a;
    }

    public final void c(boolean z6) {
        this.f69628b = z6;
    }

    public final void d(int i7) {
        this.f69627a = i7;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @NotNull
    public final String toString() {
        int i7 = this.f69627a;
        boolean z6 = this.f69628b;
        List<TopicPlayListItemVo> list = this.f69629c;
        return C8770a.a(z4.c.a(i7, "TopicPlayListVo(pageNumber=", ", hasNext=", ", data=", z6), list != null ? CollectionsKt.p(list, ",", (CharSequence) null, (CharSequence) null, (Function1) new Object(), 30) : null, ")");
    }
}
