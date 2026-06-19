package com.bilibili.lib.projection;

import android.app.Application;
import com.bilibili.lib.gripper.api.GDeferred;
import com.bilibili.lib.gripper.api.SuspendProducer;
import com.bilibili.lib.gripper.api.internal.GenerateHelper;
import com.bilibili.lib.gripper.api.internal.ProducerLambda;
import java.util.Collection;
import java.util.LinkedHashSet;
import javax.annotation.Nonnull;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/ProjectionModuleKt$$initProjectionModule$$Lambda.class */
public class ProjectionModuleKt$$initProjectionModule$$Lambda extends ProducerLambda<Unit> {
    GDeferred<Application> d_v0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    SuspendProducer<Application> f62982v0;

    public ProjectionModuleKt$$initProjectionModule$$Lambda(SuspendProducer<Application> suspendProducer, Continuation<?> continuation) {
        super(continuation);
        this.f62982v0 = suspendProducer;
    }

    @Nonnull
    public Continuation<Unit> create(@Nonnull Continuation<?> continuation) {
        return new ProjectionModuleKt$$initProjectionModule$$Lambda(this.f62982v0, continuation);
    }

    public Object invokeProducer() {
        c.initProjectionModule((Application) this.d_v0.getCompleted());
        return Unit.INSTANCE;
    }

    public Collection<Job> prepareParams() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.d_v0 = GenerateHelper.deferred(getContext(), linkedHashSet, this.f62982v0);
        return linkedHashSet;
    }
}
