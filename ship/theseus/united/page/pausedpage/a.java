package com.bilibili.ship.theseus.united.page.pausedpage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/a.class */
public interface a {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/a$a.class */
    @StabilityInferred(parameters = 1)
    public static final class C1079a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final AdPausedPageTriggerReason f102200a;

        public C1079a(@NotNull AdPausedPageTriggerReason adPausedPageTriggerReason) {
            this.f102200a = adPausedPageTriggerReason;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1079a) && this.f102200a == ((C1079a) obj).f102200a;
        }

        public final int hashCode() {
            return this.f102200a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "CancelAd(reason=" + this.f102200a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/a$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final AdPausedPageTriggerReason f102201a;

        public b(@NotNull AdPausedPageTriggerReason adPausedPageTriggerReason) {
            this.f102201a = adPausedPageTriggerReason;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f102201a == ((b) obj).f102201a;
        }

        public final int hashCode() {
            return this.f102201a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "CloseLandingPage(reason=" + this.f102201a + ")";
        }
    }
}
