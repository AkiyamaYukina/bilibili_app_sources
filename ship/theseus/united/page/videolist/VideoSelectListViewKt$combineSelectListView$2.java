package com.bilibili.ship.theseus.united.page.videolist;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ship.theseus.united.page.intro.module.season.AbstractC6342d;
import com.bilibili.ship.theseus.united.page.videolist.VideoSelectListViewKt$combineSelectListView$2;
import com.bilibili.ship.theseus.united.page.videolist.c;
import com.bilibili.ship.theseus.united.page.videolist.d;
import com.bilibili.ship.theseus.united.page.videolist.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListViewKt$combineSelectListView$2.class */
final class VideoSelectListViewKt$combineSelectListView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    final int $bottomSpace;
    final com.bilibili.ship.theseus.united.page.videolist.b $color;
    final StateFlow<Long> $currentCidFlow;
    final StateFlow<Boolean> $largePortraitFlow;
    final Function1<Long, Unit> $reportItemShow;
    final Function1<Long, Unit> $reportTabClick;
    final AbstractC6342d $scrollMode;
    final Function1<Integer, Unit> $scrollToPosition;
    final RecyclerView $selectView;
    final Function0<Integer> $selectViewOffset;
    final StateFlow<List<c.a>> $selectsFlow;
    final Function3<Boolean, Long, Long, Unit> $switchVideo;
    final TextView $tabTitle;
    final boolean $tabTitleEnable;
    final boolean $tabTitleHintEnable;
    final RecyclerView $tabView;
    final StateFlow<List<m.a>> $tabsFlow;
    private Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListViewKt$combineSelectListView$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListViewKt$combineSelectListView$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.ship.theseus.united.page.videolist.b $color;
        final Function1<Long, Unit> $reportTabClick;
        final Function1<Integer, Unit> $scrollToPosition;
        final List<Pair<Long, List<Long>>> $selectComponentIdList;
        final StateFlow<List<c.a>> $selectsFlow;
        final com.bilibili.app.gemini.ui.f $tabAdapter;
        final Ref.BooleanRef $tabClick;
        final MutableStateFlow<Long> $tabSelectFlow;
        final TextView $tabTitle;
        final boolean $tabTitleEnable;
        final boolean $tabTitleHintEnable;
        final MutableStateFlow<Long> $tabUpdateFlow;
        final RecyclerView $tabView;
        final StateFlow<List<m.a>> $tabsFlow;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListViewKt$combineSelectListView$2$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListViewKt$combineSelectListView$2$1$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<List<? extends m.a>, List<? extends c.a>, Continuation<? super Pair<? extends List<? extends m.a>, ? extends List<? extends c.a>>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(List<m.a> list, List<c.a> list2, Continuation<? super Pair<? extends List<m.a>, ? extends List<c.a>>> continuation) {
                return AnonymousClass1.invokeSuspend$lambda$0(list, list2, continuation);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListViewKt$combineSelectListView$2$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListViewKt$combineSelectListView$2$1$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends List<? extends m.a>, ? extends List<? extends c.a>>, Continuation<? super Unit>, Object> {
            final com.bilibili.ship.theseus.united.page.videolist.b $color;
            final Function1<Long, Unit> $reportTabClick;
            final Function1<Integer, Unit> $scrollToPosition;
            final List<Pair<Long, List<Long>>> $selectComponentIdList;
            final com.bilibili.app.gemini.ui.f $tabAdapter;
            final Ref.BooleanRef $tabClick;
            final MutableStateFlow<Long> $tabSelectFlow;
            final TextView $tabTitle;
            final boolean $tabTitleEnable;
            final boolean $tabTitleHintEnable;
            final MutableStateFlow<Long> $tabUpdateFlow;
            final RecyclerView $tabView;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass4(TextView textView, com.bilibili.ship.theseus.united.page.videolist.b bVar, boolean z6, boolean z7, RecyclerView recyclerView, com.bilibili.app.gemini.ui.f fVar, MutableStateFlow<Long> mutableStateFlow, MutableStateFlow<Long> mutableStateFlow2, Ref.BooleanRef booleanRef, Function1<? super Long, Unit> function1, List<Pair<Long, List<Long>>> list, Function1<? super Integer, Unit> function12, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$tabTitle = textView;
                this.$color = bVar;
                this.$tabTitleHintEnable = z6;
                this.$tabTitleEnable = z7;
                this.$tabView = recyclerView;
                this.$tabAdapter = fVar;
                this.$tabUpdateFlow = mutableStateFlow;
                this.$tabSelectFlow = mutableStateFlow2;
                this.$tabClick = booleanRef;
                this.$reportTabClick = function1;
                this.$selectComponentIdList = list;
                this.$scrollToPosition = function12;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$1$0(Ref.BooleanRef booleanRef, MutableStateFlow mutableStateFlow, m.a aVar, Function1 function1, List list, Function1 function12) {
                booleanRef.element = true;
                mutableStateFlow.setValue(Long.valueOf(aVar.f103632a));
                long j7 = aVar.f103632a;
                function1.invoke(Long.valueOf(j7));
                Iterator it = list.iterator();
                int i7 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i7 = -1;
                        break;
                    }
                    if (((Number) ((Pair) it.next()).getFirst()).longValue() == j7) {
                        break;
                    }
                    i7++;
                }
                function12.invoke(Integer.valueOf(i7));
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$tabTitle, this.$color, this.$tabTitleHintEnable, this.$tabTitleEnable, this.$tabView, this.$tabAdapter, this.$tabUpdateFlow, this.$tabSelectFlow, this.$tabClick, this.$reportTabClick, this.$selectComponentIdList, this.$scrollToPosition, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Pair<? extends List<m.a>, ? extends List<c.a>> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                List list = (List) pair.component1();
                List list2 = (List) pair.component2();
                if (list.size() <= 1) {
                    this.$tabTitle.setTextColor(this.$color.f103582a);
                    String string = this.$tabTitle.getContext().getString(2131851649);
                    String quantityString = this.$tabTitleHintEnable ? this.$tabTitle.getContext().getResources().getQuantityString(2131689807, list2.size(), String.valueOf(list2.size())) : "";
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    SpannableString spannableString = new SpannableString(quantityString);
                    spannableString.setSpan(new ForegroundColorSpan(this.$color.f103584c), 0, quantityString.length(), 33);
                    spannableString.setSpan(new AbsoluteSizeSpan(DimenUtilsKt.dpToPx(12.0f)), 0, quantityString.length(), 33);
                    this.$tabTitle.setText(spannableStringBuilder.append((CharSequence) spannableString));
                    this.$tabTitle.setVisibility(this.$tabTitleEnable ? 0 : 8);
                    this.$tabView.setVisibility(8);
                    this.$tabView.setAdapter(null);
                    return Unit.INSTANCE;
                }
                this.$tabTitle.setVisibility(8);
                this.$tabView.setVisibility(0);
                List<m.a> list3 = list;
                com.bilibili.ship.theseus.united.page.videolist.b bVar = this.$color;
                MutableStateFlow<Long> mutableStateFlow = this.$tabSelectFlow;
                Ref.BooleanRef booleanRef = this.$tabClick;
                Function1<Long, Unit> function1 = this.$reportTabClick;
                List<Pair<Long, List<Long>>> list4 = this.$selectComponentIdList;
                Function1<Integer, Unit> function12 = this.$scrollToPosition;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (m.a aVar : list3) {
                    arrayList.add(new m(aVar, bVar, mutableStateFlow, new n(booleanRef, mutableStateFlow, aVar, function1, list4, function12)));
                }
                this.$tabAdapter.N(arrayList);
                if (!Intrinsics.areEqual(this.$tabView.getAdapter(), this.$tabAdapter)) {
                    this.$tabView.setAdapter(this.$tabAdapter);
                }
                this.$tabUpdateFlow.setValue(Boxing.boxLong(System.currentTimeMillis()));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(StateFlow<? extends List<m.a>> stateFlow, StateFlow<? extends List<c.a>> stateFlow2, TextView textView, com.bilibili.ship.theseus.united.page.videolist.b bVar, boolean z6, boolean z7, RecyclerView recyclerView, com.bilibili.app.gemini.ui.f fVar, MutableStateFlow<Long> mutableStateFlow, MutableStateFlow<Long> mutableStateFlow2, Ref.BooleanRef booleanRef, Function1<? super Long, Unit> function1, List<Pair<Long, List<Long>>> list, Function1<? super Integer, Unit> function12, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$tabsFlow = stateFlow;
            this.$selectsFlow = stateFlow2;
            this.$tabTitle = textView;
            this.$color = bVar;
            this.$tabTitleHintEnable = z6;
            this.$tabTitleEnable = z7;
            this.$tabView = recyclerView;
            this.$tabAdapter = fVar;
            this.$tabUpdateFlow = mutableStateFlow;
            this.$tabSelectFlow = mutableStateFlow2;
            this.$tabClick = booleanRef;
            this.$reportTabClick = function1;
            this.$selectComponentIdList = list;
            this.$scrollToPosition = function12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(List list, List list2, Continuation continuation) {
            return new Pair(list, list2);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$tabsFlow, this.$selectsFlow, this.$tabTitle, this.$color, this.$tabTitleHintEnable, this.$tabTitleEnable, this.$tabView, this.$tabAdapter, this.$tabUpdateFlow, this.$tabSelectFlow, this.$tabClick, this.$reportTabClick, this.$selectComponentIdList, this.$scrollToPosition, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(this.$tabsFlow, this.$selectsFlow, AnonymousClass3.INSTANCE));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$tabTitle, this.$color, this.$tabTitleHintEnable, this.$tabTitleEnable, this.$tabView, this.$tabAdapter, this.$tabUpdateFlow, this.$tabSelectFlow, this.$tabClick, this.$reportTabClick, this.$selectComponentIdList, this.$scrollToPosition, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass4, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListViewKt$combineSelectListView$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListViewKt$combineSelectListView$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final int $bottomSpace;
        final com.bilibili.ship.theseus.united.page.videolist.b $color;
        final StateFlow<Long> $currentCidFlow;
        final StateFlow<Boolean> $largePortraitFlow;
        final Function1<Long, Unit> $reportItemShow;
        final com.bilibili.app.gemini.ui.f $selectAdapter;
        final List<Pair<Long, List<Long>>> $selectComponentIdList;
        final MutableStateFlow<Long> $selectComponentUpdateFlow;
        final SimpleItemAnimator $selectItemAnimator;
        final RecyclerView $selectView;
        final StateFlow<List<c.a>> $selectsFlow;
        final Function3<Boolean, Long, Long, Unit> $switchVideo;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListViewKt$combineSelectListView$2$2$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListViewKt$combineSelectListView$2$2$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<Boolean, List<? extends c.a>, Continuation<? super Pair<? extends Boolean, ? extends List<? extends c.a>>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Boolean) obj).booleanValue(), (List<c.a>) obj2, (Continuation<? super Pair<Boolean, ? extends List<c.a>>>) obj3);
            }

            public final Object invoke(boolean z6, List<c.a> list, Continuation<? super Pair<Boolean, ? extends List<c.a>>> continuation) {
                return AnonymousClass2.invokeSuspend$lambda$0(z6, list, continuation);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListViewKt$combineSelectListView$2$2$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListViewKt$combineSelectListView$2$2$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends Boolean, ? extends List<? extends c.a>>, Continuation<? super Unit>, Object> {
            final int $bottomSpace;
            final com.bilibili.ship.theseus.united.page.videolist.b $color;
            final StateFlow<Long> $currentCidFlow;
            final Function1<Long, Unit> $reportItemShow;
            final com.bilibili.app.gemini.ui.f $selectAdapter;
            final List<Pair<Long, List<Long>>> $selectComponentIdList;
            final MutableStateFlow<Long> $selectComponentUpdateFlow;
            final SimpleItemAnimator $selectItemAnimator;
            final RecyclerView $selectView;
            final Function3<Boolean, Long, Long, Unit> $switchVideo;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass4(List<Pair<Long, List<Long>>> list, RecyclerView recyclerView, int i7, com.bilibili.app.gemini.ui.f fVar, MutableStateFlow<Long> mutableStateFlow, com.bilibili.ship.theseus.united.page.videolist.b bVar, StateFlow<Long> stateFlow, Function3<? super Boolean, ? super Long, ? super Long, Unit> function3, SimpleItemAnimator simpleItemAnimator, Function1<? super Long, Unit> function1, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$selectComponentIdList = list;
                this.$selectView = recyclerView;
                this.$bottomSpace = i7;
                this.$selectAdapter = fVar;
                this.$selectComponentUpdateFlow = mutableStateFlow;
                this.$color = bVar;
                this.$currentCidFlow = stateFlow;
                this.$switchVideo = function3;
                this.$selectItemAnimator = simpleItemAnimator;
                this.$reportItemShow = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0$0(StateFlow stateFlow, c.a aVar, Function3 function3) {
                Object next;
                long jLongValue = ((Number) stateFlow.getValue()).longValue();
                Iterator<T> it = aVar.f103605l.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((d.a) next).f103614a == jLongValue) {
                        break;
                    }
                }
                if (((d.a) next) != null) {
                    return Unit.INSTANCE;
                }
                function3.invoke(Boolean.FALSE, Long.valueOf(aVar.f103596b), (Object) null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
            public static final Unit invokeSuspend$lambda$0$1(List list, RecyclerView recyclerView, SimpleItemAnimator simpleItemAnimator, Ref.ObjectRef objectRef, boolean z6, final c.a aVar, List list2, com.bilibili.app.gemini.ui.f fVar, com.bilibili.ship.theseus.united.page.videolist.b bVar, StateFlow stateFlow, final Function3 function3, UIComponent uIComponent) {
                ArrayList arrayList;
                if (list.size() <= 1) {
                    return Unit.INSTANCE;
                }
                if (recyclerView.getItemAnimator() == null) {
                    recyclerView.setItemAnimator(simpleItemAnimator);
                }
                int iIndexOf = ((List) objectRef.element).indexOf(uIComponent);
                ArrayList arrayList2 = new ArrayList((Collection) objectRef.element);
                int i7 = z6 ? 3 : 2;
                if (((Boolean) aVar.f103607n.getValue()).booleanValue()) {
                    int iRoundToInt = MathKt.roundToInt(list.size() / i7);
                    int i8 = 0;
                    while (true) {
                        arrayList = arrayList2;
                        if (i8 >= iRoundToInt) {
                            break;
                        }
                        int i9 = iIndexOf + 1;
                        list2.remove(i9);
                        arrayList2.remove(i9);
                        i8++;
                    }
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    int i10 = 0;
                    arrayList = arrayList2;
                    for (Object obj : aVar.f103605l) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        d.a aVar2 = (d.a) obj;
                        if (i10 % i7 == 0) {
                            d.a aVar3 = (d.a) CollectionsKt.getOrNull(aVar.f103605l, i11);
                            d.a aVar4 = (d.a) CollectionsKt.getOrNull(aVar.f103605l, i10 + 2);
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(Long.valueOf(aVar2.f103614a));
                            if (aVar3 != null) {
                                arrayList4.add(Long.valueOf(aVar3.f103614a));
                            }
                            if (aVar4 != null) {
                                arrayList4.add(Long.valueOf(aVar4.f103614a));
                            }
                            list2.add(iIndexOf + 1, new Pair(Long.valueOf(aVar.f103595a), arrayList4));
                            arrayList3.add(new d(new Triple(aVar2, aVar3, aVar4), bVar, stateFlow, z6, new Function1(function3, aVar) { // from class: com.bilibili.ship.theseus.united.page.videolist.o

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final Function3 f103640a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final c.a f103641b;

                                {
                                    this.f103640a = function3;
                                    this.f103641b = aVar;
                                }

                                public final Object invoke(Object obj2) {
                                    return VideoSelectListViewKt$combineSelectListView$2.AnonymousClass2.AnonymousClass4.invokeSuspend$lambda$0$1$0$0(this.f103640a, this.f103641b, (d.a) obj2);
                                }
                            }, new Object()));
                        }
                        i10 = i11;
                    }
                    arrayList.addAll(iIndexOf + 1, arrayList3);
                }
                fVar.N(arrayList);
                aVar.f103607n.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                objectRef.element = arrayList;
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0$1$0$0(Function3 function3, c.a aVar, d.a aVar2) {
                function3.invoke(Boolean.TRUE, Long.valueOf(aVar.f103596b), Long.valueOf(aVar2.f103614a));
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0$2(Function1 function1, c.a aVar) {
                function1.invoke(Long.valueOf(aVar.f103596b));
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0$4$0(Function3 function3, c.a aVar, d.a aVar2) {
                function3.invoke(Boolean.TRUE, Long.valueOf(aVar.f103596b), Long.valueOf(aVar2.f103614a));
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$selectComponentIdList, this.$selectView, this.$bottomSpace, this.$selectAdapter, this.$selectComponentUpdateFlow, this.$color, this.$currentCidFlow, this.$switchVideo, this.$selectItemAnimator, this.$reportItemShow, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Pair<Boolean, ? extends List<c.a>> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x0295  */
            /* JADX WARN: Type inference failed for: r0v68, types: [com.bilibili.ship.theseus.united.page.videolist.q] */
            /* JADX WARN: Type inference failed for: r7v0, types: [com.bilibili.ship.theseus.united.page.videolist.r] */
            /* JADX WARN: Type inference failed for: r8v1, types: [com.bilibili.ship.theseus.united.page.videolist.s] */
            /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                /*
                    Method dump skipped, instruction units count: 789
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListViewKt$combineSelectListView$2.AnonymousClass2.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(StateFlow<Boolean> stateFlow, StateFlow<? extends List<c.a>> stateFlow2, List<Pair<Long, List<Long>>> list, RecyclerView recyclerView, int i7, com.bilibili.app.gemini.ui.f fVar, MutableStateFlow<Long> mutableStateFlow, com.bilibili.ship.theseus.united.page.videolist.b bVar, StateFlow<Long> stateFlow3, Function3<? super Boolean, ? super Long, ? super Long, Unit> function3, SimpleItemAnimator simpleItemAnimator, Function1<? super Long, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$largePortraitFlow = stateFlow;
            this.$selectsFlow = stateFlow2;
            this.$selectComponentIdList = list;
            this.$selectView = recyclerView;
            this.$bottomSpace = i7;
            this.$selectAdapter = fVar;
            this.$selectComponentUpdateFlow = mutableStateFlow;
            this.$color = bVar;
            this.$currentCidFlow = stateFlow3;
            this.$switchVideo = function3;
            this.$selectItemAnimator = simpleItemAnimator;
            this.$reportItemShow = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(boolean z6, List list, Continuation continuation) {
            return new Pair(Boxing.boxBoolean(z6), list);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$largePortraitFlow, this.$selectsFlow, this.$selectComponentIdList, this.$selectView, this.$bottomSpace, this.$selectAdapter, this.$selectComponentUpdateFlow, this.$color, this.$currentCidFlow, this.$switchVideo, this.$selectItemAnimator, this.$reportItemShow, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(this.$largePortraitFlow, this.$selectsFlow, AnonymousClass3.INSTANCE));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$selectComponentIdList, this.$selectView, this.$bottomSpace, this.$selectAdapter, this.$selectComponentUpdateFlow, this.$color, this.$currentCidFlow, this.$switchVideo, this.$selectItemAnimator, this.$reportItemShow, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass4, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListViewKt$combineSelectListView$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListViewKt$combineSelectListView$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MutableStateFlow<Long> $tabSelectFlow;
        final MutableStateFlow<Long> $tabUpdateFlow;
        final RecyclerView $tabView;
        final StateFlow<List<m.a>> $tabsFlow;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListViewKt$combineSelectListView$2$3$3, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListViewKt$combineSelectListView$2$3$3.class */
        public static final /* synthetic */ class C11493 extends AdaptedFunctionReference implements Function3<Long, Long, Continuation<? super Pair<? extends Long, ? extends Long>>, Object>, SuspendFunction {
            public static final C11493 INSTANCE = new C11493();

            public C11493() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(long j7, long j8, Continuation<? super Pair<Long, Long>> continuation) {
                return AnonymousClass3.invokeSuspend$lambda$0(j7, j8, continuation);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Number) obj).longValue(), ((Number) obj2).longValue(), (Continuation<? super Pair<Long, Long>>) obj3);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListViewKt$combineSelectListView$2$3$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListViewKt$combineSelectListView$2$3$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends Long, ? extends Long>, Continuation<? super Unit>, Object> {
            final RecyclerView $tabView;
            final StateFlow<List<m.a>> $tabsFlow;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass4(StateFlow<? extends List<m.a>> stateFlow, RecyclerView recyclerView, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$tabsFlow = stateFlow;
                this.$tabView = recyclerView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$tabsFlow, this.$tabView, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Pair<Long, Long> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                View view;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                long jLongValue = ((Number) pair.component1()).longValue();
                long jLongValue2 = ((Number) pair.component2()).longValue();
                if (jLongValue <= 0) {
                    return Unit.INSTANCE;
                }
                Iterator it = ((List) this.$tabsFlow.getValue()).iterator();
                int i7 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i7 = -1;
                        break;
                    }
                    if (((m.a) it.next()).f103632a == jLongValue2) {
                        break;
                    }
                    i7++;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.$tabView.getLayoutManager();
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.$tabView.findViewHolderForAdapterPosition(i7);
                linearLayoutManager.scrollToPositionWithOffset(i7, (this.$tabView.getWidth() / 2) - (((viewHolderFindViewHolderForAdapterPosition == null || (view = viewHolderFindViewHolderForAdapterPosition.itemView) == null) ? DimenUtilsKt.dpToPx(56.0f) : view.getWidth()) / 2));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(MutableStateFlow<Long> mutableStateFlow, MutableStateFlow<Long> mutableStateFlow2, StateFlow<? extends List<m.a>> stateFlow, RecyclerView recyclerView, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$tabUpdateFlow = mutableStateFlow;
            this.$tabSelectFlow = mutableStateFlow2;
            this.$tabsFlow = stateFlow;
            this.$tabView = recyclerView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(long j7, long j8, Continuation continuation) {
            return new Pair(Boxing.boxLong(j7), Boxing.boxLong(j8));
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$tabUpdateFlow, this.$tabSelectFlow, this.$tabsFlow, this.$tabView, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCombine = FlowKt.combine(this.$tabUpdateFlow, this.$tabSelectFlow, C11493.INSTANCE);
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$tabsFlow, this.$tabView, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass4, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListViewKt$combineSelectListView$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListViewKt$combineSelectListView$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final StateFlow<Long> $currentCidFlow;
        final AbstractC6342d $scrollMode;
        final Function1<Integer, Unit> $scrollToPosition;
        final List<Pair<Long, List<Long>>> $selectComponentIdList;
        final MutableStateFlow<Long> $selectComponentUpdateFlow;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListViewKt$combineSelectListView$2$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListViewKt$combineSelectListView$2$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
            final StateFlow<Long> $currentCidFlow;
            final AbstractC6342d $scrollMode;
            final Function1<Integer, Unit> $scrollToPosition;
            final List<Pair<Long, List<Long>>> $selectComponentIdList;
            long J$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(StateFlow<Long> stateFlow, AbstractC6342d abstractC6342d, List<Pair<Long, List<Long>>> list, Function1<? super Integer, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$currentCidFlow = stateFlow;
                this.$scrollMode = abstractC6342d;
                this.$selectComponentIdList = list;
                this.$scrollToPosition = function1;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentCidFlow, this.$scrollMode, this.$selectComponentIdList, this.$scrollToPosition, continuation);
                anonymousClass1.J$0 = ((Number) obj).longValue();
                return anonymousClass1;
            }

            public final Object invoke(long j7, Continuation<? super Unit> continuation) {
                return create(Long.valueOf(j7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).longValue(), (Continuation<? super Unit>) obj2);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                int i7;
                int iNextIndex;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.J$0 <= 0) {
                    return Unit.INSTANCE;
                }
                long jLongValue = ((Number) this.$currentCidFlow.getValue()).longValue();
                AbstractC6342d abstractC6342d = this.$scrollMode;
                if (Intrinsics.areEqual(abstractC6342d, AbstractC6342d.b.f101652a)) {
                    List<Pair<Long, List<Long>>> list = this.$selectComponentIdList;
                    ListIterator<Pair<Long, List<Long>>> listIterator = list.listIterator(list.size());
                    while (true) {
                        iNextIndex = -1;
                        if (!listIterator.hasPrevious()) {
                            break;
                        }
                        if (((List) listIterator.previous().getSecond()).contains(Boxing.boxLong(jLongValue))) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    }
                    this.$scrollToPosition.invoke(Boxing.boxInt(iNextIndex));
                } else if (abstractC6342d instanceof AbstractC6342d.c) {
                    List<Pair<Long, List<Long>>> list2 = this.$selectComponentIdList;
                    AbstractC6342d abstractC6342d2 = this.$scrollMode;
                    Iterator<Pair<Long, List<Long>>> it = list2.iterator();
                    int i8 = 0;
                    while (true) {
                        i7 = -1;
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((Number) it.next().getFirst()).longValue() == ((AbstractC6342d.c) abstractC6342d2).f101653a) {
                            i7 = i8;
                            break;
                        }
                        i8++;
                    }
                    if (i7 >= 0) {
                        this.$scrollToPosition.invoke(Boxing.boxInt(i7));
                    }
                } else if (!Intrinsics.areEqual(abstractC6342d, AbstractC6342d.a.f101651a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(MutableStateFlow<Long> mutableStateFlow, StateFlow<Long> stateFlow, AbstractC6342d abstractC6342d, List<Pair<Long, List<Long>>> list, Function1<? super Integer, Unit> function1, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$selectComponentUpdateFlow = mutableStateFlow;
            this.$currentCidFlow = stateFlow;
            this.$scrollMode = abstractC6342d;
            this.$selectComponentIdList = list;
            this.$scrollToPosition = function1;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$selectComponentUpdateFlow, this.$currentCidFlow, this.$scrollMode, this.$selectComponentIdList, this.$scrollToPosition, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<Long> mutableStateFlow = this.$selectComponentUpdateFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentCidFlow, this.$scrollMode, this.$selectComponentIdList, this.$scrollToPosition, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListViewKt$combineSelectListView$2$a.class */
    public static final class a extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Paint f103557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f103558b;

        public a(com.bilibili.ship.theseus.united.page.videolist.b bVar, float f7) {
            this.f103558b = f7;
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            paint.setColor(bVar.f103588g);
            this.f103557a = paint;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int childAdapterPosition;
            com.bilibili.app.gemini.ui.f adapter = recyclerView.getAdapter();
            com.bilibili.app.gemini.ui.f fVar = adapter instanceof com.bilibili.app.gemini.ui.f ? adapter : null;
            if (fVar == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) == -1) {
                return;
            }
            Object orNull = CollectionsKt.getOrNull(fVar.c, childAdapterPosition);
            c cVar = null;
            if (orNull instanceof c) {
                cVar = (c) orNull;
            }
            if (cVar != null && cVar.f103589a.f103606m) {
                rect.top += (int) (DimenUtilsKt.dpToPx(10) + this.f103558b);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            com.bilibili.app.gemini.ui.f adapter = recyclerView.getAdapter();
            com.bilibili.app.gemini.ui.f fVar = adapter instanceof com.bilibili.app.gemini.ui.f ? adapter : null;
            if (fVar == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = recyclerView.getChildAt(i7);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition != -1) {
                    Object orNull = CollectionsKt.getOrNull(fVar.c, childAdapterPosition);
                    c cVar = orNull instanceof c ? (c) orNull : null;
                    if (cVar != null && cVar.f103589a.f103606m) {
                        float top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).topMargin;
                        canvas.drawRect(recyclerView.getPaddingLeft() + DimenUtilsKt.dpToPx(12), top, recyclerView.getWidth(), top + this.f103558b, this.f103557a);
                    }
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListViewKt$combineSelectListView$2$b.class */
    public static final class b extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f103559a = 10;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f103560b = DimenUtilsKt.dpToPx(40.0f);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Ref.BooleanRef f103561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Function0<Integer> f103562d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<Pair<Long, List<Long>>> f103563e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final MutableStateFlow<Long> f103564f;

        public b(Ref.BooleanRef booleanRef, Function0<Integer> function0, List<Pair<Long, List<Long>>> list, MutableStateFlow<Long> mutableStateFlow) {
            this.f103561c = booleanRef;
            this.f103562d = function0;
            this.f103563e = list;
            this.f103564f = mutableStateFlow;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            if (i7 == 0) {
                this.f103561c.element = false;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(final RecyclerView recyclerView, int i7, int i8) {
            Ref.BooleanRef booleanRef = this.f103561c;
            if (booleanRef.element) {
                BLog.i("VideoSelectListViewKt$combineSelectListView$2$selectScrollListener$1-onScrolled", "[theseus-united-VideoSelectListViewKt$combineSelectListView$2$selectScrollListener$1-onScrolled] scrolled from click");
                booleanRef.element = false;
            } else {
                final List<Pair<Long, List<Long>>> list = this.f103563e;
                final Function0<Integer> function0 = this.f103562d;
                final MutableStateFlow<Long> mutableStateFlow = this.f103564f;
                recyclerView.post(new Runnable(recyclerView, this, function0, list, mutableStateFlow) { // from class: com.bilibili.ship.theseus.united.page.videolist.v

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final RecyclerView f103659a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final VideoSelectListViewKt$combineSelectListView$2.b f103660b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Function0 f103661c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final List f103662d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final MutableStateFlow f103663e;

                    {
                        this.f103659a = recyclerView;
                        this.f103660b = this;
                        this.f103661c = function0;
                        this.f103662d = list;
                        this.f103663e = mutableStateFlow;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:26:0x00af A[LOOP:0: B:15:0x0065->B:26:0x00af, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7 A[EDGE_INSN: B:32:0x00b7->B:27:0x00b7 BREAK  A[LOOP:0: B:15:0x0065->B:26:0x00af], SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instruction units count: 212
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videolist.v.run():void");
                    }
                });
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VideoSelectListViewKt$combineSelectListView$2(RecyclerView recyclerView, RecyclerView recyclerView2, Function0<Integer> function0, com.bilibili.ship.theseus.united.page.videolist.b bVar, StateFlow<? extends List<m.a>> stateFlow, StateFlow<? extends List<c.a>> stateFlow2, TextView textView, boolean z6, boolean z7, Function1<? super Long, Unit> function1, Function1<? super Integer, Unit> function12, StateFlow<Boolean> stateFlow3, int i7, StateFlow<Long> stateFlow4, Function3<? super Boolean, ? super Long, ? super Long, Unit> function3, Function1<? super Long, Unit> function13, AbstractC6342d abstractC6342d, Continuation<? super VideoSelectListViewKt$combineSelectListView$2> continuation) {
        super(2, continuation);
        this.$tabView = recyclerView;
        this.$selectView = recyclerView2;
        this.$selectViewOffset = function0;
        this.$color = bVar;
        this.$tabsFlow = stateFlow;
        this.$selectsFlow = stateFlow2;
        this.$tabTitle = textView;
        this.$tabTitleHintEnable = z6;
        this.$tabTitleEnable = z7;
        this.$reportTabClick = function1;
        this.$scrollToPosition = function12;
        this.$largePortraitFlow = stateFlow3;
        this.$bottomSpace = i7;
        this.$currentCidFlow = stateFlow4;
        this.$switchVideo = function3;
        this.$reportItemShow = function13;
        this.$scrollMode = abstractC6342d;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VideoSelectListViewKt$combineSelectListView$2 videoSelectListViewKt$combineSelectListView$2 = new VideoSelectListViewKt$combineSelectListView$2(this.$tabView, this.$selectView, this.$selectViewOffset, this.$color, this.$tabsFlow, this.$selectsFlow, this.$tabTitle, this.$tabTitleHintEnable, this.$tabTitleEnable, this.$reportTabClick, this.$scrollToPosition, this.$largePortraitFlow, this.$bottomSpace, this.$currentCidFlow, this.$switchVideo, this.$reportItemShow, this.$scrollMode, continuation);
        videoSelectListViewKt$combineSelectListView$2.L$0 = obj;
        return videoSelectListViewKt$combineSelectListView$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        RecyclerView.Adapter fVar;
        a aVar;
        b bVar;
        com.bilibili.app.gemini.ui.f fVar2;
        RecyclerView.Adapter adapter;
        com.bilibili.app.gemini.ui.f fVar3;
        b bVar2;
        a aVar2;
        a aVar3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            com.bilibili.app.gemini.ui.f fVar4 = new com.bilibili.app.gemini.ui.f(false);
            fVar = new com.bilibili.app.gemini.ui.f(false);
            this.$tabView.setItemAnimator(null);
            this.$tabView.setNestedScrollingEnabled(false);
            SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) this.$selectView.getItemAnimator();
            simpleItemAnimator.setSupportsChangeAnimations(false);
            this.$tabView.setAdapter(fVar4);
            this.$selectView.setAdapter(fVar);
            MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boxing.boxLong(0L));
            MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boxing.boxLong(0L));
            ArrayList arrayList = new ArrayList();
            MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boxing.boxLong(0L));
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            b bVar3 = new b(booleanRef, this.$selectViewOffset, arrayList, MutableStateFlow);
            this.$selectView.addOnScrollListener(bVar3);
            a aVar4 = new a(this.$color, DimenUtilsKt.dpToPx(0.5f));
            this.$selectView.addItemDecoration(aVar4);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$tabsFlow, this.$selectsFlow, this.$tabTitle, this.$color, this.$tabTitleHintEnable, this.$tabTitleEnable, this.$tabView, fVar4, MutableStateFlow2, MutableStateFlow, booleanRef, this.$reportTabClick, arrayList, this.$scrollToPosition, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$largePortraitFlow, this.$selectsFlow, arrayList, this.$selectView, this.$bottomSpace, fVar, MutableStateFlow3, this.$color, this.$currentCidFlow, this.$switchVideo, simpleItemAnimator, this.$reportItemShow, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(MutableStateFlow2, MutableStateFlow, this.$tabsFlow, this.$tabView, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(MutableStateFlow3, this.$currentCidFlow, this.$scrollMode, arrayList, this.$scrollToPosition, null), 3, (Object) null);
            try {
                this.L$0 = fVar4;
                try {
                    this.L$1 = fVar;
                    try {
                        this.L$2 = bVar3;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    this.L$3 = aVar4;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    adapter = fVar;
                    fVar3 = fVar4;
                    bVar2 = bVar3;
                    aVar2 = aVar4;
                } catch (Throwable th3) {
                    th = th3;
                    aVar = aVar4;
                    bVar = bVar3;
                    fVar2 = fVar4;
                    this.$selectView.removeItemDecoration(aVar);
                    this.$selectView.removeOnScrollListener(bVar);
                    fVar2.N(CollectionsKt.emptyList());
                    fVar.N(CollectionsKt.emptyList());
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (a) this.L$3;
            bVar2 = (b) this.L$2;
            RecyclerView.Adapter adapter2 = (com.bilibili.app.gemini.ui.f) this.L$1;
            fVar3 = (com.bilibili.app.gemini.ui.f) this.L$0;
            aVar3 = aVar2;
            bVar = bVar2;
            fVar = adapter2;
            fVar2 = fVar3;
            try {
                ResultKt.throwOnFailure(obj);
                adapter = adapter2;
            } catch (Throwable th5) {
                th = th5;
                aVar = aVar3;
                this.$selectView.removeItemDecoration(aVar);
                this.$selectView.removeOnScrollListener(bVar);
                fVar2.N(CollectionsKt.emptyList());
                fVar.N(CollectionsKt.emptyList());
                throw th;
            }
        }
        aVar3 = aVar2;
        bVar = bVar2;
        fVar = adapter;
        fVar2 = fVar3;
        throw new KotlinNothingValueException();
    }
}
