package com.bilibili.upper.module.manuscript.activity;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.bilibili.upper.module.manuscript.bean.ManuscriptOpenEntity;
import com.bilibili.upper.module.manuscript.bean.ManuscriptReviewEntity;
import com.bilibili.upper.module.manuscript.bean.ManuscriptTranscodingEntity;
import com.bilibili.upper.module.manuscript.bean.ManuscriptVideosEntity;
import gI0.H;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import nI0.C8076b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ManuscriptProgressDetailsActivity$initObservers$1.class */
final class ManuscriptProgressDetailsActivity$initObservers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final ManuscriptProgressDetailsActivity this$0;

    /* JADX INFO: renamed from: com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity$initObservers$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ManuscriptProgressDetailsActivity$initObservers$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ManuscriptProgressDetailsActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity$initObservers$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ManuscriptProgressDetailsActivity$initObservers$1$1$1.class */
        public static final class C12291 extends SuspendLambda implements Function2<Result<? extends ManuscriptVideosEntity>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ManuscriptProgressDetailsActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12291(ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity, Continuation<? super C12291> continuation) {
                super(2, continuation);
                this.this$0 = manuscriptProgressDetailsActivity;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C12291 c12291 = new C12291(this.this$0, continuation);
                c12291.L$0 = ((Result) obj).unbox-impl();
                return c12291;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Result) obj).unbox-impl(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
                return create(Result.box-impl(obj), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.L$0;
                ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity = this.this$0;
                if (Result.isSuccess-impl(obj2)) {
                    ManuscriptVideosEntity manuscriptVideosEntity = (ManuscriptVideosEntity) obj2;
                    if (manuscriptVideosEntity == null) {
                        LinearLayout linearLayout = manuscriptProgressDetailsActivity.f113438H;
                        LinearLayout linearLayout2 = linearLayout;
                        if (linearLayout == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mLlSubsetHead");
                            linearLayout2 = null;
                        }
                        linearLayout2.setVisibility(8);
                        RecyclerView recyclerView = manuscriptProgressDetailsActivity.f113441K;
                        if (recyclerView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mRvSubsetDetails");
                            recyclerView = null;
                        }
                        recyclerView.setVisibility(8);
                    } else {
                        int i7 = ManuscriptProgressDetailsActivity.f113427E1;
                        manuscriptProgressDetailsActivity.getClass();
                        ArrayList<ManuscriptVideosEntity.ManuscriptVideoDetailsEntity> arrayList = manuscriptVideosEntity.videos;
                        if (arrayList == null || arrayList.isEmpty()) {
                            LinearLayout linearLayout3 = manuscriptProgressDetailsActivity.f113438H;
                            LinearLayout linearLayout4 = linearLayout3;
                            if (linearLayout3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mLlSubsetHead");
                                linearLayout4 = null;
                            }
                            linearLayout4.setVisibility(8);
                            RecyclerView recyclerView2 = manuscriptProgressDetailsActivity.f113441K;
                            if (recyclerView2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mRvSubsetDetails");
                                recyclerView2 = null;
                            }
                            recyclerView2.setVisibility(8);
                        } else {
                            long j7 = 0;
                            if (manuscriptVideosEntity.videos.size() == 1) {
                                LinearLayout linearLayout5 = manuscriptProgressDetailsActivity.f113438H;
                                LinearLayout linearLayout6 = linearLayout5;
                                if (linearLayout5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mLlSubsetHead");
                                    linearLayout6 = null;
                                }
                                linearLayout6.setVisibility(8);
                                RecyclerView recyclerView3 = manuscriptProgressDetailsActivity.f113441K;
                                if (recyclerView3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mRvSubsetDetails");
                                    recyclerView3 = null;
                                }
                                recyclerView3.setVisibility(8);
                                ManuscriptVideosEntity.ManuscriptVideoDetailsEntity manuscriptVideoDetailsEntity = (ManuscriptVideosEntity.ManuscriptVideoDetailsEntity) CollectionsKt.firstOrNull(manuscriptVideosEntity.videos);
                                if (manuscriptVideoDetailsEntity != null) {
                                    j7 = manuscriptVideoDetailsEntity.cid;
                                }
                                manuscriptProgressDetailsActivity.y1 = j7;
                            } else {
                                LinearLayout linearLayout7 = manuscriptProgressDetailsActivity.f113438H;
                                LinearLayout linearLayout8 = linearLayout7;
                                if (linearLayout7 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mLlSubsetHead");
                                    linearLayout8 = null;
                                }
                                linearLayout8.setVisibility(0);
                                RecyclerView recyclerView4 = manuscriptProgressDetailsActivity.f113441K;
                                RecyclerView recyclerView5 = recyclerView4;
                                if (recyclerView4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mRvSubsetDetails");
                                    recyclerView5 = null;
                                }
                                recyclerView5.setVisibility(0);
                                if (manuscriptProgressDetailsActivity.f113482t1 != null) {
                                    Iterator<ManuscriptVideosEntity.ManuscriptVideoDetailsEntity> it = manuscriptVideosEntity.videos.iterator();
                                    int i8 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i8 = -1;
                                            break;
                                        }
                                        if (it.next().cid == manuscriptVideosEntity.selectedCid) {
                                            break;
                                        }
                                        i8++;
                                    }
                                    if (i8 < 0) {
                                        i8 = 0;
                                    }
                                    List<? extends ManuscriptVideosEntity.ManuscriptVideoDetailsEntity> listSubList = manuscriptVideosEntity.videos;
                                    if (listSubList.isEmpty()) {
                                        listSubList = CollectionsKt.emptyList();
                                    } else {
                                        int size = listSubList.size() <= 5 ? listSubList.size() : 5;
                                        int size2 = ((listSubList.size() + size) - 1) / size;
                                        int i9 = i8 / size;
                                        if (size2 > 2) {
                                            int i10 = size2 - 2;
                                            listSubList = i9 >= i10 ? listSubList.subList(i10 * size, listSubList.size()) : listSubList.subList(i9 * size, Math.min(listSubList.size(), (i9 + 2) * size));
                                        }
                                    }
                                    gI0.G g7 = manuscriptProgressDetailsActivity.f113482t1;
                                    gI0.G g8 = g7;
                                    if (g7 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mManuscriptSubsetDetailsAdapter");
                                        g8 = null;
                                    }
                                    g8.f119768a = listSubList;
                                    ManuscriptVideosEntity.ManuscriptVideoDetailsEntity manuscriptVideoDetailsEntity2 = (ManuscriptVideosEntity.ManuscriptVideoDetailsEntity) CollectionsKt.getOrNull(manuscriptVideosEntity.videos, i8);
                                    gI0.G g9 = manuscriptProgressDetailsActivity.f113482t1;
                                    gI0.G g10 = g9;
                                    if (g9 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mManuscriptSubsetDetailsAdapter");
                                        g10 = null;
                                    }
                                    g10.f119770c = manuscriptVideoDetailsEntity2;
                                    if (manuscriptVideoDetailsEntity2 != null) {
                                        j7 = manuscriptVideoDetailsEntity2.cid;
                                    }
                                    manuscriptProgressDetailsActivity.y1 = j7;
                                    int size3 = listSubList.size() > 5 ? 5 : listSubList.size();
                                    RecyclerView recyclerView6 = manuscriptProgressDetailsActivity.f113441K;
                                    RecyclerView recyclerView7 = recyclerView6;
                                    if (recyclerView6 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mRvSubsetDetails");
                                        recyclerView7 = null;
                                    }
                                    recyclerView7.setLayoutManager(new GridLayoutManager(manuscriptProgressDetailsActivity.getApplicationContext(), Math.max(size3, 1)));
                                    RecyclerView recyclerView8 = manuscriptProgressDetailsActivity.f113441K;
                                    RecyclerView recyclerView9 = recyclerView8;
                                    if (recyclerView8 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mRvSubsetDetails");
                                        recyclerView9 = null;
                                    }
                                    ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity2 = recyclerView9.getItemDecorationCount() > 0 ? manuscriptProgressDetailsActivity : null;
                                    if (manuscriptProgressDetailsActivity2 != null) {
                                        RecyclerView recyclerView10 = manuscriptProgressDetailsActivity2.f113441K;
                                        RecyclerView recyclerView11 = recyclerView10;
                                        if (recyclerView10 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mRvSubsetDetails");
                                            recyclerView11 = null;
                                        }
                                        recyclerView11.removeItemDecorationAt(0);
                                    }
                                    RecyclerView recyclerView12 = manuscriptProgressDetailsActivity.f113441K;
                                    RecyclerView recyclerView13 = recyclerView12;
                                    if (recyclerView12 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mRvSubsetDetails");
                                        recyclerView13 = null;
                                    }
                                    recyclerView13.addItemDecoration(new yG0.a(size3, DensityUtil.dp2px(8.0f), false, DensityUtil.dp2px(16.0f)));
                                    gI0.G g11 = manuscriptProgressDetailsActivity.f113482t1;
                                    gI0.G g12 = g11;
                                    if (g11 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mManuscriptSubsetDetailsAdapter");
                                        g12 = null;
                                    }
                                    g12.notifyDataSetChanged();
                                    ManuscriptVideosEntity.ManuscriptVideosPageEntity manuscriptVideosPageEntity = manuscriptVideosEntity.page;
                                    Object objValueOf = manuscriptVideosPageEntity != null ? Long.valueOf(manuscriptVideosPageEntity.total) : Integer.valueOf(manuscriptVideosEntity.videos.size());
                                    TextView textView = manuscriptProgressDetailsActivity.f113439I;
                                    if (textView == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mTvSubsetNumber");
                                        textView = null;
                                    }
                                    textView.setText("（" + objValueOf + "）");
                                }
                            }
                        }
                        manuscriptProgressDetailsActivity.b7();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = manuscriptProgressDetailsActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity = this.this$0;
                int i8 = ManuscriptProgressDetailsActivity.f113427E1;
                StateFlow<Result<ManuscriptVideosEntity>> stateFlow = manuscriptProgressDetailsActivity.P6().f113683e;
                C12291 c12291 = new C12291(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c12291, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity$initObservers$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ManuscriptProgressDetailsActivity$initObservers$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ManuscriptProgressDetailsActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity$initObservers$1$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ManuscriptProgressDetailsActivity$initObservers$1$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<ManuscriptVideosEntity, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ManuscriptProgressDetailsActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = manuscriptProgressDetailsActivity;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(ManuscriptVideosEntity manuscriptVideosEntity, Continuation<? super Unit> continuation) {
                return create(manuscriptVideosEntity, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                ArrayList<ManuscriptVideosEntity.ManuscriptVideoDetailsEntity> arrayList;
                ManuscriptVideosEntity.ManuscriptVideosPageEntity manuscriptVideosPageEntity;
                ArrayList<ManuscriptVideosEntity.ManuscriptVideoDetailsEntity> arrayList2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ManuscriptVideosEntity manuscriptVideosEntity = (ManuscriptVideosEntity) this.L$0;
                ImageView imageView = this.this$0.f113440J;
                ImageView imageView2 = imageView;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mImvSubsetExpandSwitch");
                    imageView2 = null;
                }
                imageView2.setVisibility(((manuscriptVideosEntity == null || (arrayList2 = manuscriptVideosEntity.videos) == null) ? 0 : arrayList2.size()) > 10 ? 0 : 4);
                boolean z6 = ((manuscriptVideosEntity == null || (manuscriptVideosPageEntity = manuscriptVideosEntity.page) == null) ? 0L : manuscriptVideosPageEntity.total) <= ((long) ((manuscriptVideosEntity == null || (arrayList = manuscriptVideosEntity.videos) == null) ? 0 : arrayList.size()));
                C8076b c8076b = this.this$0.f113485v1;
                if (c8076b != null) {
                    c8076b.f124028e = z6;
                }
                if (c8076b != null) {
                    ArrayList<ManuscriptVideosEntity.ManuscriptVideoDetailsEntity> arrayList3 = manuscriptVideosEntity != null ? manuscriptVideosEntity.videos : null;
                    gI0.G g7 = c8076b.f124026c;
                    gI0.G g8 = g7;
                    if (g7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mManuscriptSubsetDetailsAdapter");
                        g8 = null;
                    }
                    g8.f119768a = arrayList3;
                    gI0.G g9 = c8076b.f124026c;
                    if (g9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mManuscriptSubsetDetailsAdapter");
                        g9 = null;
                    }
                    g9.notifyDataSetChanged();
                    c8076b.f124027d = false;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = manuscriptProgressDetailsActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity = this.this$0;
                int i8 = ManuscriptProgressDetailsActivity.f113427E1;
                StateFlow<ManuscriptVideosEntity> stateFlow = manuscriptProgressDetailsActivity.P6().f113681c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity$initObservers$1$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ManuscriptProgressDetailsActivity$initObservers$1$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ManuscriptProgressDetailsActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity$initObservers$1$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ManuscriptProgressDetailsActivity$initObservers$1$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Result<? extends ManuscriptTranscodingEntity>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ManuscriptProgressDetailsActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = manuscriptProgressDetailsActivity;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = ((Result) obj).unbox-impl();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Result) obj).unbox-impl(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
                return create(Result.box-impl(obj), continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r0 = r5
                    int r0 = r0.label
                    if (r0 != 0) goto L9c
                    r0 = r6
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r5
                    java.lang.Object r0 = r0.L$0
                    r10 = r0
                    r0 = r5
                    com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity r0 = r0.this$0
                    r6 = r0
                    r0 = r10
                    boolean r0 = kotlin.Result.isSuccess-impl(r0)
                    if (r0 == 0) goto L98
                    r0 = r10
                    com.bilibili.upper.module.manuscript.bean.ManuscriptTranscodingEntity r0 = (com.bilibili.upper.module.manuscript.bean.ManuscriptTranscodingEntity) r0
                    r10 = r0
                    int r0 = com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity.f113427E1
                    r7 = r0
                    r0 = r6
                    com.bilibili.upper.module.manuscript.vm.ManuscriptProgressDetailsViewModel r0 = r0.P6()
                    r11 = r0
                    r0 = r10
                    if (r0 == 0) goto L5a
                    r0 = r11
                    kotlin.Lazy r0 = r0.f113701x
                    java.lang.Object r0 = r0.getValue()
                    java.util.HashMap r0 = (java.util.HashMap) r0
                    r1 = r10
                    long r1 = r1.cid
                    java.lang.Long r1 = java.lang.Long.valueOf(r1)
                    r2 = r10
                    java.lang.Object r0 = r0.put(r1, r2)
                    com.bilibili.upper.module.manuscript.bean.ManuscriptTranscodingEntity r0 = (com.bilibili.upper.module.manuscript.bean.ManuscriptTranscodingEntity) r0
                    r11 = r0
                    goto L60
                L5a:
                    r0 = r11
                    java.lang.Class r0 = r0.getClass()
                L60:
                    r0 = r10
                    if (r0 == 0) goto L6e
                    r0 = r10
                    long r0 = r0.cid
                    r8 = r0
                    goto L72
                L6e:
                    r0 = -1
                    r8 = r0
                L72:
                    r0 = r8
                    r1 = 0
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 <= 0) goto L92
                    r0 = r6
                    long r0 = r0.y1
                    r8 = r0
                    r0 = r8
                    r1 = 0
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 <= 0) goto L92
                    r0 = r10
                    if (r0 == 0) goto L98
                    r0 = r10
                    long r0 = r0.cid
                    r1 = r8
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 != 0) goto L98
                L92:
                    r0 = r6
                    r1 = r10
                    r0.c7(r1)
                L98:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L9c:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity$initObservers$1.AnonymousClass3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = manuscriptProgressDetailsActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity = this.this$0;
                int i8 = ManuscriptProgressDetailsActivity.f113427E1;
                StateFlow<Result<ManuscriptTranscodingEntity>> stateFlow = manuscriptProgressDetailsActivity.P6().f113685g;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity$initObservers$1$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ManuscriptProgressDetailsActivity$initObservers$1$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ManuscriptProgressDetailsActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity$initObservers$1$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ManuscriptProgressDetailsActivity$initObservers$1$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
            long J$0;
            int label;
            final ManuscriptProgressDetailsActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = manuscriptProgressDetailsActivity;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.J$0 = ((Number) obj).longValue();
                return anonymousClass1;
            }

            public final Object invoke(long j7, Continuation<? super Unit> continuation) {
                return create(Long.valueOf(j7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).longValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                long j7 = this.J$0;
                H h = this.this$0.f113483u1;
                if (h != null) {
                    h.N(j7);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = manuscriptProgressDetailsActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity = this.this$0;
                int i8 = ManuscriptProgressDetailsActivity.f113427E1;
                StateFlow<Long> stateFlow = manuscriptProgressDetailsActivity.P6().f113686i;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity$initObservers$1$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ManuscriptProgressDetailsActivity$initObservers$1$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ManuscriptProgressDetailsActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity$initObservers$1$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ManuscriptProgressDetailsActivity$initObservers$1$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Result<? extends ManuscriptReviewEntity>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ManuscriptProgressDetailsActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = manuscriptProgressDetailsActivity;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = ((Result) obj).unbox-impl();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Result) obj).unbox-impl(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
                return create(Result.box-impl(obj), continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:51:0x016b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    Method dump skipped, instruction units count: 2110
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity$initObservers$1.AnonymousClass5.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = manuscriptProgressDetailsActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity = this.this$0;
                int i8 = ManuscriptProgressDetailsActivity.f113427E1;
                StateFlow<Result<ManuscriptReviewEntity>> stateFlow = manuscriptProgressDetailsActivity.P6().f113689l;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity$initObservers$1$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ManuscriptProgressDetailsActivity$initObservers$1$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ManuscriptProgressDetailsActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity$initObservers$1$6$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ManuscriptProgressDetailsActivity$initObservers$1$6$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Result<? extends ManuscriptOpenEntity>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ManuscriptProgressDetailsActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = manuscriptProgressDetailsActivity;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = ((Result) obj).unbox-impl();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Result) obj).unbox-impl(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
                return create(Result.box-impl(obj), continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:124:0x040b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    Method dump skipped, instruction units count: 1447
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity$initObservers$1.AnonymousClass6.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = manuscriptProgressDetailsActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity = this.this$0;
                int i8 = ManuscriptProgressDetailsActivity.f113427E1;
                StateFlow<Result<ManuscriptOpenEntity>> stateFlow = manuscriptProgressDetailsActivity.P6().f113691n;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity$initObservers$1$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ManuscriptProgressDetailsActivity$initObservers$1$7.class */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ManuscriptProgressDetailsActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.upper.module.manuscript.activity.ManuscriptProgressDetailsActivity$initObservers$1$7$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ManuscriptProgressDetailsActivity$initObservers$1$7$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final ManuscriptProgressDetailsActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = manuscriptProgressDetailsActivity;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.Z$0;
                SwipeRefreshLayout swipeRefreshLayout = this.this$0.f113436F;
                SwipeRefreshLayout swipeRefreshLayout2 = swipeRefreshLayout;
                if (swipeRefreshLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSwRefresh");
                    swipeRefreshLayout2 = null;
                }
                swipeRefreshLayout2.setRefreshing(false);
                if (z6) {
                    ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity = this.this$0;
                    ConstraintLayout constraintLayout = manuscriptProgressDetailsActivity.f113474n1;
                    ConstraintLayout constraintLayout2 = constraintLayout;
                    if (constraintLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCslErrorParent");
                        constraintLayout2 = null;
                    }
                    constraintLayout2.setVisibility(8);
                    ConstraintLayout constraintLayout3 = manuscriptProgressDetailsActivity.f113478q1;
                    ConstraintLayout constraintLayout4 = constraintLayout3;
                    if (constraintLayout3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCslLoadingParent");
                        constraintLayout4 = null;
                    }
                    constraintLayout4.setVisibility(8);
                    ViewGroup viewGroup = manuscriptProgressDetailsActivity.f113437G;
                    ViewGroup viewGroup2 = viewGroup;
                    if (viewGroup == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mNvsContentRoot");
                        viewGroup2 = null;
                    }
                    viewGroup2.setVisibility(0);
                    TE0.b bVar = TE0.b.f24088a;
                    ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity2 = this.this$0;
                    long j7 = manuscriptProgressDetailsActivity2.f113486w1;
                    long j8 = manuscriptProgressDetailsActivity2.y1;
                    int iR6 = manuscriptProgressDetailsActivity2.R6();
                    ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity3 = this.this$0;
                    long j9 = manuscriptProgressDetailsActivity3.y1;
                    QF0.f fVar = manuscriptProgressDetailsActivity3.f113428A1;
                    Object obj2 = ((Result) manuscriptProgressDetailsActivity3.P6().f113685g.getValue()).unbox-impl();
                    Object obj3 = obj2;
                    if (Result.isFailure-impl(obj2)) {
                        obj3 = null;
                    }
                    ManuscriptTranscodingEntity manuscriptTranscodingEntity = (ManuscriptTranscodingEntity) obj3;
                    Object obj4 = ((Result) this.this$0.P6().f113689l.getValue()).unbox-impl();
                    Object obj5 = obj4;
                    if (Result.isFailure-impl(obj4)) {
                        obj5 = null;
                    }
                    ManuscriptReviewEntity manuscriptReviewEntity = (ManuscriptReviewEntity) obj5;
                    Object obj6 = ((Result) this.this$0.P6().f113691n.getValue()).unbox-impl();
                    Object obj7 = obj6;
                    if (Result.isFailure-impl(obj6)) {
                        obj7 = null;
                    }
                    ManuscriptOpenEntity manuscriptOpenEntity = (ManuscriptOpenEntity) obj7;
                    String str = "上传完成";
                    if (j9 <= 0 && ((fVar == null || fVar.getTaskStatus() != 5) && (fVar == null || fVar.getTaskStatus() != 7))) {
                        str = ((fVar == null || fVar.getTaskStatus() != 3) && (fVar == null || fVar.getTaskStatus() != 11) && ((fVar == null || fVar.getTaskStatus() != 9) && ((fVar == null || fVar.getTaskStatus() != 10) && (fVar == null || fVar.getTaskStatus() != 6)))) ? "上传中" : "上传失败";
                    }
                    Integer numValueOf = manuscriptTranscodingEntity != null ? Integer.valueOf(manuscriptTranscodingEntity.xcode_state) : null;
                    String str2 = (numValueOf != null && numValueOf.intValue() == 1) ? "转码中" : (numValueOf != null && numValueOf.intValue() == 2) ? "转码完成" : (numValueOf != null && numValueOf.intValue() == 3) ? "转码失败" : "转码未开始";
                    Integer numValueOf2 = manuscriptReviewEntity != null ? Integer.valueOf(manuscriptReviewEntity.aegis_state) : null;
                    String str3 = (numValueOf2 != null && numValueOf2.intValue() == 1) ? "审核中" : (numValueOf2 != null && numValueOf2.intValue() == 2) ? "审核通过" : (numValueOf2 != null && numValueOf2.intValue() == 3) ? "已退回" : (numValueOf2 != null && numValueOf2.intValue() == 4) ? "已锁定" : (numValueOf2 != null && numValueOf2.intValue() == 5) ? "限流" : "审核未开始";
                    Integer numValueOf3 = manuscriptOpenEntity != null ? Integer.valueOf(manuscriptOpenEntity.open_state) : null;
                    String str4 = (numValueOf3 != null && numValueOf3.intValue() == 5) ? "等待剧情树发布" : ((numValueOf3 != null && numValueOf3.intValue() == 1) || (numValueOf3 != null && numValueOf3.intValue() == 4)) ? "待发布" : (numValueOf3 != null && numValueOf3.intValue() == 2) ? "定时发布" : (numValueOf3 != null && numValueOf3.intValue() == 3) ? "已开放" : "未开放";
                    StringBuilder sbA = Hr.l.a(str, "/", str2, "/", str3);
                    sbA.append("/");
                    sbA.append(str4);
                    String string = sbA.toString();
                    bVar.getClass();
                    HashMap map = new HashMap();
                    map.put(GameCardButton.extraAvid, String.valueOf(j7));
                    map.put("cid", String.valueOf(j8));
                    P4.a.a(iR6, "state", string, "p_order", map);
                    Neurons.reportExposure$default(false, "creation.process.0.0.show", map, (List) null, 8, (Object) null);
                } else {
                    ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity4 = this.this$0;
                    ViewGroup viewGroup3 = manuscriptProgressDetailsActivity4.f113437G;
                    ViewGroup viewGroup4 = viewGroup3;
                    if (viewGroup3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mNvsContentRoot");
                        viewGroup4 = null;
                    }
                    viewGroup4.setVisibility(8);
                    ConstraintLayout constraintLayout5 = manuscriptProgressDetailsActivity4.f113474n1;
                    ConstraintLayout constraintLayout6 = constraintLayout5;
                    if (constraintLayout5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCslErrorParent");
                        constraintLayout6 = null;
                    }
                    constraintLayout6.setVisibility(0);
                    ConstraintLayout constraintLayout7 = manuscriptProgressDetailsActivity4.f113478q1;
                    ConstraintLayout constraintLayout8 = constraintLayout7;
                    if (constraintLayout7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCslLoadingParent");
                        constraintLayout8 = null;
                    }
                    constraintLayout8.setVisibility(8);
                    TextView textView = manuscriptProgressDetailsActivity4.f113477p1;
                    TextView textView2 = textView;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mTvErrorOperate");
                        textView2 = null;
                    }
                    textView2.setVisibility(8);
                    TextView textView3 = manuscriptProgressDetailsActivity4.f113475o1;
                    TextView textView4 = textView3;
                    if (textView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mTvErrorDescription");
                        textView4 = null;
                    }
                    textView4.setText("加载失败，刷新试试看吧");
                    TextView textView5 = manuscriptProgressDetailsActivity4.f113477p1;
                    if (textView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mTvErrorOperate");
                        textView5 = null;
                    }
                    textView5.setTag(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.this$0 = manuscriptProgressDetailsActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass7(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity = this.this$0;
                int i8 = ManuscriptProgressDetailsActivity.f113427E1;
                SharedFlow<Boolean> sharedFlow = manuscriptProgressDetailsActivity.P6().f113699v;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManuscriptProgressDetailsActivity$initObservers$1(ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity, Continuation<? super ManuscriptProgressDetailsActivity$initObservers$1> continuation) {
        super(2, continuation);
        this.this$0 = manuscriptProgressDetailsActivity;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ManuscriptProgressDetailsActivity$initObservers$1 manuscriptProgressDetailsActivity$initObservers$1 = new ManuscriptProgressDetailsActivity$initObservers$1(this.this$0, continuation);
        manuscriptProgressDetailsActivity$initObservers$1.L$0 = obj;
        return manuscriptProgressDetailsActivity$initObservers$1;
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
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass7(this.this$0, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
