package com.bilibili.sistersplayer;

import G0.b;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import androidx.fragment.app.A;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/NetSpeedMonitor.class */
public final class NetSpeedMonitor {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private long lastAppRxBytes;
    private long lastAppTxBytes;
    private long lastTimestamp;
    private long lastTotalRxBytes;
    private long lastTotalTxBytes;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/NetSpeedMonitor$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String formatSpeed$default(Companion companion, float f7, boolean z6, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                z6 = true;
            }
            return companion.formatSpeed(f7, z6);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b8 -> B:26:0x00bc). Please report as a decompilation issue!!! */
        @NotNull
        public final String formatSpeed(float f7, boolean z6) {
            String str;
            float f8 = f7;
            if (z6) {
                f8 = f7 * 8;
            }
            double d7 = f8;
            try {
                if (d7 > 1000000.0d) {
                    str = String.format("%.1f %s/s", Arrays.copyOf(new Object[]{Double.valueOf(d7 / 1000000.0d), z6 ? "Mbit" : "MB"}, 2));
                } else if (d7 > 1000.0d) {
                    str = String.format("%.1f %s/s", Arrays.copyOf(new Object[]{Double.valueOf(d7 / 1000.0d), z6 ? "Kbit" : "KB"}, 2));
                } else {
                    str = String.format("%.0f %s/s", Arrays.copyOf(new Object[]{Float.valueOf(f8), z6 ? "bit" : "B"}, 2));
                }
            } catch (Exception e7) {
                str = "0";
            }
            return str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/NetSpeedMonitor$Speed.class */
    public static final class Speed {
        private float appDownload;
        private final float appUpload;
        private float totalDownload;
        private final float totalUpload;

        public Speed(float f7, float f8, float f9, float f10) {
            this.appDownload = f7;
            this.appUpload = f8;
            this.totalDownload = f9;
            this.totalUpload = f10;
        }

        @NotNull
        public final String format(float f7) {
            return String.format("%.0f", Arrays.copyOf(new Object[]{Float.valueOf((f7 * 8) / 1000)}, 1));
        }

        public final float getAppDownload() {
            return this.appDownload;
        }

        public final float getAppUpload() {
            return this.appUpload;
        }

        public final float getTotalDownload() {
            return this.totalDownload;
        }

        public final float getTotalUpload() {
            return this.totalUpload;
        }

        public final void setAppDownload(float f7) {
            this.appDownload = f7;
        }

        public final void setTotalDownload(float f7) {
            this.totalDownload = f7;
        }

        @NotNull
        public String toString() {
            Companion companion = NetSpeedMonitor.Companion;
            return A.a(Companion.formatSpeed$default(companion, this.totalDownload, false, 2, null), ", tu=", Companion.formatSpeed$default(companion, this.totalUpload, false, 2, null), ")", b.a("Speed(ad=", Companion.formatSpeed$default(companion, this.appDownload, false, 2, null), ", au=", Companion.formatSpeed$default(companion, this.appUpload, false, 2, null), ", td="));
        }
    }

    public final void clean() {
        this.lastTimestamp = 0L;
        this.lastTotalRxBytes = 0L;
        this.lastTotalTxBytes = 0L;
        this.lastAppRxBytes = 0L;
        this.lastAppTxBytes = 0L;
    }

    @NotNull
    public final Speed getCurrentSpeed() {
        try {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            long totalTxBytes = TrafficStats.getTotalTxBytes();
            long uidRxBytes = TrafficStats.getUidRxBytes(Process.myUid());
            long uidTxBytes = TrafficStats.getUidTxBytes(Process.myUid());
            float f7 = (jElapsedRealtimeNanos - r0) / 1.0E9f;
            if (this.lastTimestamp == 0 || f7 <= 0.0f) {
                this.lastTimestamp = jElapsedRealtimeNanos;
                this.lastTotalRxBytes = totalRxBytes;
                this.lastTotalTxBytes = totalTxBytes;
                this.lastAppRxBytes = uidRxBytes;
                this.lastAppTxBytes = uidTxBytes;
                return new Speed(0.0f, 0.0f, 0.0f, 0.0f);
            }
            float f8 = (uidRxBytes - this.lastAppRxBytes) / f7;
            float f9 = (uidTxBytes - this.lastAppTxBytes) / f7;
            float f10 = (totalRxBytes - this.lastTotalRxBytes) / f7;
            float f11 = (totalTxBytes - this.lastTotalTxBytes) / f7;
            this.lastTimestamp = jElapsedRealtimeNanos;
            this.lastTotalRxBytes = totalRxBytes;
            this.lastTotalTxBytes = totalTxBytes;
            this.lastAppRxBytes = uidRxBytes;
            this.lastAppTxBytes = uidTxBytes;
            return new Speed(f8, f9, f10, f11);
        } catch (Exception e7) {
            return new Speed(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }
}
