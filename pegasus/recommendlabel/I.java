package com.bilibili.pegasus.recommendlabel;

import androidx.compose.material.I2;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/I.class */
public final /* synthetic */ class I implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f78590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I2 f78591b;

    public /* synthetic */ I(I2 i22, CoroutineScope coroutineScope) {
        this.f78590a = coroutineScope;
        this.f78591b = i22;
    }

    public final Object invoke() {
        BuildersKt.launch$default(this.f78590a, (CoroutineContext) null, (CoroutineStart) null, new RecommendLabelFirstPageKt$RecommendLabelFirstPage$8$1$3$1$1$1(this.f78591b, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
