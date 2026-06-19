package com.bilibili.studio.editor.timeline;

import J3.K0;
import J3.L0;
import L50.a;
import P50.m;
import R50.r;
import android.content.Context;
import com.bilibili.app.producers.ability.l0;
import com.bilibili.montage.MontageLibChecker;
import com.bilibili.montage.MontageLibLoader;
import com.bilibili.montage.MontageStreamingContext;
import com.bilibili.studio.comm.manager.hdr.a;
import com.bilibili.studio.kaleidoscope.sdk.StreamingContext;
import com.bilibili.studio.material.util.UtilsKt;
import com.bilibili.studio.videoeditor.exception.FileNotExistedError;
import com.bilibili.studio.videoeditor.ms.EditorEngineSDKLoadManager;
import eA0.InterfaceC6919b;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/timeline/d.class */
public final class d implements InterfaceC6919b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static r f108286b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static N50.a f108288d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f108285a = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Lazy f108287c = LazyKt.lazy(new K0(9));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Lazy f108289e = LazyKt.lazy(new L0(11));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final AtomicBoolean f108290f = new AtomicBoolean(false);

    /* JADX WARN: Type inference failed for: r0v9, types: [M50.a, java.lang.Object] */
    public static M50.a b(String str) {
        Float fValueOf;
        int i7;
        Lazy<com.bilibili.studio.comm.manager.hdr.a> lazy = com.bilibili.studio.comm.manager.hdr.a.f105396e;
        if (a.C1185a.a().g()) {
            fValueOf = Float.valueOf(a.C1185a.a().a());
            i7 = 65553;
        } else {
            fValueOf = null;
            i7 = 17;
        }
        String auroraResourcesDirPath = str;
        if (str == null) {
            auroraResourcesDirPath = EditorEngineSDKLoadManager.getAuroraResourcesDirPath();
        }
        String absolutePath = b.a().getAbsolutePath();
        ?? obj = new Object();
        ((M50.a) obj).a = fValueOf;
        ((M50.a) obj).b = absolutePath;
        ((M50.a) obj).c = true;
        ((M50.a) obj).d = i7;
        ((M50.a) obj).e = auroraResourcesDirPath;
        return obj;
    }

    public static Map c() {
        return (Map) f108287c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String d(java.lang.Throwable r4) {
        /*
            java.lang.String r0 = ""
            r9 = r0
            kotlin.Lazy r0 = zw0.b.f130950a
            r7 = r0
            com.bilibili.lib.dd.DeviceDecision r0 = com.bilibili.lib.dd.DeviceDecision.INSTANCE
            java.lang.String r1 = "uper.enable_editor_engine_trace"
            r2 = 1
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L17
            java.lang.String r0 = "unable trace"
            return r0
        L17:
            r0 = r4
            if (r0 == 0) goto L26
            r0 = r4
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r4 = r0
            r0 = r4
            r7 = r0
            r0 = r4
            if (r0 != 0) goto L2d
        L26:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r7 = r0
        L2d:
            r0 = r9
            r8 = r0
            r0 = r7
            int r0 = r0.length     // Catch: java.lang.Throwable -> L7a
            r6 = r0
            r0 = 0
            r5 = r0
            r0 = r9
            r4 = r0
        L39:
            r0 = r4
            r8 = r0
            r0 = r5
            r1 = r6
            if (r0 >= r1) goto L84
            r0 = r7
            r1 = r5
            r0 = r0[r1]
            r9 = r0
            r0 = r4
            r8 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r10 = r0
            r0 = r4
            r8 = r0
            r0 = r10
            r0.<init>()     // Catch: java.lang.Throwable -> L7a
            r0 = r4
            r8 = r0
            r0 = r10
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L7a
            r0 = r4
            r8 = r0
            r0 = r10
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L7a
            r0 = r4
            r8 = r0
            r0 = r10
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7a
            r4 = r0
            int r5 = r5 + 1
            goto L39
        L7a:
            r4 = move-exception
            r0 = r8
            java.lang.String r1 = "getStackTrace fail"
            java.lang.String r0 = G.p.a(r0, r1)
            r8 = r0
        L84:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.timeline.d.d(java.lang.Throwable):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v146, types: [com.bilibili.studio.kaleidoscope.sdk.StreamingContext$EventCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v154, types: [com.bilibili.studio.kaleidoscope.sdk.StreamingContext$ErrorLogTraceCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [N50.b, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final m a(e eVar) {
        Aw0.a aVar;
        UpperEngineScene upperEngineScene = eVar.f108291a;
        String info = upperEngineScene.getInfo();
        String initFrom = upperEngineScene.getInitFrom();
        eA0.c.b(this, "createEditorCore start scene info :" + info + " initFrom : " + initFrom);
        N50.a aVar2 = new N50.a(upperEngineScene.getCoreType());
        a.a.a.a = new Object();
        f108288d = aVar2;
        Context context = eVar.f108292b;
        Xz0.d.f28458a.getClass();
        Xz0.d.v(info, "start", "", initFrom);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        try {
            try {
                try {
                    aVar = Aw0.a.f603a;
                } catch (UnsatisfiedLinkError e7) {
                    e = e7;
                }
                try {
                    try {
                        String coreType = upperEngineScene.getCoreType();
                        aVar.getClass();
                        Aw0.a.a(coreType);
                        EditorEngineSDKLoadManager.initMontageLibraryDirPath(context);
                        try {
                        } catch (UnsatisfiedLinkError e8) {
                            e = e8;
                        }
                    } catch (UnsatisfiedLinkError e9) {
                        e = e9;
                    }
                    if (Intrinsics.areEqual(upperEngineScene.getCoreType(), "StudioMon")) {
                        try {
                            EditorEngineSDKLoadManager.initMontageLibraryDirPath(context, true);
                            String strB = UpperEditorUtil.b();
                            if (strB.length() > 0) {
                                throw new FileNotExistedError(strB + "trace is " + d(null));
                            }
                            List<String> listCheckLibraryExistResult = MontageLibChecker.CheckLibraryExistResult();
                            if (listCheckLibraryExistResult != null) {
                                if (!listCheckLibraryExistResult.isEmpty()) {
                                    throw new FileNotExistedError("MontageLibChecker exception " + listCheckLibraryExistResult);
                                }
                            }
                        } catch (UnsatisfiedLinkError e10) {
                            e = e10;
                        }
                        String coreType2 = upperEngineScene.getCoreType();
                        String message = e.getMessage();
                        Throwable cause = e.getCause();
                        StringBuilder sbA = G0.b.a("editor engine sdk coreType ", coreType2, " init failed: ", message, " cause: ");
                        sbA.append(cause);
                        String string = sbA.toString();
                        String strA = string;
                        if (Intrinsics.areEqual(upperEngineScene.getCoreType(), "StudioMon")) {
                            String montageLibraryPath = MontageLibLoader.getMontageLibraryPath();
                            if (montageLibraryPath == null) {
                                montageLibraryPath = "";
                            }
                            strA = U1.i.a(string, "montageLocalModPath: ", EditorEngineSDKLoadManager.getMonSoDirPath(context), "  montageInternalPath: ", montageLibraryPath);
                        }
                        eA0.c.a(this, strA);
                        Xz0.d.f28458a.getClass();
                        Xz0.d.v(info, "fail", strA, initFrom);
                        throw new UnsatisfiedLinkError(strA);
                    }
                    try {
                        N50.a aVar3 = f108288d;
                        N50.a aVar4 = aVar3;
                        if (aVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mEditorCore");
                            aVar4 = null;
                        }
                        String str = eVar.f108294d;
                        M50.a aVar5 = eVar.f108293c;
                        try {
                            f108286b = aVar4.b(context, aVar5 == null ? b(str) : aVar5, new m.a(booleanRef, booleanRef2) { // from class: com.bilibili.studio.editor.timeline.c

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final Ref.BooleanRef f108283a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final Ref.BooleanRef f108284b;

                                {
                                    this.f108283a = booleanRef;
                                    this.f108284b = booleanRef2;
                                }

                                public final void onLoadResult(int i7, String str2) {
                                    if (i7 != 0) {
                                        d dVar = d.f108285a;
                                        if (str2 != null) {
                                            boolean z6 = true;
                                            if (StringsKt.n(str2, "not found")) {
                                                this.f108283a.element = true;
                                                N50.a aVar6 = d.f108288d;
                                                N50.a aVar7 = aVar6;
                                                if (aVar6 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException("mEditorCore");
                                                    aVar7 = null;
                                                }
                                                aVar7.getClass();
                                                if (MontageStreamingContext.loadMontageSDKLibraries().errorType != 0) {
                                                    z6 = false;
                                                }
                                                this.f108284b.element = z6;
                                                if (z6) {
                                                    return;
                                                }
                                                String strConcat = "loadSDKLibraries again fail ".concat(str2);
                                                dVar.getClass();
                                                if (i7 != 0) {
                                                    throw new UnsatisfiedLinkError(strConcat);
                                                }
                                                return;
                                            }
                                        }
                                        dVar.getClass();
                                        if (i7 != 0) {
                                            throw new UnsatisfiedLinkError(str2);
                                        }
                                    }
                                }
                            });
                            if (booleanRef.element && booleanRef2.element) {
                                N50.a aVar6 = f108288d;
                                N50.a aVar7 = aVar6;
                                if (aVar6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mEditorCore");
                                    aVar7 = null;
                                }
                                M50.a aVarB = aVar5;
                                if (aVar5 == null) {
                                    aVarB = b(str);
                                }
                                f108286b = aVar7.b(context, aVarB, new l0());
                            }
                            if (f108286b == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mMainContext");
                            }
                            r rVar = f108286b;
                            r rVar2 = rVar;
                            if (rVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mMainContext");
                                rVar2 = null;
                            }
                            r.f fVarV = rVar2.v();
                            int majorVersion = fVarV.a.getMajorVersion();
                            StreamingContext.SdkVersion sdkVersion = fVarV.a;
                            int minorVersion = sdkVersion.getMinorVersion();
                            int revisionNumber = sdkVersion.getRevisionNumber();
                            StringBuilder sbA2 = androidx.constraintlayout.widget.e.a(majorVersion, "init editor engine success scene info :", info, " sdk version = ", UtilsKt.DOT);
                            sbA2.append(minorVersion);
                            sbA2.append(UtilsKt.DOT);
                            sbA2.append(revisionNumber);
                            eA0.c.a(this, sbA2.toString());
                            r rVar3 = f108286b;
                            r rVar4 = rVar3;
                            if (rVar3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mMainContext");
                                rVar4 = null;
                            }
                            rVar4.getClass();
                            rVar4.b.setEventCallback(new Object());
                            r rVar5 = f108286b;
                            r rVar6 = rVar5;
                            if (rVar5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mMainContext");
                                rVar6 = null;
                            }
                            rVar6.getClass();
                            rVar6.b.setErrorLogTraceCallback(new Object());
                            f108290f.set(true);
                            Xz0.d.v(info, "success", (booleanRef.element && booleanRef2.element) ? "activeLoadSoSuccess" : "", initFrom);
                            m mVar = f108286b;
                            if (mVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mMainContext");
                                mVar = null;
                            }
                            return mVar;
                        } catch (FileNotExistedError e11) {
                            e = e11;
                            String coreType3 = upperEngineScene.getCoreType();
                            String message2 = e.getMessage();
                            Throwable cause2 = e.getCause();
                            StringBuilder sbA3 = G0.b.a("editor engine sdk coreType ", coreType3, " init failed: ", message2, " cause: ");
                            sbA3.append(cause2);
                            String string2 = sbA3.toString();
                            eA0.c.a(this, string2);
                            Xz0.d.f28458a.getClass();
                            Xz0.d.v(info, "fail", string2, initFrom);
                            throw new FileNotExistedError(string2);
                        } catch (UnsatisfiedLinkError e12) {
                            e = e12;
                        } catch (Throwable th) {
                            th = th;
                            String coreType4 = upperEngineScene.getCoreType();
                            String message3 = th.getMessage();
                            Throwable cause3 = th.getCause();
                            String strD = d(th);
                            StringBuilder sbA4 = G0.b.a("editor engine sdk coreType ", coreType4, " init failed: ", message3, " cause: ");
                            sbA4.append(cause3);
                            sbA4.append(" trace: ");
                            sbA4.append(strD);
                            String string3 = sbA4.toString();
                            eA0.c.a(this, string3);
                            Xz0.d.f28458a.getClass();
                            Xz0.d.v(info, "fail", string3, initFrom);
                            throw new UnsatisfiedLinkError(string3);
                        }
                    } catch (UnsatisfiedLinkError e13) {
                        e = e13;
                    }
                } catch (FileNotExistedError e14) {
                    e = e14;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotExistedError e15) {
            e = e15;
        }
    }

    public final boolean e() {
        if (!f108290f.get()) {
            eA0.c.a(this, "context is not initialized!");
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            eA0.c.a(this, "======================printStackTrace start=============================");
            for (StackTraceElement stackTraceElement : stackTrace) {
                eA0.c.a(this, stackTraceElement.toString());
            }
            eA0.c.a(this, "======================printStackTrace end=============================");
        }
        return f108290f.get();
    }

    public final void f(boolean z6) {
        N50.a aVar = f108288d;
        N50.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditorCore");
            aVar2 = null;
        }
        aVar2.getClass();
        if (r.u() != null) {
            r.u().getClass();
        }
        eA0.c.b(this, "releaseContext  StudioMon");
        if (e()) {
            for (Map.Entry entry : c().entrySet()) {
                N50.a aVar3 = f108288d;
                N50.a aVar4 = aVar3;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEditorCore");
                    aVar4 = null;
                }
                aVar4.c((m) entry.getValue());
            }
            c().clear();
            if (z6) {
                N50.a aVar5 = f108288d;
                if (aVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEditorCore");
                    aVar5 = null;
                }
                if (f108286b == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMainContext");
                }
                aVar5.getClass();
                r.w().close();
            }
            f108290f.set(false);
        }
    }

    @Override // eA0.InterfaceC6919b
    @NotNull
    public final String getClassTag() {
        return "UpperEngineContextManager";
    }
}
