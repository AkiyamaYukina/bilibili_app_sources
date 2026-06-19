package com.bilibili.playerbizcommonv2.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.MediaStore;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/BiliScreenshotDetectionUtil.class */
@StabilityInferred(parameters = 0)
public final class BiliScreenshotDetectionUtil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f81896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f81897c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final WeakReference<Context> f81899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final WeakReference<FragmentActivity> f81900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f81901g;

    @NotNull
    public final SharedFlow<Unit> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final BiliScreenshotDetectionUtil$contentObserver$1 f81902i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String[] f81895a = {"screenshots", "截屏", "screen_shot", "screen-shot", "screen shot"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f81898d = "";

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.utils.BiliScreenshotDetectionUtil$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/BiliScreenshotDetectionUtil$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final FragmentActivity $activityRef;
        int label;
        final BiliScreenshotDetectionUtil this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.utils.BiliScreenshotDetectionUtil$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/BiliScreenshotDetectionUtil$1$1.class */
        public static final class C05331 extends SuspendLambda implements Function2<Lifecycle.Event, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final BiliScreenshotDetectionUtil this$0;

            /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.utils.BiliScreenshotDetectionUtil$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/BiliScreenshotDetectionUtil$1$1$a.class */
            public static final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final int[] f81903a;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    try {
                        iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                    } catch (NoSuchFieldError e7) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError e8) {
                    }
                    f81903a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05331(BiliScreenshotDetectionUtil biliScreenshotDetectionUtil, Continuation<? super C05331> continuation) {
                super(2, continuation);
                this.this$0 = biliScreenshotDetectionUtil;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05331 c05331 = new C05331(this.this$0, continuation);
                c05331.L$0 = obj;
                return c05331;
            }

            public final Object invoke(Lifecycle.Event event, Continuation<? super Unit> continuation) {
                return create(event, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                ContentResolver contentResolver;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = a.f81903a[((Lifecycle.Event) this.L$0).ordinal()];
                if (i7 == 1) {
                    BiliScreenshotDetectionUtil biliScreenshotDetectionUtil = this.this$0;
                    FragmentActivity fragmentActivity = biliScreenshotDetectionUtil.f81900f.get();
                    if ((fragmentActivity != null ? fragmentActivity.getResources() : null) != null && fragmentActivity.getContentResolver() != null) {
                        ContentResolver contentResolver2 = fragmentActivity.getContentResolver();
                        if (contentResolver2 != null) {
                            contentResolver2.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, biliScreenshotDetectionUtil.f81902i);
                        }
                        biliScreenshotDetectionUtil.f81896b = true;
                        BLog.i("BiliScreenshotDetectionDelegate", "start screenshot detection");
                    }
                } else if (i7 == 2) {
                    BiliScreenshotDetectionUtil biliScreenshotDetectionUtil2 = this.this$0;
                    FragmentActivity fragmentActivity2 = biliScreenshotDetectionUtil2.f81900f.get();
                    if (biliScreenshotDetectionUtil2.f81896b) {
                        if (fragmentActivity2 != null && (contentResolver = fragmentActivity2.getContentResolver()) != null) {
                            contentResolver.unregisterContentObserver(biliScreenshotDetectionUtil2.f81902i);
                        }
                        biliScreenshotDetectionUtil2.f81896b = false;
                        BLog.i("BiliScreenshotDetectionDelegate", "stop screenshot detection");
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FragmentActivity fragmentActivity, BiliScreenshotDetectionUtil biliScreenshotDetectionUtil, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activityRef = fragmentActivity;
            this.this$0 = biliScreenshotDetectionUtil;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$activityRef, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Lifecycle.Event> eventFlow = LifecycleKt.getEventFlow(this.$activityRef.getLifecycle());
                C05331 c05331 = new C05331(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(eventFlow, c05331, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [com.bilibili.playerbizcommonv2.utils.BiliScreenshotDetectionUtil$contentObserver$1] */
    public BiliScreenshotDetectionUtil(@Nullable FragmentActivity fragmentActivity) {
        LifecycleCoroutineScope lifecycleScope;
        this.f81899e = new WeakReference<>(fragmentActivity);
        WeakReference<FragmentActivity> weakReference = new WeakReference<>(fragmentActivity);
        this.f81900f = weakReference;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, (Object) null);
        this.f81901g = mutableSharedFlowMutableSharedFlow$default;
        this.h = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        FragmentActivity fragmentActivity2 = weakReference.get();
        if (fragmentActivity2 != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentActivity2)) != null) {
            BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(fragmentActivity2, this, null), 3, (Object) null);
        }
        final Handler handler = new Handler();
        this.f81902i = new ContentObserver(this, handler) { // from class: com.bilibili.playerbizcommonv2.utils.BiliScreenshotDetectionUtil$contentObserver$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliScreenshotDetectionUtil f81904a;

            {
                this.f81904a = this;
            }

            @Override // android.database.ContentObserver
            public final void onChange(boolean z6, Uri uri) {
                LifecycleCoroutineScope lifecycleScope2;
                super.onChange(z6, uri);
                BLog.i("BiliScreenshotDetectionDelegate", "screenshot detected, uri is " + uri);
                FragmentActivity fragmentActivity3 = this.f81904a.f81900f.get();
                if (fragmentActivity3 == null || (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(fragmentActivity3)) == null) {
                    return;
                }
                BuildersKt.launch$default(lifecycleScope2, (CoroutineContext) null, (CoroutineStart) null, new BiliScreenshotDetectionUtil$contentObserver$1$onChange$1(uri, this.f81904a, null), 3, (Object) null);
            }
        };
    }

    public static final boolean a(BiliScreenshotDetectionUtil biliScreenshotDetectionUtil, Uri uri) {
        ContentResolver contentResolver;
        boolean z6 = false;
        if (Build.VERSION.SDK_INT < 29) {
            biliScreenshotDetectionUtil.getClass();
        } else {
            Context context = biliScreenshotDetectionUtil.f81899e.get();
            Cursor cursorQuery = (context == null || (contentResolver = context.getContentResolver()) == null) ? null : contentResolver.query(uri, new String[]{"is_pending"}, null, null, null);
            try {
                Cursor cursor = cursorQuery;
                z6 = false;
                if (cursor != null) {
                    z6 = false;
                    if (cursor.moveToFirst()) {
                        int columnIndex = cursor.getColumnIndex("is_pending");
                        Integer numValueOf = Integer.valueOf(columnIndex);
                        if (columnIndex < 0) {
                            numValueOf = null;
                        }
                        z6 = false;
                        if ((numValueOf != null ? cursor.getInt(numValueOf.intValue()) : 0) == 1) {
                            z6 = true;
                        }
                    }
                }
                CloseableKt.closeFinally(cursorQuery, (Throwable) null);
            } finally {
            }
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(com.bilibili.playerbizcommonv2.utils.BiliScreenshotDetectionUtil r7) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.utils.BiliScreenshotDetectionUtil.b(com.bilibili.playerbizcommonv2.utils.BiliScreenshotDetectionUtil):void");
    }
}
