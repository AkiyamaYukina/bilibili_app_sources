package com.bilibili.topix.compose.create;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.topix.model.SynonymTopic;
import com.bilibili.topix.model.TopicCreateLimit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/C.class */
@StabilityInferred(parameters = 0)
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f112452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TopicType f112453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final J f112454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final I f112455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final TopicCreateLimit f112456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final SynonymTopic f112457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f112458g;

    @Nullable
    public final E h;

    public C() {
        this(null, null, null, null, false, 255);
    }

    public C(@NotNull String str, @NotNull TopicType topicType, @NotNull J j7, @NotNull I i7, @Nullable TopicCreateLimit topicCreateLimit, @Nullable SynonymTopic synonymTopic, boolean z6, @Nullable E e7) {
        this.f112452a = str;
        this.f112453b = topicType;
        this.f112454c = j7;
        this.f112455d = i7;
        this.f112456e = topicCreateLimit;
        this.f112457f = synonymTopic;
        this.f112458g = z6;
        this.h = e7;
    }

    public /* synthetic */ C(String str, TopicType topicType, J j7, I i7, boolean z6, int i8) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? TopicType.NORMAL : topicType, (i8 & 4) != 0 ? new J(null, 31) : j7, (i8 & 8) != 0 ? new I(null, 31) : i7, null, null, (i8 & 64) != 0 ? false : z6, null);
    }

    public static C a(C c7, TopicType topicType, J j7, I i7, TopicCreateLimit topicCreateLimit, SynonymTopic synonymTopic, boolean z6, E e7, int i8) {
        String str = c7.f112452a;
        if ((i8 & 2) != 0) {
            topicType = c7.f112453b;
        }
        if ((i8 & 4) != 0) {
            j7 = c7.f112454c;
        }
        if ((i8 & 8) != 0) {
            i7 = c7.f112455d;
        }
        if ((i8 & 16) != 0) {
            topicCreateLimit = c7.f112456e;
        }
        if ((i8 & 32) != 0) {
            synonymTopic = c7.f112457f;
        }
        if ((i8 & 64) != 0) {
            z6 = c7.f112458g;
        }
        if ((i8 & 128) != 0) {
            e7 = c7.h;
        }
        c7.getClass();
        return new C(str, topicType, j7, i7, topicCreateLimit, synonymTopic, z6, e7);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c7 = (C) obj;
        return Intrinsics.areEqual(this.f112452a, c7.f112452a) && this.f112453b == c7.f112453b && Intrinsics.areEqual(this.f112454c, c7.f112454c) && Intrinsics.areEqual(this.f112455d, c7.f112455d) && Intrinsics.areEqual(this.f112456e, c7.f112456e) && Intrinsics.areEqual(this.f112457f, c7.f112457f) && this.f112458g == c7.f112458g && Intrinsics.areEqual(this.h, c7.h);
    }

    public final int hashCode() {
        int iHashCode = this.f112452a.hashCode();
        int iHashCode2 = this.f112453b.hashCode();
        int iHashCode3 = this.f112454c.hashCode();
        int iHashCode4 = this.f112455d.hashCode();
        TopicCreateLimit topicCreateLimit = this.f112456e;
        int iHashCode5 = topicCreateLimit == null ? 0 : topicCreateLimit.hashCode();
        SynonymTopic synonymTopic = this.f112457f;
        int iA = androidx.compose.animation.z.a((((((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31) + iHashCode5) * 31) + (synonymTopic == null ? 0 : synonymTopic.hashCode())) * 31, 31, this.f112458g);
        E e7 = this.h;
        return iA + (e7 == null ? 0 : e7.hashCode());
    }

    @NotNull
    public final String toString() {
        return "CreateTopicPageState(scene=" + this.f112452a + ", topicType=" + this.f112453b + ", topicName=" + this.f112454c + ", topicDesc=" + this.f112455d + ", createLimit=" + this.f112456e + ", synonymTopic=" + this.f112457f + ", checkedCoCreation=" + this.f112458g + ", createResult=" + this.h + ")";
    }
}
