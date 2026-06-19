package com.bilibili.mall.kmm.detailVideo.comment.api;

import com.bilibili.biligame.widget.dialog.BiligameCommonDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/detailVideo/comment/api/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Json f65616a;

    public b() {
        final int i7 = 0;
        this.f65616a = JsonKt.Json$default((Json) null, new Function1(i7) { // from class: com.bilibili.mall.kmm.detailVideo.comment.api.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f65615a;

            {
                this.f65615a = i7;
            }

            public final Object invoke(Object obj) {
                switch (this.f65615a) {
                    case 0:
                        JsonBuilder jsonBuilder = (JsonBuilder) obj;
                        jsonBuilder.setIgnoreUnknownKeys(true);
                        jsonBuilder.setLenient(true);
                        break;
                    default:
                        ((BiligameCommonDialog) obj).dismiss();
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 1, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull java.util.Map r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.detailVideo.comment.api.b.a(java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
