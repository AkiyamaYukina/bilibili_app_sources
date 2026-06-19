package com.bilibili.upper.module.uppercenter.view;

import J1.z;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.core.I;
import androidx.compose.animation.n;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.o;
import androidx.core.util.Pools;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import bF0.d4;
import com.alipay.sdk.app.PayTask;
import com.bilibili.upper.module.uppercenter.view.DanmakuView;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/view/DanmakuView.class */
@StabilityInferred(parameters = 0)
public final class DanmakuView extends ViewGroup {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f114182f = View.MeasureSpec.makeMeasureSpec(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public b f114183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f114184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f114185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f114186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f114187e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/view/DanmakuView$State.class */
    public static final class State {
        private static final EnumEntries $ENTRIES;
        private static final State[] $VALUES;
        public static final State IDLE = new State("IDLE", 0);
        public static final State RUNNING = new State("RUNNING", 1);
        public static final State PAUSE = new State("PAUSE", 2);
        public static final State DESTROYED = new State("DESTROYED", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{IDLE, RUNNING, PAUSE, DESTROYED};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(stateArr$values);
        }

        private State(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/view/DanmakuView$a.class */
    public static final class a implements LifecycleEventObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DanmakuView f114188a;

        /* JADX INFO: renamed from: com.bilibili.upper.module.uppercenter.view.DanmakuView$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/view/DanmakuView$a$a.class */
        public static final /* synthetic */ class C1235a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f114189a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                f114189a = iArr;
            }
        }

        public a(DanmakuView danmakuView) {
            this.f114188a = danmakuView;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            int i7 = C1235a.f114189a[event.ordinal()];
            DanmakuView danmakuView = this.f114188a;
            if (i7 == 1) {
                b bVar = danmakuView.f114183a;
                if (bVar != null) {
                    bVar.b();
                    return;
                }
                return;
            }
            if (i7 == 2) {
                b bVar2 = danmakuView.f114183a;
                if (bVar2 != null) {
                    bVar2.a();
                    return;
                }
                return;
            }
            if (i7 != 3) {
                return;
            }
            b bVar3 = danmakuView.f114183a;
            if (bVar3 != null) {
                bVar3.f114196g = State.DESTROYED;
                bVar3.f114193d = null;
                bVar3.f114194e = null;
                bVar3.f114191b.removeCallbacksAndMessages(null);
                while (bVar3.f114192c.acquire() != null) {
                }
            }
            danmakuView.f114183a = null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/view/DanmakuView$b.class */
    public final class b<VB extends ViewBinding> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final d<VB> f114190a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public c<VB> f114193d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public c<VB> f114194e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f114195f;
        public final DanmakuView h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Handler f114191b = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Pools.SimplePool<VB> f114192c = new Pools.SimplePool<>(20);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public volatile State f114196g = State.IDLE;

        public b(@NotNull DanmakuView danmakuView, d<VB> dVar) {
            this.h = danmakuView;
            this.f114190a = dVar;
        }

        public final void a() {
            this.f114191b.post(new Runnable(this) { // from class: com.bilibili.upper.module.uppercenter.view.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final DanmakuView.b f114217a;

                {
                    this.f114217a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    DanmakuView.b bVar = this.f114217a;
                    bVar.f114196g = DanmakuView.State.PAUSE;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    DanmakuView.c cVar = bVar.f114193d;
                    while (true) {
                        DanmakuView.c cVar2 = cVar;
                        if (cVar2 == null) {
                            return;
                        }
                        cVar2.f114200d = jCurrentTimeMillis - cVar2.f114199c;
                        cVar = cVar2.f114202f;
                    }
                }
            });
        }

        public final void b() {
            Handler handler = this.f114191b;
            final DanmakuView danmakuView = this.h;
            handler.post(new Runnable(this, danmakuView) { // from class: com.bilibili.upper.module.uppercenter.view.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final DanmakuView.b f114218a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final DanmakuView f114219b;

                {
                    this.f114218a = this;
                    this.f114219b = danmakuView;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    DanmakuView.b bVar = this.f114218a;
                    DanmakuView danmakuView2 = this.f114219b;
                    if (bVar.f114196g == DanmakuView.State.DESTROYED) {
                        return;
                    }
                    DanmakuView.State state = bVar.f114196g;
                    DanmakuView.State state2 = DanmakuView.State.RUNNING;
                    if (state == state2) {
                        return;
                    }
                    bVar.f114196g = state2;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    DanmakuView.c cVar = bVar.f114193d;
                    while (true) {
                        DanmakuView.c cVar2 = cVar;
                        if (cVar2 == null) {
                            bVar.f114191b.postDelayed(new c(bVar, bVar.h), 100L);
                            danmakuView2.postInvalidateOnAnimation();
                            return;
                        } else {
                            cVar2.f114199c = jCurrentTimeMillis - cVar2.f114200d;
                            cVar = cVar2.f114202f;
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/view/DanmakuView$c.class */
    public static final class c<VB> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewBinding f114197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f114198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f114199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f114200d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f114201e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public c<VB> f114202f;

        public c() {
            throw null;
        }

        public c(ViewBinding viewBinding, int i7, long j7) {
            this.f114197a = viewBinding;
            this.f114198b = i7;
            this.f114199c = j7;
            this.f114200d = 0L;
            this.f114201e = 0.0f;
            this.f114202f = null;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f114197a, cVar.f114197a) && this.f114198b == cVar.f114198b && this.f114199c == cVar.f114199c && this.f114200d == cVar.f114200d && Float.compare(this.f114201e, cVar.f114201e) == 0 && Intrinsics.areEqual(this.f114202f, cVar.f114202f);
        }

        public final int hashCode() {
            ViewBinding viewBinding = this.f114197a;
            int iA = n.a(this.f114201e, C3554n0.a(C3554n0.a(I.a(this.f114198b, (viewBinding == null ? 0 : viewBinding.hashCode()) * 31, 31), 31, this.f114199c), 31, this.f114200d), 31);
            c<VB> cVar = this.f114202f;
            return iA + (cVar == null ? 0 : cVar.hashCode());
        }

        @NotNull
        public final String toString() {
            long j7 = this.f114199c;
            long j8 = this.f114200d;
            float f7 = this.f114201e;
            c<VB> cVar = this.f114202f;
            StringBuilder sb = new StringBuilder("Danmaku(binding=");
            sb.append(this.f114197a);
            sb.append(", line=");
            o.b(this.f114198b, j7, ", startTime=", sb);
            z.a(j8, ", animateTime=", ", animateDis=", sb);
            sb.append(f7);
            sb.append(", next=");
            sb.append(cVar);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/view/DanmakuView$d.class */
    public interface d<VB extends ViewBinding> {
        @NotNull
        d4 a(@NotNull ViewGroup viewGroup);

        boolean b(@NotNull VB vb, @NotNull ViewGroup viewGroup, float f7);

        boolean c(@NotNull VB vb);
    }

    @JvmOverloads
    public DanmakuView(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public DanmakuView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public DanmakuView(Context context, AttributeSet attributeSet, int i7) {
        Lifecycle lifecycle;
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f114184b = 3;
        this.f114185c = 30;
        this.f114186d = 30;
        this.f114187e = PayTask.f60018j;
        setWillNotDraw(false);
        ComponentActivity componentActivity = (ComponentActivity) ContextUtilKt.findTypedActivityOrNull(context, ComponentActivity.class);
        if (componentActivity == null || (lifecycle = componentActivity.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(new a(this));
    }

    public final long getAnimatorDuration() {
        return this.f114187e;
    }

    public final int getLineSpaceHeight() {
        return this.f114185c;
    }

    public final int getLineSpaceWidth() {
        return this.f114186d;
    }

    public final int getLines() {
        return this.f114184b;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        b bVar = this.f114183a;
        if (bVar == null || bVar.f114196g != State.RUNNING) {
            return;
        }
        float f7 = bVar.f114195f;
        DanmakuView danmakuView = bVar.h;
        if (f7 == 0.0f && danmakuView.getAnimatorDuration() > 0) {
            bVar.f114195f = danmakuView.getMeasuredWidth() / danmakuView.getAnimatorDuration();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        c cVar = bVar.f114193d;
        if (cVar == null) {
            return;
        }
        c cVar2 = null;
        while (cVar != null) {
            long j7 = jCurrentTimeMillis - cVar.f114199c;
            cVar.f114200d = j7;
            float f8 = bVar.f114195f * j7;
            cVar.f114201e = f8;
            ViewBinding viewBinding = cVar.f114197a;
            if (bVar.f114190a.b(viewBinding, danmakuView, f8)) {
                bVar.f114192c.release(viewBinding);
                danmakuView.removeView(viewBinding.getRoot());
                c cVar3 = cVar.f114202f;
                if (cVar3 == null) {
                    bVar.f114194e = cVar2;
                }
                if (cVar2 == null) {
                    bVar.f114193d = cVar3;
                } else {
                    cVar2.f114202f = cVar3;
                }
                c cVar4 = cVar.f114202f;
                cVar.f114202f = null;
                cVar = cVar4;
            } else {
                cVar2 = cVar;
                cVar = cVar.f114202f;
            }
        }
        danmakuView.postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
    }

    public final <VB extends ViewBinding> void setAdapter(@NotNull d<VB> dVar) {
        this.f114183a = new b(this, dVar);
    }

    public final void setAnimatorDuration(long j7) {
        this.f114187e = j7;
    }

    public final void setLineSpaceHeight(int i7) {
        this.f114185c = i7;
    }

    public final void setLineSpaceWidth(int i7) {
        this.f114186d = i7;
    }

    public final void setLines(int i7) {
        this.f114184b = i7;
    }
}
