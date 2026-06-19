package com.bilibili.search2.api;

import Sm.t;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import bolts.Continuation;
import bolts.Task;
import com.bapis.bilibili.app.interfaces.v1.DefaultWordsReply;
import com.bapis.bilibili.app.interfaces.v1.DefaultWordsReq;
import com.bapis.bilibili.app.interfaces.v1.SearchMoss;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.comm.restrict.RestrictedMode;
import com.bilibili.app.comm.restrict.RestrictedType;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.commons.StringUtils;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.gripper.api.SuspendProducer;
import com.bilibili.lib.moss.api.BusinessException;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.lib.pageview.model.PageViewsEvent;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.search2.api.DefaultKeyword;
import com.bilibili.search2.main.data.SearchUserActManager;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u00.l;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/DefaultKeywordImpl.class */
@Singleton
@StabilityInferred(parameters = 0)
@Named("IDefaultKeywordService")
public final class DefaultKeywordImpl implements com.bilibili.app.comm.list.common.api.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public DefaultWordReport f86275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f86276b = MapsKt.mapOf(new Pair[]{TuplesKt.to("推荐", "tm"), TuplesKt.to("直播", "live"), TuplesKt.to("热门", "hot"), TuplesKt.to("追番", "bangumi"), TuplesKt.to("影视", "movie")});

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/DefaultKeywordImpl$DefaultWordReport.class */
    public static final class DefaultWordReport {
        private static final EnumEntries $ENTRIES;
        private static final DefaultWordReport[] $VALUES;
        private int status;
        public static final DefaultWordReport HAS_REQUESTED_STATUS = new DefaultWordReport("HAS_REQUESTED_STATUS", 0, 0);
        public static final DefaultWordReport HAS_LOGIN_STATUS = new DefaultWordReport("HAS_LOGIN_STATUS", 1, 2);
        public static final DefaultWordReport NOT_LOGIN_STATUS = new DefaultWordReport("NOT_LOGIN_STATUS", 2, 1);

        private static final /* synthetic */ DefaultWordReport[] $values() {
            return new DefaultWordReport[]{HAS_REQUESTED_STATUS, HAS_LOGIN_STATUS, NOT_LOGIN_STATUS};
        }

        static {
            DefaultWordReport[] defaultWordReportArr$values = $values();
            $VALUES = defaultWordReportArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(defaultWordReportArr$values);
        }

        private DefaultWordReport(String str, int i7, int i8) {
            this.status = i8;
        }

        @NotNull
        public static EnumEntries<DefaultWordReport> getEntries() {
            return $ENTRIES;
        }

        public static DefaultWordReport valueOf(String str) {
            return (DefaultWordReport) Enum.valueOf(DefaultWordReport.class, str);
        }

        public static DefaultWordReport[] values() {
            return (DefaultWordReport[]) $VALUES.clone();
        }

        public final int getStatus() {
            return this.status;
        }

        public final void setStatus(int i7) {
            this.status = i7;
        }
    }

    @NotNull
    public final MutableLiveData a(@Nullable String str, int i7, int i8, @Nullable String str2, boolean z6) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        if (this.f86275a == null) {
            this.f86275a = o.b() ? DefaultWordReport.HAS_LOGIN_STATUS : DefaultWordReport.NOT_LOGIN_STATUS;
        }
        String str3 = this.f86276b.get(str);
        String str4 = str3;
        if (str3 == null) {
            str4 = "others";
        }
        l lVar = (l) BLRouter.INSTANCE.get(l.class, "HOME_TAB_SERVICE");
        int status = 0;
        int iU = lVar != null ? lVar.u() : 0;
        PageViewsEvent lastEndPv = PageViewTracker.getInstance().getLastEndPv();
        String str5 = lastEndPv != null ? lastEndPv.eventId : null;
        Map map = lastEndPv != null ? lastEndPv.extra : null;
        String str6 = map != null ? (String) map.get(GameCardButton.extraAvid) : null;
        String str7 = map != null ? (String) map.get("query") : null;
        DefaultWordReport defaultWordReport = this.f86275a;
        if (defaultWordReport != null) {
            status = defaultWordReport.getStatus();
        }
        final a aVar = new a(this, mutableLiveData);
        DefaultWordsReq.b bVarNewBuilder = DefaultWordsReq.newBuilder();
        bVarNewBuilder.setFrom(i7).setLoginEvent(status);
        if (i7 == 1) {
            bVarNewBuilder.setAn(iU);
            if (!StringUtils.isBlank(str4)) {
                bVarNewBuilder.setTab(str4);
            }
        }
        if (str5 != null) {
            bVarNewBuilder.setEventId(str5);
        }
        if (str6 != null) {
            bVarNewBuilder.setAvid(str6);
        }
        if (str7 != null) {
            bVarNewBuilder.setQuery(str7);
        }
        SuspendProducer suspendProducerA = t.a(Ns0.h.class, (String) null, 2, (Object) null);
        Ns0.h hVar = suspendProducerA != null ? (Ns0.h) suspendProducerA.get() : null;
        final Ns0.c cVar = new Ns0.c();
        if (hVar != null) {
            Ns0.c cVarB = hVar.b();
            if (cVarB != null) {
                if (!TextUtils.isEmpty(cVarB.f17437b)) {
                    bVarNewBuilder.setSplashGuide(cVarB.f17437b);
                }
                bVarNewBuilder.setSplashId(cVarB.f17436a);
                cVar.f17436a = cVarB.f17436a;
                cVar.f17438c = cVarB.f17438c;
            }
            hVar.a(null);
        }
        bVarNewBuilder.setIsFresh(0L);
        if (RestrictedMode.isEnable(RestrictedType.TEENAGERS)) {
            bVarNewBuilder.setTeenagersMode(1);
        }
        if (RestrictedMode.isEnable(RestrictedType.LESSONS)) {
            bVarNewBuilder.setLessonsMode(1);
        }
        bVarNewBuilder.setRefreshType(i8);
        bVarNewBuilder.setUserAct(SearchUserActManager.b());
        bVarNewBuilder.setSearchPageReturn(z6 ? 1 : 0);
        if (str2 != null) {
            bVarNewBuilder.setDislike(str2);
        }
        final DefaultWordsReq defaultWordsReqBuild = bVarNewBuilder.build();
        Task.callInBackground(new Callable(defaultWordsReqBuild, cVar) { // from class: Ps0.s

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DefaultWordsReq f19240a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Ns0.c f19241b;

            {
                this.f19240a = defaultWordsReqBuild;
                this.f19241b = cVar;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.api.BiliApiException */
            @Override // java.util.concurrent.Callable
            public final Object call() throws BiliApiException {
                DefaultKeyword defaultKeyword;
                DefaultWordsReq defaultWordsReq = this.f19240a;
                Ns0.c cVar2 = this.f19241b;
                try {
                    DefaultWordsReply defaultWordsReplyExecuteDefaultWords = new SearchMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).executeDefaultWords(defaultWordsReq);
                    if (defaultWordsReplyExecuteDefaultWords != null) {
                        defaultKeyword = new DefaultKeyword(defaultWordsReplyExecuteDefaultWords);
                        defaultKeyword.setFromTM(false);
                        defaultKeyword.setFlashScreenQueryId(cVar2.f17436a);
                        defaultKeyword.setDefaultWordType(cVar2.f17438c);
                    } else {
                        defaultKeyword = null;
                    }
                    return defaultKeyword;
                } catch (BusinessException e7) {
                    throw new BiliApiException(e7.getCode(), e7.getMessage(), e7);
                }
            }
        }).continueWith(new Continuation(aVar) { // from class: Ps0.t

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.bilibili.search2.api.a f19242a;

            {
                this.f19242a = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // bolts.Continuation
            public final Object then(Task task) {
                com.bilibili.search2.api.a aVar2 = this.f19242a;
                if (aVar2.isCancel()) {
                    return null;
                }
                if (task.isFaulted()) {
                    aVar2.onError(task.getError());
                    return null;
                }
                aVar2.onDataSuccess(task.getResult());
                return null;
            }
        }, Task.UI_THREAD_EXECUTOR);
        return mutableLiveData;
    }

    public final void b() {
        this.f86275a = null;
    }
}
