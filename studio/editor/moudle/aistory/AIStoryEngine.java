package com.bilibili.studio.editor.moudle.aistory;

import Tw0.b;
import Yv0.e;
import android.content.Context;
import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryBean;
import com.bilibili.studio.editor.moudle.aistory.step.h;
import com.bilibili.studio.editor.moudle.aistory.step.m;
import com.bilibili.studio.editor.moudle.aistory.step.n;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/AIStoryEngine.class */
public final class AIStoryEngine {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f105695b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f105697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public AIStoryBean f105698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f105699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Function1<? super Result<AIStoryBean>, Unit> f105700g;

    @Nullable
    public Context h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public List<n> f105694a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final e f105696c = new e();

    public static final Object a(AIStoryEngine aIStoryEngine, Context context, AIStoryBean aIStoryBean, Function1 function1, Function1 function12, SuspendLambda suspendLambda) {
        aIStoryEngine.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        b.f("start", aIStoryEngine.f105694a.get(aIStoryEngine.f105695b).a(), aIStoryBean, null, null, false, Boxing.boxInt(aIStoryBean.getStoryPlayType()), 56);
        Object objB = aIStoryEngine.f105694a.get(aIStoryEngine.f105695b).b(context, aIStoryBean, new a(aIStoryEngine, jCurrentTimeMillis, function1, aIStoryBean, function12, context), suspendLambda);
        if (objB != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objB = Unit.INSTANCE;
        }
        return objB;
    }

    public final void b() {
        int size = this.f105694a.size();
        int i7 = this.f105695b;
        if (i7 >= 0 && i7 < size) {
            int iA = this.f105694a.get(i7).a();
            AIStoryBean aIStoryBean = this.f105698e;
            b.f("cancel", iA, aIStoryBean, null, null, false, aIStoryBean != null ? Integer.valueOf(aIStoryBean.getStoryPlayType()) : null, 56);
            AIStoryBean aIStoryBean2 = this.f105698e;
            if (aIStoryBean2 != null && aIStoryBean2.getReportGenerate()) {
                AIStoryBean aIStoryBean3 = this.f105698e;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j7 = this.f105697d;
                AIStoryBean aIStoryBean4 = this.f105698e;
                b.f("cancel", -6, aIStoryBean3, Long.valueOf(jCurrentTimeMillis - j7), null, true, aIStoryBean4 != null ? Integer.valueOf(aIStoryBean4.getStoryPlayType()) : null, 16);
            }
        }
        n nVar = (n) CollectionsKt.getOrNull(this.f105694a, this.f105695b);
        if (nVar != null) {
            nVar.cancel();
        }
        this.f105698e = null;
        this.h = null;
        this.f105700g = null;
        this.f105695b = -1;
        CoroutineScopeKt.cancel$default(this.f105696c, (CancellationException) null, 1, (Object) null);
        this.f105694a.clear();
    }

    public final void c(@NotNull List<? extends n> list) {
        this.f105694a = CollectionsKt.toMutableList(list);
    }

    public final void d() {
        if (this.f105695b == -1) {
            this.f105695b = 0;
        }
        this.f105697d = System.currentTimeMillis();
        AIStoryBean aIStoryBean = this.f105698e;
        if (aIStoryBean != null && aIStoryBean.getReportGenerate()) {
            AIStoryBean aIStoryBean2 = this.f105698e;
            b.f("start", -6, aIStoryBean2, null, null, true, aIStoryBean2 != null ? Integer.valueOf(aIStoryBean2.getStoryPlayType()) : null, 24);
        }
        BuildersKt.launch$default(this.f105696c, Dispatchers.getDefault(), (CoroutineStart) null, new AIStoryEngine$retry$1(this, null), 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(@NotNull Context context, @NotNull AIStoryBean aIStoryBean, @NotNull Function1<? super Integer, Unit> function1, @NotNull Function1<? super Result<AIStoryBean>, Unit> function12) {
        Object obj;
        this.f105699f = function1;
        this.f105700g = function12;
        this.f105698e = aIStoryBean;
        this.h = context;
        this.f105695b = 0;
        this.f105697d = System.currentTimeMillis();
        if (this.f105694a.isEmpty()) {
            this.f105694a.addAll(CollectionsKt.listOf(new m[]{new Object(), new Object(), new Object(), new h(), new Object(), new Object()}));
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(UUID.randomUUID().toString());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Object obj2 = obj;
        if (Result.isFailure-impl(obj)) {
            obj2 = null;
        }
        String str = (String) obj2;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        b.f24324b = "generate-".concat(str2);
        if (aIStoryBean.getReportGenerate()) {
            b.f("start", -6, aIStoryBean, null, null, true, Integer.valueOf(aIStoryBean.getStoryPlayType()), 24);
        }
        BuildersKt.launch$default(this.f105696c, Dispatchers.getDefault(), (CoroutineStart) null, new AIStoryEngine$startProcess$1(this, context, aIStoryBean, function1, function12, null), 2, (Object) null);
    }
}
