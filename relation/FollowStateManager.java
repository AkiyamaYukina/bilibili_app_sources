package com.bilibili.relation;

import J3.A1;
import android.util.LongSparseArray;
import androidx.annotation.UiThread;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bus.Violet;
import java.lang.ref.WeakReference;
import java.util.ConcurrentModificationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/FollowStateManager.class */
@StabilityInferred(parameters = 0)
public final class FollowStateManager {

    @NotNull
    public static final String TAG = "FollowStateManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LongSparseArray<CopyOnWriteArrayList<WeakReference<FollowChangeListener>>> f85913a = new LongSparseArray<>();

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy<FollowStateManager> f85912b = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new A1(8));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/FollowStateManager$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        @NotNull
        public final FollowStateManager getInstance() {
            return (FollowStateManager) FollowStateManager.f85912b.getValue();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/FollowStateManager$FollowChangeListener.class */
    public interface FollowChangeListener {
        void onFollowChange(boolean z6);
    }

    @NotNull
    public static final FollowStateManager getInstance() {
        return Companion.getInstance();
    }

    @UiThread
    public final void notify(long j7, boolean z6, @Nullable FollowChangeListener followChangeListener) {
        Violet.INSTANCE.setValue(new FollowStateEvent(j7, z6));
        synchronized (this.f85913a) {
            try {
                CopyOnWriteArrayList<WeakReference<FollowChangeListener>> copyOnWriteArrayList = this.f85913a.get(j7);
                if (copyOnWriteArrayList != null && (r0 = copyOnWriteArrayList.iterator()) != null) {
                    for (WeakReference<FollowChangeListener> weakReference : copyOnWriteArrayList) {
                        if (weakReference.get() != null && !Intrinsics.areEqual(weakReference.get(), followChangeListener)) {
                            weakReference.get().onFollowChange(z6);
                        }
                    }
                }
                CopyOnWriteArrayList<WeakReference<FollowChangeListener>> copyOnWriteArrayList2 = this.f85913a.get(j7);
                int i7 = 0;
                while (true) {
                    if (i7 >= (copyOnWriteArrayList2 != null ? copyOnWriteArrayList2.size() : 0)) {
                        break;
                    }
                    WeakReference<FollowChangeListener> weakReference2 = copyOnWriteArrayList2.get(i7);
                    if (weakReference2.get() == null) {
                        copyOnWriteArrayList2.remove(weakReference2);
                    } else {
                        i7++;
                    }
                }
            } catch (ConcurrentModificationException e7) {
                BLog.w(TAG, e7);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void register(long j7, @NotNull FollowChangeListener followChangeListener) {
        CopyOnWriteArrayList<WeakReference<FollowChangeListener>> copyOnWriteArrayList;
        if (j7 == 0) {
            BLog.w(TAG, "register error:uid == 0");
            return;
        }
        synchronized (this.f85913a) {
            if (this.f85913a.get(j7) == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                this.f85913a.put(j7, copyOnWriteArrayList);
            } else {
                copyOnWriteArrayList = this.f85913a.get(j7);
            }
            copyOnWriteArrayList.add(new WeakReference<>(followChangeListener));
        }
    }

    public final void unregister(long j7, @NotNull FollowChangeListener followChangeListener) {
        if (j7 == 0) {
            BLog.w(TAG, "unregister error:uid == 0");
            return;
        }
        synchronized (this.f85913a) {
            CopyOnWriteArrayList<WeakReference<FollowChangeListener>> copyOnWriteArrayList = this.f85913a.get(j7);
            int i7 = 0;
            while (true) {
                if (i7 < (copyOnWriteArrayList != null ? copyOnWriteArrayList.size() : 0)) {
                    WeakReference<FollowChangeListener> weakReference = copyOnWriteArrayList.get(i7);
                    if (Intrinsics.areEqual(weakReference.get(), followChangeListener)) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        i7++;
                    }
                } else {
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }
}
