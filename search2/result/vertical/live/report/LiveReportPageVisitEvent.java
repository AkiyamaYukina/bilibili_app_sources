package com.bilibili.search2.result.vertical.live.report;

import Mt0.a;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.result.vertical.live.c;
import kotlin.Deprecated;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/report/LiveReportPageVisitEvent.class */
@Deprecated(message = "")
@StabilityInferred(parameters = 0)
public final class LiveReportPageVisitEvent extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f88591a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/report/LiveReportPageVisitEvent$Msg.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Msg {
        public static final int $stable = 8;
        private int pk_id;
        private int screen_status;

        public final int getPk_id() {
            return this.pk_id;
        }

        public final int getScreen_status() {
            return this.screen_status;
        }

        @NotNull
        public final Msg pkId(int i7) {
            this.pk_id = i7;
            return this;
        }

        @NotNull
        public final Msg screenStatus(int i7) {
            this.screen_status = i7;
            return this;
        }

        public final void setPk_id(int i7) {
            this.pk_id = i7;
        }

        public final void setScreen_status(int i7) {
            this.screen_status = i7;
        }
    }

    @Override // Mt0.a
    @NotNull
    public final String[] a() {
        String str = this.f88591a;
        synchronized (c.class) {
            try {
                if (c.f88585b == null) {
                    c.f88585b = new c();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        c cVar = c.f88585b;
        return new String[]{str, "live", null, null, null, null, null, null, null, null, null, cVar != null ? cVar.a() : null, null};
    }

    @Override // Mt0.a
    @Nullable
    public final String b() {
        return "000278";
    }
}
