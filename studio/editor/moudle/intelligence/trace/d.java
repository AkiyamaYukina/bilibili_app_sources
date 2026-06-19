package com.bilibili.studio.editor.moudle.intelligence.trace;

import androidx.compose.foundation.gestures.C3392f;
import androidx.constraintlayout.motion.widget.p;
import com.bilibili.app.producers.ability.l0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u5.C8711a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/trace/d.class */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f107556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Class<? extends d> f107557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final NodeType f107558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f107559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Map<String, Object> f107560e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/trace/d$a.class */
    public static final class a extends d {
        @Override // com.bilibili.studio.editor.moudle.intelligence.trace.d
        public final boolean a(@NotNull d dVar) {
            return true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/trace/d$b.class */
    public static final class b extends d {
        public b() {
            super("进入素材页", null, null, 30);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/trace/d$c.class */
    public static final class c extends g {
    }

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.intelligence.trace.d$d, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/trace/d$d.class */
    public static final class C1196d extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f107561f;

        public C1196d(@NotNull String str, @NotNull String str2) {
            super(p.a("[", str, "]不满足分析条件[", str2, "]"), k.class, NodeType.ERROR, 24);
            this.f107561f = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/trace/d$e.class */
    public static final class e extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f107562f;

        public e(@NotNull String str) {
            super("点击“开启智能成片”", null, null, 30);
            this.f107562f = str;
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.trace.d
        public final boolean a(@NotNull d dVar) {
            if (!(dVar instanceof C1196d)) {
                return false;
            }
            return Intrinsics.areEqual(this.f107562f, ((C1196d) dVar).f107561f);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/trace/d$f.class */
    public static final class f extends g {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/trace/d$g.class */
    public static class g extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f107563f;

        public g(@NotNull String str, @NotNull String str2, @Nullable Class<? extends d> cls) {
            super(str2, cls, null, 28);
            this.f107563f = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/trace/d$h.class */
    public static final class h extends g {
        @Override // com.bilibili.studio.editor.moudle.intelligence.trace.d
        public final boolean a(@NotNull d dVar) {
            if (!(dVar instanceof g)) {
                return false;
            }
            return Intrinsics.areEqual(this.f107563f, ((g) dVar).f107563f);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/trace/d$i.class */
    public static final class i extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f107564f;

        public i(@NotNull String str, @NotNull String str2, int i7) {
            super(androidx.constraintlayout.widget.c.a(i7, "[", str2, "]生成结果成功,数量[", "]"), null, NodeType.NORMAL, 26);
            this.f107564f = str;
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.trace.d
        public final boolean a(@NotNull d dVar) {
            boolean zAreEqual;
            if (dVar instanceof g) {
                zAreEqual = Intrinsics.areEqual(this.f107564f, ((g) dVar).f107563f);
            } else {
                zAreEqual = false;
            }
            return zAreEqual;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/trace/d$j.class */
    public static final class j extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f107565f;

        public j(@NotNull String str, int i7) {
            super(C3392f.a(i7, "UI展示坑位[", "]"), null, NodeType.RESULT, 26);
            this.f107565f = str;
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.trace.d
        public final boolean a(@NotNull d dVar) {
            if (dVar instanceof i) {
                return Intrinsics.areEqual(((i) dVar).f107564f, this.f107565f);
            }
            return false;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/trace/d$k.class */
    public static final class k extends d {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/trace/d$l.class */
    public static final class l extends d {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/trace/d$m.class */
    public static final class m extends d {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/trace/d$n.class */
    public static final class n extends d {
        @Override // com.bilibili.studio.editor.moudle.intelligence.trace.d
        public final boolean a(@NotNull d dVar) {
            return true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/trace/d$o.class */
    public static final class o extends d {
        @Override // com.bilibili.studio.editor.moudle.intelligence.trace.d
        public final boolean a(@NotNull d dVar) {
            return (dVar instanceof k) || (dVar instanceof e);
        }
    }

    public d() {
        throw null;
    }

    public d(String str, Class cls, NodeType nodeType, int i7) {
        cls = (i7 & 2) != 0 ? null : cls;
        nodeType = (i7 & 4) != 0 ? NodeType.NORMAL : nodeType;
        this.f107556a = str;
        this.f107557b = cls;
        this.f107558c = nodeType;
        this.f107559d = "";
        this.f107560e = null;
    }

    public boolean a(@NotNull d dVar) {
        return Intrinsics.areEqual(this.f107557b, dVar.getClass());
    }

    @NotNull
    public final String toString() {
        String str = this.f107556a;
        String str2 = this.f107559d;
        Map<String, Object> map = this.f107560e;
        StringBuilder sbA = l0.a("IgvNode(label='", str, "', type=");
        sbA.append(this.f107558c);
        sbA.append(", id=");
        sbA.append(str2);
        sbA.append(", extra=");
        return C8711a.a(sbA, map, ")");
    }
}
