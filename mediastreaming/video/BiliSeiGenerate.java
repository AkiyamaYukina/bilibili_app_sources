package com.bilibili.mediastreaming.video;

import androidx.annotation.Keep;
import com.bilibili.mediastreaming.enums.BiliVideoCodec;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/video/BiliSeiGenerate.class */
public final class BiliSeiGenerate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final BiliSeiGenerate f66030a = new BiliSeiGenerate();

    @Nullable
    public static BiliSeiBuffer[] a(@Nullable ArrayList arrayList, @NotNull BiliVideoCodec biliVideoCodec) {
        BiliSeiBuffer[] biliSeiBufferArr;
        if (arrayList == null) {
            biliSeiBufferArr = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str = (String) pair.getFirst();
                byte[] bArr = (byte[]) pair.getSecond();
                BiliSeiGenerate biliSeiGenerate = f66030a;
                biliSeiGenerate.getClass();
                byte[] bArrNativeGetSeiFromUserData = biliSeiGenerate.nativeGetSeiFromUserData(str, bArr, true, biliVideoCodec.ordinal());
                BiliSeiBuffer biliSeiBuffer = new BiliSeiBuffer();
                biliSeiBuffer.buffer = bArrNativeGetSeiFromUserData;
                arrayList2.add(biliSeiBuffer);
            }
            biliSeiBufferArr = (BiliSeiBuffer[]) arrayList2.toArray(new BiliSeiBuffer[0]);
        }
        return biliSeiBufferArr;
    }

    @Keep
    private final native byte[] nativeGetSeiFromUserData(String str, byte[] bArr, boolean z6, int i7);
}
