package com.bilibili.studio.editor.timeline.backup;

import Yv0.e;
import android.app.Application;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.foundation.Foundation;
import com.bilibili.studio.editor.timeline.i;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import eA0.InterfaceC6919b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/timeline/backup/UpperEditorBackUpManager.class */
public final class UpperEditorBackUpManager implements InterfaceC6919b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final i.a f108267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f108268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public b f108269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f108270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final e f108271e = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f108272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f108273g;

    @NotNull
    public final ConcurrentHashMap<b, List<Function1<EditVideoInfo, Unit>>> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public a f108274i;

    public UpperEditorBackUpManager(@NotNull i.a aVar) {
        this.f108267a = aVar;
        Lazy lazy = zw0.b.f130950a;
        String strDd = DeviceDecision.INSTANCE.dd("uper.editor_backup_max", String.valueOf(30));
        int iIntValue = 30;
        if (strDd != null) {
            Integer intOrNull = StringsKt.toIntOrNull(strDd);
            iIntValue = 30;
            if (intOrNull != null) {
                iIntValue = intOrNull.intValue();
            }
        }
        this.f108273g = iIntValue;
        this.h = new ConcurrentHashMap<>();
        Application app2 = Foundation.Companion.instance().getApp();
        File externalFilesDir = app2.getExternalFilesDir("video_edit");
        File file = new File(B0.a.a((externalFilesDir == null ? app2.getFilesDir() : externalFilesDir).getAbsolutePath(), File.separator, "backup"));
        if (!file.exists()) {
            file.mkdir();
        }
        this.f108270d = file.getAbsolutePath();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(@org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r3, @org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r4) {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.timeline.backup.UpperEditorBackUpManager.c(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo, com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r2 = this;
            r0 = r2
            int r0 = r0.f108268b
            if (r0 != 0) goto L23
            r0 = r2
            com.bilibili.studio.editor.timeline.backup.b r0 = r0.f108269c
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L18
            r0 = r4
            com.bilibili.studio.editor.timeline.backup.b r0 = r0.f108280d
            r4 = r0
            goto L1a
        L18:
            r0 = 0
            r4 = r0
        L1a:
            r0 = r4
            if (r0 == 0) goto L23
            r0 = 1
            r3 = r0
            goto L25
        L23:
            r0 = 0
            r3 = r0
        L25:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.timeline.backup.UpperEditorBackUpManager.a():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() {
        /*
            r2 = this;
            r0 = r2
            int r0 = r0.f108268b
            if (r0 != 0) goto L23
            r0 = r2
            com.bilibili.studio.editor.timeline.backup.b r0 = r0.f108269c
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L18
            r0 = r4
            com.bilibili.studio.editor.timeline.backup.b r0 = r0.f108279c
            r4 = r0
            goto L1a
        L18:
            r0 = 0
            r4 = r0
        L1a:
            r0 = r4
            if (r0 == 0) goto L23
            r0 = 1
            r3 = r0
            goto L25
        L23:
            r0 = 0
            r3 = r0
        L25:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.timeline.backup.UpperEditorBackUpManager.b():boolean");
    }

    public final void d(boolean z6) {
        synchronized (this) {
            b bVar = this.f108269c;
            int i7 = 0;
            while (bVar != null && i7 < 3) {
                bVar = z6 ? bVar.f108280d : bVar.f108279c;
                i7++;
            }
            if (i7 == 3 && bVar != null) {
                h(bVar);
            }
        }
    }

    public final void e(boolean z6) {
        b bVar = this.f108269c;
        int i7 = 0;
        while (bVar != null && i7 < 2) {
            bVar = z6 ? bVar.f108279c : bVar.f108280d;
            i7++;
        }
        if (i7 != 2 || bVar == null) {
            return;
        }
        i(bVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r6, com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r7) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.timeline.backup.UpperEditorBackUpManager.f(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo, com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r6, com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r7) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.timeline.backup.UpperEditorBackUpManager.g(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo, com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo):void");
    }

    @Override // eA0.InterfaceC6919b
    @NotNull
    public final String getClassTag() {
        return "UpperEditorBackUpManager";
    }

    public final void h(b bVar) {
        eA0.c.b(this, "【从内存备份到本地】node:" + bVar.f108278b + " tag:" + bVar.f108277a.f108276b.getDes());
        BuildersKt.launch$default(this.f108271e, Dispatchers.getIO(), (CoroutineStart) null, new UpperEditorBackUpManager$nativeCache$1(this, bVar, null), 2, (Object) null);
    }

    public final void i(b bVar, Function1<? super EditVideoInfo, Unit> function1) {
        int i7 = bVar.f108278b;
        a aVar = bVar.f108277a;
        eA0.c.b(this, "【从本地恢复到内存】node:" + i7 + " tag:" + aVar.f108276b.getDes());
        EditVideoInfo editVideoInfo = aVar.f108275a;
        if (editVideoInfo != null) {
            if (function1 != null) {
                function1.invoke(editVideoInfo);
                return;
            }
            return;
        }
        List<Function1<EditVideoInfo, Unit>> list = this.h.get(bVar);
        int i8 = bVar.f108278b;
        if (list != null && !list.isEmpty()) {
            eA0.c.b(this, "【从本地恢复到内存】监听已有任务 node:" + i8);
            List<Function1<EditVideoInfo, Unit>> list2 = this.h.get(bVar);
            if (list2 != null) {
                try {
                    list2.add(function1);
                    return;
                } catch (Exception e7) {
                    return;
                }
            }
            return;
        }
        eA0.c.b(this, "【从本地恢复到内存】创建新任务 node:" + i8);
        List<Function1<EditVideoInfo, Unit>> list3 = this.h.get(bVar);
        List<Function1<EditVideoInfo, Unit>> arrayList = list3;
        if (list3 == null) {
            arrayList = new ArrayList();
        }
        try {
            arrayList.add(function1);
        } catch (Exception e8) {
        }
        this.h.put(bVar, arrayList);
        BuildersKt.launch$default(this.f108271e, Dispatchers.getIO(), (CoroutineStart) null, new UpperEditorBackUpManager$nativeRecover$2(bVar, this, null), 2, (Object) null);
    }

    public final void j() {
        this.f108268b = 0;
        this.f108269c = null;
        this.f108272f = 0;
        this.f108274i = null;
        CoroutineScopeKt.cancel$default(this.f108271e, (CancellationException) null, 1, (Object) null);
        BuildersKt.launch$default(this.f108271e, Dispatchers.getIO(), (CoroutineStart) null, new UpperEditorBackUpManager$releaseAllNativeFile$1(this, null), 2, (Object) null);
    }
}
