package com.bilibili.upper.module.cover.editor;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.studio.videoeditor.bean.EditorMaterialEntity;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/editor/g.class */
@StabilityInferred(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f112681d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static volatile g f112682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static volatile g f112683f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ManagerType f112684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d f112685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final f f112686c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/editor/g$a.class */
    public static final class a {
        @JvmStatic
        @NotNull
        public final g a() {
            g gVar = g.f112682e;
            g gVar2 = gVar;
            if (gVar == null) {
                synchronized (this) {
                    g gVar3 = g.f112682e;
                    gVar2 = gVar3;
                    if (gVar3 == null) {
                        gVar2 = new g(ManagerType.TYPE_4_3);
                        g.f112682e = gVar2;
                    }
                }
            }
            return gVar2;
        }

        @JvmStatic
        @NotNull
        public final g b() {
            g gVar = g.f112683f;
            g gVar2 = gVar;
            if (gVar == null) {
                synchronized (this) {
                    g gVar3 = g.f112683f;
                    gVar2 = gVar3;
                    if (gVar3 == null) {
                        gVar2 = new g(ManagerType.TYPE_16_9);
                        g.f112683f = gVar2;
                    }
                }
            }
            return gVar2;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/editor/g$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f112687a;

        static {
            int[] iArr = new int[ManagerType.values().length];
            try {
                iArr[ManagerType.TYPE_4_3.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ManagerType.TYPE_16_9.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f112687a = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bilibili.upper.module.cover.editor.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.bilibili.upper.module.cover.editor.f, java.lang.Object] */
    public g(@NotNull ManagerType managerType) {
        this.f112684a = managerType;
        ?? obj = new Object();
        obj.f112674a = new EditorMaterialEntity();
        obj.f112675b = new CoverEditorInfo();
        this.f112685b = obj;
        ?? obj2 = new Object();
        obj2.f112679a = new EditorMaterialEntity();
        this.f112686c = obj2;
    }

    @Nullable
    public final String a() {
        h hVarB = b();
        return hVarB != null ? hVarB.b() : null;
    }

    public final h b() {
        int i7 = b.f112687a[this.f112684a.ordinal()];
        return i7 != 1 ? i7 != 2 ? null : this.f112686c : this.f112685b;
    }
}
