package com.bilibili.mediastreaming.packet;

import androidx.annotation.Keep;
import androidx.compose.runtime.snapshots.z;
import androidx.fragment.app.D;
import androidx.media3.common.G;
import com.bilibili.search2.result.vertical.live.report.ReporterMap;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/packet/BiliEncoderPacket.class */
@Keep
public class BiliEncoderPacket {

    @JvmField
    @Nullable
    public byte[] data;

    @JvmField
    public long dtsUs;

    @JvmField
    public boolean isHeader;

    @JvmField
    public int length;

    @JvmField
    public long ptsUs;

    @NotNull
    public String toString() {
        long j7 = this.ptsUs;
        long j8 = this.dtsUs;
        int i7 = this.length;
        String str = this.isHeader ? "true" : "false";
        StringBuilder sbA = z.a(j7, "EncoderPacket{, pts=", ", dts=");
        G.a(i7, j8, ", length=", sbA);
        return D.a(", isHeader=", str, ReporterMap.RIGHT_BRACES, sbA);
    }
}
