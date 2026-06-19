package com.bilibili.ship.theseus.united.page.videoquality;

import android.graphics.BitmapFactory;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import java.io.File;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/QualityVisionResources$loadImage$2.class */
final class QualityVisionResources$loadImage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super androidx.compose.ui.graphics.painter.a>, Object> {
    final File $file;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QualityVisionResources$loadImage$2(File file, Continuation<? super QualityVisionResources$loadImage$2> continuation) {
        super(2, continuation);
        this.$file = file;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QualityVisionResources$loadImage$2(this.$file, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super androidx.compose.ui.graphics.painter.a> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        androidx.compose.ui.graphics.painter.a aVar = null;
        try {
            aVar = new androidx.compose.ui.graphics.painter.a(AndroidImageBitmap_androidKt.asImageBitmap(BitmapFactory.decodeFile(this.$file.getCanonicalPath())));
        } catch (IOException e7) {
            com.bilibili.ogv.infra.util.e.b(e7);
        } catch (OutOfMemoryError e8) {
            com.bilibili.ogv.infra.util.e.b(e8);
        }
        return aVar;
    }
}
