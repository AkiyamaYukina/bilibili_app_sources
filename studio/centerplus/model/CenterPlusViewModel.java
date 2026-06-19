package com.bilibili.studio.centerplus.model;

import F3.O1;
import I.E;
import android.content.Context;
import androidx.compose.animation.z;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.moduleservice.upper.UpperService;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper;
import com.bilibili.studio.centerplus.tabbubble.TabBubble;
import com.bilibili.studio.centerplus.ui.CenterPlusMainActivity;
import com.bilibili.studio.centerplus.util.blink.BlinkEffectManager;
import com.bilibili.studio.videoeditor.C6598f;
import com.bilibili.studio.videoeditor.mediav3.base.ConfigV3;
import com.bilibili.studio.videoeditor.util.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/CenterPlusViewModel.class */
public final class CenterPlusViewModel extends ViewModel {

    @NotNull
    public static final a Companion = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final String[] f105112q = {ConfigV3.j(), ConfigV3.k()};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final String[] f105113r = {ConfigV3.h()};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final String[] f105114s = {"android_cv_model_4"};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final String[] f105115t = {"android_cv_model_1", "android_cv_model_2", "android_cv_model_3"};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final String[] f105116u = {"android_aurora_resources"};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final String[] f105117v = {ConfigV3.c(), ConfigV3.f(), ConfigV3.d(), ConfigV3.e(), "android_aurora_thirdparty"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CenterPlusRepository f105118a = CenterPlusRepository.f105111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f105119b = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f105120c = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f105121d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public List<fw0.d> f105122e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String[] f105123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String[] f105124g;

    @NotNull
    public final String[] h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String[] f105125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String[] f105126j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String[] f105127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final String[] f105128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<b, Object> f105129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public TabBubble f105130n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f105131o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile boolean f105132p;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/CenterPlusViewModel$a.class */
    public static final class a {

        /* JADX INFO: renamed from: com.bilibili.studio.centerplus.model.CenterPlusViewModel$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/CenterPlusViewModel$a$a.class */
        public static final /* synthetic */ class C1180a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f105133a;

            static {
                int[] iArr = new int[ModLoadFrom.values().length];
                try {
                    iArr[ModLoadFrom.LIVE.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[ModLoadFrom.CAPTURE.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[ModLoadFrom.UPLOAD.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[ModLoadFrom.AI_COLLECTION.ordinal()] = 4;
                } catch (NoSuchFieldError e10) {
                }
                try {
                    iArr[ModLoadFrom.VIDEO_TEMPLATE.ordinal()] = 5;
                } catch (NoSuchFieldError e11) {
                }
                try {
                    iArr[ModLoadFrom.FOLLOWING.ordinal()] = 6;
                } catch (NoSuchFieldError e12) {
                }
                f105133a = iArr;
            }
        }

        @JvmStatic
        @NotNull
        public static ModLoadFrom a(int i7) {
            return i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? ModLoadFrom.NONE : ModLoadFrom.AI_COLLECTION : ModLoadFrom.FOLLOWING : ModLoadFrom.VIDEO_TEMPLATE : ModLoadFrom.UPLOAD : ModLoadFrom.CAPTURE : ModLoadFrom.LIVE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/CenterPlusViewModel$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f105134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f105135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f105136c;

        public b(long j7, @NotNull String str, boolean z6) {
            this.f105134a = j7;
            this.f105135b = str;
            this.f105136c = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f105134a == bVar.f105134a && Intrinsics.areEqual(this.f105135b, bVar.f105135b) && this.f105136c == bVar.f105136c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f105136c) + E.a(z.a(Long.hashCode(this.f105134a) * 31, 31, false), 31, this.f105135b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ModMark(startTime=");
            sb.append(this.f105134a);
            sb.append(", isModReady=false, tabName=");
            sb.append(this.f105135b);
            sb.append(", isDirect=");
            return androidx.appcompat.app.i.a(sb, this.f105136c, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/CenterPlusViewModel$c.class */
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f105137a;

        static {
            int[] iArr = new int[ModLoadFrom.values().length];
            try {
                iArr[ModLoadFrom.LIVE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ModLoadFrom.CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[ModLoadFrom.VIDEO_TEMPLATE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[ModLoadFrom.UPLOAD.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[ModLoadFrom.AI_COLLECTION.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[ModLoadFrom.FOLLOWING.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[ModLoadFrom.FOLLOWING_PICK.ordinal()] = 7;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[ModLoadFrom.FOLLOWING_EDIT.ordinal()] = 8;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr[ModLoadFrom.FOLLOWING_EDIT_BMM.ordinal()] = 9;
            } catch (NoSuchFieldError e15) {
            }
            f105137a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.centerplus.model.CenterPlusViewModel$initInBackground$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/CenterPlusViewModel$initInBackground$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UpperService upperService = (UpperService) BLRouter.INSTANCE.get(UpperService.class, "default");
            if (upperService != null) {
                upperService.reportUploadLocalData();
                upperService.checkAndUploadDrafts();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.centerplus.model.CenterPlusViewModel$loadModAsync$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/CenterPlusViewModel$loadModAsync$1.class */
    public static final class C65131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ModLoadFrom $from;
        final Function1<Boolean, Unit> $result;
        final long $startTime;
        int label;
        final CenterPlusViewModel this$0;

        /* JADX INFO: renamed from: com.bilibili.studio.centerplus.model.CenterPlusViewModel$loadModAsync$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/CenterPlusViewModel$loadModAsync$1$1.class */
        public static final class C11811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final ModLoadFrom $from;
            final boolean $loadModResult;
            final Function1<Boolean, Unit> $result;
            final long $startTime;
            int label;
            final CenterPlusViewModel this$0;

            /* JADX INFO: renamed from: com.bilibili.studio.centerplus.model.CenterPlusViewModel$loadModAsync$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/CenterPlusViewModel$loadModAsync$1$1$a.class */
            public static final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final int[] f105138a;

                static {
                    int[] iArr = new int[ModLoadFrom.values().length];
                    try {
                        iArr[ModLoadFrom.LIVE.ordinal()] = 1;
                    } catch (NoSuchFieldError e7) {
                    }
                    try {
                        iArr[ModLoadFrom.CAPTURE.ordinal()] = 2;
                    } catch (NoSuchFieldError e8) {
                    }
                    try {
                        iArr[ModLoadFrom.UPLOAD.ordinal()] = 3;
                    } catch (NoSuchFieldError e9) {
                    }
                    try {
                        iArr[ModLoadFrom.AI_COLLECTION.ordinal()] = 4;
                    } catch (NoSuchFieldError e10) {
                    }
                    try {
                        iArr[ModLoadFrom.FOLLOWING.ordinal()] = 5;
                    } catch (NoSuchFieldError e11) {
                    }
                    try {
                        iArr[ModLoadFrom.VIDEO_TEMPLATE.ordinal()] = 6;
                    } catch (NoSuchFieldError e12) {
                    }
                    f105138a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C11811(long j7, ModLoadFrom modLoadFrom, boolean z6, CenterPlusViewModel centerPlusViewModel, Function1<? super Boolean, Unit> function1, Continuation<? super C11811> continuation) {
                super(2, continuation);
                this.$startTime = j7;
                this.$from = modLoadFrom;
                this.$loadModResult = z6;
                this.this$0 = centerPlusViewModel;
                this.$result = function1;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C11811(this.$startTime, this.$from, this.$loadModResult, this.this$0, this.$result, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                long jCurrentTimeMillis = System.currentTimeMillis() - this.$startTime;
                int i7 = 1;
                int i8 = 0;
                switch (a.f105138a[this.$from.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        String str = CenterPlusStatisticsHelper.f105195a;
                        String value = this.$from.getValue();
                        HashMap map = new HashMap();
                        map.put("time", String.valueOf(jCurrentTimeMillis));
                        map.put("is_first_install", String.valueOf(M.f110206b));
                        map.put("first_entrance", Xz0.j.a("first_entrance"));
                        String str2 = value;
                        if (value == null) {
                            str2 = "";
                        }
                        map.put("from_tab", str2);
                        BLog.dfmt("CenterPlusStatisticsHelper", "reportChangeTabLoadingResourceTime...params = " + map, new Object[0]);
                        Neurons.trackT(false, "bilibili-creation.center-plus.loading-resource.change-tab.time.track", map, 1, new O1(9));
                        break;
                    default:
                        String str3 = CenterPlusStatisticsHelper.f105195a;
                        CenterPlusStatisticsHelper.o(jCurrentTimeMillis, this.$from.getValue());
                        break;
                }
                a aVar = CenterPlusViewModel.Companion;
                ModLoadFrom modLoadFrom = this.$from;
                aVar.getClass();
                switch (a.C1180a.f105133a[modLoadFrom.ordinal()]) {
                    case 1:
                        break;
                    case 2:
                        i8 = i7;
                        break;
                    case 3:
                        i7 = 2;
                        i8 = i7;
                        break;
                    case 4:
                        i7 = 5;
                        i8 = i7;
                        break;
                    case 5:
                        i7 = 3;
                        i8 = i7;
                        break;
                    case 6:
                        i7 = 4;
                        i8 = i7;
                        break;
                    default:
                        i7 = -1;
                        i8 = i7;
                        break;
                }
                CenterPlusStatisticsHelper.g(i8, "mod", (!this.$loadModResult || this.this$0.f105131o) ? "error" : "success", this.this$0.f105131o ? Boxing.boxInt(3001) : null, null, null, null, 112);
                this.$result.invoke(Boxing.boxBoolean(this.$loadModResult));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C65131(CenterPlusViewModel centerPlusViewModel, ModLoadFrom modLoadFrom, long j7, Function1<? super Boolean, Unit> function1, Continuation<? super C65131> continuation) {
            super(2, continuation);
            this.this$0 = centerPlusViewModel;
            this.$from = modLoadFrom;
            this.$startTime = j7;
            this.$result = function1;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C65131(this.this$0, this.$from, this.$startTime, this.$result, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CenterPlusViewModel centerPlusViewModel = this.this$0;
                ModLoadFrom modLoadFrom = this.$from;
                this.label = 1;
                Object objAccess$innerCheckAndLoad = CenterPlusViewModel.access$innerCheckAndLoad(centerPlusViewModel, modLoadFrom, false, this);
                obj = objAccess$innerCheckAndLoad;
                if (objAccess$innerCheckAndLoad == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C11811 c11811 = new C11811(this.$startTime, this.$from, zBooleanValue, this.this$0, this.$result, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c11811, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.centerplus.model.CenterPlusViewModel$loadOtherCaptureModAsync$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/CenterPlusViewModel$loadOtherCaptureModAsync$1.class */
    public static final class C65141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Function1<Boolean, Unit> $result;
        int label;
        final CenterPlusViewModel this$0;

        /* JADX INFO: renamed from: com.bilibili.studio.centerplus.model.CenterPlusViewModel$loadOtherCaptureModAsync$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/CenterPlusViewModel$loadOtherCaptureModAsync$1$1.class */
        public static final class C11821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final boolean $loadModResult;
            final Function1<Boolean, Unit> $result;
            int label;
            final CenterPlusViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C11821(CenterPlusViewModel centerPlusViewModel, Function1<? super Boolean, Unit> function1, boolean z6, Continuation<? super C11821> continuation) {
                super(2, continuation);
                this.this$0 = centerPlusViewModel;
                this.$result = function1;
                this.$loadModResult = z6;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C11821(this.this$0, this.$result, this.$loadModResult, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f105132p = false;
                this.$result.invoke(Boxing.boxBoolean(this.$loadModResult));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C65141(CenterPlusViewModel centerPlusViewModel, Function1<? super Boolean, Unit> function1, Continuation<? super C65141> continuation) {
            super(2, continuation);
            this.this$0 = centerPlusViewModel;
            this.$result = function1;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C65141(this.this$0, this.$result, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CenterPlusRepository centerPlusRepository = this.this$0.f105118a;
                ModLoadFrom modLoadFrom = ModLoadFrom.CAPTURE;
                String[] strArr = this.this$0.h;
                this.label = 1;
                Object objC = centerPlusRepository.c(modLoadFrom, "uper", strArr, false, false, this);
                obj = objC;
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C11821 c11821 = new C11821(this.this$0, this.$result, zBooleanValue, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c11821, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.centerplus.model.CenterPlusViewModel$preInit$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/CenterPlusViewModel$preInit$1.class */
    public static final class C65151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final int $tabIndex;
        int label;
        final CenterPlusViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65151(int i7, CenterPlusViewModel centerPlusViewModel, Continuation<? super C65151> continuation) {
            super(2, continuation);
            this.$tabIndex = i7;
            this.this$0 = centerPlusViewModel;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C65151(this.$tabIndex, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            boolean zBooleanValue;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                int i8 = this.$tabIndex;
                if (i8 == 0) {
                    CenterPlusViewModel centerPlusViewModel = this.this$0;
                    ModLoadFrom modLoadFrom = ModLoadFrom.LIVE;
                    this.label = 1;
                    Object objAccess$innerCheckAndLoad = CenterPlusViewModel.access$innerCheckAndLoad(centerPlusViewModel, modLoadFrom, true, this);
                    obj = objAccess$innerCheckAndLoad;
                    if (objAccess$innerCheckAndLoad == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                } else if (i8 == 1) {
                    CenterPlusViewModel centerPlusViewModel2 = this.this$0;
                    ModLoadFrom modLoadFrom2 = ModLoadFrom.CAPTURE;
                    this.label = 2;
                    Object objAccess$innerCheckAndLoad2 = CenterPlusViewModel.access$innerCheckAndLoad(centerPlusViewModel2, modLoadFrom2, true, this);
                    obj = objAccess$innerCheckAndLoad2;
                    if (objAccess$innerCheckAndLoad2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                } else if (i8 != 2) {
                    if (i8 == 3) {
                        String str = CenterPlusStatisticsHelper.f105195a;
                        CenterPlusStatisticsHelper.k(this.this$0.getEngineType(), ModLoadFrom.VIDEO_TEMPLATE.getValue(), true, true);
                    } else if (i8 == 4) {
                        String str2 = CenterPlusStatisticsHelper.f105195a;
                        CenterPlusStatisticsHelper.k(this.this$0.getEngineType(), ModLoadFrom.FOLLOWING.getValue(), true, true);
                    } else if (i8 == 5) {
                        CenterPlusViewModel centerPlusViewModel3 = this.this$0;
                        ModLoadFrom modLoadFrom3 = ModLoadFrom.AI_COLLECTION;
                        this.label = 4;
                        Object objAccess$innerCheckAndLoad3 = CenterPlusViewModel.access$innerCheckAndLoad(centerPlusViewModel3, modLoadFrom3, true, this);
                        obj = objAccess$innerCheckAndLoad3;
                        if (objAccess$innerCheckAndLoad3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zBooleanValue = ((Boolean) obj).booleanValue();
                    }
                    zBooleanValue = true;
                } else {
                    CenterPlusViewModel centerPlusViewModel4 = this.this$0;
                    ModLoadFrom modLoadFrom4 = ModLoadFrom.UPLOAD;
                    this.label = 3;
                    Object objAccess$innerCheckAndLoad4 = CenterPlusViewModel.access$innerCheckAndLoad(centerPlusViewModel4, modLoadFrom4, true, this);
                    obj = objAccess$innerCheckAndLoad4;
                    if (objAccess$innerCheckAndLoad4 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
            } else if (i7 == 1) {
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else if (i7 == 2) {
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else if (i7 == 3) {
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else {
                if (i7 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
            }
            String str3 = CenterPlusStatisticsHelper.f105195a;
            CenterPlusStatisticsHelper.g(this.$tabIndex, "mod", (!zBooleanValue || this.this$0.f105131o) ? "error" : "success", this.this$0.f105131o ? Boxing.boxInt(3001) : null, null, null, null, 112);
            C6598f.a(1);
            if (zBooleanValue) {
                CenterPlusViewModel.Companion.getClass();
                try {
                    int i9 = FoundationAlias.getFapp().getApplicationInfo().flags;
                } catch (Throwable th) {
                }
            }
            this.this$0.getPreInitLiveData().postValue(Boxing.boxBoolean(zBooleanValue));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.centerplus.model.CenterPlusViewModel$requestTabBubble$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/CenterPlusViewModel$requestTabBubble$1.class */
    public static final class C65161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Context $ctx;
        int label;
        final CenterPlusViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65161(Context context, CenterPlusViewModel centerPlusViewModel, Continuation<? super C65161> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.this$0 = centerPlusViewModel;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C65161(this.$ctx, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                com.bilibili.studio.centerplus.tabbubble.a aVar = com.bilibili.studio.centerplus.tabbubble.a.f105200a;
                Context context = this.$ctx;
                this.label = 1;
                Object objA = aVar.a(context, this);
                obj = objA;
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            TabBubble tabBubble = (TabBubble) obj;
            if (tabBubble != null) {
                CenterPlusViewModel centerPlusViewModel = this.this$0;
                Integer tab = tabBubble.getTab();
                if (tab != null) {
                    if (tab.intValue() < 0) {
                        tab = null;
                    }
                    if (tab != null) {
                        int iIntValue = tab.intValue();
                        Iterator it = centerPlusViewModel.f105122e.iterator();
                        int i8 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i8 = -1;
                                break;
                            }
                            if (Intrinsics.areEqual(((fw0.d) it.next()).f119643a, centerPlusViewModel.getTabNameByIndex(iIntValue, "invalid"))) {
                                break;
                            }
                            i8++;
                        }
                        Integer numBoxInt = Boxing.boxInt(i8);
                        Integer num = null;
                        if (numBoxInt.intValue() > -1) {
                            num = numBoxInt;
                        }
                        if (num != null) {
                            int iIntValue2 = num.intValue();
                            if (centerPlusViewModel.getInitTabIndex() == iIntValue) {
                                return Unit.INSTANCE;
                            }
                            centerPlusViewModel.setTabBubble(tabBubble);
                            fw0.d dVar = (fw0.d) centerPlusViewModel.f105122e.get(iIntValue2);
                            Long id = tabBubble.getId();
                            dVar.f119645c = id != null ? id.longValue() : -1L;
                            fw0.d dVar2 = (fw0.d) centerPlusViewModel.f105122e.get(iIntValue2);
                            Long playId = tabBubble.getPlayId();
                            long jLongValue = -1;
                            if (playId != null) {
                                jLongValue = playId.longValue();
                            }
                            dVar2.f119646d = jLongValue;
                            String note = tabBubble.getNote();
                            if (note == null || note.length() == 0) {
                                ((fw0.d) centerPlusViewModel.f105122e.get(iIntValue2)).f119647e = true;
                            } else {
                                ((fw0.d) centerPlusViewModel.f105122e.get(iIntValue2)).f119648f = true;
                                ((fw0.d) centerPlusViewModel.f105122e.get(iIntValue2)).f119644b = tabBubble.getNote();
                            }
                            centerPlusViewModel.getTabLiveData().postValue(Boxing.boxInt(iIntValue2));
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public CenterPlusViewModel() {
        String[] strArr = f105112q;
        String[] strArr2 = f105116u;
        Object[] objArrPlus = ArraysKt.plus(strArr, strArr2);
        String[] strArr3 = f105117v;
        Object[] objArrPlus2 = ArraysKt.plus(objArrPlus, strArr3);
        String[] strArr4 = f105113r;
        Object[] objArrPlus3 = ArraysKt.plus(objArrPlus2, strArr4);
        String[] strArr5 = f105114s;
        this.f105123f = (String[]) ArraysKt.plus(objArrPlus3, strArr5);
        this.f105124g = new String[0];
        this.h = f105115t;
        this.f105125i = (String[]) ArraysKt.plus(ArraysKt.plus(ArraysKt.plus(strArr, strArr2), strArr3), strArr4);
        this.f105126j = (String[]) ArraysKt.plus(ArraysKt.plus(ArraysKt.plus(strArr, strArr2), strArr3), strArr4);
        this.f105127k = (String[]) ArraysKt.plus(ArraysKt.plus(strArr, strArr2), strArr3);
        this.f105128l = (String[]) ArraysKt.plus(ArraysKt.plus(ArraysKt.plus(ArraysKt.plus(strArr, strArr2), strArr3), strArr4), strArr5);
        this.f105129m = new ConcurrentHashMap<>();
    }

    public static boolean I0(ModLoadFrom modLoadFrom) {
        return modLoadFrom == ModLoadFrom.LIVE || modLoadFrom == ModLoadFrom.CAPTURE || modLoadFrom == ModLoadFrom.UPLOAD || modLoadFrom == ModLoadFrom.AI_COLLECTION || modLoadFrom == ModLoadFrom.FOLLOWING;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0382  */
    /* JADX WARN: Type inference failed for: r0v135 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$innerCheckAndLoad(com.bilibili.studio.centerplus.model.CenterPlusViewModel r7, com.bilibili.studio.centerplus.model.ModLoadFrom r8, boolean r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instruction units count: 912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.model.CenterPlusViewModel.access$innerCheckAndLoad(com.bilibili.studio.centerplus.model.CenterPlusViewModel, com.bilibili.studio.centerplus.model.ModLoadFrom, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @JvmStatic
    @NotNull
    public static final ModLoadFrom getLoadModFrom(int i7) {
        Companion.getClass();
        return a.a(i7);
    }

    public static /* synthetic */ String getTabNameByIndex$default(CenterPlusViewModel centerPlusViewModel, int i7, String str, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            CenterPlusMainActivity.Companion.getClass();
            str = CenterPlusMainActivity.a.c();
        }
        return centerPlusViewModel.getTabNameByIndex(i7, str);
    }

    public final Object J0(ModLoadFrom modLoadFrom, boolean z6, Continuation<? super Boolean> continuation) {
        switch (c.f105137a[modLoadFrom.ordinal()]) {
            case 1:
                CenterPlusRepository centerPlusRepository = this.f105118a;
                centerPlusRepository.getClass();
                BlinkEffectManager.Companion companion = BlinkEffectManager.Companion;
                String modPool = companion.instance().getModPool();
                centerPlusRepository.getClass();
                return centerPlusRepository.c(modLoadFrom, modPool, companion.instance().getBlinkModResourceList(), z6, false, continuation);
            case 2:
                return this.f105118a.c(modLoadFrom, "uper", this.f105123f, z6, false, continuation);
            case 3:
                return this.f105118a.c(modLoadFrom, "uper", this.f105124g, z6, false, continuation);
            case 4:
                return this.f105118a.c(modLoadFrom, "uper", this.f105125i, z6, true, continuation);
            case 5:
                return this.f105118a.c(modLoadFrom, "uper", this.f105126j, z6, true, continuation);
            case 6:
            case 7:
            case 8:
                return this.f105118a.c(modLoadFrom, "uper", this.f105127k, z6, false, continuation);
            case 9:
                return this.f105118a.c(modLoadFrom, "uper", this.f105128l, z6, false, continuation);
            default:
                return Boxing.boxBoolean(true);
        }
    }

    public final int getEngineType() {
        return 3;
    }

    public final int getInitTabIndex() {
        return this.f105121d;
    }

    @NotNull
    public final MutableLiveData<Boolean> getPreInitLiveData() {
        return this.f105119b;
    }

    public final int getRoutIndexByRealIndex(int i7) {
        int i8;
        fw0.d dVar = (fw0.d) CollectionsKt.getOrNull(this.f105122e, i7);
        String str = dVar != null ? dVar.f119643a : null;
        CenterPlusMainActivity.Companion.getClass();
        if (Intrinsics.areEqual(str, CenterPlusMainActivity.a.e())) {
            i8 = 0;
        } else if (Intrinsics.areEqual(str, CenterPlusMainActivity.a.c())) {
            i8 = 1;
        } else if (Intrinsics.areEqual(str, CenterPlusMainActivity.a.b())) {
            i8 = 2;
        } else if (Intrinsics.areEqual(str, CenterPlusMainActivity.a.f())) {
            i8 = 3;
        } else if (Intrinsics.areEqual(str, CenterPlusMainActivity.a.d())) {
            i8 = 4;
        } else {
            String str2 = CenterPlusStatisticsHelper.f105195a;
            i8 = (Intrinsics.areEqual(str, zw0.b.l()) || Intrinsics.areEqual(str, CenterPlusMainActivity.a.a())) ? 5 : -1;
        }
        return i8;
    }

    @Nullable
    public final TabBubble getTabBubble() {
        return this.f105130n;
    }

    @NotNull
    public final MutableLiveData<Integer> getTabLiveData() {
        return this.f105120c;
    }

    @NotNull
    public final List<fw0.d> getTabNameArray(int i7) {
        boolean z6;
        if (!this.f105122e.isEmpty()) {
            return this.f105122e;
        }
        boolean zBooleanValue = ((Boolean) zw0.b.f130959k.getValue()).booleanValue();
        c71.b.a.getClass();
        boolean z7 = false;
        if (c71.b.c()) {
            z6 = false;
        } else {
            int iF = com.bilibili.studio.videoeditor.media.performance.a.e().f();
            if (iF == 1 || iF == 0) {
                z7 = true;
            }
            Neurons.trackT$default(false, "center-plus.show-live-tab.track", MapsKt.mapOf(new Pair[]{TuplesKt.to("isShow", String.valueOf(!z7)), TuplesKt.to("grade", String.valueOf(iF))}), 0, new AT0.c(8), 8, (Object) null);
            z6 = true;
        }
        CenterPlusMainActivity.Companion.getClass();
        String str = CenterPlusStatisticsHelper.f105195a;
        String strL = zw0.b.l();
        fw0.d dVar = new fw0.d(CenterPlusMainActivity.a.e());
        fw0.d dVar2 = new fw0.d(CenterPlusMainActivity.a.c());
        fw0.d dVar3 = new fw0.d(CenterPlusMainActivity.a.b());
        fw0.d dVar4 = new fw0.d(strL);
        fw0.d dVar5 = new fw0.d(CenterPlusMainActivity.a.a());
        fw0.d dVar6 = new fw0.d(CenterPlusMainActivity.a.f());
        fw0.d dVar7 = new fw0.d(CenterPlusMainActivity.a.d());
        List<fw0.d> listMutableListOf = CollectionsKt.mutableListOf(new fw0.d[]{dVar2, dVar3, dVar, dVar7, zw0.b.g() ? dVar5 : dVar4, dVar6});
        this.f105122e = listMutableListOf;
        if (!z6) {
            listMutableListOf.remove(dVar);
        }
        if (!zBooleanValue) {
            this.f105122e.remove(dVar7);
        }
        if (i7 != 5 && !Intrinsics.areEqual(Contract.get$default(ConfigManager.Companion.ab(), "uper.hometab.openai", (Object) null, 2, (Object) null), Boolean.TRUE)) {
            this.f105122e.remove(dVar4);
            this.f105122e.remove(dVar5);
        }
        if (i7 != 3) {
            this.f105122e.remove(dVar6);
        }
        BLog.e("CenterPlusViewModel", " list=" + this.f105122e);
        return this.f105122e;
    }

    @NotNull
    public final String getTabNameByIndex(int i7, @NotNull String str) {
        if (i7 == 0) {
            CenterPlusMainActivity.Companion.getClass();
            str = CenterPlusMainActivity.a.e();
        } else if (i7 == 1) {
            CenterPlusMainActivity.Companion.getClass();
            str = CenterPlusMainActivity.a.c();
        } else if (i7 == 2) {
            CenterPlusMainActivity.Companion.getClass();
            str = CenterPlusMainActivity.a.b();
        } else if (i7 == 3) {
            CenterPlusMainActivity.Companion.getClass();
            str = CenterPlusMainActivity.a.f();
        } else if (i7 == 4) {
            CenterPlusMainActivity.Companion.getClass();
            str = CenterPlusMainActivity.a.d();
        } else if (i7 == 5) {
            if (zw0.b.g()) {
                CenterPlusMainActivity.Companion.getClass();
                str = CenterPlusMainActivity.a.a();
            } else {
                CenterPlusMainActivity.Companion.getClass();
                String str2 = CenterPlusStatisticsHelper.f105195a;
                str = zw0.b.l();
            }
        }
        return str;
    }

    public final void initInBackground() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new AnonymousClass1(null), 2, (Object) null);
    }

    public final void loadModAsync(@NotNull ModLoadFrom modLoadFrom, @NotNull Function1<? super Boolean, Unit> function1) {
        int i7;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = CenterPlusStatisticsHelper.f105195a;
        Companion.getClass();
        switch (a.C1180a.f105133a[modLoadFrom.ordinal()]) {
            case 1:
                i7 = 0;
                break;
            case 2:
                i7 = 1;
                break;
            case 3:
                i7 = 2;
                break;
            case 4:
                i7 = 5;
                break;
            case 5:
                i7 = 3;
                break;
            case 6:
                i7 = 4;
                break;
            default:
                i7 = -1;
                break;
        }
        CenterPlusStatisticsHelper.g(i7, "mod", null, null, null, null, null, SearchBangumiItem.TYPE_FULLNET_VARIETY);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new C65131(this, modLoadFrom, jCurrentTimeMillis, function1, null), 2, (Object) null);
    }

    public final void loadOtherCaptureModAsync(@NotNull Function1<? super Boolean, Unit> function1) {
        if (this.f105132p) {
            return;
        }
        this.f105132p = true;
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new C65141(this, function1, null), 2, (Object) null);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f105131o = true;
        for (b bVar : Collections.list(this.f105129m.keys())) {
            String str = CenterPlusStatisticsHelper.f105195a;
            bVar.getClass();
            CenterPlusStatisticsHelper.j(System.currentTimeMillis() - bVar.f105134a, bVar.f105135b, "cancel", false, bVar.f105136c);
        }
        this.f105129m.clear();
    }

    public final void preInit(int i7) {
        this.f105121d = i7;
        CenterPlusStatisticsHelper.g(i7, "mod", null, null, null, null, null, SearchBangumiItem.TYPE_FULLNET_VARIETY);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new C65151(i7, this, null), 2, (Object) null);
        BLog.i("BlinkEffect", "preInit reset init");
        BlinkEffectManager.Companion.instance().initEffectSdkType();
    }

    public final void requestTabBubble(@NotNull Context context) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new C65161(context, this, null), 3, (Object) null);
    }

    public final void setInitTabIndex(int i7) {
        this.f105121d = i7;
    }

    public final void setTabBubble(@Nullable TabBubble tabBubble) {
        this.f105130n = tabBubble;
    }
}
