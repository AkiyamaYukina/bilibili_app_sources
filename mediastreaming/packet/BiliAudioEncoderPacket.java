package com.bilibili.mediastreaming.packet;

import androidx.annotation.Keep;
import androidx.compose.runtime.snapshots.z;
import androidx.media3.common.G;
import com.bilibili.mediastreaming.enums.BiliAudioCodec;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/packet/BiliAudioEncoderPacket.class */
@Keep
public final class BiliAudioEncoderPacket extends BiliEncoderPacket {

    @JvmField
    @NotNull
    public BiliAudioCodec codec = BiliAudioCodec.UN_DEFINE;

    @Override // com.bilibili.mediastreaming.packet.BiliEncoderPacket
    @NotNull
    public String toString() {
        long j7 = this.ptsUs;
        long j8 = this.dtsUs;
        int i7 = this.length;
        boolean z6 = this.isHeader;
        BiliAudioCodec biliAudioCodec = this.codec;
        StringBuilder sbA = z.a(j7, "BiliAudioEncoderPacket: pts=", ", dts=");
        G.a(i7, j8, ", length:", sbA);
        sbA.append(", isHeader=");
        sbA.append(z6);
        sbA.append(", codec=");
        sbA.append(biliAudioCodec);
        return sbA.toString();
    }
}
