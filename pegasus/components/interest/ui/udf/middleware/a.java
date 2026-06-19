package com.bilibili.pegasus.components.interest.ui.udf.middleware;

import Eo0.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.bangumi.logic.page.detail.service.e;
import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/middleware/a.class */
@Singleton
@StabilityInferred(parameters = 0)
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Eo0.b f76430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f76431b = "Interest";

    @Inject
    public a(@NotNull Eo0.b bVar) {
        this.f76430a = bVar;
    }

    @Override // com.bilibili.pegasus.components.interest.ui.udf.middleware.c
    @Nullable
    public final Unit a(@NotNull Actions actions) {
        String strA;
        String str = this.f76431b;
        Eo0.b bVar = this.f76430a;
        if (bVar.f4670d) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String name = Thread.currentThread().getName();
            String simpleName = Reflection.getOrCreateKotlinClass(actions.getClass()).getSimpleName();
            String str2 = simpleName;
            if (simpleName == null) {
                str2 = "Unknown";
            }
            if (actions instanceof Actions.a.c) {
                strA = C4496a.a("item=", Reflection.getOrCreateKotlinClass(((Actions.a.c) actions).f76415a.getClass()).getSimpleName());
            } else if (actions instanceof Actions.a.d) {
                strA = C4496a.a("sub=", ((Actions.a.d) actions).f76417b.getName());
            } else if (actions instanceof Actions.a.b) {
                strA = C4496a.a("gender=", ((Actions.a.b) actions).f76414a.getTitle());
            } else if (actions instanceof Actions.a.C0490a) {
                strA = C4496a.a("age=", ((Actions.a.C0490a) actions).f76413a.getTitle());
            } else if (actions instanceof Actions.a.e) {
                strA = "unfold";
            } else if (actions instanceof Actions.f) {
                strA = com.bilibili.app.comm.bh.x5.b.a("hasData=", ((Actions.f) actions).f76424b != null);
            } else if (actions instanceof Actions.ReportActions.b) {
                strA = "type=" + ((Actions.ReportActions.b) actions).f76408b;
            } else if (actions instanceof Actions.ReportActions.d) {
                strA = "type=" + ((Actions.ReportActions.d) actions).f76412c;
            } else {
                strA = "";
            }
            a.C0030a c0030a = new a.C0030a(jCurrentTimeMillis, name, actions, str2, strA);
            bVar.a(c0030a);
            if (bVar.f4671e) {
                StringBuilder sb = new StringBuilder("[ACTION] ");
                sb.append(c0030a.f4650d);
                sb.append(" ");
                bilibili.live.app.service.resolver.b.a(sb, c0030a.f4651e, str);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.bilibili.pegasus.components.interest.ui.udf.middleware.c
    @Nullable
    public final Unit b(@NotNull Actions actions, @NotNull Throwable th) {
        String strA = C4496a.a("Error processing action ", Reflection.getOrCreateKotlinClass(actions.getClass()).getSimpleName());
        String str = this.f76431b;
        Eo0.b bVar = this.f76430a;
        if (bVar.f4670d) {
            bVar.a(new a.b(System.currentTimeMillis(), Thread.currentThread().getName(), strA, th != null ? ExceptionsKt.stackTraceToString(th) : null));
            if (bVar.f4671e) {
                if (th != null) {
                    e.a("[ERROR] ", strA, str, th);
                } else {
                    M.b("[ERROR] ", strA, str);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0450  */
    @Override // com.bilibili.pegasus.components.interest.ui.udf.middleware.c
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.Unit c(@org.jetbrains.annotations.NotNull com.bilibili.pegasus.components.interest.ui.udf.actions.Actions r12, @org.jetbrains.annotations.NotNull Fo0.k r13, @org.jetbrains.annotations.Nullable Fo0.k r14, @org.jetbrains.annotations.NotNull Co0.b r15) {
        /*
            Method dump skipped, instruction units count: 1557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.udf.middleware.a.c(com.bilibili.pegasus.components.interest.ui.udf.actions.Actions, Fo0.k, Fo0.k, Co0.b):kotlin.Unit");
    }
}
