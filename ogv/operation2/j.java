package com.bilibili.ogv.operation2;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.lifecycle.Lifecycle;
import com.bilibili.ogv.kmm.operation.banner.C5437a;
import com.bilibili.ogv.kmm.operation.banner.C5440d;
import com.bilibili.ogv.kmm.operation.banner.InterfaceC5439c;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.Map;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/j.class */
@StabilityInferred(parameters = 0)
public final class j implements InterfaceC5439c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.bpf.lifecycle.e f70995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final C5440d f70996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lifecycle f70997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.operation3.module.operable.delivery.a f70998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f70999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableState f71000f = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Long f71001g;

    public j(@NotNull com.bilibili.ogv.bpf.lifecycle.e eVar, @Nullable C5440d c5440d, @NotNull Lifecycle lifecycle, @NotNull com.bilibili.ogv.operation3.module.operable.delivery.a aVar, @NotNull String str) {
        this.f70995a = eVar;
        this.f70996b = c5440d;
        this.f70997c = lifecycle;
        this.f70998d = aVar;
        this.f70999e = str;
        Long l7 = null;
        this.f71001g = c5440d != null ? Long.valueOf(c5440d.f68098a) : l7;
    }

    public static final Map<String, String> d(d dVar, C5437a.e eVar, long j7) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.putAll(eVar.f68095d);
        mapCreateMapBuilder.put("type", dVar.f70825f);
        mapCreateMapBuilder.put(EditCustomizeSticker.TAG_DURATION, String.valueOf(System.currentTimeMillis() - j7));
        return MapsKt.build(mapCreateMapBuilder);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.bilibili.ogv.kmm.operation.banner.InterfaceC5439c
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 1256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation2.j.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.ogv.kmm.operation.banner.InterfaceC5439c
    public final void b(@Nullable Rect rect) {
        this.f71000f.setValue(rect);
    }

    @Override // com.bilibili.ogv.kmm.operation.banner.InterfaceC5439c
    @Nullable
    public final Long c() {
        return this.f71001g;
    }
}
