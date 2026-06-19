package com.bilibili.lib.sharewrapper.Bshare;

import com.bilibili.lib.gripper.api.GDeferred;
import com.bilibili.lib.gripper.api.SuspendProducer;
import com.bilibili.lib.gripper.api.internal.GenerateHelper;
import com.bilibili.lib.gripper.api.internal.ProducerLambda;
import com.bilibili.lib.sharewrapper.ShareHelper;
import com.google.common.base.Optional;
import java.util.Collection;
import java.util.LinkedHashSet;
import javax.annotation.Nonnull;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/Bshare/ShareContainer$$setShareImpl$$Lambda.class */
public class ShareContainer$$setShareImpl$$Lambda extends ProducerLambda<Unit> {
    GDeferred<ShareHelper> d_p0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    Optional<SuspendProducer<ShareHelper>> f64406p0;

    public ShareContainer$$setShareImpl$$Lambda(Optional<SuspendProducer<ShareHelper>> optional, Continuation<?> continuation) {
        super(continuation);
        this.f64406p0 = optional;
    }

    @Nonnull
    public Continuation<Unit> create(@Nonnull Continuation<?> continuation) {
        return new ShareContainer$$setShareImpl$$Lambda(this.f64406p0, continuation);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.lib.sharewrapper.Bshare.d, java.lang.Object] */
    public Object invokeProducer() {
        return new Object().setShareImpl((ShareHelper) GenerateHelper.getDeferredCompleted(this.d_p0), this);
    }

    public Collection<Job> prepareParams() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.d_p0 = GenerateHelper.deferredIfPresent(getContext(), linkedHashSet, this.f64406p0);
        return linkedHashSet;
    }
}
