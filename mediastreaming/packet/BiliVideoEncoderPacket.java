package com.bilibili.mediastreaming.packet;

import androidx.annotation.Keep;
import androidx.compose.runtime.snapshots.z;
import androidx.media3.common.G;
import androidx.media3.common.util.C4638g;
import com.bilibili.mediastreaming.enums.BiliVideoCodec;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/packet/BiliVideoEncoderPacket.class */
@Keep
public final class BiliVideoEncoderPacket extends BiliEncoderPacket {

    @JvmField
    @NotNull
    public BiliVideoCodec codec = BiliVideoCodec.UN_DEFINE;

    @JvmField
    public boolean isKeyFrame;

    @Override // com.bilibili.mediastreaming.packet.BiliEncoderPacket
    @NotNull
    public String toString() {
        long j7 = this.ptsUs;
        long j8 = this.dtsUs;
        int i7 = this.length;
        boolean z6 = this.isHeader;
        boolean z7 = this.isKeyFrame;
        BiliVideoCodec biliVideoCodec = this.codec;
        StringBuilder sbA = z.a(j7, "BiliAudioEncoderPacket: pts=", ", dts=");
        G.a(i7, j8, ", length:", sbA);
        C4638g.b(", isHeader=", ", isKeyFrame=", sbA, z6, z7);
        sbA.append(", codec=");
        sbA.append(biliVideoCodec);
        return sbA.toString();
    }
}
