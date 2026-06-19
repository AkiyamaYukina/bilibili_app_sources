package com.bilibili.ogvvega.tunnel;

import androidx.compose.animation.z;
import c6.P;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/Subscription.class */
public final class Subscription {
    private boolean reconnect;
    private boolean started;
    private boolean subscribed;

    @NotNull
    private final Subscriber<?> subscriber;

    @NotNull
    private final TargetPath targetPath;

    public Subscription(@NotNull TargetPath targetPath, @NotNull Subscriber<?> subscriber, boolean z6, boolean z7, boolean z8) {
        this.targetPath = targetPath;
        this.subscriber = subscriber;
        this.started = z6;
        this.subscribed = z7;
        this.reconnect = z8;
    }

    public /* synthetic */ Subscription(TargetPath targetPath, Subscriber subscriber, boolean z6, boolean z7, boolean z8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(targetPath, subscriber, z6, z7, (i7 & 16) != 0 ? false : z8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Subscription copy$default(Subscription subscription, TargetPath targetPath, Subscriber subscriber, boolean z6, boolean z7, boolean z8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            targetPath = subscription.targetPath;
        }
        if ((i7 & 2) != 0) {
            subscriber = subscription.subscriber;
        }
        if ((i7 & 4) != 0) {
            z6 = subscription.started;
        }
        if ((i7 & 8) != 0) {
            z7 = subscription.subscribed;
        }
        if ((i7 & 16) != 0) {
            z8 = subscription.reconnect;
        }
        return subscription.copy(targetPath, subscriber, z6, z7, z8);
    }

    @NotNull
    public final TargetPath component1() {
        return this.targetPath;
    }

    @NotNull
    public final Subscriber<?> component2() {
        return this.subscriber;
    }

    public final boolean component3() {
        return this.started;
    }

    public final boolean component4() {
        return this.subscribed;
    }

    public final boolean component5() {
        return this.reconnect;
    }

    @NotNull
    public final Subscription copy(@NotNull TargetPath targetPath, @NotNull Subscriber<?> subscriber, boolean z6, boolean z7, boolean z8) {
        return new Subscription(targetPath, subscriber, z6, z7, z8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        return Intrinsics.areEqual(this.targetPath, subscription.targetPath) && Intrinsics.areEqual(this.subscriber, subscription.subscriber) && this.started == subscription.started && this.subscribed == subscription.subscribed && this.reconnect == subscription.reconnect;
    }

    public final boolean getReconnect() {
        return this.reconnect;
    }

    public final boolean getStarted() {
        return this.started;
    }

    public final boolean getSubscribed() {
        return this.subscribed;
    }

    @NotNull
    public final Subscriber<?> getSubscriber() {
        return this.subscriber;
    }

    @NotNull
    public final TargetPath getTargetPath() {
        return this.targetPath;
    }

    public int hashCode() {
        return Boolean.hashCode(this.reconnect) + z.a(z.a((this.subscriber.hashCode() + (this.targetPath.hashCode() * 31)) * 31, 31, this.started), 31, this.subscribed);
    }

    public final void setReconnect(boolean z6) {
        this.reconnect = z6;
    }

    public final void setStarted(boolean z6) {
        this.started = z6;
    }

    public final void setSubscribed(boolean z6) {
        this.subscribed = z6;
    }

    @NotNull
    public String toString() {
        TargetPath targetPath = this.targetPath;
        Subscriber<?> subscriber = this.subscriber;
        boolean z6 = this.started;
        boolean z7 = this.subscribed;
        boolean z8 = this.reconnect;
        StringBuilder sb = new StringBuilder("Subscription(targetPath=");
        sb.append(targetPath);
        sb.append(", subscriber=");
        sb.append(subscriber);
        sb.append(", started=");
        P.a(", subscribed=", ", reconnect=", sb, z6, z7);
        return androidx.appcompat.app.i.a(sb, z8, ")");
    }
}
