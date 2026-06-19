package com.bilibili.ogv.operation2;

import android.net.Uri;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.lifecycle.Lifecycle;
import com.bilibili.search2.api.SearchBangumiItem;
import java.io.File;
import jl0.C7707a;
import kntr.base.imageloader.BiliImageKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/m.class */
public final class m implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f71005a;

    public m(File file) {
        this.f71005a = file;
    }

    @Override // com.bilibili.ogv.operation2.a
    public final Object a(Continuation<? super Unit> continuation) {
        Object objDelay = DelayKt.delay(2000L, continuation);
        return objDelay == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDelay : Unit.INSTANCE;
    }

    @Override // com.bilibili.ogv.operation2.a
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void b(Composer composer, Modifier modifier) {
        composer.startReplaceGroup(1523591119);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1523591119, 0, -1, "com.bilibili.ogv.operation2.AnimationContent.<no name provided>.UI (BangumiHomeFlowAnimationLayer.kt:204)");
        }
        BiliImageKt.BiliImage(C7707a.a(Uri.fromFile(this.f71005a).toString(), ContentScale.Companion.getFit(), null, false, false, null, null, SearchBangumiItem.TYPE_FULLNET_DOCUMENTARY), modifier, (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composer, 0, 1020);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
