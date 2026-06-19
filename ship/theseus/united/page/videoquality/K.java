package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.painter.Painter;
import com.bilibili.lib.foundation.FoundationAlias;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/K.class */
@StabilityInferred(parameters = 0)
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Mutex f103726a = MutexKt.Mutex$default(false, 1, (Object) null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f103727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static Map<String, ? extends Painter> f103728c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/K$a.class */
    public interface a {
        int a();

        @NotNull
        Animatable<Float, AnimationVector1D> getAnimatable();
    }

    public static final Object a(File file, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        FileInputStream fileInputStream = new FileInputStream(file);
        cV0.b0.b().execute(new cV0.N(new com.opensource.svgaplayer.a(FoundationAlias.getFapp()), fileInputStream, ByteString.Companion.encodeUtf8(file.getAbsolutePath()).md5().hex(), new L(cancellableContinuationImpl, file)));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
