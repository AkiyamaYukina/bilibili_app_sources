package com.bilibili.studio.editor.timeline;

import L50.a;
import R50.r;
import android.content.Context;
import eA0.InterfaceC6919b;
import fA0.n;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/timeline/k.class */
public final class k implements InterfaceC6919b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f108313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f108314b = LazyKt.lazy(new Df1.b(10));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/timeline/k$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final k f108315a = new k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /* JADX WARN: Type inference failed for: r0v136, types: [M50.a] */
    /* JADX WARN: Type inference failed for: r0v143, types: [M50.a] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v19, types: [M50.a] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.studio.editor.timeline.i a(com.bilibili.studio.editor.timeline.UpperEngineScene r8, com.bilibili.studio.editor.timeline.e r9) {
        /*
            Method dump skipped, instruction units count: 1004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.timeline.k.a(com.bilibili.studio.editor.timeline.UpperEngineScene, com.bilibili.studio.editor.timeline.e):com.bilibili.studio.editor.timeline.i");
    }

    public final void b(@NotNull UpperEngineScene upperEngineScene) {
        eA0.c.b(this, "destroyStreamVideo scene: " + upperEngineScene.getInfo());
        synchronized (c()) {
            i iVar = c().get(upperEngineScene);
            if (iVar != null) {
                iVar.f(upperEngineScene.isAuxiliaryContext());
            }
            c().remove(upperEngineScene);
        }
    }

    public final Map<UpperEngineScene, i> c() {
        return (Map) this.f108314b.getValue();
    }

    @Nullable
    public final i d(@NotNull UpperEngineScene upperEngineScene, @Nullable e eVar) {
        eA0.c.b(this, "getStreamVideo scene: " + upperEngineScene.getInfo());
        synchronized (c()) {
            Iterator<Map.Entry<UpperEngineScene, i>> it = c().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<UpperEngineScene, i> next = it.next();
                UpperEngineScene key = next.getKey();
                if (Intrinsics.areEqual(key.name(), upperEngineScene.name()) && Intrinsics.areEqual(key.getCoreType(), upperEngineScene.getCoreType()) && Intrinsics.areEqual(key.getContextType(), upperEngineScene.getContextType())) {
                    L50.a aVar = a.a.a;
                    Object obj = null;
                    if ((aVar.a != null ? r.u() : null) == null) {
                        continue;
                    } else {
                        if ((aVar.a != null ? r.u() : null) != null) {
                            obj = "StudioMon";
                        }
                        if (Intrinsics.areEqual(obj, upperEngineScene.getCoreType())) {
                            eA0.c.b(this, "getStreamVideo scene: " + upperEngineScene.getInfo() + " has exits just return");
                            return next.getValue();
                        }
                        UpperEngineScene key2 = next.getKey();
                        i value = next.getValue();
                        if (value != null) {
                            value.f(key2.isAuxiliaryContext());
                        }
                        it.remove();
                    }
                }
            }
            return a(upperEngineScene, eVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [com.bilibili.studio.editor.timeline.l, java.lang.Object] */
    public final void e(@NotNull Context context, @NotNull UpperEngineScene upperEngineScene, @Nullable e eVar) {
        eA0.c.b(this, "engine init start");
        if (!this.f108313a) {
            n.a = new Object();
            eA0.c.b(this, "engine initLogger----");
        }
        String coreType = upperEngineScene.getCoreType();
        if (context == null) {
            throw new NullPointerException("checkInitParamsValid context is null just return");
        }
        if (coreType != null && coreType.length() == 0) {
            throw new NullPointerException("checkInitParamsValid sdk is isNullOrEmpty just return");
        }
        d(upperEngineScene, eVar);
        this.f108313a = true;
        eA0.c.b(this, "engine init success");
    }

    @Override // eA0.InterfaceC6919b
    @NotNull
    public final String getClassTag() {
        return "UpperVideoEditorEngine";
    }
}
