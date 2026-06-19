package com.bilibili.pegasus.promo;

import HG0.t1;
import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.bilibili.app.comm.list.common.api.ListCommonApiManager;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.api.modelv2.Args;
import com.bilibili.pegasus.card.base.F;
import com.bilibili.relation.blacklist.BlackListManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/BasePegasusFragment.class */
@StabilityInferred(parameters = 0)
public abstract class BasePegasusFragment<T extends F> extends BaseListFragment implements ao.d<com.bilibili.pegasus.card.base.e>, PassportObserver {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f78463o = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Ip0.a f78464i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public F f78465j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f78466k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f78467l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public Map<String, String> f78468m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f78469n;

    /* JADX INFO: renamed from: com.bilibili.pegasus.promo.BasePegasusFragment$onChange$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/BasePegasusFragment$onChange$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final KFunction<Unit> $blacklistOperation;
        final Map<String, String> $extraMap;
        final BasicIndexItem $feed;
        final boolean $isAdded;
        final long $mid;
        final String $spmid;
        int label;
        final BasePegasusFragment<T> this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.promo.BasePegasusFragment$onChange$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/BasePegasusFragment$onChange$3$a.class */
        public static final class a implements BlackListManager.Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BasePegasusFragment<T> f78470a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f78471b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BasicIndexItem f78472c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f78473d;

            public a(BasePegasusFragment<T> basePegasusFragment, boolean z6, BasicIndexItem basicIndexItem, String str) {
                this.f78470a = basePegasusFragment;
                this.f78471b = z6;
                this.f78472c = basicIndexItem;
                this.f78473d = str;
            }

            @Override // com.bilibili.relation.blacklist.BlackListManager.Callback
            public final void onConfirm() {
            }

            @Override // com.bilibili.relation.blacklist.BlackListManager.Callback
            public final void onFailed() {
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
            @Override // com.bilibili.relation.blacklist.BlackListManager.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onSuccess() {
                /*
                    Method dump skipped, instruction units count: 419
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.promo.BasePegasusFragment.AnonymousClass3.a.onSuccess():void");
            }
        }

        /* JADX INFO: renamed from: com.bilibili.pegasus.promo.BasePegasusFragment$onChange$3$b */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/BasePegasusFragment$onChange$3$b.class */
        public static final class b implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BasePegasusFragment f78474a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final KFunction f78475b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f78476c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f78477d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final BasicIndexItem f78478e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final Map f78479f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f78480g;

            public b(BasePegasusFragment basePegasusFragment, KFunction kFunction, long j7, String str, BasicIndexItem basicIndexItem, Map map, boolean z6) {
                this.f78474a = basePegasusFragment;
                this.f78475b = kFunction;
                this.f78476c = j7;
                this.f78477d = str;
                this.f78478e = basicIndexItem;
                this.f78479f = map;
                this.f78480g = z6;
            }

            public final Unit invoke() {
                BasePegasusFragment basePegasusFragment = this.f78474a;
                Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(basePegasusFragment.getContext());
                if (activityFindActivityOrNull != null) {
                    Function8 function8 = this.f78475b;
                    AppCompatActivity appCompatActivity = (AppCompatActivity) activityFindActivityOrNull;
                    long j7 = this.f78476c;
                    BasicIndexItem basicIndexItem = this.f78478e;
                    String str = basicIndexItem.trackId;
                    String str2 = str;
                    if (str == null) {
                        str2 = "";
                    }
                    String jSONString = JSON.toJSONString(this.f78479f);
                    a aVar = new a(basePegasusFragment, this.f78480g, basicIndexItem, this.f78477d);
                    String str3 = this.f78477d;
                    function8.invoke(appCompatActivity, Long.valueOf(j7), 0, str3, str2, str3, jSONString, aVar);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BasePegasusFragment<T> basePegasusFragment, KFunction<Unit> kFunction, long j7, String str, BasicIndexItem basicIndexItem, Map<String, String> map, boolean z6, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = basePegasusFragment;
            this.$blacklistOperation = kFunction;
            this.$mid = j7;
            this.$spmid = str;
            this.$feed = basicIndexItem;
            this.$extraMap = map;
            this.$isAdded = z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$blacklistOperation, this.$mid, this.$spmid, this.$feed, this.$extraMap, this.$isAdded, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0102  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                Method dump skipped, instruction units count: 310
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.promo.BasePegasusFragment.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final int lf(@Nullable List<BasicIndexItem> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            com.bilibili.pegasus.card.base.a aVarA = nf().a(list.get(i8), this);
            F fNf = nf();
            if (aVarA == null) {
                fNf.getClass();
            } else {
                ((ArrayList) fNf.a).add(aVarA);
            }
            i7++;
        }
        return i7;
    }

    @NotNull
    public final Ip0.a mf() {
        Ip0.a aVar = this.f78464i;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @NotNull
    public final T nf() {
        T t7 = (T) this.f78465j;
        if (t7 != null) {
            return t7;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cardManager");
        return null;
    }

    public abstract int of();

    public final void onChange(@Nullable Topic topic) {
        String str;
        String str2;
        String str3;
        Args args;
        if (topic == Topic.SIGN_IN) {
            int i7 = this.f78467l;
            if (i7 == 1) {
                Map<String, String> map = this.f78468m;
                if (map != null && (str = (String) ((LinkedHashMap) map).get("param_feedback_url")) != null) {
                    Qp0.c.e(getContext(), str, null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE, Op0.b.a(of(), 0));
                }
            } else if (i7 == 2) {
                Map<String, String> map2 = this.f78468m;
                if (map2 != null && (str2 = (String) ((LinkedHashMap) map2).get("param_avid")) != null && !StringsKt.isBlank(str2)) {
                    String strA = Op0.b.a(of(), 0);
                    ListCommonApiManager.likeVideo(str2, false, strA, strA);
                    PromoToast.showTopToast(getContext(), 2131841382);
                }
            } else if (i7 == 3) {
                Map<String, String> map3 = this.f78468m;
                if (map3 == null || (str3 = (String) ((LinkedHashMap) map3).get("param_negative_feedback_value")) == null) {
                    return;
                }
                int i8 = Integer.parseInt(str3);
                Map<String, String> map4 = this.f78468m;
                BasicIndexItem basicIndexItem = (BasicIndexItem) JSON.parseObject(map4 != null ? (String) ((LinkedHashMap) map4).get("param_feed") : null, BasicIndexItem.class);
                if (basicIndexItem == null || (args = basicIndexItem.args) == null) {
                    return;
                }
                long j7 = args.upId;
                boolean z6 = i8 == 1;
                BlackListManager blackListManagerNewInstance = BlackListManager.Companion.newInstance();
                KFunction basePegasusFragment$onChange$blacklistOperation$1 = z6 ? new BasePegasusFragment$onChange$blacklistOperation$1(blackListManagerNewInstance) : new BasePegasusFragment$onChange$blacklistOperation$2(blackListManagerNewInstance);
                String strA2 = Op0.b.a(of(), 0);
                String str4 = basicIndexItem.cardGoto;
                String str5 = str4;
                if (str4 == null) {
                    str5 = "";
                }
                Pair pair = TuplesKt.to("entity", str5);
                String str6 = basicIndexItem.param;
                if (str6 == null) {
                    str6 = "";
                }
                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, basePegasusFragment$onChange$blacklistOperation$1, j7, strA2, basicIndexItem, MapsKt.mapOf(new Pair[]{pair, TuplesKt.to("entity_id", str6)}), z6, null), 3, (Object) null);
            }
        }
        this.f78467l = 0;
        this.f78468m = null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        BiliAccounts.get(getContext()).subscribe(this, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT, Topic.ACCOUNT_SWITCH});
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BiliAccounts.get(getContext()).unsubscribe(this, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT, Topic.ACCOUNT_SWITCH});
    }

    /* JADX WARN: Removed duplicated region for block: B:247:0x0706  */
    /* JADX WARN: Type inference failed for: r0v165, types: [com.bilibili.pegasus.promo.a] */
    /* JADX WARN: Type inference failed for: r0v395, types: [com.bilibili.pegasus.promo.c, java.lang.Object] */
    @Override // 
    /* JADX INFO: renamed from: pf, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void P1(@org.jetbrains.annotations.NotNull com.bilibili.pegasus.card.base.e r9) {
        /*
            Method dump skipped, instruction units count: 2053
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.promo.BasePegasusFragment.P1(com.bilibili.pegasus.card.base.e):void");
    }

    public void qf() {
    }

    public void rf(int i7) {
        if (i7 >= 0 && i7 < mf().f10355b.c()) {
            b bVar = new b(this, i7);
            RecyclerView mRecyclerView = getMRecyclerView();
            if (mRecyclerView == null || !mRecyclerView.isComputingLayout()) {
                bVar.invoke();
                return;
            }
            RecyclerView mRecyclerView2 = getMRecyclerView();
            if (mRecyclerView2 != null) {
                mRecyclerView2.post(new t1(bVar, 2));
            }
        }
    }

    public final void sf(int i7, @NotNull BasicIndexItem basicIndexItem) {
        if (i7 < 0) {
            return;
        }
        com.bilibili.pegasus.card.base.a aVarA = nf().a(basicIndexItem, this);
        if (i7 < mf().f10355b.c()) {
            F fNf = nf();
            if (aVarA == null) {
                fNf.getClass();
            } else if (((ao.b) CollectionsKt.getOrNull(fNf.a, i7)) != null) {
                ((ArrayList) fNf.a).set(i7, aVarA);
            }
            mf().notifyItemChanged(i7);
        }
    }
}
