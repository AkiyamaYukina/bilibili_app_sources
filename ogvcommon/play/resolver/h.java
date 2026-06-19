package com.bilibili.ogvcommon.play.resolver;

import android.util.SparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationManagerCompat;
import com.bilibili.mediacore.mediacodec.MediaCodecInfoHelper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/h.class */
@StabilityInferred(parameters = 0)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final SparseArray<ob0.a> f73267a;

    static {
        SparseArray<ob0.a> sparseArray = new SparseArray<>();
        f73267a = sparseArray;
        ob0.a aVar = new ob0.a(90);
        ob0.a aVar2 = new ob0.a(100);
        ob0.a aVar3 = new ob0.a(150);
        ob0.a aVar4 = new ob0.a(175);
        ob0.a aVar5 = new ob0.a(200);
        ob0.a aVar6 = new ob0.a(400);
        ob0.a aVar7 = new ob0.a(MediaCodecInfoHelper.RANK_TESTED);
        ob0.a aVar8 = new ob0.a(900);
        ob0.a aVar9 = new ob0.a(-100000);
        sparseArray.put(15, aVar);
        sparseArray.put(16, aVar2);
        sparseArray.put(32, aVar3);
        sparseArray.put(48, aVar4);
        sparseArray.put(64, aVar5);
        sparseArray.put(80, aVar6);
        sparseArray.put(112, aVar7);
        sparseArray.put(120, aVar8);
        sparseArray.put(NotificationManagerCompat.IMPORTANCE_UNSPECIFIED, aVar9);
    }

    public static int a(int i7) {
        int size = f73267a.size();
        for (int i8 = 0; i8 < size; i8++) {
            SparseArray<ob0.a> sparseArray = f73267a;
            if (sparseArray.valueAt(i8).a == i7) {
                return sparseArray.keyAt(i8);
            }
        }
        return 64;
    }
}
