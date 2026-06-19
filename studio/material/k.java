package com.bilibili.studio.material;

import androidx.core.app.NotificationCompat;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.material.internal.ProcessorItem;
import com.bilibili.studio.material.util.UtilsKt;
import java.io.File;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/k.class */
public final class k extends IStrategy<ProcessorItem> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final xA0.a f108560a;

    public k(@NotNull xA0.a aVar) {
        this.f108560a = aVar;
    }

    @Override // com.bilibili.studio.material.IStrategy
    @Nullable
    public final Object action(@NotNull ProcessorItem processorItem, @NotNull MaterialConfig materialConfig, @NotNull Continuation<? super Unit> continuation) {
        if (!processorItem.getResult().isHit() && processorItem.getResult().getFilePath().length() > 0) {
            File file = new File(processorItem.getResult().getFilePath());
            if (!UtilsKt.isFileExist(file)) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = "";
                UtilsKt.printDirectoryContents$default(file, null, new UR0.j(objectRef, 3), 2, null);
                Map mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("path", processorItem.getResult().getFilePath()), TuplesKt.to("url", processorItem.getRequest().getMaterialUrl()), TuplesKt.to(NotificationCompat.CATEGORY_MESSAGE, objectRef.element)});
                this.f108560a.getClass();
                Neurons.trackT(true, "editor-basic.material.unzip.error", mapMapOf, 1, new AT0.c(8));
            }
        }
        return Unit.INSTANCE;
    }
}
