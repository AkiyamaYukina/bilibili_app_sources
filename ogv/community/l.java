package com.bilibili.ogv.community;

import io.reactivex.rxjava3.subjects.PublishSubject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/l.class */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final com.bilibili.ogv.community.a<Long, Boolean> f67554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final PublishSubject<a> f67555b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/l$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f67556a;

        public a(long j7) {
            this.f67556a = j7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f67556a == ((a) obj).f67556a;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + (Long.hashCode(this.f67556a) * 31);
        }

        @NotNull
        public final String toString() {
            return android.support.v4.media.session.a.a(new StringBuilder("FollowUpperEvent(upperMid="), this.f67556a, ", followed=true)");
        }
    }

    static {
        com.bilibili.ogv.community.a<Long, Boolean> aVar = new com.bilibili.ogv.community.a<>();
        b.a(aVar);
        f67554a = aVar;
        f67555b = PublishSubject.create();
    }
}
